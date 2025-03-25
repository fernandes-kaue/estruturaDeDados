package primeiraUnidade.Aula3.FilaEstaticaCircular;

public class FilaEstaticaCircularMain {
    public static void main(String[] args) {
        Enfileiravel fila = new FilaEstaticaCircular();

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
