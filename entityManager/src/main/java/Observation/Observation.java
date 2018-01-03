package Observation;

import Person.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@SequenceGenerator(name="SEQ_ID", sequenceName="S_OBSERVATION", allocationSize=1)
@Table(name="OBSERVATION")
public class Observation implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ID")
    @Column(name="OBSERVATION_ID")
    private Integer id;

    @Column(name="DATE_INSERTION")
    private Date dateInsertion;

    @Column(name="MESSAGE")
    private String message;

    @Column(name="AUTHOR")
    private Person author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(Date dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

}
