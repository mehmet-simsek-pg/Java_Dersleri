package gun52.props;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main1{
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("resources/vars.properties");

        Properties properties = new Properties();
        properties.load(reader);

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("tarih"));
        System.out.println(properties.getProperty("gun"));

    }
}
