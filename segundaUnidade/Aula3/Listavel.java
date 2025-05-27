package Aula3;

/**
 * Interface que define operações essenciais para objetos que podem ser
 * listados,
 * que devem ser implementadas por classes que desejam fornecer uma
 * representação
 * em formato de lista.
 * 
 * @param <T> o tipo de objeto que estara armazenado na lista
 * @author Kauê Santos Fernandes
 * @version 0.1
 * @since 2025/05/26
 */

public interface Listavel<T> {

    // métodos principais

    /**
     * Anexa um novo dado ao final da lista.
     * 
     * @param dado o dado a ser anexado
     * @throws OverflowException se a lista estiver cheia
     */
    void anexar(T dado);

    /**
     * Insere um dado em uma posição específica da lista.
     * 
     * @param posicao a posição onde o dado será inserido
     * @param dado    o dado a ser inserido
     * @throws OverflowException  se a lista estiver cheia
     * @throws UnderflowException se a posição for inválida
     */
    void inserir(int posicao, T dado);

    /**
     * Seleciona um dado de uma posição específica da lista.
     * 
     * @param posicao a posição do dado a ser selecionado
     * @return o dado selecionado
     * @throws UnderflowException        se a posição for inválida
     * @throws IndexOutOfBoundsException se a posição estiver fora dos limites da
     *                                   lista
     */
    T selecionar(int posicao);

    /**
     * Seleciona todos os dados da lista.
     * 
     * @return um array contendo todos os dados da lista
     * @throws UnderflowException se a lista estiver vazia
     */
    T[] selecionarTodos();

    /**
     * Atualiza o dado em uma posição específica da lista.
     * 
     * @param posicao  a posição do dado a ser atualizado
     * @param novoDado o novo dado a ser colocado na posição
     * @throws UnderflowException        se a posição for inválida
     * @throws IndexOutOfBoundsException se a posição estiver fora dos limites da
     *                                   lista
     */
    void atualizar(int posicao, T novoDado);

    /**
     * Remove um dado de uma posição específica da lista.
     * 
     * @param posicao a posição do dado a ser removido
     * @return o dado removido
     * @throws UnderflowException        se a posição for inválida
     * @throws IndexOutOfBoundsException se a posição estiver fora dos limites da
     *                                   lista
     */
    T apagar(int posicao);

    // métodos auxiliares

    /**
     * Verifica se a lista está cheia.
     * 
     * @return true se a lista estiver cheia, false caso contrário
     */
    boolean estaCheia();

    /**
     * Verifica se a lista está vazia.
     * 
     * @return true se a lista estiver vazia, false caso contrário
     */
    boolean estaVazia();

    /**
     * Retorna uma string representando a lista, com elementos
     * separados por vírgulas e delimitados por colchetes.
     * 
     * @return string representando a lista
     */
    String imprimir();
}
