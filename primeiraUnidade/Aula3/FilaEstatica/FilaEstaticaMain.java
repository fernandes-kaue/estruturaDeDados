package primeiraUnidade.Aula3.FilaEstatica;

public class FilaEstaticaMain {
    public static void main(String[] main) {
        Enfileiravel fila = new FilaEstatica();

        fila.enfileirar("agua");
        fila.enfileirar("terra");
        fila.desenfileirar();
        System.out.println(fila.frente());
        fila.enfileirar("fogo");
        fila.enfileirar("terra");
        fila.enfileirar("fogo");
        fila.desenfileirar();
        System.out.println(fila.frente());
        fila.enfileirar("king crimson");
        fila.enfileirar("terra");
        fila.enfileirar("ar");
    }
}
