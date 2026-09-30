package com.umg.vetcare.semana13vetcarepostgresql.repository;

import com.umg.vetcare.semana13vetcarepostgresql.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    
}