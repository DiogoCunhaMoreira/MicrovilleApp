package diogomoreira.microvilleApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Products");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Product product = new Product();

        product.setSpecie("Bróculos");
        product.setQuantity(10);

        //em.persist(product);

        em.remove(product.getProductId());
        em.getTransaction().commit();

        //System.out.println("ID do novo Produto é: " + product.getProductId());
        em.close();
       emf.close();

    }
}
