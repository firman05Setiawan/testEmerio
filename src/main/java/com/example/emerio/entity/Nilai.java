package com.example.emerio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nilai {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long nomorInduk;
	private String mataPelajaran;
	private int nilai;
	public Nilai() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Nilai(long nomorInduk, String mataPelajaran, int nilai) {
		super();
		this.nomorInduk = nomorInduk;
		this.mataPelajaran = mataPelajaran;
		this.nilai = nilai;
	}

	public long getNomorInduk() {
		return nomorInduk;
	}

	public void setNomorInduk(long nomorInduk) {
		this.nomorInduk = nomorInduk;
	}

	public String getMataPelajaran() {
		return mataPelajaran;
	}

	public void setMataPelajaran(String mataPelajaran) {
		this.mataPelajaran = mataPelajaran;
	}

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
	
	
	
	
	
}
