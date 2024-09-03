
package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class ListaSimple {
    
    Nodo inicio;
    
    ListaSimple(){
        inicio=null;
    }
    
    public void insertarInicio(String name, int age, float average){
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio=nuevo;
        }else{
            nuevo.setEnlace(inicio);
            inicio=nuevo;
        }
    }
    
    public void consultar(){
        Nodo temporal=inicio;
        if(inicio==null){
            JOptionPane.showConfirmDialog(null, "La lista está vacía");
        }else{
            do{
                JOptionPane.showConfirmDialog(null,
                        "Nombre: "+temporal.getName()+"\n"+
                        "Edad: "+temporal.getAge()+"\n"+
                        "Promedio: "+temporal.getAverage());
                
                temporal.setEnlace(null);
            }while(temporal.getEnlace()!=null);
        }
    }
}
