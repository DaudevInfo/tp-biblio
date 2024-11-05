package bibliotheque;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name="livre")
public class Livre implements Serializable {

    @Id
    @Column (name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "TITRE")
    private String titre;

    @Column (name = "AUTEUR", length = 50)
    private String auteur;

    public Livre() {
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    /**
     * Getter
     *
     * @return id
     **/
    public int getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param : id
     **/

    public Livre setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Getter
     *
     * @return titre
     **/
    public String getTitre() {
        return titre;
    }

    /**
     * Setter
     *
     * @param : titre
     **/

    public Livre setTitre(String titre) {
        this.titre = titre;
        return this;
    }

    /**
     * Getter
     *
     * @return auteur
     **/
    public String getAuteur() {
        return auteur;
    }

    /**
     * Setter
     *
     * @param : auteur
     **/

    public Livre setAuteur(String auteur) {
        this.auteur = auteur;
        return this;
    }

    @Override
    public String toString() {
        String sb = "livre " + "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'';
        return sb;
    }
}
