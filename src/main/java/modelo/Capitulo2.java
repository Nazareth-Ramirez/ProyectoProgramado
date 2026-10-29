/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kaysc
 */
public class Capitulo2 extends Libro {

    private String textoLectura;
    private boolean ganoGatito;

    public Capitulo2(String titulo, String introduccion) {
        super(titulo, introduccion);
    }

    public String getTextoLectura() {
        return textoLectura;
    }

    public void setTextoLectura(String textoLectura) {
        this.textoLectura = textoLectura;
    }

    public boolean isGanoGatito() {
        return ganoGatito;
    }

    public void setGanoGatito(boolean ganoGatito) {
        this.ganoGatito = ganoGatito;
    }

    public void verificarGane(String gane) {

    }

}
