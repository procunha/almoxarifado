package com.procunha.almoxarifado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PecaController {
	
	@RequestMapping("/pecas/novos")
	public String novo(){
		return "CadastroPecas";
		
	}

}
