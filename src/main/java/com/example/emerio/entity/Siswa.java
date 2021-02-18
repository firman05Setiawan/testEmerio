package com.example.emerio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Siswa {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long nomorInduk;
	private String nama;
	private String kelas;
	
	public Siswa() {
		super();
	}
	
	public Siswa(long nomorInduk, String nama, String kelas) {
		super();
		this.nomorInduk = nomorInduk;
		this.nama = nama;
		this.kelas = kelas;
	}
	
	public Siswa( String nama, String kelas) {
		super();
		this.nama = nama;
		this.kelas = kelas;
	}
	
	public long getNomorInduk() {
		return nomorInduk;
	}
	public void setNomorInduk(long nomorInduk) {
		this.nomorInduk = nomorInduk;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	
	
	
}
