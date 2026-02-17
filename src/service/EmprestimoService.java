package service;

import exceptions.LivroIndisponivelException;
import model.Livro;
import model.Professor;
import model.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmprestimoService {
    int diasDevolucao;
    LocalDate dataDevolucao;
    private final LivroService livroService;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public EmprestimoService(LivroService livroService){
        this.livroService = livroService;
    }

    public void realizarEmprestimo(Usuario user, String TituloLivro ) throws LivroIndisponivelException {
        Livro livro = livroService.getLivroByTitulo(TituloLivro);
        if(!livro.isDisponivel()){
            throw new LivroIndisponivelException("O livro " + livro.getTitulo() + " já está emprestado.");
        };

        diasDevolucao = (user instanceof Professor) ? 15 : 7;
        dataDevolucao = LocalDate.now().plusDays(diasDevolucao);
        livro.setDisponivel(false);
        System.out.println("Livro emprestado com sucesso!");
        System.out.println("Dados do empréstimo:");
        System.out.printf("Usuário: %s%nLivro: %s%nData de devolução:%s%n", user.getNome(), livro.getTitulo(), dataDevolucao.format(formatter));
    }
}
