package in.ashokit.util;

import org.springframework.stereotype.Component;

@Component 
public class EmailUtils {
	
	public EmailUtils() {
		System.out.println("EmailUtils :: Constructor");
	}
	
	public void sendEmail() {
		System.out.println("Sending Email For Registered User....");
	}
}
