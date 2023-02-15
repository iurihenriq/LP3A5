package exercicio03;

public class Quadrado extends FormaGeometrica {
	private double lado;
	
	public Quadrado(double lado) {
		this.setLado(lado);
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		double area = this.getLado() * this.getLado();
		System.out.println("O valor da Área é: " + area);

	}
}
