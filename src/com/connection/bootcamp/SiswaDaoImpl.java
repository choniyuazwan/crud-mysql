package com.connection.bootcamp;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class SiswaDaoImpl implements SiswaDao {
	static Connection conn;

	@Override
	public List<Siswa> getAllSiswa() {
		List<Siswa> listSiswa = new ArrayList<Siswa>();
    	
		try {
        	DBConnection connect = new DBConnection();
        	conn = connect.getConnection();

        	DBUtil util = new DBUtil(conn);
        	listSiswa = util.getAllSiswa();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return listSiswa;
	}

}
