package com.connection.bootcamp;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
	static Connection conn;

	private static SiswaDao siswaDao = new SiswaDaoImpl();
    public static void main(String[] args) {
    	printAllSiswa(siswaDao.getAllSiswa());
    }
    
    private static void printAllSiswa(List<Siswa> listSiswa) {        	
    	for(Siswa siswa : listSiswa) {
    		System.out.println(String.format("%d. %s | %s | %s", siswa.getId(), siswa.getNama(), siswa.getNoHp(), siswa.getKelas()));	
    	}
    }
}


