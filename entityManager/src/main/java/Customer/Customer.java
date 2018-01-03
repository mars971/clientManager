package Customer;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name="SEQ_ID", sequenceName="S_CUSTOMER", allocationSize=1)
@Table(name="CUSTOMER")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ID")
    @Column(name="CUSTOMER_ID")
    private Integer id;

    @Column(name="STATUT")
    private String statut;

    @Column(name="ADRESS")
    private Adresse adress;

    @Column(name="SOCIAL_REASON")
    private String socialReason;

    @Column(name="DATE_CREATION")
    private Date dateCreation

    @Column(name="SIRET")
    private String SIRET;

    @Column(name="SIREN")
    private String SIREN;

    @Column(name="APE")
    private String APE;

    @Column(name="SUMMARY")
    private String summary;

    @Column(name="NAF")
    private String NAF

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

    public Adresse getAdress() {
        return adress;
    }

    public void setAdress(Adresse adress) {
        this.adress = adress;
    }

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

    public String getSIRET() {
        return SIRET;
    }

    public void setSIRET(String SIRET) {
        this.SIRET = SIRET;
    }

    public String getSIREN() {
        return SIREN;
    }

    public void setSIREN(String SIREN) {
        this.SIREN = SIREN;
    }

    public String getAPE() {
        return APE;
    }

    public void setAPE(String APE) {
        this.APE = APE;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNAF() {
        return NAF;
    }

    public void setNAF(String NAF) {
        this.NAF = NAF;
    }
}
