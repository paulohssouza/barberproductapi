package br.com.barbershop.barbershop.controller;

import br.com.barbershop.barbershop.dto.BarberProductRequestDTO;
import br.com.barbershop.barbershop.dto.BarberProductResponseDTO;
import br.com.barbershop.barbershop.entity.BarberProduct;
import br.com.barbershop.barbershop.repository.BarberProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("barberproduct")
public class BarberProductController {

    private final BarberProductRepository repository;

    public BarberProductController(BarberProductRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<BarberProductResponseDTO> getAllBarberProducts() {
        return repository.findAll().stream().map(BarberProductResponseDTO :: new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveBarberProduct(@RequestBody BarberProductRequestDTO data) {
        BarberProduct barberProduct = new BarberProduct(data);
        repository.save(barberProduct);
    }
}
