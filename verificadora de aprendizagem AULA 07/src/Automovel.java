public class Automovel extends Veiculo {

    @Override
    public float acelerar(float velocidade) {
        System.out.println("O automóvel acelerou para " + velocidade + " km/h.");
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("O automóvel parou.");
    }

    public void mudarOleo(float litros) {
        System.out.println("Troca de óleo realizada com " + litros + " litros.");
    }
}
