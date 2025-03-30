package primeiraUnidade.Aula3.FilaEstaticaDupla;

public class FilaDupla implements DuplamenteEnfileiravel {
    // variaveis de instancia
    private Object[] dados;
    private int ponteiroInicio; // head
    private int ponteiroFim;    // tail
    private int quantidade;

    // construtores
    public FilaDupla(int tamanho) {
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
        dados = new Object[tamanho];
    }

    public FilaDupla() {
        this(10);
    }

    // metodos principais
    @Override
    public void enfileirarInicio(Object dado) {

        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim+1)%dados.length;
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.err.println("Fila está cheia");
        }

    }

    @Override
    public void enfileirarFim(Object dado) {
        // TODO
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
    public Object tras() {
        //TODO
        return null;
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
    public Object desenfileirarInicio() {
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
    public Object desenfileirarFim() {
        Object tras = null;

        if (!estaVazia()) {
            tras = dados[ponteiroInicio];
            ponteiroFim = ((ponteiroFim-1)+dados.length)%dados.length;

            quantidade--;
        } else {
            System.err.println("Fila está vazia");
        }

        return tras;
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
    public String imprimirTrasFrente() {
        return null;
    }

    @Override
    public String imprimirFrenteTras() {
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
}
