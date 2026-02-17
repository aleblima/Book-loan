package service;

import model.Livro;

import java.util.ArrayList;

public class LivroService {

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

}
