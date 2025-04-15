package primeiraUnidade.Aula4e5.ListaEstaticaCircular;

public class ListaEstaticaCircularMain {
    public static void main(String[] args) {
        Listavel lista = new ListaEstaticaCircular();
        lista.anexar("A");
        lista.anexar("B");
        lista.inserir("C", 2);
        System.out.println(lista.imprimir()); //[A,B,C]
        lista.anexar("D");
        lista.apagar(0);
        lista.inserir("E", 0);
        lista.inserir("F", 2);
        System.out.println(lista.imprimir()); //[E,B,F,C,D]
        System.out.println(lista.selecionar(1)); //B
        lista.atualizar("G", 1);
        System.out.println(lista.imprimir()); //[E,G,F,C,D]}
    }
}
