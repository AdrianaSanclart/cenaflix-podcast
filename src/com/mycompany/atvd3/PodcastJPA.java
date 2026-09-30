
package com.mycompany.atvd3;

import jakarta.persistence.EntityManager;
import java.util.List;

public class PodcastJPA {

    private static String produtor;
    
    public static void cadastrar(Podcast p) {
        EntityManager manager = JPAConexao.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(p);
            manager.getTransaction().commit();            
        } catch (Exception e) {

            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            System.out.println("ERRO AO CADASTRAR PODCAST:");
            e.printStackTrace();

        } finally {
            manager.close();
        }
    }
    
    public static void excluir(int id) {
    EntityManager manager = JPAConexao.conectar();

    try {
        manager.getTransaction().begin();

        Podcast p = manager.find(Podcast.class, id);

        if (p != null) {
            manager.remove(p);
        }

        manager.getTransaction().commit();

    } catch (Exception e) {
        if (manager.getTransaction().isActive()) {
            manager.getTransaction().rollback();
        }
        throw e;

    } finally {
        manager.close();
    }
}
    
    public static List<Podcast> filtrarTodos() {
        EntityManager manager = JPAConexao.conectar();

    return manager.createQuery("SELECT p FROM Podcast p", Podcast.class).getResultList();
}
    
    public static List<Podcast> filtrarPorProdutor(String produtor) {
        EntityManager manager = JPAConexao.conectar();
        
        return manager.createQuery("SELECT p FROM Podcast p WHERE p.produtor LIKE :produtor", Podcast.class).setParameter("produtor", "%" + produtor + "%").getResultList();
    }

    public static List<Podcast> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
