package com.concrete.app.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.concrete.app.dto.Usuario;


@RestController
@RequestMapping(path="/concreteREST/login")
public class UsuarioController {
	
	@RequestMapping(method=RequestMethod.GET, path="/validate", consumes="application/json", produces="application/json")
	public @ResponseBody Usuario user(@RequestBody Usuario user) throws Exception {
		Usuario response = new Usuario();
		
		if(!user.getNombre().equals("")) {
			response.setNombre(user.getNombre());
		}else {
			response.setNombre("Default");
		}
		
		return response;
	}
}
