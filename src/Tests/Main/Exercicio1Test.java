package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {

    @Test
    void minArray() {
        int[] array = {3, 3, 4, 6, 4, 2};
        assertEquals(2, Exercicio_1.minArray(array), "Valor incorreto!");
    }

    @Test
    void entreIndices() {
        int[] array = {1, 2, 3, 4, 5};
        int[] res = {2, 3, 4};
        assertArrayEquals(res, Exercicio_1.entreIndices(array, 1, 3), "Array incorreto!");
    }

    @Test
    void comunsArrays() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 1};
        int[] res = {1, 2, 3};
        assertArrayEquals(res, Exercicio_1.comunsArrays(array1, array2), "Array incorreto!");
    }
}