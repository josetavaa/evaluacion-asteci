package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Operador;
import com.example.service.OperadorService;


@RestController
@RequestMapping("/operador")
public class OperadorController {

    @Autowired
    @Qualifier("operadorservice")
	private OperadorService operadorService;
	
	@GetMapping("/consulta")
	List<Operador> Servicio() {		
		return operadorService.listaOperadores();
	}
}
