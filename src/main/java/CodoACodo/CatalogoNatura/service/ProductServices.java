package CodoACodo.CatalogoNatura.service;

import CodoACodo.CatalogoNatura.model.Product;
import CodoACodo.CatalogoNatura.repository.ProductRepository;
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

    public void deleteProductById(Integer id) {
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

    // FIND BY PRICE PROG FUNCIONAL
//    public List<Product>detectOffers(List<Product> products, double offerPrice){
//        return products.stream()
//            .filter(product -> product.getPrecio() < offerPrice)
//            .collect(Collectors.toList());
//    }
//    public List<Product> getOffers(double offerPrice){
//        List<Product> products = productRepository.findAll();
//        return detectOffers(products, offerPrice);
//    }


    public List<Product> findByTypeAndPrecio(String type, double offerPrice) {
        List<Product> products = productRepository.findAll();
        List<Product> typeAndPriceProducts = new ArrayList<>();
        for (Product product : products) {
            if ((product.getPrecio() < offerPrice) & (product.getType().equals(type))) {
                typeAndPriceProducts.add(product);
            }
//            else{
//                System.out.println("No hay productos que coincidan con los filtros solicitados");
//            }
        }
        return typeAndPriceProducts;
    }

    public List<Product> findByTypeAndName(String type, String name) {
        return productRepository.findByTypeAndName(type, name);
    }
}

/*

//    public String createProduct(){
//        String serv = "Producto creado desde el Service";
//        return serv;
//    }
*/
