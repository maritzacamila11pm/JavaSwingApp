
package com.maritza.pe.cdatosdao;
import com.maritza.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
 import java.sql.PreparedStatement;

public class TipoDocumentoDao {
    private String mensaje;
    
    //primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB 
    public String agregarTipoDocumento (Connection conn, TipoDocumento tipoDocumento ){
    PreparedStatement ps = null;  
    String sql = "INSERT INTO TipoDocumento (id_documento_identidad,nombre,siglas,nacionalidad,estado) " + "VALUES (?,?,?,?,?)";
    try {
    ps= conn.prepareStatement(sql);
ps.setInt(1,tipoDocumento.getId_documento_identidad());    
ps.setString(2, tipoDocumento.getSiglas());
ps.setString(3, tipoDocumento.getNacionalidad());
ps.setString (4 , tipoDocumento.getNombre());
ps.setString(5, tipoDocumento.getEstado());
    ps.execute();
    ps.close();
    mensaje = "el tipo de documento fue creado correctamente ";
    } catch (Exception e ){
    mensaje = "Alto ! , error al crear tipo documento . " + e.getMessage();
      System.out.println(e.getMessage());

    }
return  mensaje;
}
}
