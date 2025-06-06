package Aula2.FilaDinamicaGenericaSimples.src;

//javadoc -d doc src/*.java

//compilar um código-fonte específico: 
//javac src/Enfileiravel.java -d bin
//ou
//compilar todos os códigos-fonte: 
//javac src/*.java -d bin
//executar o programa: 
//java -cp .;bin FilaDinamicaGenericaMainCLI

//Para os testes unitários com junit:
//compilar classe de teste: 
//javac -cp .;bin;lib/junit-4.13.2.jar -d test test/FilaDinamicaGenericaTest.java
//executar testes: 
//java -cp .;bin;test;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore FilaDinamicaGenericaTest

//Gerar binário
//Gerar .jar
//jar cvfe build/Main.jar FilaDinamicaGenericaMainCLI -C bin .
//Executar .jar
//java -jar build/Main.jar

/**
 * Esta interface indica as operações que uma classe que deseja
 * ter o comportamento de ser Enfileirável precisa.
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/16
 */

public interface Enfileiravel<T> {
    void enfileirarInicio(T dado);

    void enfileirarFim(T dado);

    T frente();

    T tras();

    void atualizarInicio(T dado);

    void atualizarFim(T dado);

    T desenfileirarInicio();

    T desenfileirarFim();

    boolean estaCheia();

    boolean estaVazia();

    String imprimirDeTrasPraFrente();

    String imprimirDeFrentePraTras();
}
