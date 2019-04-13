package abb;

/**
 *
 * @author Mario
 */
public class nodo {
 
    private int valor;
    private nodo padre;
    private nodo hojaIzquierda;
    private nodo hojaDerecha;
 
    public nodo(int valor) {
        this.valor = valor;
    }
 
    public void setValor(int valor) {
        System.out.println("entra a valor");
        this.valor = valor;
        System.out.println("sale de valor");
    }
 
    public int getValor() {
        return valor;
    }
 
    public nodo getPadre() {
        return padre;
    }
 
    public void setPadre(nodo padre) {
        this.padre = padre;
    }
 
    public nodo getHojaIzquierda() {
        return hojaIzquierda;
    }
 
    public void setHojaIzquierda(nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
 
    public nodo getHojaDerecha() {
        return hojaDerecha;
    }
 
    public void setHojaDerecha(nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
 
}
