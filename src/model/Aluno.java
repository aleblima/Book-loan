package model;

public class Aluno extends Usuario{
    private String matricula;
    private String curso;

    public Aluno(String nome, String email, String curso, String matricula){
        super(nome, email);
        this.curso = curso;
        if (matricula != null){
        this.matricula = matricula;
        }
    }

    public String getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public String getNome(){
        return super.getNome();
    }
}