package com.objis.demojdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Atelier {
	//Création d'une méthode pour ouvrir la connection (mauvaise)
/*	public static void openConnection() {
		Connection cn = null;
		Statement st = null;

		String url = "jdbc:mysql://localhost/gestionSpectacle";
		String user = "root";
		String pwd = "rootpwd";

		
			//récupération du driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Driver ok !");
			//recupération de la connection
			try {
				cn =(Connection) DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	} */

	//Création de la bonne méthode
	public static Connection openConnectionGood(Statement st) {
		Connection cn = null;
		String url = "jdbc:mysql://localhost/gestionspectacles";
		String user = "root";
		String pwd = "Pierrebing59";

		try {
			//récupération du driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver ok !");
			//recupération de la connection
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
	//Création de la méthode requete(mauvaise)
/*	 public static void selectAll() {

		Statement st = null;

		try {
			//Création d'un statement
			st = (Statement) cn.createStatement();
			//Création de la requete
			String sql = "SELECT * FROM gestionSpectacles.spectacle";

			//Exécution de la requete
			ResultSet result = (ResultSet) st.executeQuery(sql);

			//recuperer les infos pour azfficher le nom de chaque artiste

			String artiste;

			//recupération de tous les infos
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

	//Création de la méthode requete (bonne)
	public static Statement selectAllGood(Connection cn) {
		
		Statement st = null;

		try {
			//Création d'un statement
			st = (Statement) cn.createStatement();
			//Création de la requete
			String sql = "SELECT * FROM gestionSpectacles.spectacle";

			//Exécution de la requete
			ResultSet result = (ResultSet) st.executeQuery(sql);

			//recuperer les infos pour azfficher le nom de chaque artiste

			String artiste;

			//recupération de toutes les infos
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
