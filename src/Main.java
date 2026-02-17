import exceptions.LivroIndisponivelException;
import model.Aluno;
import model.Livro;
import model.Professor;
import service.EmprestimoService;
import service.LivroService;
import service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        Aluno aluno = userService.criarAluno("Alexandre", "alexandre.teste@teste.com", "ADS");
        System.out.printf(aluno != null ? "Aluno criado com sucesso!" : "Erro ao criar aluno!");

        Professor professor = userService.criarProfessor("Henrique", "henrique.teste@teste.com", "Matemática", "Bloco A");
        System.out.println(professor != null ? "Professor criado com sucesso!" : "Erro ao criar professor!");

        LivroService livroService = new LivroService();
        livroService.criarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        livroService.criarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");
        for (Livro livro : livroService.getLivros()) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }

        EmprestimoService emprestimoService = new EmprestimoService(livroService);
        try {
            emprestimoService.realizarEmprestimo(aluno, "O senhor dos aneis");
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }
}
