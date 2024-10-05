package br.com.barbershop.barbershop.dto;

import br.com.barbershop.barbershop.entity.BarberProduct;

public record BarberProductResponseDTO(int id, String title, String description, String image, Double price) {
    public BarberProductResponseDTO(BarberProduct barberProduct) {
        this(barberProduct.getId(),
                barberProduct.getTitle(),
                barberProduct.getDescription(),
                barberProduct.getImage(),
                barberProduct.getPrice());
    }
}
