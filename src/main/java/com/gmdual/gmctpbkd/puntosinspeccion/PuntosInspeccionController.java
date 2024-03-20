package com.gmdual.gmctpbkd.puntosinspeccion;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/puntoinspeccion")
@RequiredArgsConstructor
public class PuntosInspeccionController {
    private final PuntosInspeccionService puntosInspeccionServ;
    @PostMapping
    public void createPuntosInspeccion(@RequestBody PuntosInspeccion puntosInspeccion){
        puntosInspeccionServ.createUsuario(puntosInspeccion);
    }
}
