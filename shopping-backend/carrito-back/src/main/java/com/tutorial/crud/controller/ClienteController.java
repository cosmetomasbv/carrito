package com.tutorial.crud.controller;

import com.tutorial.crud.dto.Mensaje;
import com.tutorial.crud.dto.ProductoDto;
import com.tutorial.crud.entity.Cliente;
import com.tutorial.crud.entity.Producto;
import com.tutorial.crud.service.ClienteService;
import com.tutorial.crud.service.ProductoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
	
    @Autowired
    ClienteService clienteService;

    @GetMapping("/lista")
    public ResponseEntity<List<Cliente>> list(){
        List<Cliente> list = clienteService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
