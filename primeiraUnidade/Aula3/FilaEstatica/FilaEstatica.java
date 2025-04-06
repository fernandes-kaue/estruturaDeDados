package primeiraUnidade.Aula3.FilaEstatica;

public class FilaEstatica implements Enfileiravel {
    // variáveis de instancia
    private Object[] dados;
    private int ponteiroInicio; // head
    private int ponteiroFim;    // tail

    // construtores
    public FilaEstatica() {
        this(10);
    }

    public FilaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        // estrutura vazia = ponteiroFim = ponteiroInicio-1
    }

    // metodos principais
    @Override
    public void enfileirar(Object dado) {

        if (!estaCheia()) {
            ponteiroFim++;
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("Fila está cheia");
        }

    }


    @Override
    public Object frente() {
        Object frente = null;

        if (!estaVazia()) {
            frente = dados[ponteiroInicio];
        } else {
            System.err.println("Fila está vazia");
        }

        return frente;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("Fila está vazia!");
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if (!estaCheia()) {
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("Fila está cheia!");
        }
    }


    @Override
    public Object desenfileirar() {
        Object frente = null;

        if (!estaVazia()) {
            frente = dados[ponteiroInicio];
            ponteiroInicio++;
        } else {
            System.err.println("Fila está vazia");
        }

        return frente;
    }

    // metodos auxiliares
    @Override
    public Boolean estaCheia() {
        return (ponteiroFim == dados.length - 1);
    }

    @Override
    public Boolean estaVazia() {
        return (ponteiroFim == ponteiroInicio - 1);
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroInicio; i <= ponteiroFim; i++) {
            if (i == ponteiroFim) {
                retorno += dados[i];
            }
            retorno += dados[i] + ", ";
        }
        return retorno + "]";
    }

}
