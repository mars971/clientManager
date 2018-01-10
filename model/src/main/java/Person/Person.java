package Person;

import Observation.Observation;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@SequenceGenerator(name="SEQ_ID", sequenceName="S_PERSON", allocationSize=1)
@Table(name="PERSON")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ID")
    @Column(name="PERSON_ID")
    private Integer id;

    @Column(name="NAME")
    private String name;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="AGE")
    private String age;

    @OneToMany(mappedBy="observations")
    private List<Observation> observationList;

    @Column(name="DATE_BIRTH")
    private Date dateOfBirth;

    @Column(name="DATE_HIRING")
    private Date dateHiring;

    @Column(name="LOGIN")
    private String login;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PSEUDO")
    private String pseudo;

    @Column(name="AVATAR")
    private Object avatar;

/*
    @OneToMany(mappedBy="adresses")
    private List<Address.Address> adressEntityList;
*/

    public Person() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateHiring() {
        return dateHiring;
    }

    public void setDateHiring(Date dateHiring) {
        this.dateHiring = dateHiring;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

}
