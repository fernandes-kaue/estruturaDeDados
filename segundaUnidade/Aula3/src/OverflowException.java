package Aula3.src;

/**
 * exceção lançada quando operação tenta inserir dados em
 * uma estrutura já cheia
 * 
 * @author Kauê Santos Fernandes
 * @version 0.1
 * @since 2025/05/26
 */

public class OverflowException extends RuntimeException {

    /**
     * Construtor para criar uma exceção de estouro com uma mensagem específica.
     *
     * @param mensagem a mensagem de erro a ser exibida
     */
    public OverflowException(String mensagem) {
        super(mensagem);
    }

    /**
     * Construtor padrão para criar uma exceção de estouro sem mensagem.
     */
    public OverflowException() {
        super("A lista está cheia.");
    }

}
