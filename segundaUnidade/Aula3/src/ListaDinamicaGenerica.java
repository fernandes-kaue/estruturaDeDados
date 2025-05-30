package Aula3.src;

/**
 * Classe que representa uma lista dinâmica genérica.
 * Esta classe pode ser utilizada para armazenar e manipular dados de forma
 * dinâmica,
 * permitindo operações como anexar, inserir, selecionar e atualizar dados.
 * 
 * @author Kauê Santos Fernandes
 * @version 0.1
 * @since 2025/05/29
 */
public class ListaDinamicaGenerica<T> implements Listavel<T> {

    /** quantidade atual de itens na lista */
    private int quantidade;

    /** tamanho maximo da lista */
    private int tamanho;

    /** ponteiro para primeiro nó da lista */
    private NoDuplo<T> ponteiroInicio;

    /** ponteiro para último nó da lista */
    private NoDuplo<T> ponteiroFim;

    // construtores

    /**
     * Construtor padrão que inicializa a lista com tamanho máximo de 10.
     */
    public ListaDinamicaGenerica() {
        this(10);
    }

    /**
     * Construtor que inicializa a lista com o tamanho máximo especificado.
     * 
     * @param tamanho o tamanho máximo da lista
     */
    public ListaDinamicaGenerica(int tamanho) {
        ponteiroInicio = null;
        ponteiroFim = null;
        quantidade = 0;
        this.tamanho = tamanho;
    }

    // métodos principais

    // métodos auxiliares

}
