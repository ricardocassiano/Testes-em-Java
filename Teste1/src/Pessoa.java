/**
OBJETIVO: Implementar conceitos básicos de orientação à objetos: atributos, 
métodos, método construtor, encapsulamento... etc.
/**
 * @author Rick Rock
 *
 */
public class Pessoa {
	
	//Atributos da classe Pessoa
	//Todos os atributos devem ser privados
	private String nome;
	private String cpf;
	private int idade;
	
	//Métodos construtores da classe
	public Pessoa(String nome, String cpf, int idade)
	{
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
	}
	
	//Forma alternativa de instanciação de um objeto
	//Conceito de sobrecarga de métodos - Polimorfismo
	public Pessoa(){};

	//Métodos de acesso aos atributos
	//Conceito de encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
