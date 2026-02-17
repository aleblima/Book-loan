package model;

public class Professor extends Usuario{
    private String especialidade;
    private String departamento;

    public Professor(String nome, String email, String especialidade, String departamento) {
        super(nome, email);
        this.especialidade = especialidade;
        this.departamento = departamento;
    }

    public String getEspecialidade(){
        return especialidade;
    }
    public String getDepartamento(){
        return departamento;
    }
}
