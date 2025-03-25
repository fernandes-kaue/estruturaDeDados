package primeiraUnidade.Aula3.FilaEstaticaDupla;

public interface DuplamenteEnfileiravel {
    void enfileirarInicio(Object dado);      // ja ta pronto
    void enfileirarFim(Object dado);         // ja ta pronto
    Object frente();                         // ja ta pronto
    Object tras();                           //
    void atualizarInicio(Object dado);       // ja ta pronto
    void atualizarFim(Object dado);          // ja ta pronto
    Object desenfileirarInicio();            // ja ta pronto
    Object desenfileirarFim();               //

    Boolean estaCheia();                     // ja ta pronto
    Boolean estaVazia();                     // ja ta pronto
    String imprimirTrasFrente();
    String imprimirFrenteTras();             // ja ta pronto
}
