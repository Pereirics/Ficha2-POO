package Main;

public class Exercicio_1 {
    public static int minArray (int[] array) {
        int menor = 0;
        if (array.length > 0) {
            menor = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < menor) menor = array[i];
            }
        }
        return menor;
    }

    public static int[] entreIndices (int[] array, int i, int j) {
        int[] result = new int[j-i+1];
        for (int k = 0; i <= j; i++, k++) {
            result[k] = array[i];
        }
        return result;
    }

    public static int[] comunsArrays (int[] array1, int[] array2) {
        int comp1 = array1.length;
        int comp2 = array2.length;
        int maior = Math.max(comp1, comp2);
        int k = 0;
        int[] res = new int[Math.min(comp1, comp2)];

        for (int value : array1) {
            for (int i : array2) {
                if (value == i) res[k++] = value;
            }
        }
        return res;
    }
}
