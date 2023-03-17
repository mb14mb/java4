package coap;

import java.io.IOException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.elements.exception.ConnectorException;

public class Client extends CoapResource {

	public Client(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		CoapClient client1 = new CoapClient("coap://localhost/Humidity");
		CoapClient client2 = new CoapClient("coap://localhost/Temperature");
		
		try {
			String text1 = client1.get().getResponseText();
			String text2 = client2.get().getResponseText();
			
			System.out.println(text1);
			System.out.println(text2);
			
			
		} catch (ConnectorException | IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
