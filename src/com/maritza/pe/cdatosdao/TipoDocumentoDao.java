
package com.maritza.pe.cdatosdao;
import com.maritza.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
 import java.sql.PreparedStatement;

public class TipoDocumentoDao {
    private String mensaje;
    
    //primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB 
    public String agregarTipoDocumento (Connection conn, TipoDocumento tipoDocumento ){
    PreparedStatement ps = null;  
    String sql = "INSERT INTO TipoDocumento (id_documento_identidad,nombre,siglas,nacionalidad,estado,fecha) " + "VALUES (?,?,?,?,?,?)";
    try {
    ps= conn.prepareStatement(sql);
    ps.setInt(1,tipoDocumento.getId_documento_identidad());    
    ps.setString(2, tipoDocumento.getSiglas());
    ps.setString(3, tipoDocumento.getNacionalidad());
    ps.setString (4 , tipoDocumento.getNombre());
    ps.setString(5, tipoDocumento.getEstado());
    ps.setString(6, tipoDocumento.getFecha());
    ps.execute();
    ps.close();
    mensaje = "el tipo de documento fue creado correctamente ";
    } catch (Exception e ){
    mensaje = "Alto ! , error al crear tipo documento . " + e.getMessage();
      System.out.println(e.getMessage());

    }
return  mensaje;
}
    
    // metodo eliminar 
    public String eliminarTipoDocumento (Connection conn, TipoDocumento tipoDocumento ){
    PreparedStatement ps = null;  
    String sql = "DELETE FROM TipoDocumento WHERE Id_documento_identidad = ?";
    try {
    ps= conn.prepareStatement(sql);
    ps.setInt(1,tipoDocumento.getId_documento_identidad());    
    ps.execute();
    ps.close();
    mensaje = "el tipo de documento fue eliminado correctamente ";
    } catch (Exception e ){
    mensaje = "Alto ! , error al eliminar tipo documento . " + e.getMessage();
      System.out.println(e.getMessage());

    }
return  mensaje;
}
    
    //modficar
    
    
    
    public String modificartipodocumento(Connection conn, TipoDocumento tipoDocumento) {
        PreparedStatement ps = null;  
        String sql = "UPDATE TipoDocumento SET siglas = ?, nacionalidad = ?, nombre = ?, estado = ?, fecha = ? WHERE id_documento_identidad = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getSiglas());
            ps.setString(2, tipoDocumento.getNacionalidad());
            ps.setString(3, tipoDocumento.getNombre());
            ps.setString(4, tipoDocumento.getEstado());
            ps.setString(5, tipoDocumento.getFecha());
            ps.setInt(6, tipoDocumento.getId_documento_identidad());
            //ps.setInt(7,tipoDocumento.getId_documento_identidad());
            int filasActualizadas = ps.executeUpdate(); 
            ps.close();
            
            if (filasActualizadas > 0) {
                mensaje = "El tipo de documento fue modificado correctamente.";
            } else {
                mensaje = "No se encontró el tipo de documento con el ID especificado.";
            }
        } catch (Exception e) {
            mensaje = "Alto! Error al modificar tipo documento: " + e.getMessage();
            System.out.println(mensaje);
        }
        return mensaje;
    }
}

