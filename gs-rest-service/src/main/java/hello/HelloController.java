package hello;

import java.net.URL;

import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    
	
	private int port=8080;

	private URL base;
	private RestTemplate template;

	
	//Aqui el metodo que se mapea cuando el user pone / en su navegador
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
}
    
    @RequestMapping(value = "/prueba", produces = "application/json")
    @ResponseBody
    public String infoSist() throws Exception {
    	base = new URL("http://localhost:" + port + "/metrics");
    	template = new TestRestTemplate();
    	//response es un json tratarlo en el index
    	ResponseEntity<String> infoSist = template.getForEntity(base.toString(), String.class);
		return infoSist.getBody();	
    }
    
    @RequestMapping("/estadoSist")
    @ResponseBody
    public String stateSist() throws Exception {
    	base = new URL("http://localhost:" + port + "/health");
    	template = new TestRestTemplate();
    	//response es un json tratarlo en el index
    	ResponseEntity<String> stateSist = template.getForEntity(base.toString(), String.class);
    	return stateSist.getBody();	
    }
    
}