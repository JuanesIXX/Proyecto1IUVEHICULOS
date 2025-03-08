// src/Main.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        boolean seguir = true;
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        List<Venta> listaVentas = new ArrayList<>();

        while (seguir) {
            System.out.println("Selecciona un tipo de vehículo:");
            System.out.println("1. Auto");
            System.out.println("2. Motocicleta");
            System.out.println("3. Camioneta");
            int eleccion = escaner.nextInt();
            escaner.nextLine(); // para que continue con la línea

            System.out.println("Ingrese el código del vehículo:");
            String id = escaner.nextLine();

            System.out.println("Ingrese la marca del vehículo:");
            String fabricante = escaner.nextLine();

            System.out.println("Ingrese el modelo del vehículo:");
            int año = escaner.nextInt();

            System.out.println("Ingrese el kilometraje del vehículo:");
            int km = escaner.nextInt();
            escaner.nextLine(); // sigue a la siguiente línea

            System.out.println("Ingrese el precio del vehículo:");
            double precio = escaner.nextDouble();
            escaner.nextLine();

            System.out.println("Ingrese el nombre del comprador:");
            String nombreComprador = escaner.nextLine();

            System.out.println("Ingrese el apellido del comprador:");
            String apellidoComprador = escaner.nextLine();

            System.out.println("Ingrese el documento del comprador:");
            String idComprador = escaner.nextLine();

            Vehiculo vehiculo = switch (eleccion) {
                case 1 -> new Auto(id, fabricante, año, km, precio);
                case 2 -> new Motocicleta(id, fabricante, año, km, precio);
                case 3 -> new Camioneta(id, fabricante, año, km, precio);
                default -> {
                    System.out.println("Opción no válida. Se registrará como vehículo otro.");
                    yield new Vehiculo(id, fabricante, "otro", año, km, precio);
                }
            };
            listaVehiculos.add(vehiculo);

            Venta venta = new Venta(precio, vehiculo, nombreComprador, apellidoComprador, idComprador);
            listaVentas.add(venta);

            System.out.println("Venta realizada:");
            System.out.println("Precio: " + venta.precio);
            System.out.println("Vehículo vendido: " + venta.vehiculoVendido.id);
            System.out.println("Comprador: " + venta.nombreComprador + " " + venta.apellidoComprador);
            System.out.println("Documento: " + venta.idComprador);

            System.out.println("¿Desea registrar otro vehículo? (si/no):");
            String respuesta = escaner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                seguir = false;
            }
        }

        System.out.println("Registro final:");
        for (Venta v : listaVentas) {
            System.out.println("Código: " + v.vehiculoVendido.id + ", Marca: " + v.vehiculoVendido.fabricante + ", Tipo: " + v.vehiculoVendido.tipo + ", Modelo: " + v.vehiculoVendido.año + ", Kilometraje: " + v.vehiculoVendido.km + ", Precio: " + v.vehiculoVendido.precio + ", Comprador: " + v.nombreComprador + " " + v.apellidoComprador + ", Documento: " + v.idComprador);
        }
    }
}