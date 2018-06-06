package za.co.meccado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class BookstoreApplicationService 
{
    public static void main( String[] args )
    {
        SpringApplication.run(BookstoreApplicationService.class, args);
    }
    
    
    @RequestMapping(value="/recommended")
    public String readingList() {
    	return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }
}
