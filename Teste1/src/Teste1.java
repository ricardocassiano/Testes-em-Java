//Esta é a classe principal do pacote, que executará tudo o que foi definido
//nas demais classes do projeto.

public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p;
		
		p = new Pessoa();
		
		p.setNome("João da Silva");
		p.setCpf("123.456.789-00");
		p.setIdade(20);
		
		//Concatenação de string com o retorno de um método
		System.out.println("Idade antes da modificação:  "+p.getIdade());
		
		//Cálculo com um método sendo passado como argumento
		p.setIdade(p.getIdade()+1);
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
		//Verificar a instância de determinado objeto
		System.out.println(p instanceof Pessoa);
		
		
		//Trabalhando com vetores
		int vetorQualquer[] = {34, 23, 2}; 
		//Declaração do objeto v
		Vetor v;
		
		//Instanciação do objeto v
		v = new Vetor(vetorQualquer);
		
		//v.Imprimir(v.getX());
		//System.out.println(v.getX().length);
		
		//Incluindo um novo item para o vetor
		v.Incluir(v.getX(), 50);
		
		//Exibir os itens do vetor
		v.Imprimir(v.getX());
	}

}
