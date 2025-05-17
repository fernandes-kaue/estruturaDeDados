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
