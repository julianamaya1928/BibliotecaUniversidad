package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;
    private int numeroPrestamos;
    private int antiguedad;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo,int numeroPrestamos, int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = calcularSalario(numeroPrestamos, antiguedad);
        this.numeroPrestamos = aumentarPrestamos();
        this.antiguedad = antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroPrestamos() {
        return numeroPrestamos;
    }

    public void setNumeroPrestamos(int numeroPrestamos) {
        this.numeroPrestamos = numeroPrestamos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "nombre : " + nombre + ", cedula : " + cedula + ", salario : " + salario + ", telefono : "
                + telefono + ", numeroPrestamos : " + numeroPrestamos + ", correo : " + correo + ", antiguedad : "
                + antiguedad;
    }

    public double calcularSalario(int numeroPrestamos, int antiguedad){
        double porcentaje = numeroPrestamos*0.20;
        double bonificacion =  porcentaje*(antiguedad*0.02);
        double total = porcentaje+bonificacion;
        return total;     
    }

    public int aumentarPrestamos(){
        return numeroPrestamos++;
    }
    
    
}
