package CodoACodo.CatalogoNatura.service;

import CodoACodo.CatalogoNatura.model.Product;
import CodoACodo.CatalogoNatura.repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServices {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public void addProducts(List<Product> products) {
        productRepository.saveAll(products);
    }
    public Product searchProductById(Integer id) { //ver como mejorar con el if en caso q no exista el id
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> searchAllProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product) {
        productRepository.save(product);
        return productRepository.findById(product.getId()).orElse(null);
    }

    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }

    public void deleteAllProduct() {
        productRepository.deleteAll();
    }

    public List<Product> findByType(String type) {
        return productRepository.findByType(type);
    }

    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> findByPrice(double offerPrice) {
        List<Product> products = productRepository.findAll(); //traigo todos los prod
        List<Product> offerProducts = new ArrayList<>(); //instancio nuevo array para guardar lo q obtenga
        //Lógica para hallar los prod cuyo precio sea menor al ingresado x parámetro
        for (Product product : products) {
            if (product.getPrecio() < offerPrice) {
                offerProducts.add(product);
            }
        }
            return offerProducts;
        }
}


//    public String createProduct(){
//        String serv = "Producto creado desde el Service";
//        return serv;
//    }

