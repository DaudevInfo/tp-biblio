package bibliotheque;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.io.Serializable;

@Entity
@Table (name="livre")
public class livre implements Serializable {

    @Id
    @Column (name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "TITRE")
    private String titre;

    @Column (name = "AUTEUR", length = 50)
    private String auteur;

    public livre() {
    }

    public livre(String titre, String auteur) {
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

    public livre setId(int id) {
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

    public livre setTitre(String titre) {
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

    public livre setAuteur(String auteur) {
        this.auteur = auteur;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("livre ");
        sb.append("id=").append(id);
        sb.append(", titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        return sb.toString();
    }
}
