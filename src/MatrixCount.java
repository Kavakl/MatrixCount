import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by kaval on 02.10.2017.
 */
public class MatrixCount {
    static int[][] arr;
    static int[][] copyArr = new int[3][3];
    static int count;

    public MatrixCount(int arr[][]) {
        this.arr = arr;
    }

    public int countWay(int i, int j) {
            if (j < arr[0] .length - 1 || i < arr.length - 1) {
                if (i + arr[i][j] < arr.length) {
                    if (arr[i][j]>0) {
                        copyArr[i][j] = arr[i][j];
                        countWay(i + arr[i][j], j);
                    }
                }
                if (j + arr[i][j] < arr[0].length) {
                    if (arr[i][j]>0) {
                    copyArr[i][j] = arr[i][j];
                    countWay(i, j + arr[i][j]);
                    }
                }
            } else if (i == arr.length - 1 || j == arr[0].length - 1) {
                copyArr[i][j] = arr[i][j];
                int countI = arr.length;
                int countJ = arr[0].length;
                copyArr[0][0] = arr[0][0];
                for (int k = 0; k < countI; k++) {
                    for (int v = 0; v < countJ; v++) {
                        System.out.print(copyArr[k][v]);
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                copyArr = new int[4][3];
                count++;
            }
        return count;
    }
}
