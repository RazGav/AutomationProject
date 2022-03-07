package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertyFile {
    public FileInputStream fileInputStream;
    public Properties properties;

    public PropertyFile(String path){
        loadFile(path);
    }

    public void loadFile(String path){
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/" + path + ".properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public HashMap<String, String> getAllValues(){
        HashMap<String, String> values = new HashMap<>();
        for(Object key: properties.keySet()){
            values.put(key.toString(), properties.getProperty(key.toString()));
        }
        return values;
    }
}
