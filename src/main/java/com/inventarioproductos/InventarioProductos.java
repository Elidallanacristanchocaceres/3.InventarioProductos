package com.inventarioproductos;

import java.util.*;

public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> inventario = new HashMap<>();

        // 1.cantidad de categorías
        System.out.print("Ingrese la cantidad de categorías: ");
        int cantidadCategorias = scanner.nextInt();
        scanner.nextLine(); 

        // 2.productos en cada categoria
        for (int i = 0; i < cantidadCategorias; i++) {
            System.out.print("Ingrese el nombre de la categoría " + (i + 1) + ": ");
            String categoria = scanner.nextLine();

            System.out.print("Ingrese la cantidad de productos en " + categoria + ": ");
            int cantidadProductos = scanner.nextInt();
            scanner.nextLine(); 

            List<String> productos = new ArrayList<>();
            for (int j = 0; j < cantidadProductos; j++) {
                System.out.print("Ingrese el nombre del producto " + (j + 1) + ": ");
                productos.add(scanner.nextLine());
            }

            inventario.put(categoria, productos);
        }

      

        scanner.close();
    }
}

