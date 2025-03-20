package primeiraUnidade.Aula2.PilhaEstaticaDuplaAutomática;

import primeiraUnidade.Aula1.Empilhavel;

public class PilhaDuplaAuto implements Empilhavel {
    private Object[] dados;
    private int ponteiro1;
    private int ponteiro2;

    // construtores
    public PilhaDuplaAuto(int tamanho) {
        ponteiro1 = -1;
        ponteiro2 = tamanho;
        dados = new Object[tamanho];
    }

    public PilhaDuplaAuto() {
        this(10);
    }

    // metodos principais

    /* pensei em utilizar um parametro booleano para selecionar a pilha,
    mas o usuário final nao se importaria tanto sobre qual pilha estaria salvo,
    apenas se estaria salvo :p */
    @Override
    public void empilhar(Object obj) {
        if (!estaCheia()) {
            if ((ponteiro1 + ponteiro2) % 2 == 1) {
                dados[++ponteiro1] = obj; // Adiciona na pilha normal primeiro
            } else {
                dados[--ponteiro2] = obj; // Depois adiciona na pilha invertida
            }
        } else {
            System.err.println("Pilha está cheia!");
        }
    }






    /* na minha cabeça a pilha invertida é do meow pra frente,
    entao tem de ser desempilhada primeiro */
    @Override
    public Object desempilhar() {
        Object dadoTopo = null;
        if (!estaVazia()) {
            if (ponteiro1 >= 0) {
                dadoTopo = dados[ponteiro1--]; // Remove primeiro da pilha normal
            } else if (ponteiro2 < dados.length) {
                dadoTopo = dados[ponteiro2++]; // Depois da pilha invertida
            }
        } else {
            System.err.println("Pilha está completamente vazia!");
        }
        return dadoTopo;
    }



    @Override
    public Object topo() {
        if (ponteiro2 < dados.length) {
            return dados[ponteiro2]; // Retorna topo da pilha invertida
        } else if (ponteiro1 >= 0) {
            return dados[ponteiro1]; // Retorna topo da pilha normal
        }
        return null; // Ambas as pilhas estão vazias
    }



    @Override
    public void atualizar(Object obj) {
        if (ponteiro2 < dados.length) {
            // Atualiza o topo da pilha invertida primeiro
            dados[ponteiro2] = obj;
        } else if (ponteiro1 >= 0) {
            // Se a pilha invertida está vazia, atualiza o topo da pilha normal
            dados[ponteiro1] = obj;
        } else {
            System.err.println("Pilha vazia! Nada para atualizar.");
        }
    }


    // metodos auxiliares
    @Override
    public Boolean estaCheia() {
        return (ponteiro1 + 1 == ponteiro2);
    }

    @Override
    public Boolean estaVazia() {
        return (ponteiro1 == -1 || ponteiro2 == dados.length);
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Pilha 1: ");
        for (int i = dados.length - 1; i >= ponteiro2; i--) {
            sb.append(dados[i]).append(" ");
        }

        sb.append("\nPilha 2: ");
        for (int i = 0; i <= ponteiro1; i++) {
            sb.append(dados[i]).append(" ");
        }

        return sb.toString();
    }

}
