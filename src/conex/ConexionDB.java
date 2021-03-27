/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Kathya Ortiz
 */
public class ConexionDB {
    
    
   public static Connection getConection(){
       Connection con=null;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/persona","root","root");
           System.out.println("Conexion exitosa");
           
           
       }catch(Exception e){
           System.out.println("Error al conectar"+e);
       }
       return null;
       
   
       
   } 

   
   
    
}
