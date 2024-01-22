package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig(){
        File src= new File("E:\\Vinay\\Java Programs\\My_Java_Programs\\My_App\\src\\Configuration\\config.properties");

        try{
            FileInputStream fis= new FileInputStream(src);
            pro=new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is "+e.getMessage());

        }
    }
    public String getApplicationURL(){
        String url= pro.getProperty("baseurl");
        return url;
    }
    public String getUsername(){
        String uname= pro.getProperty("uname");
        return uname;
    }
    public String getPassword(){
        String pwd= pro.getProperty("pwd");
        return pwd;
    }
    public String getPageTitle(){
        String pageTitle= pro.getProperty("pageTitle");
        return pageTitle;
    }
    public String getApplicationURL2(){
        String url2= pro.getProperty("baseurl2");
        return url2;
    }
    public String getParaUsername(){
        String paraUsername=pro.getProperty("paraUsername");
        return paraUsername;
    }
    public String getParaPassword(){
        String paraPassword=pro.getProperty("paraPassword");
        return paraPassword;
    }
    
}
