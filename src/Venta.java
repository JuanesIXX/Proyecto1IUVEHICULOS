// src/Venta.java
public class Venta {
    public double precio;
    public Vehiculo vehiculoVendido;
    public String apellidoComprador;
    public String nombreComprador;
    public String idComprador;

    public Venta(double precio, Vehiculo vehiculoVendido, String apellidoComprador, String nombreComprador, String idComprador) {
        this.precio = precio;
        this.vehiculoVendido = vehiculoVendido;
        this.apellidoComprador = apellidoComprador;
        this.nombreComprador = nombreComprador;
        this.idComprador = idComprador;
    }
}