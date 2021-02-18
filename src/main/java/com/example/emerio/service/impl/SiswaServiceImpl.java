package com.example.emerio.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emerio.entity.Siswa;
import com.example.emerio.repository.SiswaRespository;
import com.example.emerio.service.SiswaService;

@Service
@Transactional
public class SiswaServiceImpl implements SiswaService{
	@Autowired
	private SiswaRespository siswaRepository;
	

	@Override
	public List<Siswa> getAllSiswa() {
//		Path pathToFile = Paths.get("siswa.csv"); 
//		List<Siswa> listSiswa = new ArrayList<Siswa>();
		// create an instance of BufferedReader 
		// using try with resource, Java 7 feature to close resources 
//		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { 
//			String line = br.readLine(); 
//			while (line != null) { 
//				String[] attributes = line.split(","); 
//				String nama = attributes[1]; 
//				String kelas = attributes[2]; 
//				siswaRepository.save( new Siswa(nama, kelas)); 
//				line = br.readLine(); 
//			} 
			return siswaRepository.findAll();
//		} catch (IOException ioe) { 
//			ioe.printStackTrace(); 
//		} 
//		return null;
	}
	
}
