public class FilaComPilhas implements Enfileiravel1 {
    Empilhavel1 p1;
    Empilhavel1 p2;

    // construtores
    public FilaComPilhas() {
        this(10);
    }

    public FilaComPilhas(int tamanho){
        p1 = new PilhaEstatica(tamanho);
        p2 = new PilhaEstatica(tamanho);
    }

    // metodos principais
    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()) {
            p1.empilhar(dado);
        }
    }

    @Override
    public Object desenfileirar() {
        Object dadoInicio = null;
        while (!p1.estaVazia()) {
            p2.empilhar((p1.desempilhar()));
        }
        dadoInicio = p2.desempilhar();
        while(!p2.estaVazia()) {
            p1.empilhar(p2.desempilhar());
        }
        return dadoInicio;
    }

    @Override
    public Object frente() {
        Object dadoInicio = null;
        while (!p1.estaVazia()) {
            p2.empilhar((p1.desempilhar()));
        }
        dadoInicio = p2.espiar();
        while(!p2.estaVazia()) {
            p1.empilhar(p2.desempilhar());
        }
        return dadoInicio;
    }


    // metodos auxiliares
    @Override
    public boolean estaCheia() {
        return p1.estaCheia();
    }

    @Override
    public boolean estaVazia() {
        return p1.estaVazia();
    }
}
