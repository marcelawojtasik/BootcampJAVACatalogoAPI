package CodoACodo.CatalogoNatura.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    int id;
    String type;
    String name;
    String description;
    double precio;
    boolean enStock;

    public Product(int id, String type, String name, String description, double precio, boolean enStock) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.precio = precio;
        this.enStock = enStock;
    }
}
