package entity;

import java.util.List;

@Entity
@SequenceGenerator(name="SEQ_ID", sequenceName="S_PERSON", allocationSize=1)
@Table(name="PERSON")
public class Person {

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

    @OneToMany(mappedBy="adresses")
    private List<Adress> adressList;
}
