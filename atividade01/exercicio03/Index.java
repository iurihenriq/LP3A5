package exercicio03;

public class Index {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(10);
		Circulo circulo = new Circulo(5);
		Triangulo triangulo = new Triangulo(10, 20);
		
		quadrado.calcularArea();
		circulo.calcularArea();
		triangulo.calcularArea();
	}

}
