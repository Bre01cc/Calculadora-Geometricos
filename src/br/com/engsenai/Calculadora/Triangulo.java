package br.com.engsenai.Calculadora;

public class Triangulo {
	double altura;
	double base;
	double area;
	
	public void setLados(double altura, double base) {
		this.altura = altura;
		this.base= base;
	}
	public void calcularArea() {
		area =((base*altura)/ 2);
	}
	public void mostrarFicha() {
		System.out.println("=============================");
		System.out.println("Dados do triângulo");
		System.out.println("------------------------------");
		System.out.println("Base:"+ base);
		System.out.println("Altura:"+ altura);
		System.out.println("Area:"+ area);
		System.out.println("==============================");
	

	}
	
}
