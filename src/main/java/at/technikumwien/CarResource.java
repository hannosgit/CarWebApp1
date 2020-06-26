package at.technikumwien;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources/cars")
public class CarResource {
	@Autowired
	private CarRepository carRepository;
	
	@GetMapping
	public List<Car> retrieveAll() {
		
		return carRepository.findAll();
	}

}
