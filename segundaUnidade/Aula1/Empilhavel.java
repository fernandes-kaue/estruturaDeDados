package Aula1;
/**
 * Interface para implementação de pilhas
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/08
 */

public interface Empilhavel<T> {

    void empilhar(T dado);

    T desempilhar();

    T espiar();

    void atualizar(T dado);

    boolean estaCheia();

    boolean estaVazia();

    String imprimir();
}
