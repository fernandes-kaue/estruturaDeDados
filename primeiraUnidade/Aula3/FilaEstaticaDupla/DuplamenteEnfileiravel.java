package primeiraUnidade.Aula3.FilaEstaticaDupla;

public interface DuplamenteEnfileiravel {
    void enfileirarInicio(Object dado);      // NOVO
    void enfileirarFim(Object dado);         // funciona como o enfileirar de Enfileiravel

    Object desenfileirarInicio();            // funciona como o desenfileirar de Enfileiravel
    Object desenfileirarFim();               // NOVO

    Object frente();                         // frente (funciona como o frente de Enfileiravel)
    Object tras();                           // NOVO

    void atualizarInicio(Object dado);       // funciona como o atualizarInicio de Enfileiravel
    void atualizarFim(Object dado);          // funciona como o atualizarFim de Enfileiravel

    Boolean estaCheia();                     // funciona como o estaCheia de Enfileiravel
    Boolean estaVazia();                     // funciona como o estaVazia de Enfileiravel

    String imprimirTrasFrente();             // funciona como o imprimir de Enfileiravel
    String imprimirFrenteTras();             // NOVO
}
