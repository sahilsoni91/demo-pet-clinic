package demo.petclinic.demopetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.petclinic.demopetclinic.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping(value = {"/vets", "/vets/index", "/vets/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vetsList", vetService.findAll());
		return "vets/index";
	}
}
