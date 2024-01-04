package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBdd;

public class AdminPersonas {
	public static void insertar(Persona persona) {
		Connection con = null;
		try {
			// abrir la conexion
			con = ConexionBdd.conectar();
			ps = connection
					.prepareStatement("insert into transacciones (codigo, numero_cuenta, monto, tipo, fecha, hora)"
							+ "values(?,?,?,?,?,?)");
			ps.setInt(1, 53147);
			ps.setString(2, "32102");
			ps.setBigDecimal(3, new BigDecimal(500.65));
			ps.setString(4, "D");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				// extrayendo la fehca en milis
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				// Crear un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				// Tranformando al tiempo SQL
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);

				ps.executeUpdate();
				System.out.println("ejecute inset");

			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			// Mostrar el error al usuario
			System.out.println(e.getMessage());
			// loggear el error
			e.printStackTrace();
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}

	}
}
