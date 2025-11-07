abstract class Empleado1 {
    protected String nombre;

    public Empleado1(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
        System.out.println("--------------------------");
    }
}

class Gerente extends Empleado1 {
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
}

class Vendedor extends Empleado1 {
    private double salarioBase;
    private double comisionPorVenta;
    private int cantidadVentas;

    public Vendedor(String nombre, double salarioBase, double comisionPorVenta, int cantidadVentas) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comisionPorVenta = comisionPorVenta;
        this.cantidadVentas = cantidadVentas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comisionPorVenta * cantidadVentas);
    }
}

public class Empleado {
    public static void main(String[] args) {
       
        Empleado gerente = new Gerente("Laura Gómez", 3000, 800);
        Empleado vendedor = new Vendedor("Carlos Pérez", 1500, 100, 10);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
