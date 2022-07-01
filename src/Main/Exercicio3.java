package Main;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Exercicio3 {

    static LocalDateTime[] datas = new LocalDateTime[0];
    static int i = 0;

    public static void insereData (LocalDateTime data) {
        datas = Arrays.copyOf(datas, datas.length+1);
        datas[i++] = data;
        System.out.print(Arrays.toString(datas));
    }
}
