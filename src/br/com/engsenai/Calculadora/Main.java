package br.com.engsenai.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {
		
			//Quadrado
		 	Quadrado quadrado1 = new Quadrado();
		 	quadrado1.setLado(9);
	 		quadrado1.calcularArea();
	 		quadrado1.calcularPerimetro();
	 		quadrado1.mostrarDados();
	 		
	 		//Trapezio
	 		Trapezio trapezio1 = new Trapezio();
	 		trapezio1.setLados(8, 4, 2);
	 		trapezio1.calcularArea();
	 		trapezio1.mostrarFicha();
	 		
	 		//Circulo
	 		Circulo circulo1= new Circulo();
	 		circulo1.setRaio(5);
	 		circulo1.calcularArea();
	 		circulo1.mostrarFicha();
	 		
	 		//Triângulo
	 		Triangulo triangulo1 = new Triangulo();
	 		triangulo1.setLados(5, 6);
	 		triangulo1.calcularArea();
	 		triangulo1.mostrarFicha();
	 		
	 		
	 		//Retângulo
	 		Retangulo retangulo1 = new Retangulo();
	 		retangulo1.setLados(9, 12);
	 		retangulo1.calcularArea();
	 		retangulo1.calcularPerimetro();
	 		retangulo1.mostrarFicha();
	 		
	 		
	 		
	}
}