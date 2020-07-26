package diogomoreira.microvilleApp;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int productId;

    @Column(name = "Specie")
    private String specie;

    @Column(name = "Quantity")
    private int quantity;

    public int getProductId() {
        return productId;
    }

    public String getSpecie() {
        return specie;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "productId=" + productId +
                ", specie='" + specie + '\'' +
                ", quantity=" + quantity;
    }

}

