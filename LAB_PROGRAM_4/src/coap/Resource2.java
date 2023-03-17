package coap;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Resource2 extends CoapResource{
	
	public Resource2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void handleGET(CoapExchange exchange) {
		String text = "Temperature is :"+Math.floor(Math.random() * (40-20) + 20);
		exchange.respond(text);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}	

}
