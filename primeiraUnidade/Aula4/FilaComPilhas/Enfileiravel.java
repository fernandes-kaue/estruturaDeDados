public interface Enfileiravel {
    void enfileirar(Object dado); 		//C	enqueue
    Object desenfileirar();				//D dequeue
    Object frente();					//R	front
    void atualizarInicio(Object dado);	//U	update
    void atualizarFim(Object dado);		//U	update
    //S sort
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
