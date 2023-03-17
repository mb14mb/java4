package coap;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Resource1 extends CoapResource {

	public Resource1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void handleGET(CoapExchange exchange) {
		String text = "Humidity is :"+Math.floor(Math.random() * (40-20) + 80);
		exchange.respond(text);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public static void main(String[] args) {
		CoapServer server = new CoapServer();
		server.add(new Resource1("Humidity"));
		server.add(new Resource2("Temperature"));
		server.start();
	}

}
