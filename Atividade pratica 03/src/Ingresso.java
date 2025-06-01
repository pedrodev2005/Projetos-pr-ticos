
public class Ingresso {
    protected int codigo;
    protected double valor;

    public Ingresso(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.printf("Código: %d | Valor: R$ %.2f\n", codigo, valor);
    }
}
