package httprequests;

import java.io.File;
import java.util.Properties;

import static configreader.PropertyReader.readPropertiesFile;

public class BaseRequests {
    protected Properties appProp;
    String testDataFile;

    BaseRequests(){
        testDataFile = "appdetails.properties";
        appProp = readPropertiesFile(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "appData" + File.separator + testDataFile);
    }
}
