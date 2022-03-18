package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketService {

	/*
	 * @Autowired private RestTemplate rt;
	 */

	public TicketResponse initiateTicketBookProcess(PassengerRequest requestData) {

		String endpointUrl = "http://localhost:9090/bookTicket";
		
		RestTemplate rt=new RestTemplate();
		

		ResponseEntity<TicketResponse> postForEntity = 
					rt.postForEntity(endpointUrl, requestData, TicketResponse.class);
		
		
		TicketResponse body = postForEntity.getBody();

		return body;
	}

}
