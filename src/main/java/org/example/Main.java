package org.example;

import bibliotheque.Client;
import bibliotheque.Emprunt;
import bibliotheque.livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em;
        em = emf.createEntityManager();
        em.getTransaction().begin();

        //Lecture d'un livre
        for (int i = 1; i <100 ; i++) {
            livre livreLu = em.find(livre.class,i );
            if (livreLu != null) {
                System.out.println(livreLu);
            } else {
                break;
            }

        }


        for (int i = 1; i <100 ; i++) {
            Emprunt empruntlu = em.find(Emprunt.class,i );
            if (empruntlu != null) {
                System.out.println(empruntlu);
            } else {
                break;
            }
        }

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}