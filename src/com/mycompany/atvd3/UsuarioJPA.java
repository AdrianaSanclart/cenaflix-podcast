package com.mycompany.atvd3;

import jakarta.persistence.EntityManager;

public class UsuarioJPA {
    
    public static Usuario autenticar(String login, String senha) {

        EntityManager manager = JPAConexao.conectar();

        try {

            return manager.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class)
            .setParameter("login", login)
            .setParameter("senha", senha)
            .getResultStream()
            .findFirst()
            .orElse(null);

        } finally {
            manager.close();
        }
    }
  }

