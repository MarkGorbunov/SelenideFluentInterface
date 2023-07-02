package config;

import java.io.FileInputStream;
import java.util.Properties;

import lombok.SneakyThrows;


public class Config {
    private static Properties envProperties;

    @SneakyThrows
    private static Properties readProperties(String propertiesFilePath) {
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(propertiesFilePath));
        return appProps;
    }

    private static void readEnv() {
        String env = System.getProperty("env").isEmpty() ? "test" : System.getProperty("env");
        envProperties = readProperties("src/test/resources/" + env + ".properties");
    }

    public static Properties getEnv() {
        if (envProperties == null) {
            readEnv();
        }
        return envProperties;
    }
}
