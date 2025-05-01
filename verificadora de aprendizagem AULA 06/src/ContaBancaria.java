import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ContaBancaria {
    private double saldo = 0.00;
    private final Date dataAbertura;

    public ContaBancaria() {
        this.dataAbertura = new Date();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public String getDataAberturaFormatada() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(dataAbertura);
    }

    public String getSaldoFormatado() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatador.format(saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}
