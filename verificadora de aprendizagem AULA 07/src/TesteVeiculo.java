public class TesteVeiculo {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta();
        Automovel carro = new Automovel();

        System.out.println("=== Bicicleta ===");
        bike.acelerar(15);
        bike.parar();

        System.out.println("\n=== Automóvel ===");
        carro.acelerar(80);
        carro.parar();
        carro.mudarOleo(4);
    }
}
