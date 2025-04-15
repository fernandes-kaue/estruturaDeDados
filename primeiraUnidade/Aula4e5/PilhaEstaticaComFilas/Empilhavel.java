package primeiraUnidade.Aula4e5.PilhaEstaticaComFilas;

public interface Empilhavel {
    void empilhar(Object elemento);
    Object desempilhar();
    Object espiar();
    void atualizar(Object dado);

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}