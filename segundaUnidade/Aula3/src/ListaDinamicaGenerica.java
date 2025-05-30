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
    /**
     * Verifica se a lista está cheia.
     * 
     * @return true se a lista estiver cheia, false caso contrário
     */
    @Override
    public boolean estaCheia() {
        return quantidade == tamanho;
    }

    /**
     * Verifica se a lista está vazia.
     * 
     * @return true se a lista estiver vaiza, false caso contrário
     */
    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    /**
     * Retorna uma string representando a lista, com elementos separados por
     * vírgula.
     * 
     * @return uma string representando a lista
     */
    @Override
    public String imprimir() {
        String resultado = "[";
        NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            resultado += ponteiroAuxiliar.getDado();
            if (i != quantidade - 1) {
                resultado += ",";
            }
            ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
        }
        return resultado + "]";
    }
}
