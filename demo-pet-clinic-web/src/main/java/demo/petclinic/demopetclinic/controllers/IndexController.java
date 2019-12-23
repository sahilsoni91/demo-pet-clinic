package demo.petclinic.demopetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = {"", "/", "index", "index.html"})
	public String index() {
		return "index";
	}
}
