package br.com.barbershop.barbershop.entity;

import br.com.barbershop.barbershop.dto.BarberProductRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "barberproduct")
@Entity(name = "barberproduct")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class BarberProduct {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String image;
    private Double price;

    public BarberProduct(BarberProductRequestDTO data) {
        this.title = data.title();
        this.description = data.description();
        this.image = data.image();
        this.price = data.price();
    }
}
