/**
 * OBJETIVO: Realizar testes com strings, métodos da classe String
 */

/**
 * @author Rick Rock
 *Data: 21/01/2020
 */

import java.util.Scanner; //Importação da classe para utilização dos métodos de leitura


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objeto do tipo pessoa
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Ricardo");
		Pessoa p3, p4;

		//Objeto para ler interações via console
		Scanner ler = new Scanner(System.in);
		
		//Exibindo o valor predefinido para a variável nome
		System.out.println("O primeiro nome armazenado é: "+p1.getNome());
		System.out.println("O segundo nome armazenado é: "+p2.getNome());
		
		//Solicitando um nome do usuário via console
		System.out.println("Digite um nome:");
		//Criando a instancia da classe Pessoa
		p3 = new Pessoa(ler.nextLine());//pega a linha inteira
		
		//Exibindo o nome que o usuário digitou
		System.out.println("O nome que o usuário digitou foi: "+p3.getNomeCompleto());
		
		//Exibindo o tamanho da string
		System.out.printf("O nome digitado possui %d caracteres, incluindo "
				+ "o espaço.\n", p3.getNomeCompleto().length());
		
		//Definindo um sobrenome
		//System.out.println("Digite um sobrenome: ");
		//p3.setSobrenome(ler.next());//Utilização do método next() porque só quero um sobrenome.
		
		//System.out.printf("Sobrenome: %s\n", p3.getSobrenome());
		System.out.printf("O nome completo digitado foi: %s\n", p3.getNomeCompleto());
		System.out.printf("Nome: %s\n", p3.getNome());
		System.out.printf("Segundo nome: %s\n", p3.getSegundoNome());
		System.out.printf("Sobrenome: %s\n", p3.getSobrenome());
		
		
		//CORRIGIR BUG: Nesta forma de construção, os nomes não estão ficando separados corretamente
		//Instanciando uma nova pessoa
		p4 = new Pessoa();
		System.out.println("Digite um nome:");
		p4.setNome(ler.nextLine());
		System.out.println("Digite um sobrenome:");
		p4.setSobrenome(ler.nextLine());
		
		//Exibindo as informações dessa nova pessoa
		System.out.printf("O nome completo digitado foi: %s\n", p4.getNomeCompleto());
		System.out.printf("Nome: %s\n", p4.getNome());
		System.out.printf("Segundo nome: %s\n", p4.getSegundoNome());
		System.out.printf("Sobrenome: %s\n", p4.getSobrenome());
}
}
