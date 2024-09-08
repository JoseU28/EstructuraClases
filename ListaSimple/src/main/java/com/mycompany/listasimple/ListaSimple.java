
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
            inicio=nuevo; 
            if(nuevo.getName()==null){
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            }
        }else{
            nuevo.setEnlace(inicio);
            inicio=nuevo;
        }
    }
    
    public void insertarFinal(String name, int age, float average){
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            inicio=nuevo; 
            if(nuevo.getName()==null){
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            }
        }else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal=temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
    }
    public void insertarAzar(String name, int age, float average){
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);
        nuevo.setAverage(average);
        nuevo.setEnlace(null);
        int a=1;
        int b=1;
        int c=1;
        if(inicio==null){
            inicio=nuevo; 
            if(nuevo.getName()==null){
                JOptionPane.showMessageDialog(null, "La lista está vacía");
            }
        }else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal=temporal.getEnlace();
                c++;
            }
            a = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición quiere colocarlo? Hay "+c+" posiciones"));
            if(a>c || a<1){
                JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
            }else{
                temporal = inicio;
                while(b<(a-1)){
                    temporal=temporal.getEnlace();
                    b++;
                }
                Nodo temporal2;
                if(temporal.getEnlace()!=null){
                    temporal2=temporal.getEnlace();
                    temporal.setEnlace(nuevo);
                    temporal=temporal.getEnlace();
                    temporal.setEnlace(temporal2);
                }else{
                    temporal.setEnlace(nuevo);
                }
            }
        }
    }
    
    public void consultar(){
        Nodo temporal=inicio;
        if(inicio==null){
            JOptionPane.showConfirmDialog(null, "La lista está vacía");
        }else{
            do{
                JOptionPane.showMessageDialog(null,
                        "Nombre: "+temporal.getName()+"\n"+
                        "Edad: "+temporal.getAge()+"\n"+
                        "Promedio: "+temporal.getAverage());
                
                temporal=temporal.getEnlace();
            }while(temporal!=null);
        }
    }
}
