public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Data de abertura: " + conta.getDataAberturaFormatada());
        System.out.println("Saldo inicial: " + conta.getSaldoFormatado());

        conta.depositar(1500.00);
        System.out.println("Saldo após depósito: " + conta.getSaldoFormatado());

        conta.sacar(500.00);
        System.out.println("Saldo após saque: " + conta.getSaldoFormatado());

        conta.sacar(2000.00); // Teste de saque inválido
        System.out.println("Saldo final: " + conta.getSaldoFormatado());
    }
}
