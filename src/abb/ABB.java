/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

/**
 *
 * @author enriq
 */
public class ABB {

    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();
        arbol.insertar(5);
        arbol.insertar(2);
        arbol.insertar(6);
        arbol.insertar(1);
        System.out.print(arbol);
        arbol.imprimirArbol();
    }
    
}
