package kg.megacom.main_service.microservices;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "auth", url = "localhost:8012")
public interface LoginServiceFeign {


     @PostMapping("/auth/signup")
     ResponseEntity signUp(@RequestParam String login, @RequestParam String password );
@PostMapping("/auth/login")
     String login(@RequestParam String login, @RequestParam String password );
}
