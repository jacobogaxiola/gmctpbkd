package com.gmdual.gmctpbkd.puntosinspeccion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntosInspeccionRepository extends JpaRepository <PuntosInspeccion, Integer>{

}

