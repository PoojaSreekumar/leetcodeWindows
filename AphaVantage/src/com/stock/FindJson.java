package com.stock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.logging.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FindJson {

	public static String apikey="LRHG6PQ9KT10BWFE";
	
	public static  String getJsonInfo(String stockvalue) {
		StringBuilder strBuf = new StringBuilder();
		try {
			 URL url =  
		             new URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+stockvalue+"&apikey="+apikey); 
		                HttpURLConnection con = 
		                        (HttpURLConnection) url.openConnection(); 
		  
		                // set the request method and properties. 
		                con.setRequestMethod("GET"); 
		             BufferedReader   reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		              
		                String output = null;  
		                while ((output = reader.readLine()) != null)  
		                    strBuf.append(output); 
		                con.disconnect();
		               
		
		}
		catch(IOException e){  
            e.printStackTrace();   
        }
		finally {
			
		}
		 return strBuf.toString();
		
	}
	
	public void log() throws SecurityException, IOException {
		Logger logger=Logger.getLogger(FindJson.class.getName());
		FileHandler fhandler=new FileHandler("C:\\Users\\nandu\\eclipse-workspace\\AphaVantage\\app.log",true);
		logger.addHandler(fhandler);
		SimpleFormatter format=new SimpleFormatter();
		fhandler.setFormatter(format);
		Properties prop=new Properties();
		//InputStream input = new FileInputStream("C:\\Users\\nandu\\eclipse-workspace\\AphaVantage\\config.properties");
		InputStream ip=getClass().getResourceAsStream("../../resource/conf.properties");
	//	OutputStream output=new FileOutputStream("/resources/conf.properties");
	//	prop.setProperty("hi", "hello");
	//	prop.store(output, null);
		if(ip==null) {
			logger.info("invalid");
			System.out.println("invalid");
		}
		else {
		prop.load(ip);
		
		System.out.println(prop.getProperty("val"));
		logger.info(prop.getProperty("val"));
		}
		
		/*
		 * if(prop.getProperty("lval").equals("true")) {
		 * logger.info("Logged successfully"); } else logger.info("no");
		 */
	//	ip.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
