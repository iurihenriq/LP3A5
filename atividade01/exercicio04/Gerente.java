package exercicio04;

public class Gerente extends Funcionario {
	private String senha;

	public Gerente(String nome, double salario, String departamento, String senha) {
		super(nome, salario, departamento);
		this.setSenha(senha);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void mostrarInformações() {
		System.out.println("Meu nome é " + this.getNome() + ", trabalho no departamento de " + this.getDepartamento()
				+ ", ganho R$" + this.getSalario() + " e minha senha é " + this.getSenha());
	}

}
