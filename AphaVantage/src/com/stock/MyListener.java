package com.stock;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener{

	Logger logger;
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	//	ServletContextListener.super.contextDestroyed(sce);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		logger=Logger.getLogger(FindJson.class.getName());
		FileHandler fhandler;
		try {
			fhandler = new FileHandler("C:\\Users\\nandu\\eclipse-workspace\\AphaVantage\\app.log",true);
			logger.addHandler(fhandler);
			SimpleFormatter format=new SimpleFormatter();
			fhandler.setFormatter(format);
			logger.info("Starting the application");
			System.out.println("Started");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	ServletContextListener.super.contextInitialized(sce);
	}
	

}
