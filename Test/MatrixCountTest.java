import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kaval on 02.10.2017.
 */
public class MatrixCountTest {
    @Test
    public void countWay() throws Exception {
        int[][] arr = {{1,1,1},{1,1,1},{1,1,1}};
        MatrixCount m = new MatrixCount(arr);
        assertEquals(6,m.countWay(0,0));
    }
}