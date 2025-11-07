abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario base: " + calcularSalario());
    }
}

class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" Gerente: " + nombre);
        System.out.println("Salario total (con bono): $" + calcularSalario());
    }
}

public class Empleado1 {
    public static void main(String[] args) {
        Gerente g = new Gerente("Laura Gómez", 3000, 800);
        g.mostrarDetalles(); 
    }
}
