package com.gmdual.gmctpbkd.usuarios;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuariosService {
    private final UsuariosRepository UsuariosRepo;
    @SuppressWarnings("null")
    public void createUsuario(Usuarios usuario) {
        UsuariosRepo.save(usuario);
    }
}
