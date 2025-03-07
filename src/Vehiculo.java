public class Vehiculo {
    public String codigo;
    public String marca;
    public String tipo;
    public int modelo;
    public int kilometraje;
    public double monto;


    public Vehiculo() {
        this.codigo = "";
        this.marca = "";
        this.tipo = "";
        this.modelo = 0;
        this.kilometraje = 0;
    }


    public Vehiculo(String codigo, String marca, String tipo, int modelo, int kilometraje, double monto) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.monto = monto;
    }
}


