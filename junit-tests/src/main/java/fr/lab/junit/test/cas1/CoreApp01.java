package fr.lab.junit.test.cas1;

import org.apache.log4j.Logger;


public class CoreApp01 {

	public static Logger logger = Logger.getLogger(CoreApp01.class);
	
	public String getTexte(int index){
		return ""+index;
	}
	
	public static String getVille(){
		return "Paris";
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("START");
		logger.info("ville = "+getVille());
		logger.info("END");
		
		System.out.println("START");
		System.out.println("ville = "+getVille());
		System.out.println("END");

	}

}
