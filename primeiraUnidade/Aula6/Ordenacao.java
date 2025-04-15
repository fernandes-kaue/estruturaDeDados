package primeiraUnidade.Aula6;

/*
ALGORITMOS DE ORDENAÇÃO (POR TROCA)
LISTAS ORDENADAS
BUSCA DE DADOS

BUBBLE SORT
SELECTION SORT
INSERTION SORT
 */

public class Ordenacao {
    // array para teste
    public int[] dados = {9, 7, 8, 6, 4, 77, 65, 2, 1, 3, 11};


    public void bubbleSort() {
        for (int j = 0; j < (dados.length - 1); j++) {
            for (int i = 0; i < (dados.length - 1) - j; i++) {
                if (dados[i] > dados[i + 1]) {
                    troca(i, i + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int j = 0; j < dados.length; j++) {
            int menor = 0 + j;
            for (int i = 1 + j; i < dados.length; i++) {
                if (dados[menor] > dados[i]) {
                    menor = i;
                }
            }
            troca(j, menor);
        }

    }



    // metodo auxiliar para bubble sort
    private void troca(int indice1, int indice2) {
        int aux = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = aux;
    }

}
