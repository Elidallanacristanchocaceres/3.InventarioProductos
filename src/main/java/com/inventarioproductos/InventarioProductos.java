package com.inventarioproductos;

import java.util.*;

public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> inventario = new HashMap<>();

        // 1.cantidad de categorías
        System.out.print("Ingrese la cantidad de categorías: ");
        int cantidadCategorias = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

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

        int opcion;
        do {
            //menu
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Mostrar productos de una categoría");
            System.out.println("2. Agregar un producto a una categoría existente");
            System.out.println("3. Mostrar todas las categorías y productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // 3.ver productos de una categoria
                    System.out.print("\nIngrese la categoría a consultar: ");
                    String categoriaBuscada = scanner.nextLine();
                    if (inventario.containsKey(categoriaBuscada)) {
                        System.out.println("Productos en " + categoriaBuscada + ": " + inventario.get(categoriaBuscada));
                    } else {
                        System.out.println("La categoría no existe.");
                    }
                    break;

                case 2:
                    // 4.agregar productos
                    System.out.print("\nIngrese la categoría donde quiere agregar un producto: ");
                    String categoriaAgregar = scanner.nextLine();
                    if (inventario.containsKey(categoriaAgregar)) {
                        System.out.print("Ingrese el nombre del producto a agregar: ");
                        String nuevoProducto = scanner.nextLine();
                        inventario.get(categoriaAgregar).add(nuevoProducto);
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("La categoría no existe.");
                    }
                    break;

                case 3:
                    // 5.mostrar el listado
                    System.out.println("\nInventario completo:");
                    for (Map.Entry<String, List<String>> entry : inventario.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
      

        scanner.close();
    }
}

