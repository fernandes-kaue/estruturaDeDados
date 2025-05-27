package Aula3.src;

/**
 * exceção lançada quando operação tenta
 * acessar/remover dados em uma estrutura vazia
 * 
 * @author Kauê Santos Fernandes
 * @version 0.1
 * @since 2025/05/26
 */

public class UnderflowException extends RuntimeException {

    /**
     * Construtor para criar uma exceção de subfluxo com uma mensagem específica.
     *
     * @param mensagem a mensagem de erro a ser exibida
     */
    public UnderflowException(String mensagem) {
        super(mensagem);
    }

    /**
     * Construtor padrão para criar uma exceção de subfluxo sem mensagem.
     */
    public UnderflowException() {
        super("A lista está vazia ou a posição é inválida.");
    }

}
