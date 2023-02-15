package exercicio02;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void apresetar() {
		System.out.println("Olá, eu sou o aluno " + this.getNome() + " com matrícula " + this.getMatricula()
				+ " e tenho " + this.getIdade());
	}

}
