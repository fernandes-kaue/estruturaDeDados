package primeiraUnidade.Aula3.FilaEstatica;

/*Fila (Queue)
  Fila Circula (Circle Queue)
  Fila com dupla terminação (DeQUE)*/
public interface Enfileiravel {
    void enfileirar(Object dado);       // C enqueue
    Object frente();                    // R front
    void atualizarInicio(Object dado);  // U update
    void atualizarFim(Object dado);     // U update
    Object desenfileirar();               // D dequeue

    Boolean estaCheia();
    Boolean estaVazia();
    String imprimir();
}
