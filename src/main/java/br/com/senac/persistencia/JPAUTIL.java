/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.persistencia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author lizz
 */
public class JPAUTIL {
     private static final String PERSISTENCE_UNIT = "SchoolManager-PU";

    private static EntityManager em;
    private static EntityManagerFactory fabrica;

    //cria a entidade se ela estiver nula e a retorna
    public static EntityManager getEntityManager() {
        if (fabrica == null || !fabrica.isOpen()) {
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (em == null || !em.isOpen()) //cria se em nulo ou se o entity manager foi fechado
        {
            em = fabrica.createEntityManager();
        }

        return em;
    }

    //fecha o EntityManagere e o factory
    public static void closeEntityManager() {
        if(em.isOpen() && em != null){
        em.close();
        fabrica.close();
        }
    }



}
