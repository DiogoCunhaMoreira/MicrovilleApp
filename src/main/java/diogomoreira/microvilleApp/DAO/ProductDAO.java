package diogomoreira.microvilleApp.DAO;

import diogomoreira.microvilleApp.Product;

import java.util.List;

public interface ProductDAO {

    public void save(Product product);

    public List<Product> productList();

    public Product getById (int productId);

    public void delete (int productId);

    public void changeQuantity(int productId, int newQuantity);

}
