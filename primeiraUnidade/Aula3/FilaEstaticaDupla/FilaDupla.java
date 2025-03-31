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

    //NOVO
    @Override
    public void enfileirarInicio(Object dado) {
        if (!estaCheia()){
            ponteiroInicio = retroceder(ponteiroInicio);
            dados[ponteiroInicio] = dado;
            //não deixar ponteiroFim esquecido, caso a estrutura esteja na 1ª inserção
            if (estaVazia())
                ponteiroFim = ponteiroInicio;

            quantidade++;
        } else {
            System.err.println("Queue is full!");
        }
    }

    //funciona como o enfileirar de FilaEstaticaCircular
    @Override
    public void enfileirarFim(Object dado) {
        if (!estaCheia()){
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            //não deixar ponteiroInicio esquecido, caso a estrutura esteja na 1ª inserção
            if (estaVazia())
                ponteiroInicio = ponteiroFim;

            quantidade++;
        } else {
            System.err.println("Queue is full!");
        }
    }


    //funciona como o desenfileirar de FilaEstaticaCircular
    @Override
    public Object desenfileirarInicio() {
        Object dadoInicio = null;
        if (!estaVazia()){
            dadoInicio = dados[ponteiroInicio];
            ponteiroInicio = avancar(ponteiroInicio);
            quantidade--;
        } else {
            System.err.println("Queue is empty!");
        }
        return dadoInicio;
    }

    //NOVO
    @Override
    public Object desenfileirarFim() {
        Object dadoFim = null;
        if (!estaVazia()){
            dadoFim = dados[ponteiroFim];
            ponteiroFim = retroceder(ponteiroFim);
            quantidade--;
        } else {
            System.err.println("Queue is empty!");
        }
        return dadoFim;
    }

    //funciona como o frente de FilaEstaticaCircular
    @Override
    public Object frente() {
        Object dadoInicio = null;
        if (!estaVazia())
            dadoInicio = dados[ponteiroInicio];
        else
            System.err.println("Fila Vazia!");

        return dadoInicio;
    }

    //NOVO
    @Override
    public Object tras() {
        Object dadoFim = null;
        if (!estaVazia()) {
            dadoFim = dados[ponteiroFim];
        } else {
            System.err.println("Fila Vazia!");
        }
        return dadoFim;
    }

    //funciona como o atualizarInicio de FilaEstaticaCircular
    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()){
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("Queue is empty!");
        }
    }

    //funciona como o atualizarFim de FilaEstaticaCircular
    @Override
    public void atualizarFim(Object dado) {
        if (!estaVazia()){
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("Queue is empty!");
        }
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

    private int avancar(int ponteiro) {
        return (ponteiro+1)%dados.length;
    }

    private int retroceder(int ponteiro) {
        return ((ponteiro-1)+dados.length)%dados.length;
    }

    //NOVO
    @Override
    public String imprimirTrasFrente() {
        String retorno = "[";
        int ponteiroAux = ponteiroFim;
        for (int i = 0; i < quantidade; i++) {
            if (i == quantidade - 1)
                retorno += dados[ponteiroAux];
            else
                retorno += dados[ponteiroAux] + ",";

            ponteiroAux = retroceder(ponteiroAux);
        }
        return retorno + "]";
    }

    //funciona como o imprimir de FilaEstaticaCircular
    @Override
    public String imprimirFrenteTras() {
        String retorno = "[";
        int ponteiroAux = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            if (i == quantidade - 1)
                retorno += dados[ponteiroAux];
            else
                retorno += dados[ponteiroAux] + ",";

            ponteiroAux = avancar(ponteiroAux);
        }
        return retorno + "]";
    }
}
