package exercicio03;

public class Triangulo extends FormaGeometrica {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		double area = this.getAltura() * this.getAltura();
		System.out.println("O valor da Área é: " + area);

	}

}
