package Aula2.FilaDinamicaGenericaSimples;

/**
 * Esta classe implementa uma fila dinâmica genérica.
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/16
 */

import java.util.NoSuchElementException;

import Aula2.FilaDinamicaGenericaSimples.Enfileiravel;
import Aula2.FilaDinamicaGenericaSimples.NoDuplo;

public class FilaDinamicaGenerica<T> implements Enfileiravel<T> {

    private int quantidade;
    private int tamanho;
    private NoDuplo<T> ponteiroInicio;
    private NoDuplo<T> ponteiroFim;

    /**
     * construtor da fila dinâmica genérica
     * 
     * @param tamanho tamanho máximo da fila
     */
    public FilaDinamicaGenerica(int tamanho) {
        quantidade = 0;
        this.tamanho = tamanho;
        ponteiroInicio = null;
        ponteiroFim = null;
    }

    /**
     * construtor da fila dinâmica genérica sem tamanho informado,
     * tendo um tamanho padrão de 10
     */
    public FilaDinamicaGenerica() {
        this(10);
    }

    // metodos principais

    /**
     * método que adiciona um elemento no fim da fila
     * 
     * @param dado dado/elemento a ser adicionado na fila
     * @throws NoSuchElementException se a fila estiver cheia
     */
    @Override
    public void enfileirarFim(T dado) {
        if (estaCheia()) {
            throw new NoSuchElementException("Fila cheia!");
        }
        NoDuplo<T> noTemporario = new NoDuplo<>();
        noTemporario.setDado(dado);
        if (!estaVazia()) {
            ponteiroFim.setProximo(noTemporario);
        } else {
            ponteiroInicio = noTemporario;
        }
        noTemporario.setAnterior(ponteiroFim);
        ponteiroFim = noTemporario;
        quantidade++;
    }

    /**
     * método que desenfileira um elemento do início e o retorna
     * 
     * @return dado/elemento desenfileirado
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T desenfileirarInicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        T dadoInicio = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();
        quantidade--;
        if (!estaVazia()) {
            ponteiroInicio.setAnterior(null);
        } else {
            ponteiroFim = null;
        }
        return dadoInicio;

    }

    /**
     * método que atualiza o elemento da frente da fila
     * 
     * @param dado dado/elemento a ser atualizado
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public void atualizarInicio(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        ponteiroInicio.setDado(dado);
    }

    /**
     * método que atualiza o elemento do final da fila
     * 
     * @param dado dado/elemento a ser atualizado
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public void atualizarFim(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        ponteiroFim.setDado(dado);
    }

    // métodos auxiliares

    /**
     * método que retorna o dado da frente da fila
     * sem alterar a estrutura da fila (espiar)
     * 
     * @return dado/elemento da frente da fila
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T frente() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        return ponteiroInicio.getDado();
    }

    /**
     * método que verifica se a fila esta cheia, com base na quantidade de
     * elementos
     * 
     * @return true se a fila estiver cheia, false caso contrário
     */
    @Override
    public boolean estaCheia() {
        return quantidade == tamanho;
    }

    /**
     * método que verifica se a fila esta vazia, com base na quantidade de
     * elementos
     * 
     * @return true se a fila estiver vazia, false caso contrário
     */
    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    /**
     * método que imprime a fila, retornando uma
     * 
     * @return String com os elementos da fila
     */
    @Override
    public String imprimirDeFrentePraTras() {
        String resultado = "[";
        NoDuplo<T> noAuxiliar = ponteiroInicio;

        for (int i = 0; i < quantidade; i++) {
            resultado += noAuxiliar.getDado();
            if (i != quantidade - 1) {
                resultado += ",";
            }
            noAuxiliar = noAuxiliar.getProximo();
        }

        return resultado += "]";
    }

    // operações agora suportadas
    @Override
    public void enfileirarInicio(T dado) {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public T desenfileirarFim() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    /**
     * método que retorna o dado do final da fila
     * sem alterar a estrutura da fila (espiar)
     * 
     * @return dado/elemento do final da fila
     * @throws NoSuchElementException se a fila estiver vazia
     */
    @Override
    public T tras() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia!");
        }
        return ponteiroFim.getDado();
    }

    /**
     * método que imprime a fila, retornando uma
     * 
     * @return String com os elementos da fila
     */
    @Override
    public String imprimirDeTrasPraFrente() {
        String resultado = "[";
        NoDuplo<T> noAuxiliar = ponteiroFim;

        for (int i = 0; i < quantidade; i++) {
            resultado += noAuxiliar.getDado();
            if (i != quantidade - 1) {
                resultado += ",";
            }
            noAuxiliar = noAuxiliar.getAnterior();
        }

        return resultado += "]";
    }

}
