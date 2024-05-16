package com.example.micro2.Infrastracture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.micro2.Domain.Compra;



@Repository
public interface CompraRepository extends JpaRepository<Compra,Long> {
}