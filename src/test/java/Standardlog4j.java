import org.apache.log4j.*;
import org.junit.Test;

public class Standardlog4j {
    static Logger log=Logger.getLogger(Standardlog4j.class);
    @Test
    public void Slog(){
        PropertyConfigurator.configure("src/log4j.properties");
        log.trace("跟踪数据变化");
    }

}
