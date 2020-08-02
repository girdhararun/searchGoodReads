package configreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public PropertyReader() {
    }

    public static Properties readPropertiesFile(String filePath) {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return prop;
    }
}
