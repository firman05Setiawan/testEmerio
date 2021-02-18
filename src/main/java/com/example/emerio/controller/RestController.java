package com.example.emerio.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.emerio.entity.Nilai;
import com.example.emerio.entity.Siswa;
import com.example.emerio.repository.NilaiRepository;
import com.example.emerio.repository.SiswaRespository;
import com.example.emerio.service.SiswaService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1")
public class RestController {
	
	@Autowired
	private NilaiRepository nilaiRepository;
	
	@Autowired
	private SiswaService siswaService;
	
	@GetMapping("/siswa")
	public ResponseEntity<List<Siswa>> getEmployeeById() throws ConfigDataResourceNotFoundException {
		List<Siswa> siswa = siswaService.getAllSiswa();
		return ResponseEntity.ok().body(siswa);
	}
	
	
	@PutMapping("/update-nilai/{nomorInduk}/{nilai}")
    public ResponseEntity < Nilai > updateNilai(@PathVariable(value = "nomorInduk") Long nomorInduk,
    		@PathVariable(value = "nilai") int newNilai) throws ConfigDataResourceNotFoundException {
		Nilai nilai =  nilaiRepository.findById(nomorInduk).orElse(new Nilai());
		nilai.setNilai(newNilai);
        final Nilai updateNilai = nilaiRepository.save(nilai);
        return ResponseEntity.ok(updateNilai);
    }
	
	 @DeleteMapping("/delete/{id}")
	 public Map< String, Boolean > deleteMataPelajaran(@PathVariable(value = "id") Long nomorInduk)
	    throws Exception {
		 Nilai Nilai = nilaiRepository.findById(nomorInduk).orElse(new Nilai());
		 nilaiRepository.delete(Nilai);
	     Map < String, Boolean > response = new HashMap< > ();
	     response.put("deleted", Boolean.TRUE);
	     return response;
	    }

	
	
}
