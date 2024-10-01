
package com.maritza.pe.db;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    private static Connection con = null;
    private static String usuario = " trabajo";
    private static String contraseña = "1234560";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
    try{
        //cargar el controldador JDBC
        Class.forName("oracle.jdbc.OracleDriver");
        
        //Establecer la conexion con la base de datos
        con = DriverManager.getConnection(url,usuario,contraseña);
        con.setAutoCommit(false);
        
        System.out.println("Maritza ........");
        if(con != null ){
            System.out.println("Conexion exitosa :)");
        }else{
            System.out.println("Error conexion fallida");
        }
        
    }catch(Exception e ){
        System.out.println("Error: "+e.getMessage());
    }
    return con;
    };
    public void closeConnection(){
        try{con.close();
        }catch (Exception e ){System.out.println("error al cerrar la conexion: "+ e.getMessage());
        
        }
    }
    public static void main (String[] args){
       // Conexion con = new Conexion();
     Conexion.getConnection();
        
    }

}
