package Main;

import java.util.Arrays;

public class Exercicio2 {

    public static int somaUC (int[][] notasTurma, int UC) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notasTurma[i][UC];
        }
        return soma;
    }

    public static double mediaAluno (int[][] notasTurma, int aluno) {
        double media = 0;
        for (int i = 0; i < notasTurma.length; i++) {
            media += notasTurma[aluno][i];
        }
        return media / notasTurma.length;
    }

    public static double mediaUC (int[][] notasTurma, int UC) {
        double media = 0;
        for (int[] ints : notasTurma) {
            media += ints[UC];
        }
        return media / notasTurma.length;
    }

    public static int melhorNota (int[][] notasTurma) {
        int maior = 0;
        for (int i = 0; i < notasTurma.length; i++) {
            for (int j = 0; j < notasTurma.length; j++) {
                if (maior < notasTurma[i][j]) maior = notasTurma[i][j];
            }
        }
        return maior;
    }

    public static int piorNota (int[][] notasTurma) {
        int menor = notasTurma[0][0];
        for (int i = 0; i < notasTurma.length; i++) {
            for (int j = 0; j < notasTurma.length; j++) {
                if (menor > notasTurma[i][j]) menor = notasTurma[i][j];
            }
        }
        return menor;
    }

    public static int[] acimaValor (int[][] notasTurma, int valor) {
        int[] res = new int[notasTurma.length+5];
        int k = 0;
        for (int i = 0; i < notasTurma.length; i++) {
            for (int j = 0; j < notasTurma.length; j++) {
                if (valor < notasTurma[i][j]) res[k++] = notasTurma[i][j];
            }
        }
        return res;
    }

    public static String notas (int[][] notasTurma) {
        return Arrays.deepToString(notasTurma);
    }

    public static int mediaElevada (int[][] notasTurma) {
        double maior = 0;
        int ind = 0;
        for (int i = 0; i < notasTurma.length; i++) {
            if (mediaUC(notasTurma, i) > maior) {
                ind = i;
                maior = mediaUC(notasTurma, i);
            }
        }
        return ind;
    }

}
