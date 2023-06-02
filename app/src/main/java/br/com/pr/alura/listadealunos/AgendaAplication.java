package br.com.pr.alura.listadealunos;

import android.app.Application;

import br.com.pr.alura.listadealunos.dao.AlunoDao;
import br.com.pr.alura.listadealunos.model.Aluno;

public class AgendaAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunoDeTeste();
    }

    private static void criaAlunoDeTeste() {
        AlunoDao dao = new AlunoDao();
        dao.salvar(new Aluno("Leonardo", "991851861", "boreiko@alura.com.br"));
        dao.salvar(new Aluno("Fernanda", "998455897", "ferboreiko@gmail.com"));
        dao.salvar(new Aluno("Gabriela", "665669633", "gabiboreiko@gmail.com"));
    }
}
