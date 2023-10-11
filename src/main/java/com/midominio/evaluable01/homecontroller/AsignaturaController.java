package com.midominio.evaluable01.homecontroller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.midominio.evaluable01.model.Asignatura;



@Controller
@RequestMapping("/")
public class AsignaturaController {
	
	@GetMapping ({"/vistadeasignatura"})
	public  String handelerVistadeAsignaturas (Model model) {
	   
		
		List<Asignatura> listaAsignaturas = new ArrayList<>();
		listaAsignaturas.add(new Asignatura(1,"matematicas","sobre raices cuadradas",3,1));
		listaAsignaturas.add(new Asignatura(2,"sociales","Comportamiento de la sociedad",7,8));
		listaAsignaturas.add(new Asignatura(3,"letras","Cultura sobre el lenguaje",8,5));
		listaAsignaturas.add(new Asignatura(4,"artistico","Dibujo técnico",12,7));
		
		model.addAttribute("titulo", "asignaturas");
		model.addAttribute("tituloH1", "listado de  asignaturas");
		model.addAttribute("listadodeasignatura", listaAsignaturas);
		return "vistadeasignatura";
	}
	
	
}
	


