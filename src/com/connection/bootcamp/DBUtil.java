package com.connection.bootcamp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
	static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public DBUtil(Connection connection) {
    	conn = connection;
    }
    
    public List<Siswa> getAllSiswa() throws Exception {
    	List<Siswa> listSiswa = new ArrayList<Siswa>();
    	try {
        	stmt = conn.createStatement();
        	String sql = "SELECT * FROM siswa";
    		rs = stmt.executeQuery(sql);
    		while (rs.next()) {
    			Siswa siswa = new Siswa();
    			siswa.setId(rs.getInt("id"));
                siswa.setNama(rs.getString("nama"));
                siswa.setNoHp(rs.getString("no_hp"));
                siswa.setKelas(rs.getString("kelas"));
                listSiswa.add(siswa);
//                System.out.println(String.format("%d. %s | %s | %s", id, nama, noHp, kelas));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return listSiswa;
    }
}
