
package com.maritza.pe.cnegocio;
import com.maritza.pe.cdatosdao.TipoDocumentoDao;
import com.maritza.pe.cmodelo.TipoDocumento;
import com.maritza.pe.db.Conexion;
import  java.sql.Connection;
import java.sql.SQLException;


public class TipoDocumentoBo {
    private String  mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
    Connection c = Conexion.getConnection();
    
    try {
        mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
        c.commit();
    }catch (Exception e){
        c.rollback();
        
    }finally{ 
    c.close();
    }
    return mensaje;
    }
}

