   
abstract class Figura1 {
    
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }

}
class Circulo extends Figura1 {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura1 {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class Figura {
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(5);      
        Figura rectangulo = new Rectangulo(4, 6); 

        
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}

