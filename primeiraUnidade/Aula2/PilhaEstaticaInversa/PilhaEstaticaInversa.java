package primeiraUnidade.Aula2.PilhaEstaticaInversa;

import primeiraUnidade.Aula1.Empilhavel;

public class PilhaEstaticaInversa implements Empilhavel {
    private int ponteiroTopo;                      // definição de variáveis
    private Object[] dados;

    // construtores
    public PilhaEstaticaInversa(int tamanho) {             // construtor passando tamanho de array
        ponteiroTopo = tamanho;
        dados = new Object[tamanho];
    }

    public PilhaEstaticaInversa() {                        // construtor padrão, com 10 "espaços"
        this(10);
    }

    // métodos principais
    @Override
    public void empilhar(Object dado) {             // para adicionar um novo objeto no topo da pilha/stack
        if (!estaCheia()) {
            ponteiroTopo--;
            dados[ponteiroTopo] = dado;
        } else {
            System.out.println("Pilha está cheia!"); // poderia se utilizar throw também
        }
    }

    @Override
    public Object desempilhar() {                    // para remover o objeto do topo da pilha/stack
        Object dadoTopo = null;
        if (!estaVazia()) {
            dadoTopo = dados[ponteiroTopo];
            ponteiroTopo++;
        } else {
            System.out.println("Pilha esta Vazia!"); // poderia se utilizar throw também
        }
        return dadoTopo;
    }

    @Override
    public Object topo() {                           // "espia" o objeto do topo da pilha/stack
        Object dadoTopo = null;
        if (!estaVazia()) {
            dadoTopo = dados[ponteiroTopo];
        } else {
            throw new ArrayIndexOutOfBoundsException("Pilha esta Vazia");
        }
        return dadoTopo;
    }

    @Override
    public void atualizar(Object obj) {             // metodo para atualizar objeto do topo da pilha/stack
        if (!estaVazia()) {
            dados[ponteiroTopo] = obj;
        } else throw new ArrayIndexOutOfBoundsException("Pilha esta Vazia");
    }

    // métodos auxiliares
    @Override
    public Boolean estaCheia() {                    // verifica se está vazia
        return ponteiroTopo == 0;
    }

    @Override
    public Boolean estaVazia() {                    // verifica se está cheia
        return (ponteiroTopo == dados.length);
    }

    @Override
    public String imprimir() {                      // retorna uma String com todos objetos da pilha/stack
        String resultado = "[";
        for (int i = ponteiroTopo; i >= 0; i--) {
            if (i == 0) {
                resultado += dados[i];
            } else {
                resultado += dados[i] + ",";
            }
        }
        return resultado + "]";
    }
}
