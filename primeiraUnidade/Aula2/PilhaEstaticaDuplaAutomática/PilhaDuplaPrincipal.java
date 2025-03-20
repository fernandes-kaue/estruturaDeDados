package primeiraUnidade.Aula2.PilhaEstaticaDuplaAutomática;

import primeiraUnidade.Aula1.Empilhavel;

public class PilhaDuplaPrincipal {
    public static void main(String[] args) {
        Empilhavel pilha = new PilhaDuplaAuto(10);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        System.out.println("Espiar:" + pilha.topo());
        pilha.empilhar("de");
        pilha.empilhar("Educação");
        pilha.empilhar("Ciência");
        pilha.empilhar("e");
        System.out.println("Espiar:" + pilha.topo());
        Object conteudo = pilha.desempilhar();
        pilha.desempilhar();
        pilha.empilhar("Tecnologia");
        pilha.empilhar("da");
        pilha.empilhar("Bahia");
        pilha.empilhar(pilha.desempilhar());
        pilha.empilhar(conteudo);

        System.out.println("Impressão de pilha: ");
        System.out.println(pilha.imprimir());
    }
}

