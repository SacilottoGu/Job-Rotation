import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        double faturamentoTotal =0;

        Map<String, Double> faturamentos = new HashMap<>();

        faturamentos.put("SP", 67836.43);
        faturamentos.put("RJ", 36678.66);
        faturamentos.put("MG", 29229.88);
        faturamentos.put("ES", 27165.48);
        faturamentos.put("Outros", 19849.53);

        for(double faturamento : faturamentos.values()){
            faturamentoTotal += faturamento;
        }

        for(String estado : faturamentos.keySet()){
            double percentual = ( faturamentos.get(estado) / faturamentoTotal) * 100;

            System.out.printf("%s: %.2f%% %n",estado, percentual);
        }

    }
}