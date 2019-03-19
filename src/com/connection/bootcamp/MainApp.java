package com.connection.bootcamp;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
	static Connection conn;
    
//    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//    static BufferedReader input = new BufferedReader(inputStreamReader);

    public static void main(String[] args) {
        try {
        	List<Siswa> dataSiswa = new ArrayList<Siswa>();
        	
        	DBConnection objConnect = new DBConnection();
        	conn = objConnect.getConnection();

        	DBUtil util = new DBUtil(conn);
        	dataSiswa = util.getAllSiswa();
        	
        	for(Siswa siswa : dataSiswa) {
        		System.out.println(String.format("%d. %s | %s | %s", siswa.getId(), siswa.getNama(), siswa.getNoHp(), siswa.getKelas()));	
        	}
        	
//        	while (!conn.isClosed()) {
//                menu();
//            }

//            stmt.close();
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    static void menu() {
//        System.out.println("\n========= MENU UTAMA =========");
//        System.out.println("1. Insert Data");
//        System.out.println("2. Show Data");
//        System.out.println("0. Keluar");
//        System.out.println("");
//        System.out.print("PILIHAN: ");
//
//        try {
//            int pilihan = Integer.parseInt(input.readLine());
//
//            if(pilihan==0) {
//            	System.exit(0);
//            } else if(pilihan==1) {
//            	insert();
//            } else if(pilihan==2) {
//            	show();
//            } else {
//            	System.out.println("masukkan pilihan dengan benar");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    
//    static void insert() {
//    	try {
//    		System.out.println("\nMasukkan Data Siswa");
//    		System.out.print("nama: ");
//            String nama = input.readLine().trim();
//            System.out.print("no hp: ");
//            String noHp = input.readLine().trim();
//            System.out.print("kelas: ");
//            String kelas = input.readLine().trim();
//            
//            String sql = "INSERT INTO siswa (nama, no_hp, kelas) VALUE('%s', '%s', '%s')";
//            sql = String.format(sql, nama, noHp, kelas);
//            stmt.execute(sql);
//    	} catch (Exception e) {
//    		e.printStackTrace();
//    	}
//    }
    
//    static void show( ) {
//    	String sql = "SELECT * FROM siswa";
//        try {
//            rs = stmt.executeQuery(sql);
//
//            System.out.println("\nData Siswa");
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String nama = rs.getString("nama");
//                String noHp = rs.getString("no_hp");
//                String kelas = rs.getString("kelas");
//                
//                System.out.println(String.format("%d. %s | %s | %s", id, nama, noHp, kelas));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}


