package com.objis.demojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Atelier {
	//Cr�ation d'une m�thode pour ouvrir la connection (mauvaise)
/*	public static void openConnection() {
		Connection cn = null;
		Statement st = null;

		String url = "jdbc:mysql://localhost/gestionSpectacle";
		String user = "root";
		String pwd = "rootpwd";

		
			//r�cup�ration du driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Driver ok !");
			//recup�ration de la connection
			try {
				cn =(Connection) DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	} */

	//Cr�ation de la bonne m�thode
	public static Connection openConnectionGood(Statement st) {
		Connection cn = null;
		String url = "jdbc:mysql://localhost/gestionspectacles";
		String user = "root";
		String pwd = "Pierrebing59";

		try {
			//r�cup�ration du driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver ok !");
			//recup�ration de la connection
			cn =(Connection) DriverManager.getConnection(url, user, pwd);
		}
		//ajout du catch pour les exceptions
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cn;
	}
	//Cr�ation de la m�thode requete(mauvaise)
/*	 public static void selectAll() {

		Statement st = null;

		try {
			//Cr�ation d'un statement
			st = (Statement) cn.createStatement();
			//Cr�ation de la requete
			String sql = "SELECT * FROM gestionSpectacles.spectacle";

			//Ex�cution de la requete
			ResultSet result = (ResultSet) st.executeQuery(sql);

			//recuperer les infos pour azfficher le nom de chaque artiste

			String artiste;

			//recup�ration de tous les infos
			while(result.next()) {
				artiste = result.getString("artiste");

				System.out.println("Artiste: " +artiste);

			}
		}
		catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} */

	//Cr�ation de la m�thode requete (bonne)
	public static Statement selectAllGood(Connection cn) {
		
		Statement st = null;

		try {
			//Cr�ation d'un statement
			st = (Statement) cn.createStatement();
			//Cr�ation de la requete
			String sql = "SELECT * FROM gestionSpectacles.spectacle";

			//Ex�cution de la requete
			ResultSet result = (ResultSet) st.executeQuery(sql);

			//recuperer les infos pour azfficher le nom de chaque artiste

			String artiste;

			//recup�ration de toutes les infos
			while(result.next()) {
				
				artiste = result.getString("artiste");
				System.out.println("Artiste : " + artiste);

			}
		}
		catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return st;
	}

	/*public static void closeConnection() {

		//Fermeture de la connection
		try {
			cn.close();
			st.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	} */
	public static void closeConnectionGood(Connection cn, Statement st) {

		//Fermeture de la connection
		try {
			cn.close();
			st.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}









	public static void main(String[] args) {
		Connection cn = null;
		Statement st = null;


		cn = openConnectionGood(st);
		st = selectAllGood(cn);
		closeConnectionGood(cn, st);

	}

}
