import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;
import pojo.Hero;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class logtest {

    private int id;
    private String name;
    @Test
    public void test(){
//        Logger logger= Logger.getGlobal();
//        logger.info("start process...");
//        logger.warning("memory is running out...");
//        logger.fine("ignored");
//        logger.severe("process will be terminated...");
        System.out.println(new logtest());
//        System.out.println(new logtest(1,"gareen"));
    }

    static Logger logger=Logger.getLogger(String.valueOf(logtest.class));
    @Test
    public void log4j() throws InterruptedException {
        BasicConfigurator.configure();
        logger.setLevel(Level.DEBUG);
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("警告信息");
        logger.error("错误信心");
        logger.fatal("致命信息");
    }
    @Test
    public void bb(){
        Logger logger = Logger.getLogger(logtest.class);
        BasicConfigurator.configure();
        logger.info(new Hero().getId());
        System.out.println(new Hero().getName());
    }
}
//package com.itranswarp.learnjava;
//        import java.io.UnsupportedEncodingException;
//        import org.apache.commons.logging.Log;
//        import org.apache.commons.logging.LogFactory;
//
//public class Main {
//    static final Log log = LogFactory.getLog(Main.class);
//    public static void main(String[] args) {
//        log.info("Start process...");
//        try {
//            "".getBytes("invalidCharsetName");
//        } catch (UnsupportedEncodingException e) {
//            log.error("Invalid encoding.", e);
//        }
//        log.info("Process end.");
//    }
//}

