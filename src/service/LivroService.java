package service;

import exceptions.LivroIndisponivelException;
import exceptions.LivroInexistenteException;
import model.Livro;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class LivroService {
    Collator collator = Collator.getInstance(new Locale("pt", "BR"));
    private final ArrayList<Livro> livros = new ArrayList<>();


    public void criarLivro(String titulo, String autor){
        livros.add(new Livro(titulo, autor));
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    public ArrayList<Livro> getLivrosDisponiveis(){
        ArrayList<Livro> disponiveis = new ArrayList<>();
        for(Livro livro : livros){
            if(livro.isDisponivel()){
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    public boolean isDisponivel(Livro livro) {
        if(livro == null){
            return false;
        }
        return livro.isDisponivel();
    }

    public Livro getLivroByTitulo(String titulo) throws LivroInexistenteException{

            for(Livro livro : livros){
                collator.setStrength(Collator.PRIMARY);
                if(collator.compare(livro.getTitulo(), titulo) == 0){
                    return livro;
                }
            }
            System.out.println("Livro '" + titulo + "' não encontrado.");
            System.out.println("--- Livros Disponíveis para Empréstimo ---");

            for (Livro livroDisponivel : getLivrosDisponiveis()) {
                System.out.println("- " + livroDisponivel.getTitulo());
            }
            System.out.println("------------------------------------------");
        throw new LivroInexistenteException("Livro inexistente");
    }

}
