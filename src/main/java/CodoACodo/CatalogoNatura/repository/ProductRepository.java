package CodoACodo.CatalogoNatura.repository;

import CodoACodo.CatalogoNatura.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByType(String Type);
    List<Product> findByName(String Name);
}