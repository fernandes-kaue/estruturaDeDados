package primeiraUnidade.Aula1;

/*
TIPOS DE DADOS


	Numerico (positivo ou negativo)
		Inteiros
		unsigned int
		tinyint, smallint
		Int
		Long
	Pontos flutuantes
		Float
		Double
	Ponto fixo (nunca ouvi falar)
		Numerical/Decimal (útil em SQL)

	
	
	String = ""
	char = ''

	Logico 
		Boolean, bool

	Matriz unidimensional
		Vector, array, (dicionario) map

	Pointer
		Variável que guarda o endereço de memória de outra variável

	Conjunto
		Set (util para operações SQL por conter operações semelhantes)


*/

public interface Empilhavel {
	// C -> REATE (criar)
	// R -> EAD (ler)
	// U -> PDATE (atualizar)
	// D -> ELETE (deleter/apagar)
	// S -> ORT (ordernar)
	//
	// Funções Básicas/Principais
	void empilhar(Object obj); // push

	Object desempilhar(); // pop

	Object topo(); // top

	void atualizar(Object obj); // update

	// Operações auxiliares
	Boolean estaCheia(); // isFull | overflow

	Boolean estaVazia(); // isEmpty| underflow

	String imprimir(); // print

}
