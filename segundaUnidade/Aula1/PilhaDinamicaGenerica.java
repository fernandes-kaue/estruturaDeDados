package Aula1;
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
        if (estaCheia()) {
            throw new NoSuchElementException("Pilha Cheia!");
        }
        NoDuplo<T> noTemporario = new NoDuplo<T>();
        noTemporario.setDado(dado);
        noTemporario.setAnterior(ponteiroTopo);
        if (!estaVazia()) {
            ponteiroTopo.setProximo(noTemporario);
        }
        ponteiroTopo = noTemporario;
        quantidade++;
    }

    /**
     * função que desempilha (remove) um dado da pilha
     * 
     * @return retorna o dado que foi desempilhado, podendo este ser reutilizado ou
     *         descartado, à escolha do usuário
     */
    @Override
    public T desempilhar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Pilha Vazia!");
        }
        T dadoTopo = ponteiroTopo.getDado();
        ponteiroTopo = ponteiroTopo.getAnterior();
        quantidade--;
        if (!estaVazia()) {
            ponteiroTopo.setProximo(null);
        }
        return dadoTopo;
    }

    /**
     * função que retorna o dado do topo da pilha sem o remover da pilha
     * 
     * @return retorna o dado topo sem o remover da estrutura
     * @throws NoSuchElementException se pilha estiver vazia
     */
    @Override
    public T espiar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Pilha Vazia!");
        }
        T dadoTopo = ponteiroTopo.getDado();
        return dadoTopo;
    }

    /**
     * função que atualiza o topo da pilha
     * 
     * @param novoDado é o novo dado para o topo
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    @Override
    public void atualizar(T novoDado) {
        if (estaVazia()) {
            throw new NoSuchElementException("Pilha Vazia!");
        }
        ponteiroTopo.setDado(novoDado);
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
