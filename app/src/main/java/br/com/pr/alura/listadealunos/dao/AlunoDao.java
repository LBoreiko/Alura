package br.com.pr.alura.listadealunos.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.pr.alura.listadealunos.model.Aluno;

public class AlunoDao {
    private final static List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todosalunos() {
        return new ArrayList<>(alunos);
    }
}
