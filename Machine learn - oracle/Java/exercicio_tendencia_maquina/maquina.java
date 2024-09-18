
import java.util.Random;

public class maquina {
    
    private static final int DIAS_NO_MES = 30;
    private static final double AUMENTO_PROBABILIDADE = 0.33;
    private static final int CUSTO_FALHA = 100;

    public static void main(String[] args) {
        Random random = new Random();
        double probabilidadeFalha = 0;
        int totalFalhas = 0;
        int custoTotal = 0;

        for (int dia = 1; dia <= DIAS_NO_MES; dia++) {
            probabilidadeFalha += AUMENTO_PROBABILIDADE;
            System.out.println("Dia " + dia + " - Probabilidade de falha: " + probabilidadeFalha + "%");

            if (random.nextDouble() * 100 < probabilidadeFalha) {
                totalFalhas++;
                custoTotal += CUSTO_FALHA;
                System.out.println("A máquina falhou no dia " + dia + ". Custo acumulado: " + custoTotal);
                probabilidadeFalha = 0;  // Reinicia a probabilidade após a falha
            }
        }

        System.out.println("\nTotal de falhas no mês: " + totalFalhas);
        System.out.println("Custo total no mês: R$ " + custoTotal);
    }
}
