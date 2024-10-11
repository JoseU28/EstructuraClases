/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-10
 */
public class ListasDobles {

    Person inicio;
    
    public void ListasDobles(){
        inicio=null;
    }
    
    public void insertarFinal(int edad, String name){
        Person nuevo= new Person();
        Person temporal = inicio;
        nuevo.setEdad(edad);
        nuevo.setName(name);
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        
        nuevo.setAnterior(inicio.getAnterior());
        nuevo.setSiguiente(inicio);
        inicio.setAnterior(nuevo);
//        inicio.setSiguiente();  ARREGLAR :)
        if(inicio!=null){
//           while(temporal.getSiguiente()!=null){
//               temporal=temporal.getSiguiente();
//            }
//           temporal.setSiguiente(nuevo);
//           nuevo.setAnterior(temporal);
           
        }else{
            inicio=nuevo;
            inicio.setAnterior(inicio);
            inicio.setSiguiente(inicio);
        }
    }
    
    public void imprimir(){
        Person temporal=inicio;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        }else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getName()+"\n"+"Edad: "+temporal.getEdad());
                temporal=temporal.getSiguiente();
            }
        }
    }
    
    public void borrarMenores(){
        Person temporal=inicio;
        while(temporal!=null){
            if(temporal.getEdad()<18){
                if(temporal.getAnterior()!=null){
                    temporal.getAnterior().setSiguiente(temporal.getSiguiente());
                }
                if(temporal.getSiguiente()!=null){
                    temporal.getSiguiente().setAnterior(temporal.getAnterior());
                }
                if(temporal.getAnterior()==null){
                    inicio=temporal.getSiguiente();
                }
                if(temporal.getAnterior()==null && temporal.getSiguiente()==null){
                    inicio=null;
                }
            }
            temporal=temporal.getSiguiente();
        }
    }
    
    public void buscarMayores(){
        Person temporal=inicio;
        int c=0;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        }else{
            while(temporal!=null){
                c++;
                if(temporal.getEdad()>18){
                    JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getName()+"\n"+"Edad: "+temporal.getEdad()+"\n"+"En la posición: "+c);
                }
                temporal=temporal.getSiguiente();
            }
        }
    }
    
    public void buscarPosición(){
        int a=1;
        Person temporal=inicio;
        while(temporal.getSiguiente()!=null){
            temporal=temporal.getSiguiente();
            a++;
        }
        int busc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición (Hay "+a+" posiciones)"));
        int c=1;
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        }else{
            if(busc<=a && busc>0){
                while(temporal!=null){
                    if(c==busc){
                        if(temporal.getAnterior()==null && temporal.getSiguiente()==null){
                            JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getName()+"\n"+"Edad: "+temporal.getEdad()+"\n"+"En la posición: "+c+"\n"
                                                        +"No hay nadie adelante ni atrás");
                        }else if(temporal.getAnterior()==null){
                            JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getName()+"\n"+"Edad: "+temporal.getEdad()+"\n"+"En la posición: "+c+"\n"
                                                        +"Atrás: "+"No hay nadie atrás"+"\n"+"Adelante: "+temporal.getSiguiente().getName());
                        }else if(temporal.getSiguiente()==null){
                            JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getName()+"\n"+"Edad: "+temporal.getEdad()+"\n"+"En la posición: "+c+"\n"
                                                        +"Atrás: "+temporal.getAnterior().getName()+"\n"+"Adelante: "+"No hay nadie atrás");
                        }else{
                            JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getName()+"\n"+"Edad: "+temporal.getEdad()+"\n"+"En la posición: "+c+"\n"
                                                        +"Atrás: "+temporal.getAnterior().getName()+"\n"+"Adelante: "+temporal.getSiguiente().getName());
                        }
                    }
                    c++;
                    temporal=temporal.getSiguiente();
                }
            }else{
                JOptionPane.showMessageDialog(null, "No existe dicha posición");
            }
        }
    }
}
