import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-04-03
 *
 */
 

@SpringBootApplication
@Controller
public class SpringStarterApplication {
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "funciona?";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
	}
}
