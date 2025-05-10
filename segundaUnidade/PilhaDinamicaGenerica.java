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

    /**
     * função para saber se pilha está cheia
     * 
     * @return true se cheia, false se vazia
     */
    @Override
    public boolean estaCheia() {
        return (quantidade == tamanho);
    }

    /**
     * função para saber se pilha está vazia
     * 
     * @return true se vazia, false se cheia
     */
    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    /**
     * função que retorna uma String com todos os dados da pilha
     * 
     * @return uma String com todos os dados da pilha, para posterior manipulação
     */
    @Override
    public String imprimir() {
        NoDuplo<T> ponteiroAuxiliar = ponteiroTopo;
        String resultado = "[";
        for (int i = quantidade - 1; i >= 0; i--) {
            resultado += ponteiroAuxiliar.getDado();
            if (i != 0) {
                resultado += ",";
            }
            ponteiroAuxiliar = ponteiroAuxiliar.getAnterior();
        }
        return resultado + "]";
    }

}
