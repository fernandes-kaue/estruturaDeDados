package primeiraUnidade.Aula4e5.ListaEstaticaCircular;

public interface Listavel {
    // inserir         - Insert (local especifico
    // anexar          - append (final
    // selecionar      - especifico
    // selecionarTodos -
    // atualizar       -
    // apagar          -

    // principais
    void inserir(Object obj, int posicao);
    void anexar(Object obj);
    Object selecionar (int posicao);
    Object[] selecionarTodos();
    void atualizar(Object dado, int posicao);
    Object apagar(int posicao);

    // extras
    // int primeiraOcorrencia(Object dado);
    // int ultimaOcorrencia(Object dado);
    // boolean contem(Object dado);
    // void limpar();

    // auxiliares
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
