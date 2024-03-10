package CodoACodo.CatalogoNatura.service;

import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    public String createProduct(){
        String serv = "Producto creado desde el Service";
        return serv;
    }


}
