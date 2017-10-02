import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kaval on 02.10.2017.
 */
public class MatrixCountTest {
    @Test
    public void countWay() throws Exception {
        int[][] arr = {{2,1,1,2},{3,2,1,44},{3,1,1,0}};
        int[][] arr1 = {{3,2,1,3,1,1,3,1},{1,1,2,1,1,1,1,1},{2,1,1,1,1,1,1,1},{3,1,2,4,1,1,1,2},{1,1,1,1,1,1,1,1},{1,1,1,4,1,1,1,0}};
        MatrixCount m = new MatrixCount(arr1);
        assertEquals(5,m.countWay(0,0));
    }
}