
import org.junit.Test;
import junit.framework.Assert;
public class testjunit {
    @Test
    public void testSum1(){
        int result=sum(1,2);
        Assert.assertEquals(result,3);
    }
    public static int sum(int i, int j) {
        return i+j;
    }
}
