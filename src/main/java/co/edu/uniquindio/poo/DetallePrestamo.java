package co.edu.uniquindio.poo;


public class DetallePrestamo {
    private Libro libro;
    private int cantidad;
    private double valor;

    public DetallePrestamo(Libro libro, int cantidad, double valor) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getvalor() {
        return valor;
    }

    public void setvalor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " El Detalle del prestamo es : Libro : " + libro + ", cantidad : " + cantidad + ", valor : " + valor;
    }
}

