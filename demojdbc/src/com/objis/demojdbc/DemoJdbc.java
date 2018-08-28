package com.objis.demojdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
		//Connexion
		String url= "jdbc:mysql://localhost/formation";
		String user="root";
		String pwd ="Pierrebing59";

		//chargement du Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection) DriverManager.getConnection(url,user,pwd);
			//Creation d'un Statement à partir de notre objet connection
			Statement st = (Statement) cn.createStatement();
			//notre Requete
			String sql = "SELECT * FROM formation.clients";

			//execution de la requete
			ResultSet result = st.executeQuery(sql);
			int ncVar;
			String nomcVar;
			String villeVar;
			while(result.next()) {
				//recuperer le "nc"
				ncVar = result.getInt("nc");
				//recuperer le "nomc"
				nomcVar = result.getString("nomc");
				//recuperer "ville"
				villeVar = result.getString("ville");

				System.out.println("Numero Client: " +ncVar+ ",NomClient: " +nomcVar + ",Ville: " +villeVar);
			}
			//Notre Requete 2
			String sql2 = "SELECT np, nomp FROM formation.produits WHERE coul = 'rouge' AND pds > 2000";

			ResultSet result2 = st.executeQuery(sql2);
			int npProduits;
			String nomProduits;

			while(result2.next()) {
				npProduits = result2.getInt("np");
				nomProduits = result2.getString("nomp");

				System.out.println("Numero Produit: " +npProduits+ ", Nom du Produit: " +nomProduits);
			}
			//Notre Requete 3
			String sql3 = "SELECT representants.nomr FROM formation.representants\r\n" + 
					"INNER JOIN formation.ventes\r\n" + 
					"ON representants.nr = ventes.qt\r\n" + 
					"WHERE qt > 1";

			ResultSet result3 =st.executeQuery(sql3);
			String nomRep;

			while(result3.next()) {
				nomRep = result3.getString("nomr");
				System.out.println("Nom des representants ayant vendu au moins un produit :" + nomRep);
			}

			//Notre Requete 4
			String sql4 = "SELECT DISTINCT  clients.nomc FROM formation.clients\r\n" + 
					"INNER JOIN formation.ventes\r\n" + 
					"ON clients.nc = ventes.nc\r\n" + 
					"WHERE clients.ville = 'Lyon'\r\n" + 
					"AND qt > 180";

			ResultSet result4 = st.executeQuery(sql4);
			String nomClient;

			while(result4.next()) {
				nomClient = result4.getString("nomc");
				System.out.println("Nom des clients avec des achats supérieur à 180 unités qui réside à Lyon: " +nomClient);
			}

			//Notre Requete 5
			String sql5 = "SELECT DISTINCT representants.nomr, clients.nomc FROM (((formation.ventes\r\n" + 
					"INNER JOIN formation.produits ON ventes.np = produits.np)\r\n" + 
					"INNER JOIN formation.representants ON ventes.nr = representants.nr)\r\n" + 
					"INNER JOIN formation.clients ON ventes.nc = clients.nc)\r\n" + 
					"WHERE produits.coul = 'Rouge'\r\n" + 
					"AND ventes.qt > 100";

			ResultSet result5 = st.executeQuery(sql5);
			String nomRepre;
			String nomCli;
			while(result5.next()) {
				nomRepre = result5.getString("nomr");
				nomCli = result5.getString("nomc");
				System.out.println("Nom du representant: " +nomRepre+ " \nNom du client: " +nomCli);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}










}


