package microservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {
	
	
	@GetMapping("/test")
	public ResponseEntity<colleage> getcalleagedetails() {
		
		colleage c1 = new colleage();
		c1.setColleageid(1L);
		c1.setName("Ganesh");
		c1.setAddress("Mumbai");
		
	return new ResponseEntity<colleage>(c1,HttpStatus.OK);
	}

}
