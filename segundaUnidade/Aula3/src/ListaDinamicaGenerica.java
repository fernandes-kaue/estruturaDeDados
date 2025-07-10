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

    /**
     * quantidade atual de itens na lista
     */
    private int quantidade;

    /**
     * tamanho maximo da lista
     */
    private int tamanho;

    /**
     * ponteiro para primeiro nó da lista
     */
    private NoDuplo<T> ponteiroInicio;

    /**
     * ponteiro para último nó da lista
     */
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

    /**
     * Anexa um novo dado ao final da lista.
     *
     * @param dado o dado a ser anexado
     * @throws OverflowException se a lista estiver cheia
     */
    @Override
    public void anexar(T dado) {
        if (estaCheia()) {
            throw new OverflowException("Lista Cheia!");
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
     * Insere um dado em uma posição específica da lista.
     *
     * @param posicao a posição onde o dado será inserido
     * @param dado    o dado a ser inserido
     * @throws OverflowException         se a lista estiver cheia
     * @throws UnderflowException        se a posição for inválida
     * @throws IndexOutOfBoundsException se a posição estiver fora dos limites da
     *                                   lista
     */
    @Override
    public void inserir(int posicao, T dado) {
        if (estaCheia()) {
            throw new OverflowException("Lista Cheia!");
        }
        if (!(posicao >= 0 && posicao <= quantidade)) {
            throw new IndexOutOfBoundsException("Indice Invalido!");
        }
        NoDuplo<T> noTemporario = new NoDuplo<>();
        noTemporario.setDado(dado);

        NoDuplo<T> ponteiroAnterior = null;
        NoDuplo<T> ponteiroProximo = ponteiroInicio;

        for (int i = 0; i < posicao; i++) {
            ponteiroAnterior = ponteiroProximo;
            ponteiroProximo = ponteiroProximo.getProximo();
        }

        if (ponteiroAnterior != null) {
            ponteiroAnterior.setProximo(noTemporario);
            // se o anterior é nulo é pq a insercao está sendo no inicio
        } else {
            ponteiroInicio = noTemporario;
        }

        if (ponteiroProximo != null) {
            ponteiroProximo.setAnterior(noTemporario);
            // se o proximo é nulo é pq a insercao está sendo no fim (append)
        } else {
            ponteiroFim = noTemporario;
        }

        noTemporario.setAnterior(ponteiroAnterior);
        noTemporario.setProximo(ponteiroProximo);

        quantidade++;
    }

    /**
     * Atualiza o elemento de uma dada posição da lista
     *
     * @param posicao  a posição do elemento a ser atualizado
     * @param novoDado o novo dado
     * @throws UnderflowException        se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição for inválida
     */
    @Override
    public void atualizar(int posicao, T novoDado) {
        if (estaVazia()) {
            throw new UnderflowException("Lista Vazia!");
        }
        if (!(posicao >= 0 && posicao < quantidade)) {
            throw new IndexOutOfBoundsException("Indice Invalido!");
        }

        NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
        }
        ponteiroAuxiliar.setDado(novoDado);
    }

    /**
     * Método para apagar um dado com base na posição que for passada
     *
     * @param posicao a posição do dado a ser removido
     * @return dado apagado para posterior uso
     * @throws UnderflowException        se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição for inválida
     */
    @Override
    public T apagar(int posicao) {
        if (estaVazia()) {
            throw new UnderflowException("Lista Vazia!");
        }
        if (!(posicao >= 0 && posicao < quantidade)) {
            throw new IndexOutOfBoundsException("Indice Invalido!");
        }

        NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
        }

        NoDuplo<T> ponteiroAnterior = ponteiroAuxiliar.getAnterior();
        NoDuplo<T> ponteiroProximo = ponteiroAuxiliar.getProximo();

        if (ponteiroAnterior != null) {
            ponteiroAnterior.setProximo(ponteiroProximo);
            // remocao do inicio, joga o ponteiro de inicio para o proximo nodo.
        } else {
            ponteiroInicio = ponteiroInicio.getProximo();
        }
        if (ponteiroProximo != null) {
            ponteiroProximo.setAnterior(ponteiroAnterior);
            // remocao do fim, joga o ponteiro de fim para o nodo anterior.
        } else {
            ponteiroFim = ponteiroFim.getAnterior();
        }

        quantidade--;
        return ponteiroAuxiliar.getDado();
    }

    /**
     * Retorna o elemento de uma dada posição da lista.
     *
     * @param posicao a posição do elemento a ser selecionado
     * @return o dado selecionado
     * @throws UnderflowException        se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição for inválida
     */
    @Override
    public T selecionar(int posicao) {
        if (estaVazia()) {
            throw new UnderflowException("Lista Vazia!");
        }
        if (!(posicao >= 0 && posicao < quantidade)) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }

        NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
        }
        return ponteiroAuxiliar.getDado();
    }

    /**
     * Retorna um array contendo todos os dados da lista.
     *
     * @return um array contendo todos os dados da lista
     * @throws UnderflowException se a lista estiver vazia
     */
    @SuppressWarnings("unchecked")
    @Override
    public T[] selecionarTodos() {
        if (estaVazia()) {
            throw new UnderflowException("Lista Vazia!");
        }

        T[] dadosTemporario = (T[]) new Object[quantidade];
        NoDuplo<T> ponteiroAuxiliar = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            dadosTemporario[i] = ponteiroAuxiliar.getDado();
            ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
        }
        return dadosTemporario;
    }

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
     * @return true se a lista estiver vazia, false caso contrário
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
