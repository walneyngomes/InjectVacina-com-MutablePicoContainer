package injector;

import org.picocontainer.annotations.Inject;

import br.com.vacina.Vacina;

public class Pessoa {

	@Inject
	Vacina vacina;
	private String nome;
	private int idade;
	private String cpf;
	private static final int IDADE = 13;

	public Pessoa(Vacina v, int idade) {
		if (idade >= IDADE) {
			this.idade = idade;
			this.vacina = v;
		} else {
			vacina = null;
			System.out.print("  Tem que ter pelo menos   " + this.IDADE);
		}
	}

	public void injecao() {
		if (vacina != null) {
			vacina.injetar();
		} else {
			System.err.print(" Nao foi injetado nenhuma vacina   ");
		}
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
