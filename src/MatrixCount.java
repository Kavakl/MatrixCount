/**
 * Created by kaval on 02.10.2017.
 */
public class MatrixCount {
    static int [][] arr ;
    static int count;
    public MatrixCount (int arr[][]){
        this.arr = arr;
    }
    public int countWay(int i , int j){
        if (j < arr[0].length-1 || i<arr.length-1){
            if (i + arr[i][j]<arr.length)
                countWay(i+arr[i][j],j);
            if (j+arr[i][j]<arr[0].length)
                countWay(i,j+arr[i][j]);
        }
        else if (i==arr.length-1 || j==arr[0].length-1)
            count++;
        return count;
    }
}
