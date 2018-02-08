package aws.wom.authenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
@Controller
public class AuthenticatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticatorApplication.class, args);
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@RequestMapping(value = "/")
    public void test() {}
}
