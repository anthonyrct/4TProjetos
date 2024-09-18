import java.util.Random;

public class CadeiaMarkovSimples {
    // Definição dos estados
    private static final int ENSOLARADO = 0;
    private static final int NUBLADO = 1;
    private static final int CHUVOSO = 2;

    // Matriz de transição
    private static final double[][] matrizTransicao = {
            { 0.7, 0.2, 0.1 }, // Probabilidades de transição a partir de ENSOLARADO
            { 0.3, 0.4, 0.3 }, // Probabilidades de transição a partir de NUBLADO
            { 0.2, 0.3, 0.5 } // Probabilidades de transição a partir de CHUVOSO

    };
}
