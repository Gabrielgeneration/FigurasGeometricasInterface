package Figuras;
public interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
public class Cuadrado implements FiguraGeometrica {
	    private String nombre;
	    private double lado;
	    
	    // Constructor
	    public Cuadrado(String nombre, double lado) {
	        super();
	        this.nombre = nombre;
	        this.lado = lado;
	    }
	    
	    // Implementación de métodos de la interfaz FiguraGeometrica
	    @Override
	    public double calcularArea() {
	        return (lado * lado); // Calcula el área del cuadrado
	    }
	    
	    @Override
	    public double calcularPerimetro() {
	        return (lado * 4); // Calcula el perímetro del cuadrado
	    }
	    
	    // Getters y Setters
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public double getLado() {
	        return lado;
	    }
	    
	    public void setLado(double lado) {
	        this.lado = lado;
	    }
	    
	    // Override del método toString()
	    @Override
	    public String toString() {
	        return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	    }
	}
}

