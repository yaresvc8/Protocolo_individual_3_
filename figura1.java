abstract class Figura {
    public abstract double calcularArea();
}

public class figura1 {
    public static void main(String[] args) {
        // Intento de crear un objeto de una clase abstracta
        Figura f = new Figura(); // ERROR de compilación

        System.out.println(f.calcularArea());
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class figura1 {
    public static void main(String[] args) {
        Figura f = new Circulo(5); //  Ahora sí, una subclase concreta
        System.out.println("Área: " + f.calcularArea());
    }
}
