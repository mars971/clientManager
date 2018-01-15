package ECustomer;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@SequenceGenerator(name="SEQ_ID", sequenceName="S_CUSTOMER", allocationSize=1)
@Table(name="CUSTOMER")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ID")
    @Column(name="CUSTOMER_ID")
    private Integer id;

    @Column(name="STATUT")
    private String statut;

/*
    @Column(name="ADRESS")
    private Address.Address adressEntity;
*/

    @Column(name="SOCIAL_REASON")
    private String socialReason;

    @Column(name="DATE_CREATION")
    private Date dateCreation;

    @Column(name="SIRET")
    private String siret;

    @Column(name="SIREN")
    private String siren;

    @Column(name="APE")
    private String ape;

    @Column(name="SUMMARY")
    private String summary;

    @Column(name="NAF")
    private String naf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

/*
    public Address.Address getAdressEntity() {
        return adressEntity;
    }
*/

/*
    public void setAdressEntity(Address.Address adressEntity) {
        this.adressEntity = adressEntity;
    }
*/

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNaf() {
        return naf;
    }

    public void setNaf(String naf) {
        this.naf = naf;
    }
}
