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
     * função que empilha um dado na pilha
     * 
     * @param dado a ser empilhado
     * @throws NoSuchElementException se a piilha estiver cheia
     */
    @Override
    public void empilhar(T dado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empilhar'");
    }

    /**
     * função que desempilha (remove) um dado da pilha
     * 
     * @return retorna o dado que foi desempilhado, podendo este ser reutilizado ou
     *         descartado, à escolha do usuário
     */
    @Override
    public T desempilhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desempilhar'");
    }

    /**
     * função que retorna o dado do topo da pilha sem o remover da pilha
     * 
     * @return retorna o dado topo sem o remover da estrutura
     */
    @Override
    public T espiar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'espiar'");
    }

    /**
     * atualiza o topo da pilha
     * 
     * @param dado é o novo dado para o topo
     */
    @Override
    public void atualizar(T dado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

}
