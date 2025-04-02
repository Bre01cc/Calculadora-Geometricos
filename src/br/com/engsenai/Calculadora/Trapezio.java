package br.com.engsenai.Calculadora;

public class Trapezio {
	 double baseMaior;
	 double baseMenor;
	 double altura;
	 	
	 	public void setLados(double baseMaior, double baseMenor, double altura) {
	 		this.baseMaior= baseMaior;
	 		this.baseMenor = baseMenor;
	 		this.altura= altura;
	 	}
	 	public double area;
	 	
	 	public void calcularArea() {
	 		area = ((baseMaior + baseMenor)* altura)/2;
	 	}
	 	public void mostrarFicha() {
	 		System.out.println("-------------------------");
	 		System.out.println("Dados do trapezio");
	 		System.out.println("--------------------------");
	 		System.out.println("Tipo: trapézio");
	 		System.out.println("Base menor: "+ baseMenor);
	 		System.out.println("Base maior: "+ baseMaior);
	 		System.out.println("Altura: "+ altura);
	 		System.out.println("Area: "+area);
	 		System.out.println("----------------------------");
	 	} 
	 	}