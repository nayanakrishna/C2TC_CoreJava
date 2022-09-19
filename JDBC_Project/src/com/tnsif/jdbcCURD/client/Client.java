package com.tnsif.jdbcCURD.client;
import java.sql.SQLException;


import com.tnsif.jdbcCURD.service.Service;

public class Client {

	public static void main(String[] args) throws SQLException {
		Service service=new Service();
       // service.addStudent();
        service.getStudents();
       // service.updateStudent();
        //service.deleteStudnet();
        //service.closeSession();
	}

}
