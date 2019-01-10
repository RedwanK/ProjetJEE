/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.DAO;

import java.sql.CallableStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import database.Ipackage.IUtilisateurDAO;
import metier.Utilisateur;

/**
 *
 * @author Mohamed
 */
public class OracleUtilisateurDAO implements IUtilisateurDAO{
    private static DataSource ds; 
    private static Connection connexionBD;
    
    @Override
    public void setDataSource(DataSource ds){
        OracleUtilisateurDAO.ds = ds; 
    }
    
    @Override
    public void setConnection (Connection c) {
        OracleUtilisateurDAO.connexionBD = c;
    }
   
    
    @Override 
    public List<Utilisateur> getUsers() {
        ResultSet rset = null; 
        Statement stmt = null;
        List<Utilisateur> listeUser = null; 
        try {
              stmt= connexionBD.createStatement();
              listeUser = new ArrayList<>();
              rset = stmt.executeQuery("SELECT * from UTILISATEUR");
              while(rset.next()){
                Utilisateur newM = new Utilisateur(rset.getString("user"), rset.getString("password"),rset.getString("type"),rset.getInt("numUser"));
                listeUser.add(newM);
            }
            }catch(SQLException ex){
             Logger.getLogger(OracleUtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        
        return listeUser ;
        
        
        
    }
}
