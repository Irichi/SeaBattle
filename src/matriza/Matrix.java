package matriza;

/**
 * Created by Иричи on 18.04.2015.
 */
public class Matrix {

    public void output(int a, int b) {

        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < b+1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}

