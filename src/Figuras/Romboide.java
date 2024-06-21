package Figuras;

public interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
public class Romboide implements FiguraGeometrica {
	    private String name;
	    private double base;
	    private double altura;
	    private double lado;

	    // Constructor
	    public Romboide(String name, double base, double altura, double lado) {
	        this.name = name;
	        this.base = base;
	        this.altura = altura;
	        this.lado = lado;
	    }

	    // Implementación de métodos de la interfaz FiguraGeometrica

	    @Override
	    public double calcularArea() {
	        return base * altura; // Área del romboide
	    }

	    @Override
	    public double calcularPerimetro() {
	        return 2 * (base + lado); // Perímetro del romboide
	    }

	    // Getters y setters

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getBase() {
	        return base;
	    }

	    public void setBase(double base) {
	        this.base = base;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	    public double getLado() {
	        return lado;
	    }

	    public void setLado(double lado) {
	        this.lado = lado;
	    }

	    @Override
	    public String toString() {
	        return "Romboide [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	    }
	}
}
