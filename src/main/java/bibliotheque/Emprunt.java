package bibliotheque;

import jakarta.persistence.*;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="emprunt")
public class Emprunt implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "DATE_DEBUT")
    private LocalDate dateDebut ;

    @Column (name = "DATE_FIN")
    private LocalDate dateFin ;

    @Column (name = "DELAI")
    private int delai ;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    public Emprunt() {
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

    public Emprunt setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Getter
     *
     * @return dateDebut
     **/
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter
     *
     * @param : dateDebut
     **/

    public Emprunt setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
        return this;
    }

    /**
     * Getter
     *
     * @return dateFin
     **/
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * Setter
     *
     * @param : dateFin
     **/

    public Emprunt setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
        return this;
    }

    /**
     * Getter
     *
     * @return delai
     **/
    public int getDelai() {
        return delai;
    }

    /**
     * Setter
     *
     * @param : delai
     **/

    public Emprunt setDelai(int delai) {
        this.delai = delai;
        return this;
    }

    /**
     * Getter
     *
     * @return client
     **/
    public Client getClient() {
        return client;
    }

    /**
     * Setter
     *
     * @param : client
     **/

    public Emprunt setClient(Client client) {
        this.client = client;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("emprunt{");
        sb.append("id=").append(id);
        sb.append(", dateDebut=").append(dateDebut);
        sb.append(", dateFin=").append(dateFin);
        sb.append(", delai=").append(delai);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emprunt emprunt)) return false;
        return Objects.equals(dateDebut, emprunt.dateDebut) && Objects.equals(client, emprunt.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateDebut, client);
    }
}