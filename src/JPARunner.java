import model.Product;
import model.Supplier;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class JPARunner {


    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.
//                createEntityManagerFactory("myDatabaseConfig");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction etx = em.getTransaction();
//        etx.begin();
//        Supplier supplier1 = new Supplier("GoPro Technologies", "Czarnowiejska 10", "Cracow");
//        Supplier supplier2 = new Supplier("Lenovo", "Lea 15", "Cracow");
//        Supplier supplier3 = new Supplier("Samsung", "Tomasza 25", "Cracow");
//
//        Product p1 = new Product ("GoPro Hero 4", 25);
//        Product p2 = new Product("Lenovo Moto X Play", 250);
//        Product p3 = new Product("Samsung Galaxy S5", 250);
//
//        p1.setSupplier(supplier1);
//        p2.setSupplier(supplier2);
//        p3.setSupplier(supplier3);
//
//        List<Product> products1 = new ArrayList<>();
//        products1.add(p1);
//        List<Product> products2 = new ArrayList<>();
//        products2.add(p2);
//        List<Product> products3 = new ArrayList<>();
//        products3.add(p3);
//
//        supplier1.setProductSet(products1);
//        supplier2.setProductSet(products2);
//        supplier3.setProductSet(products3);
//
//        em.persist(supplier1);
//        em.persist(supplier2);
//        em.persist(supplier3);
//
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        etx.commit();
    }
}
