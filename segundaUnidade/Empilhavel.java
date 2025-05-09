/**
 * Classe que implementa a pilha em si
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/08
 */

public interface Empilhavel<T> {
    /**
     * função que empilha um dado na pilha
     * 
     * @param dado a ser empilhado
     */
    void empilhar(T dado);

    /**
     * função que desempilha (remove) um dado da pilha
     * 
     * @return retorna o dado que foi desempilhado, podendo este ser reutilizado ou
     *         descartado, à escolha do usuário
     */
    T desempilhar();

    /**
     * função que retorna o dado do topo da pilha sem o remover da pilha
     * 
     * @return retorna o dado topo sem o remover da estrutura
     */
    T espiar();

    /**
     * atualiza o topo da pilha
     * 
     * @param dado é o novo dado para o topo
     */
    void atualizar(T dado);

    /**
     * função para saber se pilha está cheia
     * 
     * @return um valor booleano que indica se está cheia ou não
     */
    boolean estaCheia();

    /**
     * função para saber se pilha está vazia
     * 
     * @return um valor booleano que indica se está vazia ou não
     */
    boolean estaVazia();

    /**
     * função que retorna uma String com todos os dados da pilha
     * 
     * @return uma String com todos os dados da pilha, para posterior manipulação
     */
    String imprimir();
}
