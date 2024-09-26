package com.example.ptf.repositories;


import com.example.ptf.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
      
    // Método para encontrar produtos por nome (opcional)
    List<Product> findByName(String name);
}
