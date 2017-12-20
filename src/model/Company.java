package model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Embedded
    protected Address address;
    protected String companyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
