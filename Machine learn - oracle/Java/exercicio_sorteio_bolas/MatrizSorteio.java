public class MatrizSorteio {
    // Método para gerar a matriz de transição
    public double[][] gerarMatrizTransicao() {
        // Definindo o número de estados (0 a 5 bolas azuis)
        int estados = 6;

        // Matriz de transição
        double[][] matrizTransicao = new double[estados][estados];

        // Preenchendo a matriz de transição
        for (int i = 1; i <= 5; i++) {
            // Probabilidade de sortear uma bola azul
            double probAzul = (double) i / (i + 5);
            // Probabilidade de sortear uma bola vermelha
            double probVermelha = (double) 5 / (i + 5);

            // Transição ao sortear uma bola azul: de i bolas azuis para i-1
            matrizTransicao[i][i - 1] = probAzul;

            // Transição ao sortear uma bola vermelha: permanece no mesmo estado
            matrizTransicao[i][i] = probVermelha;
        }

        // O estado 0 é o estado final, sem transições (absorvente)
        matrizTransicao[0][0] = 1.0;

        return matrizTransicao;
    }

    // Método para exibir a matriz de transição
    public void exibirMatriz(double[][] matrizTransicao) {
        System.out.println("Matriz de Transição:");
        for (int i = 0; i < matrizTransicao.length; i++) {
            for (int j = 0; j < matrizTransicao[i].length; j++) {
                System.out.printf("%.2f ", matrizTransicao[i][j]);
            }
            System.out.println();
        }
    }
}
