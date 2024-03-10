package CodoACodo.CatalogoNatura.controller;

import CodoACodo.CatalogoNatura.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductServices productServices;

    @GetMapping()
    public String createProduct(){
        //return "Producto creado desde el Controller";
        return productServices.createProduct();
    }
}
