package Aula5.src;

/**
 * Interface que define as operações básicas para uma estrutura
 * Heap, sendo esta uma estrutura uma árvore binária especial, que
 * satisfaz a propriedade de Heap
 *
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/06/07
 *
 */
public interface Amontoavel<T> {

    // principais

    /**
     * Insere um elemento no Heap
     *
     * @param dado a ser inserido no Heap
     */
    void inserir(T dado);

    /**
     * Remove o elemento raiz do Heap
     *
     * @return dado extraído
     */
    T extrair();

    /**
     * Retorna o elemento raiz sem extraí-lo do Heap
     *
     * @return objeto da raiz
     */
    T obterRaiz();


    // auxiliares

    /**
     * Retorna uma string representando o Heap
     *
     * @return String representando estado do Heap
     */
    String imprimir();

    /**
     * Método para verificar se o Heap está vazio
     *
     * @return true se estiver vazia, false caso contrário
     */
    boolean estaVazia();

    /**
     * Método para verificar se o Heap está cheio
     *
     * @return true se estiver cheia, false caso contrário
     */
    boolean estaCheia();
}