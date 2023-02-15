package exercicio03;

public class Circulo extends FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calcularArea() {
		double area = Math.PI * this.raio * this.raio;
		System.out.println("O valor da Área é: " + area);

	}
}
