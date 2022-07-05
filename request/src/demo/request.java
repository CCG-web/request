package demo;

import java.util.*; 
import javax.ws.rs.client.Client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class request {

	
		public static void main(String [] args) {
			Timer t = new Timer();  
			TimerTask tt = new TimerTask() {  
			    @Override  
			    public void run() {  
			        
			    	try {
						Client client = ClientBuilder.newClient();
						WebTarget target=client.target("https://api.msrc.microsoft.com/cvrf/v2.0/updates");
						System.out.println(
								target.request(MediaType.TEXT_XML).get(String.class)
								);
						  
						   } catch (Exception e) {
						      
							  
						   }  
			          
			    };  
			};  
			t.schedule(tt, new Date(),300000); ;  
			
			

	}

}
 
	      
	   