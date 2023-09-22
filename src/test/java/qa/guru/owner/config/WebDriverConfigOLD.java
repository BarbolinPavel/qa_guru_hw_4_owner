package qa.guru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverConfigOLD {

    public String getBaseUrl(){
        String baseUrl = System.getProperty("baseUrl","https://www.vtb.ru/");
        return baseUrl;
    }

    public Browser getBrowser(){
        String browser = System.getProperty("browser", "CHROME");
        return Browser.valueOf(browser);
    }

    public URL getRemoteURL(){
        String remoteURL = System.getProperty("remoteURL", "http://localhost:4444");
        try {
            return new URL(remoteURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
