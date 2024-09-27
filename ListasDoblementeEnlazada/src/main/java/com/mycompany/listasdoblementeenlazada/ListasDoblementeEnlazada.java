
package com.mycompany.listasdoblementeenlazada;

import javax.swing.JOptionPane;

public class ListasDoblementeEnlazada {

    NodoDoble inicio;

    public ListasDoblementeEnlazada() {
        inicio=null;
    }
    
    public void insertarInicio(String dato){
        
        NodoDoble nuevo=new NodoDoble();
        
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        
        if(inicio!=null){
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
        }
        inicio=nuevo;
    }
    
    public void insertarFinal(String dato){
       
        NodoDoble nuevo=new NodoDoble();
        NodoDoble temporal=inicio;
        
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        
        if(inicio!=null){
           while(temporal.getSiguiente()!=null){
               temporal=temporal.getSiguiente();
            }
           temporal.setSiguiente(nuevo);
           nuevo.setAnterior(temporal);
        }else{
            inicio=nuevo;
        }
    }
    
    public void imprimir(){
        NodoDoble temporal=inicio;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        }else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null, "Dato: "+temporal.getDato());
                temporal=temporal.getSiguiente();
            }
        }
    }
    
}
