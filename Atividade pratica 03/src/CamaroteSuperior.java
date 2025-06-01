
public class CamaroteSuperior extends Vip {
    private double valorAdicionalSuperior;

    public CamaroteSuperior(int codigo, double valor, double valorAdicional, double valorAdicionalSuperior) {
        super(codigo, valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }

    public double getValorTotal() {
        return valor + valorAdicional + valorAdicionalSuperior;
    }

    @Override
    public void imprimeValor() {
        System.out.printf("Código: %d | Valor Camarote Superior: R$ %.2f\n", codigo, getValorTotal());
    }
}
