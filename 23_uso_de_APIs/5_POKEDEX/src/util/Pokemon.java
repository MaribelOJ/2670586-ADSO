
package util;

import java.awt.Image;

public class Pokemon {
    String nombre;
    Image [] imagenes;
    String [] habilidades;
    String [] url_habilidad;

    public Pokemon(String nombre, Image[] imagenes, String[] habilidades, String[] url_habilidad) {
        this.nombre = nombre;
        this.imagenes = imagenes;
        this.habilidades = habilidades;
        this.url_habilidad = url_habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Image[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(Image[] imagenes) {
        this.imagenes = imagenes;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public String[] getUrl_habilidad() {
        return url_habilidad;
    }

    public void setUrl_habilidad(String[] url_habilidad) {
        this.url_habilidad = url_habilidad;
    }

   
    
}
