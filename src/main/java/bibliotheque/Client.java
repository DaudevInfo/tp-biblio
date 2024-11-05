package bibliotheque;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table (name="client")
public class Client implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "NOM", length = 50)
    private String nom;

    @Column (name = "PRENOM", length = 50)
    private String prenom;

    @OneToMany(mappedBy="client")
    private Set<Emprunt> emprunts;

    public Client() {
        emprunts = new HashSet<Emprunt>();
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

    public Client setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Getter
     *
     * @return nom
     **/
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param : nom
     **/

    public Client setNom(String nom) {
        this.nom = nom;
        return this;
    }

    /**
     * Getter
     *
     * @return prenom
     **/
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter
     *
     * @param : prenom
     **/

    public Client setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    /**
     * Getter
     *
     * @return emprunts
     **/
    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    /**
     * Setter
     *
     * @param : emprunts
     **/

    public Client setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("client{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }
}
