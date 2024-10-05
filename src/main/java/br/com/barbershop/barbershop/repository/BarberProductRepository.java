package br.com.barbershop.barbershop.repository;

import br.com.barbershop.barbershop.entity.BarberProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberProductRepository extends JpaRepository<BarberProduct, Integer> {
}
