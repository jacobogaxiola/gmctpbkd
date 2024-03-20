package com.gmdual.gmctpbkd.puntosinspeccion;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PuntosInspeccionService {
    private final PuntosInspeccionRepository PuntosInspeccionRepo;
    @SuppressWarnings("null")
    public void createUsuario(PuntosInspeccion puntosInspeccion) {
        PuntosInspeccionRepo.save(puntosInspeccion);
    }
}