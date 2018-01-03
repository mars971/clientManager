package Adress;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name="SEQ_ID", sequenceName="S_ADRESS", allocationSize=1)
@Table(name="ADRESS")
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_ID")
    @Column(name="ADRESS_ID")
    private Integer id;

    @Column(name="CP")
    private String cp;

    @Column(name="VILLE")
    private String ville;

    @Column(name="DEPARTMENT")
    private String department;

    @Column(name="REGION")
    private String region;

    @Column(name="ROUTE")
    private String route;

    @Column(name="IMMEUBLE")
    private String immeuble;

    @Column(name="VOIE")
    private String voie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getImmeuble() {
        return immeuble;
    }

    public void setImmeuble(String immeuble) {
        this.immeuble = immeuble;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }
}
