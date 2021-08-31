package aulaslpi;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
	final static Logger log = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			int result = r.nextInt(5);
			if( result == 0) {
				log.error("Deu 0, logo, deu ruim");
			} else {
				log.info("Deu bom " +  result);
			}
		}
		
		
	}

}
