package Aula2;

/**
 * Esta classe implementa uma fila dinâmica genérica.
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/16
 */

import java.util.NoSuchElementException;

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

    // métodos auxiliares

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
     * @return String com os elementos da fila
     */
    @Override   
    public String imprimirDeFrentePraTras() {
        String resultado = "[";
        NoDuplo<T> noAuxiliar = ponteiroInicio;

        for (int i = 0; i < quantidade; i++) {
            if (i == quantidade - 1) {
                resultado += noAuxiliar.getDado();
            } else {
                    resultado += noAuxiliar.getDado() + ", ";
                }
                noAuxiliar = noAuxiliar.getProximo();
            }
        }return resultado+="]";

    }

    // operações não suportadas para fila simples
    @Override
    public void enfileirarInicio(T dado) {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public T desenfileirarFim() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public T tras() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }

    @Override
    public String imprimirDeTrasPraFrente() {
        throw new UnsupportedOperationException("Operação não suportada!");
    }
}
