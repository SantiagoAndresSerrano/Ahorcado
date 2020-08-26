/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author santi
 */
public class SistemaPalabras {
    
    
    private LinkedList<String> palabras;
    
    public SistemaPalabras(){
        
        palabras = new LinkedList<>();
    }

    public LinkedList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(LinkedList<String> palabras) {
        this.palabras = palabras;
    }
    
    
    public String palabraAzar(){
      
        int posAleatorio = ((int)(Math.random()*this.palabras.size()));      
        return palabras.get(posAleatorio);
    }
    
    public void insertarPalabra(String palabra){
    
        
        for(String s: palabras){
            if(s.equals(palabra)){
                return;
            }
        }
        this.palabras.add(palabra);
        
    
    }
    public void eliminarPalabra(String palabra){
        int contador = 0;
        for(String p:palabras){
            
            if(p.equals(palabra)){
                System.out.println("Palabra "+p+" eliminada");
                palabras.remove(contador);
                
            }
            contador++;
        }
        
    }
    
    
}
