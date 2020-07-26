package diogomoreira.microvilleApp.DAO;

import diogomoreira.microvilleApp.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Product product) {

        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(product);
        tx.commit();
        session.close();
    }

    public List<Product> productList() {

        Session session = this.sessionFactory.openSession();

        List<Product> productList = session.createQuery("from Product").list();
        session.close();
        return productList;
    }

    public Product getById(int productId) {
        Session session = this.sessionFactory.openSession();
        Product product = session.get(Product.class, productId);
        session.close();
        return product;
    }

    public void delete(int productId) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(session.get(Product.class, productId));
        tx.commit();
        session.close();

    }

    public void changeQuantity(int productId, int newQuantity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Product productToChange = getById(productId);
        productToChange.setQuantity(newQuantity);
        session.update(productToChange);
        tx.commit();
        session.close();
    }

}
