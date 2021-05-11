import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.*;
import java.io.UnsupportedEncodingException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class TestLog4j {
    static Logger logger = Logger.getLogger(TestLog4j.class);
    public static void main(String[] args) throws InterruptedException {
        BasicConfigurator.configure();
        logger.setLevel(Level.DEBUG);
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }
    @Test
    public void Test(){
        PropertyConfigurator.configure("src/log4j.properties");
//        for(int i=0;i<50;i++){
//            logger.trace("跟踪信息");
//            logger.debug("调试信息");
//            logger.info("输出信息");
//            logger.warn("警告信息");
//            logger.error("错误信息");
//            logger.fatal("致命信息");
//        }
        logger.trace(new logtest());
    }
    static final Log log=LogFactory.getLog(TestLog4j.class);
    @Test
    public void exlog(){
        PropertyConfigurator.configure("src/log4j.properties");
        log.info("Start process");
        try{
            "".getBytes("invalidCharsetName");
        }catch(UnsupportedEncodingException e){
//            e.printStackTrace();
            log.error("Invalid encoding.");
        }
        log.info("Process end");
    }
}
