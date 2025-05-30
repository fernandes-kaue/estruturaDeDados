package Aula3.src;

/**
 * Classe representando um nó de uma lista duplamente encadeada
 * Classe utilizada em todas estruturas que necessitem de nós com
 * referencias para nós adjacentes
 * 
 * @param <T> o tipo de dado armazenado no nó
 * @author Kauê Santos Fernandes
 * @version 0.1
 * @since 2025/05/26
 */
public class NoDuplo<T> {

    /** O dado armazenado no nó */
    private T dado;

    /** Referência para o nó anterior */
    private NoDuplo<T> anterior;

    /** Referência para o próximo nó */
    private NoDuplo<T> proximo;

    /**
     * Construtor para criar um nó com o dado especificado.
     *
     * @param dado o dado a ser armazenado no nó
     */
    public NoDuplo(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    /**
     * Construtor padrão que inicializa o nó sem dado e sem referências.
     */
    public NoDuplo() {
        this.dado = null;
        this.anterior = null;
        this.proximo = null;
    }

    /**
     * Retorna o dado armazenado no nó.
     *
     * @return o dado do nó
     */
    public T getDado() {
        return dado;
    }

    /**
     * Define o dado a ser armazenado no nó.
     *
     * @param dado o novo dado
     */
    public void setDado(T dado) {
        this.dado = dado;
    }

    /**
     * Retorna a referência para o nó anterior.
     *
     * @return o nó anterior
     */
    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    /**
     * Define a referência para o nó anterior.
     *
     * @param anterior o novo nó anterior
     */
    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * Retorna a referência para o próximo nó.
     *
     * @return o próximo nó
     */
    public NoDuplo<T> getProximo() {
        return proximo;
    }

    /**
     * Define a referência para o próximo nó.
     *
     * @param proximo o novo próximo nó
     */
    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}
