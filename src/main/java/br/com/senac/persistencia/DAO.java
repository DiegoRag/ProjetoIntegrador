/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.persistencia;

import java.util.List;

/**
 *
 * @author lizz
 */
public abstract class DAO<T> {

    public abstract void cadastrar(T objeto);
    
    public abstract List<T> listar();
    
     public abstract void excluirPorId(int id);
}
