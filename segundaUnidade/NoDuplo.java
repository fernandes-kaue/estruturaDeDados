/**
 * classe auxiliar para manutenção de nós e
 * posiçoes na pilha estatica, uma vez que
 * esta não possui um acesso direto aos indices como na pilha normal
 * 
 * @author Kauê Fernandes
 * @version 0.1
 * @since 2025/05/08
 */
public class NoDuplo<T> {
    private NoDuplo<T> anterior;
    private T dado;
    private NoDuplo<T> proximo;

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}
