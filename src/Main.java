import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//definir la clase vehiculo

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        List<Vehiculo> vehiculos = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();

        while (continuar) {
            System.out.println("seleciona un tipo de vehiculo:");
            System.out.println("1. Auto");
            System.out.println("2. Motocicleta");
            System.out.println("3. Camioneta");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // para que continue con la linea

            System.out.println("Ingrese el código del vehículo:");
            String codigo = scanner.nextLine();

            System.out.println("Ingrese la marca del vehículo:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el modelo del vehículo:");
            int modelo = scanner.nextInt();

            System.out.println("Ingrese el km del vehículo:");
            int kilometraje = scanner.nextInt();
            scanner.nextLine(); // sigue a la siguiente lineaaa

            System.out.println("Ingrese el monto del vehículo:");
            double monto = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese el nombre del comprador:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del comprador:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese el documento del comprador:");
            String documento = scanner.nextLine();
                //               swtich mejorado
            Vehiculo vehiculo = switch (opcion) {
                case 1 -> new Auto(codigo, marca, modelo, kilometraje, monto);
                case 2 -> new Motocicleta(codigo, marca, modelo, kilometraje, monto);
                case 3 -> new Camioneta(codigo, marca, modelo, kilometraje, monto);
                default -> {
                    System.out.println("Opción no válida. Se registrará como vehículo otro.");
                    yield new Vehiculo(codigo, marca, "otro", modelo, kilometraje, monto);
                }
            };
            vehiculos.add(vehiculo);

            // guardar venta
            Venta venta = new Venta(monto, vehiculo, nombre, apellido, documento);
            ventas.add(venta);

            // detalles de la venta
            System.out.println("Venta realizada:");
            System.out.println("Monto: " + venta.monto);
            System.out.println("Vehículo vendido: " + venta.vehiculoVendido.codigo);
            System.out.println("Comprador: " + venta.nombre + " " + venta.apellido);
            System.out.println("Documento: " + venta.documento);

            System.out.println("¿Desea registrar otro vehículo? (si/no):");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        // Impresion final
        System.out.println("Registro final :");
        for (Venta v : ventas) {
            System.out.println("Código: " + v.vehiculoVendido.codigo + ", Marca: " + v.vehiculoVendido.marca + ", Tipo: " + v.vehiculoVendido.tipo + ", Modelo: " + v.vehiculoVendido.modelo + ", Kilometraje: " + v.vehiculoVendido.kilometraje + ", Monto: " + v.vehiculoVendido.monto + ", Comprador: " + v.nombre + " " + v.apellido + ", Documento: " + v.documento);
        }
    }
}

//definir la clase vehiculo