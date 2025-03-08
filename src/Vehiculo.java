// src/Vehiculo.java
public class Vehiculo {
    public String id;
    public String fabricante;
    public String tipo;
    public int año;
    public int km;
    public double precio;

    public Vehiculo() {
        this.id = "";
        this.fabricante = "";
        this.tipo = "";
        this.año = 0;
        this.km = 0;
    }

    public Vehiculo(String id, String fabricante, String tipo, int año, int km, double precio) {
        this.id = id;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.año = año;
        this.km = km;
        this.precio = precio;
    }
}