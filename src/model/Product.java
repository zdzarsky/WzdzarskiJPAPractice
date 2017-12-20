package model;


import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productName;
    private int unitsInStock;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<TransactionModel> isSold = new LinkedList<>();

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Category category;

    public Product(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(String productName, int stocks) {
        this.productName = productName;
        this.unitsInStock = stocks;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<TransactionModel> getIsSold() {
        return isSold;
    }

    public void setIsSold(List<TransactionModel> isSold) {
        this.isSold = isSold;
    }
}
