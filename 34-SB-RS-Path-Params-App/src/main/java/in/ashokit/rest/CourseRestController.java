package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course/{cname}/trainer/{tname}")
	public String getCourseDetails(@PathVariable String cname, @PathVariable String tname) {
		String msg = cname + " By " + tname + " Starting From 15-Jul-2021 @8:00 PM IST";
		return msg;
	}
}
