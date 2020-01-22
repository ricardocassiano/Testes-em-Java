/**
 * Classe para conter os dados de uma pessoa
 */

/**
 * @author Rick Rock
 *
 */
public class Pessoa {
	private String nome;
	private String segundoNome;
	private String sobrenome;
	private String nomeCompleto;

	//Métodos construtores
	public Pessoa() {
		this.setNomeCompleto("");
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.setNomeCompleto(nome.concat(" "+sobrenome));
	}
	
	public Pessoa(String nome, String segundoNome, String sobrenome) {
		this.setNomeCompleto(nome.concat(" "+segundoNome+" "+sobrenome));
	}
	
	public Pessoa(String nomeCompleto) {
		//Caso a pessoa passe um nome apenas ou um nome completo
		this.setNomeCompleto(nomeCompleto);
	}

	//Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
		this.separarNome(nomeCompleto);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	//Método que separa o nome completo em partes
	public void separarNome(String nomeCompleto)
	{
		int spacePosition = nomeCompleto.indexOf(" ");
		if (spacePosition>0)
			//O nome digitado possui mais de um nome
		{
			//Faço tudo que tenho que fazer
			//Se a posição do espaço armazenada for igual à última posição
			//em que há ocorrência de um espaço nessa String:
			//Verifica se há somente dois nomes
			if(spacePosition == nomeCompleto.lastIndexOf(" "))
			{
				this.setNome(nomeCompleto.substring(0, spacePosition+1));
				this.setSegundoNome(nomeCompleto.substring(spacePosition+1, nomeCompleto.length()));
				this.setSobrenome("");
			}
			else //Há mais de dois nomes
			{
				this.setNome(nomeCompleto.substring(0, spacePosition+1));
				this.setSegundoNome(nomeCompleto.substring(spacePosition+1, nomeCompleto.indexOf(" ", spacePosition+1)));
				//A partir do segundo nome, tudo é sobrenome
				this.setSobrenome(nomeCompleto.substring(nomeCompleto.indexOf(" ", spacePosition+1), nomeCompleto.length()));
			}
		}
		else
		//O nome digitado só tem um nome.
		{
			this.setNome(nomeCompleto);
			this.setSegundoNome("");
			this.setSobrenome("");
		}
	}
	
	
}
