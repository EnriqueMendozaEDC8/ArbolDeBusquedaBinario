package abb;
/**
 *
 * @author Mario
 */
public class Arbol {
    nodo raiz;

    public void ABB(){
    }
 
    public boolean esVacio(){
        return (raiz == null);
    }
 
    public void insertar(int valor)
    {
        insertar(raiz, valor);
    }
    
    //Importante, este metodo es privado!
    private void insertar(nodo n, int valor){
        if (esVacio()) {
            nodo nuevoNodo = new nodo(valor);
            n = nuevoNodo;
        }
        else {
            if (valor > n.getValor()) {  
                if(n.getHojaIzquierda()!=null){
                    nodo hojaIzquierda = new nodo(valor);
                    n.setHojaIzquierda(hojaIzquierda);
                }else{
                    insertar(n.getHojaIzquierda(),valor);
                }
                
            }else{
                if (valor < n.getValor()){
                    if(n.getHojaIzquierda()!=null){
                        nodo hojaDerecha = new nodo(valor);
                        n.setHojaDerecha(hojaDerecha);
                    }else{
                        insertar(n.getHojaDerecha(),valor);
                    }
                }
            }
            
        }
    }
 
    public void imprimirArbol(){
        try {
            imprimirArbol(raiz);
        } catch (Exception e) {
            System.out.println("El arbol esta vacio!");
        }
    }
 
    private void imprimirArbol(nodo n)
    {
        //Implementar cualquier orden de impresion (inorden, preorden, posorden).
        System.out.println(n.getValor());
        if(n.getHojaIzquierda()!= null){
            imprimirArbol(n.getHojaIzquierda());
        }
        if(n.getHojaDerecha()!= null){
            imprimirArbol(n.getHojaDerecha());
        }
        
    }
  
}