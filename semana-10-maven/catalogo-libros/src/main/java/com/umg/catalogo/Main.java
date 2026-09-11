package com.umg.catalogo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        libros.add(
                new Libro(
                        1L,
                        "El Principito",
                        "Antoine de Saint-Exupéry",
                        true
                )
        );

        libros.add(
                new Libro(
                        2L,
                        "Cien años de soledad",
                        "Gabriel García Márquez",
                        false
                )
        );

        libros.add(
                new Libro(
                        3L,
                        "Don Quijote de la Mancha",
                        "Miguel de Cervantes",
                        true
                )
        );

        System.out.println("===== CATÁLOGO DE LIBROS =====");

        for (Libro libro : libros) {
            System.out.println(libro);
        }

        int disponibles = 0;

        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                disponibles++;
            }
        }

        System.out.println("\nLibros registrados: " + libros.size());

        System.out.println("Libros disponibles: " + disponibles);
    }
}