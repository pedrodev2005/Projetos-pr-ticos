public class Normal extends Ingresso {
    public Normal(int codigo, double valor) {
        super(codigo, valor);
    }

    public void tipoIngresso() {
        System.out.println("Ingresso Normal");
    }

    @Override
    public void imprimeValor() {
        tipoIngresso();
        super.imprimeValor();
    }
}
