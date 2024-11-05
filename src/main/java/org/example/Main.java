package org.example;

import bibliotheque.Emprunt;
import bibliotheque.Livre;
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

        //Lecture d'un livre et emprunt associé
        for (int i = 1; i <100 ; i++) {
            Livre livreLu = em.find(Livre.class,i );
            if (livreLu != null) {
                System.out.println(livreLu);
                for (Emprunt e : livreLu.getEmprunts()) {
                    System.out.println(e);
                }
            } else {
                break;
            }

        }


        for (int i = 1; i <100 ; i++) {
            Emprunt empruntlu = em.find(Emprunt.class,i );
            if (empruntlu != null) {
                System.out.println(empruntlu);
                for (Livre l : empruntlu.getLivres()) {
                    System.out.println(l);
                }

            } else {
                break;
            }
        }



        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}