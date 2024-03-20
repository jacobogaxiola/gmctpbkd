package com.gmdual.gmctpbkd.usuarios;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuariosController {
    private final UsuariosService usuariosServ;
    @PostMapping
    public void createUsuario(@RequestBody Usuarios usuario){
        usuariosServ.createUsuario(usuario);
    }
}
