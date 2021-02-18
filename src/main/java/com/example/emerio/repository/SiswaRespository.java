package com.example.emerio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emerio.entity.Siswa;

@Repository
public interface SiswaRespository extends JpaRepository<Siswa, Long> {

}
