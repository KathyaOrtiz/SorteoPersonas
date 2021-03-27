/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaPuntos;

/**
 *
 * @author Kathya Ortiz
 */
public class Nodo {
    int dato;
    Nodo  enlace;
    
    public Nodo(int x){
        dato=x;
        enlace=null;
    }
    public Nodo(int x,Nodo n){
        dato=x;
        enlace=n;
    }
    
    public int getDato(){
        return dato;
    }
    public Nodo getEnlcace(){
        return enlace;
        
    }
    public void setEnlace(Nodo enlace){
        this.enlace=enlace;
    }
    
}
