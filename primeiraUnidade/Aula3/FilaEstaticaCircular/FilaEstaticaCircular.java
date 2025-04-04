package primeiraUnidade.Aula3.FilaEstaticaCircular;

public class FilaEstaticaCircular implements Enfileiravel{
    // variaveis de instancia
    private Object[] dados;
    private int ponteiroInicio; // head
    private int ponteiroFim;    // tail
    private int quantidade;

    // construtores
    public FilaEstaticaCircular() {
        this(10);
    }

    public FilaEstaticaCircular(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
    }

    // metodos principais
    @Override
    public void enfileirar(Object dado) {

        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim+1)%dados.length;
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.err.println("Fila está cheia");
        }

    }

    @Override
    public Object desenfileirar() {
        Object frente = null;

        if (!estaVazia()) {
            frente = dados[ponteiroInicio];
            ponteiroInicio = ((ponteiroInicio-1)+dados.length)%dados.length;

            quantidade--;
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

    public Object frente() {
        Object frente = null;

        if (!estaVazia()) {
            frente = dados[ponteiroInicio];
        } else {
            System.err.println("Fila está vazia");
        }

        return frente;
    }

    // metodos auxiliares
    @Override
    public Boolean estaCheia() {
        return (quantidade == dados.length);
    }

    @Override
    public Boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroInicio; i <= quantidade + ponteiroInicio; i++) {
            /* funciona mas não é o mais adequado
            if (i == dados.length) {
                i = 0;
            }
            */

            if (i == quantidade + ponteiroInicio - 1) {
                retorno += dados[i%dados.length];
            }
            retorno += dados[i%dados.length] + ", ";
        }
        return retorno + "]";
    }

    private int avancar(int ponteiro) {
		return (ponteiro+1)%dados.length;
	}

	private int retroceder(int ponteiro) {
		return ((ponteiro-1)+dados.length)%dados.length;
	}

}

