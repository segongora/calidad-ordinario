package com.mayab.calidad.mockito;

import java.util.ArrayList;
import java.sql.*;
import java.sql.PreparedStatement;

public class ClassAlumnoMap implements AlumnoDAO{
	@Override
	public String addAlumno(Alumno alumno) {
		// TODO Auto-generated method stub	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/calidad"
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qazwsxedc");
			String query = "Insert Into Alumnia(id, firstName, lastName, age, average) values (?, ?, ?, ?, ?);";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt (1, alumno.getID());
			preparedStatement.setString(2, alumno.getName());
			preparedStatement.setString(3, alumno.getLastName());
			preparedStatement.setInt(4, alumno.getAge());
			preparedStatement.setDouble(5, alumno.getAvg());
			
			preparedStatement.execute();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Se agrego alumno";
	}

	@Override
	public String removeAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/calidad"
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qazwsxedc");
			String query = "Delete from Alumnia where id = ?;";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt (1, alumno.getID());
		
			preparedStatement.execute();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Se elimino alumno";
	}

	@Override
	public String updatePromedio(Alumno alumno) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/calidad"
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qazwsxedc");
			String query = "Update Alumnia Set average = ? where id = ?;";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setDouble(1, alumno.getAvg());
			preparedStatement.setInt (2, alumno.getID());
			preparedStatement.execute();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Se actualizo promedio";
	}

	@Override
	public boolean getAll() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/calidad"
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qazwsxedc");
			String query = "Select * from Alumnia";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.execute();
			conn.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return true;
		
	}

}
