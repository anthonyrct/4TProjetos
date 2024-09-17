import java.util.Scanner;

public class SistemaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arrays de disciplinas e notas
        String[] disciplinas = { "Matematica", "Portugues", "Ciencias", "Historia" };
        double[] notas = new double[4];
        double somaNotas = 0;
        // variavel do tipo booleana para um bonus de 10%,
        // caso a nota do aluno seja maior que 9
        // (para testar mais os controladores de fluxos)
        boolean bonus = true;
        // for que percorre um array para ver as notas de cada disciplina
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota de " + disciplinas[i] + ":");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];

            if (notas[i] <= 9) {// se a nota for menor que 9, o bonus sera falso
                bonus = false;
            }
        }
        double media = somaNotas / 4;
        // caso o aluno tenha uma nota maior que 9 em todas as disciplinas, o bonus sera
        // true
        if (bonus) {
            media *= 1.10;
            System.out.println("bonus de 10% foi aplicado a media!");
        }
        System.out.printf("A Media do aluno é: %2f%n", media);
        // Verifica o status do aluno com base na média
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }

        scanner.close();
    }
}
