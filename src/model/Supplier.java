package model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Supplier extends Company{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany
    private List<Product> productSet;


    public Supplier(String name, Address address) {
        this.companyName = name;
        this.address = address;
    }

    public Supplier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(List<Product> productSet) {
        this.productSet = productSet;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
