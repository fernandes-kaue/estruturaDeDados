public class PilhaComFilas implements Empilhavel1 {
    private Enfileiravel f1;
    private Enfileiravel f2;

    // construtores
    public PilhaComFilas() {
        this(10);
    }

    public PilhaComFilas(int tamanho) {
        f1 = new FilaCircular(tamanho);
        f2 = new FilaCircular(tamanho);
    }

    // metodos principais
    @Override
    public void empilhar(Object dado) {
        if (!f1.estaCheia()){
            f1.enfileirar(dado);
        }
    }

    @Override
    public Object desempilhar() {
        return null;
    }

    @Override
    public Object espiar() {
        return (f1.frente());
    }

    @Override
    public void atualizar(Object dado) {
        if (!estaVazia()) {
            f1.atualizarInicio(dado);
        }
    }

    @Override
    public boolean estaCheia() {
        return f1.estaCheia();
    }

    @Override
    public boolean estaVazia() {
        return f1.estaVazia();
    }

    @Override
    public String imprimir() {
        return f1.imprimir();
    }
}
