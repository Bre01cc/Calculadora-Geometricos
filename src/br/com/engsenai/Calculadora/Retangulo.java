package br.com.engsenai.Calculadora;

public class Retangulo {
    private double altura;
    private double base;
    public double area;
    public double perimetro;

    public void setLados(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        		area =base * altura; 
        		return area;
    }

    
    public double calcularPerimetro() {
         perimetro =2 * (base + altura); 
         return perimetro; 
    }

   
    public void mostrarFicha() {
        System.out.println("======================");
        System.out.println("  Dados do Retângulo  ");
        System.out.println("======================");
        System.out.println("Altura: " + altura);
        System.out.println("Base: " + base);
        System.out.println("Área: " + calcularArea());      
        System.out.println("Perímetro: " + calcularPerimetro()); 
        System.out.println("======================");
    }

    
}


