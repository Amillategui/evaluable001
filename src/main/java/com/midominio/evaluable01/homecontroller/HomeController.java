package com.midominio.evaluable01.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/","/home"})
	public String homendlerHome(Model model){
	 
     model.addAttribute("titulo", "Asignaturas");
	 model.addAttribute("tituloH1", "Asignaturas: ciencias,letras,mixto,sociales, y artístico");
     model.addAttribute("parrafo1", "texto de presentación número 1");
	 model.addAttribute("parrafo2", "texto de presentación número 2");
	 model.addAttribute("parrafo3", "texto de presentación número 3");
		return ("home");
	}

}
