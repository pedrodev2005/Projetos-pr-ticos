public class Bicicleta extends Veiculo {

    @Override
    public float acelerar(float velocidade) {
        System.out.println("A bicicleta acelerou para " + velocidade + " km/h.");
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}
