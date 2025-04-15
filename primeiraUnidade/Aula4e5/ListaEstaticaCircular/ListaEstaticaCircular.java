package primeiraUnidade.Aula4e5.ListaEstaticaCircular;


    public class ListaEstaticaCircular implements Listavel{
        // variaveis
        private int ponteiroInicio;
        private int ponteiroFim;
        private int quantidade;
        private Object[] dados;

        // construtores
        public ListaEstaticaCircular(int tamanho) {
            this.dados = new Object[tamanho];
            this.ponteiroInicio = 0;
            this.ponteiroFim = -1;
            this.quantidade = 0;
        }

        public ListaEstaticaCircular() {
            this(10);
        }

        // principais

        @Override
        public void inserir(Object dado, int posicao) {
            if (!estaCheia()) {
                //verificar se a posicao informada é valida
                if ((posicao >= 0) && (posicao <= quantidade)) {
                    //mapeamento:
                    //DE endereçamento lógico (informado pelo usuário)
                    //PARA endereçamento físico (onde o dado está no array)
                    int posicaoFisica = mapeamento(posicao);

                    for (int i = ponteiroFim+1; i!= posicaoFisica; i--) {
                        int anterior = i-1;

                        if(i == dados.length) {
                            i = 0;
                        }
                        int atual = i;

                        dados[atual] = dados[anterior];
                    }

                    dados[posicaoFisica] = dado;
                    ponteiroFim++;
                    if (ponteiroFim == dados.length) {
                        ponteiroFim = 0;
                    }
                    quantidade++;
                } else {
                    System.err.println("Indice Invalido");
                }
            } else {
                System.err.println("Lista Cheia!");
            }
        }

        @Override
        public void anexar(Object dado) {
            if (!estaCheia()) {
                ponteiroFim = avancar(ponteiroFim);
                dados[ponteiroFim] = dado;
                quantidade++;
            } else {
                System.err.println("List is full!");
            }
        }

        @Override
        public Object selecionar(int posicao) {
            Object dadoAux = null;
            if (!estaVazia()) {
                //verificando se o índice/posição é válido
                if ((posicao >= 0) && (posicao < quantidade)) {
                    //mapeamento:
                    //DE endereçamento lógico (informado pelo usuário)
                    //PARA endereçamento físico (onde o dado está no array)
                    int posicaoFisica = mapeamento(posicao);
                    dadoAux = dados[posicaoFisica];
                } else {
                    System.err.println("Indice Invalido!");
                }
            } else {
                System.err.println("Lista Vazia!");
            }
            return dadoAux;
        }

        @Override
        public Object[] selecionarTodos() {
            Object[] dadosAux = null;
            if (!estaVazia()) {
                dadosAux = new Object[quantidade];
                for (int i = 0, ponteiroAux = ponteiroInicio; i < quantidade; i++, ponteiroAux++)  {
                    if (ponteiroAux == dados.length) {
                        ponteiroAux = 0;
                    }
                    dadosAux[i] = dados[ponteiroAux];
                }
            }
            return dadosAux;
        }

        @Override
        public void atualizar(Object dado, int posicao) {
            if (!estaVazia()) {
                if (posicao >= 0 && posicao < quantidade) {
                    int posicaoFisica = mapeamento(posicao);
                    dados[posicaoFisica] = dado;
                } else {
                    System.err.println("Invalid index!");
                }
            } else {
                System.err.println("List is empty!");
            }
        }

        @Override
        public Object apagar(int posicao) {
            Object dadoAux = null;
            if (!estaVazia()) {
                //verificar se a posicao informada é valida
                if ((posicao >= 0) && (posicao < quantidade)) {
                    //mapeamento:
                    //DE endereçamento lógico (informado pelo usuário)
                    //PARA endereçamento físico (onde o dado está no array)
                    int posicaoFisica = mapeamento(posicao);
                    dadoAux = dados[posicaoFisica];

                    for (int i = posicaoFisica; i != ponteiroFim ; i++) {
                        int atual = i;
                        if (i == dados.length-1) {
                            i = -1;
                        }
                        int proximo = i+1;

                        dados[atual] = dados[proximo];
                    }
                    ponteiroFim--;
                    if (ponteiroFim == -1) {
                        ponteiroFim = dados.length - 1;
                    }
                    quantidade--;
                } else {
                    System.err.println("Indice Invalido!");
                }
            } else {
                System.err.println("Lista Vazia!");
            }
            return dadoAux;
        }

        // auxiliares

        @Override
        public boolean estaCheia() {
            return (quantidade == dados.length);
        }

        @Override
        public boolean estaVazia() {
            return (quantidade == 0);
        }

        @Override
        public String imprimir() {
            String resultado = "[";
            for (int i = 0, ponteiroAux = ponteiroInicio; i < quantidade; i++, ponteiroAux++) {
                if (i == quantidade - 1) {
                    resultado += dados[ponteiroAux % dados.length];
                } else {
                    resultado += dados[ponteiroAux % dados.length] + ",";
                }
            }
            return resultado + "]";
        }

        int mapeamento(int logica) {
            return (logica + ponteiroInicio)%dados.length;
        }

        private int avancar(int ponteiro) {
            return (ponteiro+1)%dados.length;
        }

        private int retroceder(int ponteiro) {
            return ((ponteiro-1)+dados.length)%dados.length;
        }


    }

