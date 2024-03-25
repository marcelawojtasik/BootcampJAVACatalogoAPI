package CodoACodo.CatalogoNatura.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private static Product product;

    @Test
    public void setAndGetTypeTest(){
        String testedType=("Perfume");
        product.setType(testedType); //si le paso una cadena distinta a la testedType, el test falla

        System.out.println("Se le asigna el tipo de producto " + testedType);
        Assertions.assertEquals(product.getType(), testedType);
    }

    @BeforeAll
    public static void setUp(){
        System.out.println("Se está creando el producto");
        product = new Product();
    }

}