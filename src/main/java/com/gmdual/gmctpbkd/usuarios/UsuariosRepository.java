package com.gmdual.gmctpbkd.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios, Integer>{

}
