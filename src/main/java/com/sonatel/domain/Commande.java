package com.sonatel.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Commande.
 */
@Entity
@Table(name = "commande")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Commande implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "referentiel", nullable = false, unique = true)
    private String referentiel;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private String userId;

    @NotNull
    @Column(name = "date_commande", nullable = false)
    private Instant dateCommande;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Commande id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferentiel() {
        return this.referentiel;
    }

    public Commande referentiel(String referentiel) {
        this.setReferentiel(referentiel);
        return this;
    }

    public void setReferentiel(String referentiel) {
        this.referentiel = referentiel;
    }

    public String getUserId() {
        return this.userId;
    }

    public Commande userId(String userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Instant getDateCommande() {
        return this.dateCommande;
    }

    public Commande dateCommande(Instant dateCommande) {
        this.setDateCommande(dateCommande);
        return this;
    }

    public void setDateCommande(Instant dateCommande) {
        this.dateCommande = dateCommande;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Commande)) {
            return false;
        }
        return getId() != null && getId().equals(((Commande) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Commande{" +
            "id=" + getId() +
            ", referentiel='" + getReferentiel() + "'" +
            ", userId='" + getUserId() + "'" +
            ", dateCommande='" + getDateCommande() + "'" +
            "}";
    }
}
