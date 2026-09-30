package com.mycompany.atvd3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class JPAConexao {
    
    private static String PERSISTENCE_UNIT = "cenaflixpodcast";
    private static EntityManager manager;
    private static EntityManagerFactory factory;
    
    public static EntityManager conectar() {
        if(factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if (manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
        }
        return manager;
    }
}
