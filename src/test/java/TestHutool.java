import java.util.Date;
import cn.hutool.core.date.DateUtil;
import org.junit.Test;
import java.util.Date;
import cn.hutool.core.date.DateUtil;
public class TestHutool {
    @Test
    public void test(){
        String dateStr = "2012-12-12 12:12:12";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }

}
