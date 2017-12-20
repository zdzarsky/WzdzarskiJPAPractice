package model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
public class TransactionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionNumber;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private Set<Product> products;

    @MapKeyJoinColumn
    @ElementCollection
    private Map<Product, Integer> quantity;

    public TransactionModel() {
    }


    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Map<Product, Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(Map<Product, Integer> quantity) {
        this.quantity = quantity;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
