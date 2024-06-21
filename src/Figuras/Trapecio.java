package Figuras;

public interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
public class Trapecio implements FiguraGeometrica {
	    private String name;
	    private double baseMayor;
	    private double baseMenor;
	    private double altura;
	    private double lado1;
	    private double lado2;

	    // Constructor
	    public Trapecio(String name, double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
	        this.name = name;
	        this.baseMayor = baseMayor;
	        this.baseMenor = baseMenor;
	        this.altura = altura;
	        this.lado1 = lado1;
	        this.lado2 = lado2;
	    }

	    // Implementación de métodos de la interfaz FiguraGeometrica

	    @Override
	    public double calcularArea() {
	        return ((baseMayor + baseMenor) / 2) * altura; // Área del trapecio
	    }

	    @Override
	    public double calcularPerimetro() {
	        return baseMayor + baseMenor + lado1 + lado2; // Perímetro del trapecio
	    }

	    // Getters y setters

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getBaseMayor() {
	        return baseMayor;
	    }

	    public void setBaseMayor(double baseMayor) {
	        this.baseMayor = baseMayor;
	    }

	    public double getBaseMenor() {
	        return baseMenor;
	    }

	    public void setBaseMenor(double baseMenor) {
	        this.baseMenor = baseMenor;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	    public double getLado1() {
	        return lado1;
	    }

	    public void setLado1(double lado1) {
	        this.lado1 = lado1;
	    }

	    public double getLado2() {
	        return lado2;
	    }

	    public void setLado2(double lado2) {
	        this.lado2 = lado2;
	    }

	    @Override
	    public String toString() {
	        return "Trapecio [name=" + name + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura
	                + ", lado1=" + lado1 + ", lado2=" + lado2 + "]";
	    }
	}
}
