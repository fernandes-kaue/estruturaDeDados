package primeiraUnidade.Aula2.PilhaDupla;

import primeiraUnidade.Aula1.Empilhavel;

public class PilhaDupla implements Empilhavel {
    private Object[] dados;
    private int ponteiro1;
    private int ponteiro2;

    // construtores
    public PilhaDupla(int tamanho) {
        dados = new Object[tamanho];
        ponteiro1 = -1;
        ponteiro2 = tamanho;
    }

    public PilhaDupla() {
        this(10);
    }

    // metodos principais

    /* pensei em utilizar um parametro booleano para selecionar a pilha,
    mas o usuário final nao se importaria tanto sobre qual pilha estaria salvo,
    apenas se estaria salvo :p */
    @Override
    public void empilhar(Object obj) {
        if (!estaCheia()) {
            // Verifica se uma das pilhas está vazia e adiciona nela
            if (ponteiro1 == -1) { // Pilha normal vazia
                dados[++ponteiro1] = obj;
            } else if (ponteiro2 == dados.length) { // Pilha invertida vazia
                dados[--ponteiro2] = obj;
            } else if (ponteiro1 + 1 < ponteiro2) { // Há espaço para a pilha normal
                dados[++ponteiro1] = obj;
            } else if (ponteiro2 - 1 > ponteiro1) { // Há espaço para a pilha invertida
                dados[--ponteiro2] = obj;
            }
        } else {
            System.err.println("Pilha está cheia!");
        }
    }


    @Override
    public Object desempilhar() {
        Object dadoTopo = null;
        if (!estaVazia()) {

        }
        return dadoTopo;
    }

    @Override
    public Object topo() {
        return null;
    }

    @Override
    public void atualizar(Object obj) {

    }

    // metodos auxiliares
    @Override
    public Boolean estaCheia() {
        return null;
    }

    @Override
    public Boolean estaVazia() {
        return null;
    }

    @Override
    public String imprimir() {
        return "";
    }
}
