package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba", "postgres", "postgres");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement(
					"insert into transacciones (codigo, numero_cuenta, monto, tipo, fecha, hora)" + "values(?,?,?,?,?,?)");
			ps.setInt(1, 53147);
			ps.setString(2, "32102");
			ps.setBigDecimal(3, new BigDecimal(500.65));
			ps.setString(4, "D");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha= sdf.parse(fechaStr);
				System.out.println(fecha);
				//extrayendo la fehca en milis
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				// Crear un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL =new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				//Tranformando al tiempo SQL
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
				ps.executeUpdate();
				System.out.println("ejecute inset");
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
			ps = connection.prepareStatement("insert into videojuegos(codigo, nombre, descripcion, valoracion)\r\n"
					+ "values(?,?,?,?)");
			ps.setInt(1, 63550);
			ps.setString(2, "Doraemon");
			ps.setString(3, "juego de aventura");
			ps.setInt(4, 8);
			
			ps.executeUpdate();
			System.out.println("ejecute insets");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
