
package com.maritza.pe.ctest;

import com.maritza.pe.cmodelo.TipoDocumento;
import com.maritza.pe.cnegocio.TipoDocumentoBo;
import java.sql.SQLException;

public class Test {
    TipoDocumentoBo tdbo = new TipoDocumentoBo();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar () throws SQLException{
        
    td.setId_documento_identidad(1);
    td.setNombre("Documento Nacional de Identidad dos ");
    td.setEstado("4");
    td.setSiglas("DNI");
    td.setNacionalidad("peruano");
    tdbo.agregarTipoDocumento(td);

    
    TipoDocumento td2 = new TipoDocumento();
    td2.setId_documento_identidad(2);
    td2.setNombre("Pasaporte");
    td2.setEstado("1");
    td2.setSiglas("PAS");
    td2.setNacionalidad("peruana");
    tdbo.agregarTipoDocumento(td2);
    
    TipoDocumento td3 = new TipoDocumento();
    td3.setId_documento_identidad(3);
    td3.setNombre("Carnet de Extrnajeria ");
    td3.setEstado("1");
    td3.setSiglas("C.E.");
    td3.setNacionalidad("Extrnajero");
    tdbo.agregarTipoDocumento(td3);
    
    
    TipoDocumento td4 = new TipoDocumento();
    td4.setId_documento_identidad(4);
    td4.setNombre("Documento en tramite");
    td4.setEstado("0");
    td4.setSiglas("E.T.");
    td4.setNacionalidad("....");
    tdbo.agregarTipoDocumento(td4);
    


    /*
    System.out.println("Tipo de documento insertado: " + td.getId_documento_identidad());
    System.out.println("Nombre insertado: " + td.getNombre());
    System.out.println("Estado insertado: " + td.getEstado());
    System.out.println("Siglas  insertadas: " + td.getSiglas());
    System.out.println("Nacionalidad insertado: " + td.getNacionalidad());
*/

    }

    public static void main(String[] args) throws SQLException {
        
        Test t = new Test();
        t.insertar(); 
    }

}
