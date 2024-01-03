import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductoAlimentos productoAlimentos = null;
        ProductoElectro productoElectro = null;
        ProductoRopa productoRopa = null;

        char opcion;
        do {
            mostrarMenu();
            opcion = scanner.next().charAt(0);
            scanner.nextLine();

            switch (opcion) {
                case '1':
                    productoAlimentos = ingresarProductoAlimenticio(scanner);
                    break;
                case '2':
                    productoElectro = ingresarProductoElectronico(scanner);
                    break;
                case '3':
                    productoRopa = ingresarProductoRopa(scanner);
                    break;
                case '4':
                    mostrarInformacionProductos(productoAlimentos, productoElectro, productoRopa);
                    break;
                case '0':
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != '0');


        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n---- Menú ----");
        System.out.println("1. Ingresar producto alimenticio");
        System.out.println("2. Ingresar producto electrónico");
        System.out.println("3. Ingresar producto de ropa");
        System.out.println("4. Mostrar información de los productos ingresados");
        System.out.println("0. Salir");
        System.out.print("Ingrese la opción: ");
    }

    private static ProductoAlimentos ingresarProductoAlimenticio(Scanner scanner) {
        System.out.println("\nIngrese información del producto alimenticio:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Fecha de caducidad: ");
        String fechaCaducidad = scanner.nextLine();

        return new ProductoAlimentos(nombre, precio, fechaCaducidad);
    }

    private static ProductoElectro ingresarProductoElectronico(Scanner scanner) {
        System.out.println("\nIngrese información del producto electrónico:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        return new ProductoElectro(nombre, precio, marca);
    }

    private static ProductoRopa ingresarProductoRopa(Scanner scanner) {
        System.out.println("\nIngrese información del producto de ropa:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Talla: ");
        String talla = scanner.nextLine();

        return new ProductoRopa(nombre, precio, talla);
    }

    private static void mostrarInformacionProductos(
            ProductoAlimentos productoAlimenticio,
            ProductoElectro productoElectronico,
            ProductoRopa productoRopa) {
        System.out.println("\nInformación de los productos:");

        if (productoAlimenticio != null) {
            System.out.println("\nProducto Alimenticio:");
            productoAlimenticio.mostrarInformacion();
        }

        if (productoElectronico != null) {
            System.out.println("\nProducto Electrónico:");
            productoElectronico.mostrarInformacion();
        }

        if (productoRopa != null) {
            System.out.println("\nProducto de Ropa:");
            productoRopa.mostrarInformacion();
        }

    }
}
