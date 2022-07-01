package Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio2Test {

    @BeforeAll
    static void beforeAll() {
        Scanner sc = new Scanner(System.in);
        int[][] notasTurma = new int[5][5];

        int soma = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                notasTurma[i][j] = soma;
            }
            soma += 1;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(notasTurma[i][j] + " ");
            }

            System.out.println();
        }
    }

    @Test
    void somaUC() {
        int[][] notasTurma = new int[5][5];

        int soma = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                notasTurma[i][j] = soma;
            }
            soma += 1;
        }

       soma = 15;
       assertEquals(soma, Exercicio2.somaUC(notasTurma, 3), "Valor errado!");
    }

    @Test
    void mediaAluno() {
        int[][] notasTurma = new int[5][5];

        int soma = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                notasTurma[i][j] = soma;
            }
            soma += 1;
        }

        int media = 3;
        assertEquals(media, Exercicio2.mediaAluno(notasTurma, 2), "Média errada!");
    }

    @Test
    void mediaUC() {
    }

    @Test
    void melhorNota() {
    }

    @Test
    void piorNota() {
    }

    @Test
    void acimaValor() {
        int[][] notasTurma = new int[5][5];

        int soma = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                notasTurma[i][j] = soma;
            }
            soma += 1;
        }

        int[] res = {5,5,5,5,5};
        assertArrayEquals(res, Exercicio2.acimaValor(notasTurma, 4), "Array incorreto!");
    }

    @Test
    void notas() {
    }

    @Test
    void mediaElevada() {
    }
}