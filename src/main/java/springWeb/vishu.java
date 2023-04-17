package springWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
@Controller
public class vishu {
	@RequestMapping("/home")
	public String getHome() {
		return "home";
	}
}
