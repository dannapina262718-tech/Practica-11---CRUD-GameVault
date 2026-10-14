package com.example.GameVault.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "juegos")
public class Juego {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     @Column(nullable = false)
     private Long id;

     @Column(length = 1000)
     private String titulo;

     @Column (name = "descripcion")
     private String descripcion;

     @Column
     private String portadaUrl;

     @Column
     private Double precio;

     @Column
     private String categoria;

     @ManyToOne
     @JoinColumn(name = "usuario_id")
     private Usuario usuario;
}
