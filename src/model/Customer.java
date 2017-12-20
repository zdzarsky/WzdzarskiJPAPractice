package model;

import javax.persistence.Entity;

@Entity
public class Customer extends Company{
    private int discount;

    public Customer(String name, Address address, int discount){
        this.address = address;
        this.companyName = name;
        this.discount = discount;
    }



    public Customer() {

    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
