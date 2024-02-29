/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.persistencia;

/**
 *
 * @author lizz
 */
public class Aluno {
    private int ID;
    private String Nome;
    private int Sala;
    private String Ano;

    public int getNumero() {
        return ID;
    }

    public void setNumero(int Numero) {
        this.ID = Numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }
    
    
}
