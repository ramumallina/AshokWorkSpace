package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@GetMapping("/price/{carName}")
	@ResponseBody
	public String getCarPrice(@PathVariable("carName") String carName) {

		String msg = carName + " Price is 7.8 lakhs";

		return msg;
	}

	@GetMapping("/check/{carName}/{location}/{branch}/cars")
	@ResponseBody
	public String checkDtls(@PathVariable String carName, 
			@PathVariable String location, @PathVariable String branch) {

		String responseMsg = "In " + location + " " + branch + " Branch " + carName + " Cars are available";

		return responseMsg;
	}
}
