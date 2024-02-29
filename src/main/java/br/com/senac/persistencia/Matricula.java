/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.persistencia;

import java.sql.Date;

/**
 *
 * @author lizz
 */
public class Matricula {
    private int ID;
    private Date Data;
    private Docente Docente;
    private Aluno Aluno;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public Docente getDocente() {
        return Docente;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }

    public Aluno getAluno() {
        return Aluno;
    }

    public void setAluno(Aluno Aluno) {
        this.Aluno = Aluno;
    }
}
