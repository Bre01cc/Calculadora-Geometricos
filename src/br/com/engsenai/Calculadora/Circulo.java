package br.com.engsenai.Calculadora;

public class Circulo {
	double raio;
	double area;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public void calcularArea() {
		area = (Math.PI *(raio* raio));
	}
	public void mostrarFicha() {
		
		System.out.println("===============================");
		System.out.println("Dados do Circulo");
		System.out.println("-----------------------------");
		System.out.println("Raio: " + raio);
		System.out.println("Area: "+ area);
		System.out.println("==============================");
	}

}
