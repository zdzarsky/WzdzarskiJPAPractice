import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.*;


public class HibernateRunner {

    static SessionFactory sessionFactory = null;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
//           zadanie1();
       // zadanie2();
         zadanie8();

    }

    private static void zadanie1() {
//        try {
//            System.out.println("Enter product name: ");
//            String productName = reader.readLine();
//            System.out.println("Enter stock in unit");
//            int stocks = Integer.valueOf(reader.readLine());
//            Product p = new Product(productName, stocks);
//            Session s = getSessionFactory().openSession();
//            Transaction tx = s.beginTransaction();
//            s.save(p);
//            tx.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    private static void zadanie8() {
        Product p1 = new Product("GoPro Hero 4", 25);
        Product p2 = new Product("Lenovo Moto X Play", 250);
        Product p3 = new Product("Samsung Galaxy S5", 250);
        Map<Product, Integer> toSell = new HashMap<>();
        toSell.put(p1, 10);
        toSell.put(p2, 15);
        toSell.put(p3, 20);
        sell(toSell, new TransactionModel());

    }

    private static void sell(Map<Product, Integer> products, TransactionModel model) {
        Set<Product> prods = products.keySet();
        model.setProducts(prods);
        prods.forEach(x -> x.getIsSold().add(model));
        prods.forEach(x -> x.setUnitsInStock(x.getUnitsInStock() - products.get(x)));
        model.setQuantity(products);
        Session s = getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.persist(model);
        tx.commit();
    }

    private static void zadanie2() {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Address address = new Address("Czarnowiejska 48", "Cracow", "30-054");
        Supplier supplier1 = new Supplier("GoPro Technologies", address);
        Supplier supplier2 = new Supplier("Lenovo", address);
        Supplier supplier3 = new Supplier("Samsung", address);

        Product p1 = new Product("GoPro Hero 4", 25);
        Product p2 = new Product("Lenovo Moto X Play", 250);
        Product p3 = new Product("Samsung Galaxy S5", 250);

        p1.setSupplier(supplier1);
        p2.setSupplier(supplier2);
        p3.setSupplier(supplier3);

        List<Product> products1 = new ArrayList<>();
        products1.add(p1);
        supplier1.setProductSet(products1);


        session.save(supplier1);
        session.save(supplier2);
        session.save(supplier3);
        session.save(new Customer("AGH", address, 20));
        session.save(p1);
        session.save(p2);
        session.save(p3);

        tx.commit();
    }

    private static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}

