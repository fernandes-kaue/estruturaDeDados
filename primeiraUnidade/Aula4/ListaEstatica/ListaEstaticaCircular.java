public class ListaEstaticaCircular implements Listavel{
    // variaveis
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;
    private Object[] dados;

    // construtores
    public ListaEstaticaCircular(int tamanho) {
        this.dados = new Object[tamanho];
        this.ponteiroInicio = 0;
        this.ponteiroFim = -1;
        this.quantidade = 0;
    }

    public ListaEstaticaCircular() {
        this(10);
    }

    // principais

    @Override
    public void anexar(Object obj) {
        if (!estaCheia()) {
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.err.println("List is full!");
        }
    }

    @Override
    public void atualizar(Object dado, int posicao) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                int posicaoFisica = mapeamento(posicao);
                dados[posicaoFisica] = dado;
            } else {
                System.err.println("Invalid index!");
            }
        } else {
            System.err.println("List is empty!");
        }
    }

    // auxiliares

    @Override
    public boolean estaCheia() {
        return (quantidade == dados.length);
    }

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroInicio; i < quantidade + ponteiroInicio; i ++) {
            if (i == quantidade + ponteiroInicio - 1) {
                retorno += dados[i%dados.length];
            } else {
                retorno += dados[i%dados.length] + ", ";
            }
        }
        return retorno + "]";
    }

    int mapeamento(int logica) {
        return (logica + ponteiroInicio)%dados.length;
    }


}
