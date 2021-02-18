package com.example.emerio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emerio.entity.Nilai;

@Repository
public interface NilaiRepository extends JpaRepository<Nilai, Long>{

}
