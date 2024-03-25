package CodoACodo.CatalogoNatura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
//@NoArgsConstructor
@Data

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String type;
    String name;
    String description;
    double precio;
    boolean enStock;

    public Product(String type, String name, String description, double precio, boolean enStock) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.precio = precio;
        this.enStock = enStock;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

}

