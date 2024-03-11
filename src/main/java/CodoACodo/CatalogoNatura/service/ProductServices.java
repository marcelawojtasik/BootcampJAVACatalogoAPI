package CodoACodo.CatalogoNatura.service;

import CodoACodo.CatalogoNatura.model.Product;
import CodoACodo.CatalogoNatura.repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


//    public String createProduct(){
//        String serv = "Producto creado desde el Service";
//        return serv;
//    }
}
