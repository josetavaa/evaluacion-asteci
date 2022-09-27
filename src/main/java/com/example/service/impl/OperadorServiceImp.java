package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Operador;
import com.example.repository.OperadorRepository;
import com.example.service.OperadorService;

@Service("operadorservice")
public class OperadorServiceImp implements OperadorService{

	@Autowired
	@Qualifier("operadorepository")
	OperadorRepository operadorRepository;
	
	@Override
	public List<Operador> listaOperadores() {
		return operadorRepository.findAll();
	
	}

}
