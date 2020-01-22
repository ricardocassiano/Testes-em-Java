/**
 * Esta classe é para testar opções de vetor
 * Vetores em si são limitados para alocação dinâmica
 * Há uma coleção Java chamada Arraylist que permite a manipulação dinâmica de vetores
 * 
 */

/**
 * @author Rick Rock
 *
 */

public class Vetor {
	private int[] x; //Criação de um vetor sem definir as posições

	//Método construtor da classe vetor
	public Vetor () {}
	
	public Vetor (int[] x)
	{
		this.setX(x);
	}
	
	public Vetor (int tam)
	{
		this.setX(new int[tam]);
	}
	
	//Get and set
	public int[] getX() {
		return x;
	}

	public void setX(int[] x) {
		this.x = x;
	}
	
	//Método para incluir um novo item no vetor
	public void Incluir(int[] vetor, int item)
	{
		//Utilização do algoritmo de estrutura de dados
		//Para inserir numa lista não ordenada
		
		int tam =vetor.length;
		if (tam<this.getX().length)
		{
			vetor[tam+1]=item;
			tam++;
		}
		else
			System.out.println("Lista cheia");
		
		/*int tam = vetor.length;//Saber o tamanho do vetor atual
		int[] novoVetor = new int[tam+1]; //Criar um novo vetor com uma posição a mais do que o atual
		novoVetor = vetor; //O novo vetor recebe todos os itens do vetor atual
		novoVetor[tam] = item; //Adicionar o elemento no final do vetor
		vetor = novoVetor; //Substituir o vetor atual pelo novo vetor
		
		this.Imprimir(vetor);
		//System.out.println(tam);
		//this.setX(x[tam+1]);
		//this.x[tam] = item;*/
	}
	
	//Método para exibir o conteúdo do vetor
	public void Imprimir(int[] vetor)
	{
		int i;
		for (i=0; i<vetor.length;i++)
		{
			System.out.println(vetor[i]);
		}
	}

	
}
