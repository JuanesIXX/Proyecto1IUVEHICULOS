public class Venta {
    public double monto;
    public Vehiculo vehiculoVendido;
    public String apellido;
    public String nombre;
    public String documento;

    public Venta(double monto, Vehiculo vehiculoVendido, String apellido, String nombre, String documento) {
        this.monto = monto;
        this.vehiculoVendido = vehiculoVendido;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }
}