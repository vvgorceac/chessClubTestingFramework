package md.chessclub.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configs {
    private static final Logger logger = LogManager.getLogger(Configs.class);
    private static Configs ourInstance = new Configs();
    private Properties prop;
    private Integer globalTimeout = 10;

    public static Configs getInstance() {
        return ourInstance;
    }

    private Configs() {
        //Initializing property file
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "test.properties";

        prop = new Properties();
        try {
            logger.info("Trying to load resources from " + appConfigPath);
            prop.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties getProp() {
        return prop;
    }

    public Integer getGlobalTimeout() {
        return globalTimeout;
    }
}