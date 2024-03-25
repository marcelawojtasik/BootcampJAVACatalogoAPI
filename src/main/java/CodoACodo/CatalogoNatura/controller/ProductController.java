package CodoACodo.CatalogoNatura.controller;

import CodoACodo.CatalogoNatura.model.Product;
import CodoACodo.CatalogoNatura.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductServices productServices;

    @PostMapping("/crearProducto")
    public void createProduct(@RequestBody Product product) {
        productServices.createProduct(product);
    }

    @PostMapping("/agregarProductos")
    public void addProducts(@RequestBody List<Product> products) {
        productServices.addProducts(products);
    }

    @GetMapping("/{id}")
    public Product searchProductById(@PathVariable Integer id){
        return productServices.searchProductById(id);
    }
    @GetMapping("/productos")
    public List<Product> getAllProducts(){
        return productServices.searchAllProducts();
    }

    @GetMapping("/buscarPorTipo")
    public List<Product> searchProductByType(String type){
        return productServices.findByType(type);
    }

    @GetMapping("/buscarPorNombre")
    public List<Product> searchProductByName(String name){
        return productServices.findByName(name);
    }

    @GetMapping("/ofertas")
    public List<Product> getOffers(double offerPrice){
        return productServices.findByPrice(offerPrice);
    }

    @GetMapping("/buscarPorTipoYPrecio")
    public List<Product> typeAndPriceProducts(String type, double offerPrice){
        return productServices.findByTypeAndPrecio(type, offerPrice);
    }

    @GetMapping("/buscarPorTipoYNombre")
    public List<Product> typeAndNameProducts(String type, String name){
        return productServices.findByTypeAndName(type, name);
    }

    @PutMapping("/actualizarProducto/{id}")
    public Product updateProduct(@RequestBody Product product){
        return productServices.updateProduct(product);
    }

    @DeleteMapping("/eliminarProducto/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productServices.deleteProductById(id);
    }

    @DeleteMapping("/borrarProductos")
    public void deleteProducts(){
        productServices.deleteAllProduct();
    }




//    @GetMapping()
//    public String createProduct(){
//        //return "Producto creado desde el Controller";
//        return productServices.createProduct();
//    }
}
