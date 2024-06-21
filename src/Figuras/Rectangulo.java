package Figuras;

public interface FiguraGeometrica {
    String getName();
    double calcularPerimetro();
    double calcularArea();
public class Rectangulo implements FiguraGeometrica {
	    private String nombre;
	    private double base;
	    private double altura;

	    // Constructor
	    public Rectangulo(String nombre, double base, double altura) {
	        this.nombre = nombre;
	        this.base = base;
	        this.altura = altura;
	    }

	    // Métodos de la interfaz FiguraGeometrica

	    @Override
	    public String getName() {
	        return this.nombre;
	    }

	    @Override
	    public double calcularPerimetro() {
	        return 2 * (base + altura);
	    }

	    @Override
	    public double calcularArea() {
	        return base * altura;
	    }

	    // Getters y Setters

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
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

	    // Método toString para representación textual

	    @Override
	    public String toString() {
	        return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	    }
	}
}
