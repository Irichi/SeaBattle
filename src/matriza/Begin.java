package matriza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Иричи on 18.04.2015.
 */
public class Begin {
    private int i;
    private int j;
    static int k;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public static void main(String[] args) throws IOException {

        Begin start = new Begin();
        Matrix matrix = new Matrix();
        matrix.output(start.i,start.j);

    }
    public Begin() throws IOException {
        System.out.println("Введите число строк");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        i = Integer.parseInt(reader.readLine());
        System.out.println("Введите число столбцов");
        j = Integer.parseInt(reader.readLine());
    }



}
