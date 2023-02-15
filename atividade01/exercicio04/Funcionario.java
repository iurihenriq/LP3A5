package exercicio04;

public class Funcionario {
	private String nome;
	private double salario;
	private String departamento;

	public Funcionario(String nome, double salario, String departamento) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setDepartamento(departamento);
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void mostrarInformações() {
		System.out.println("Meu nome é " + this.getNome() + ", trabalho no departamento " + this.getDepartamento()
				+ ", ganho R$" + this.getSalario());
	}

}
