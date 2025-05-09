import java.util.NoSuchElementException;

/**
 * classe que implementa uma pilha, estrutura LIFO
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/08
 */
public class PilhaDinamicaGenerica<T> implements Empilhavel<T> {
    private int tamanho;
    private int quantidade;
    private NoDuplo<T> ponteiroTopo;

    /**
     * construtor passando tamanho maximo
     * 
     * @param tamanho indicando tamanho da pilha
     */
    public PilhaDinamicaGenerica(int tamanho) {
        this.tamanho = tamanho;
        quantidade = 0;
        ponteiroTopo = null;
    }

    /**
     * construtor vazio, criando uma pilha com tamanho 10 por padrao
     */
    public PilhaDinamicaGenerica() {
        this(10);
    }

    

}
