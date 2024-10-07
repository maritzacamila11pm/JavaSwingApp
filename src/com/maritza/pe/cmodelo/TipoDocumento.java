
package com.maritza.pe.cmodelo;

import java.util.Date;

public class TipoDocumento {
    private int id_documento_identidad ;
    private String nombre;
    private String siglas;
    private String nacionalidad;
    private String estado;

        public int getId_documento_identidad() {
            return id_documento_identidad;
        }

        public void setId_documento_identidad(int id_documento_identidad) {
            this.id_documento_identidad = id_documento_identidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getSiglas() {
            return siglas;
        }

        public void setSiglas(String siglas) {
            this.siglas = siglas;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
   
}
