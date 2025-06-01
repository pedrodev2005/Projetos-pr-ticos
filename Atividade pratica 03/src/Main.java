import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ingresso> ingressos = new ArrayList<>();

        ingressos.add(new Normal(1, 50.0));
        ingressos.add(new Vip(2, 50.0, 20.0));
        ingressos.add(new CamaroteInferior(3, 50.0, 30.0, "Setor A"));
        ingressos.add(new CamaroteSuperior(4, 50.0, 30.0, 40.0));

        for (Ingresso i : ingressos) {
            System.out.println("------------------------------");
            i.imprimeValor();
        }
    }
}
