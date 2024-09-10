
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
        int d=0;
        boolean e=true;
        String word="";
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
            d = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar por nombre"+"\n"+"2. Agregar por posición"));
            if(d==2){
                a = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición quiere colocarlo? Hay "+c+" posiciones"));
                if(a>c || a<1){
                    JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
                }else{
                    temporal = inicio;
                    while(b<(a-1)){
                        temporal=temporal.getEnlace();
                        b++;
                    }
                    if(a==1){
                        if(temporal!=null){
                            inicio=nuevo;
                            inicio.setEnlace(temporal);
                        }else{
                            inicio=nuevo;
                        } 
                    }else{
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
            }else if(d==1){
                word=JOptionPane.showInputDialog("Escriba el nombre delante del cuál colocará el registro");
                if(word!=null){
                    temporal = inicio;
                    while(b<=(c)){
                        if(b==1){
                            if(temporal.getName().toUpperCase().equals(word.toUpperCase())){
                                a=b;
                                b=c+2;
                                e=false;
                            }
                        }else{
                            temporal=temporal.getEnlace();
                            if(temporal.getName().toUpperCase().equals(word.toUpperCase())){
                                a=b;
                                b=c+2;
                                e=false;
                            }
                        }
                        b++;
                    }
                    if(e){
                        JOptionPane.showMessageDialog(null, "Ese nombre no está registrado");
                    }else{
                        b=1;
                        temporal = inicio;
                        while(b<(a-1)){
                            temporal=temporal.getEnlace();
                            b++;
                        }
                        if(a==1){
                            if(temporal!=null){
                                inicio=nuevo;
                                inicio.setEnlace(temporal);
                            }else{
                                inicio=nuevo;
                            } 
                        }else{
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
                }else{
                    JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Esa no es una posición valida");
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
