package Figuras;

public interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
public class Rombo implements FiguraGeometrica {
	    private String name;
	    private double lado;
	    private double diagonalMayor;
	    private double diagonalMenor;
	    
	    // Constructor
	    public Rombo(String name, double lado, double diagonalMayor, double diagonalMenor) {
	        this.name = name;
	        this.lado = lado;
	        this.diagonalMayor = diagonalMayor;
	        this.diagonalMenor = diagonalMenor;
	    }
	    
	    // Implementación de métodos de la interfaz FiguraGeometrica
	    
	    @Override
	    public double calcularArea() {
	        return (diagonalMayor * diagonalMenor) / 2; // Área del rombo
	    }
	    
	    @Override
	    public double calcularPerimetro() {
	        return 4 * lado; // Perímetro del rombo
	    }
	    
	    // Getters y setters
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public double getLado() {
	        return lado;
	    }
	    
	    public void setLado(double lado) {
	        this.lado = lado;
	    }
	    
	    public double getDiagonalMayor() {
	        return diagonalMayor;
	    }
	    
	    public void setDiagonalMayor(double diagonalMayor) {
	        this.diagonalMayor = diagonalMayor;
	    }
	    
	    public double getDiagonalMenor() {
	        return diagonalMenor;
	    }
	    
	    public void setDiagonalMenor(double diagonalMenor) {
	        this.diagonalMenor = diagonalMenor;
	    }
	    
	    @Override
	    public String toString() {
	        return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + "]";
	    }
	}	
}
