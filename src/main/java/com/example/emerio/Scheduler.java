package com.example.emerio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.emerio.entity.Siswa;
import com.example.emerio.repository.SiswaRespository;

@Component
public class Scheduler {
	
	@Autowired
	private SiswaRespository siswaRepository;
	
//	@Scheduled(cron = "* */10 * * * *")
	@Scheduled(cron = "0 0 * * * *")	
	public void updateData() throws IOException {
		Path pathToFile = Paths.get("siswa.csv"); 
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { 
			String line = br.readLine(); 
			while (line != null) { 
				String[] attributes = line.split(","); 
				String nama = attributes[1]; 
				String kelas = attributes[2]; 
				siswaRepository.save( new Siswa(nama, kelas)); 
				line = br.readLine(); 
				System.out.println("Data sudah di update ");
		}
	   }catch (Exception e) {
		   e.printStackTrace();
		}
	}

}
