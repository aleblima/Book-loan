package service;

import model.Aluno;
import model.Professor;

import java.time.LocalDate;

public class UserService {
    static int contador = 0;
    public  Aluno criarAluno(String nome, String email, String curso){
        if(nome == null || email == null || curso == null){
            return null;
        }
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        contador++;
        String matricula = ano+curso+contador;
        return new Aluno(nome, email, curso, matricula);
    }
    public  Professor criarProfessor(String nome, String email, String especialidade, String departamento){
        if (nome == null || email == null || especialidade == null || departamento == null){
            return null;
        }
        return new Professor(nome, email, especialidade, departamento);
    }
}
