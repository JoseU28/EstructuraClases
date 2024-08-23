package com.mycompany.restaurant;

import javax.swing.JOptionPane;

public class Menu {

    String platos [];
    int datos[][];
    String semana[]=new String[]{"lunes","martes","miercoles","jueves","viernes","sábado"};
    
    public void crearMenu(int cantidad){
        
        platos=new String[cantidad];
        int i=0;
        while(i<cantidad){
            platos[i]=JOptionPane.showInputDialog("Escriba el nombre del plato "+(i+1));
            i++;
        }
    }
    
    public void consultarMenu(){
        String text="Platos:";
        
        for(int i=0;i<platos.length;i++){
            if((i+1)==platos.length){
                text+=" "+platos[i];
            }else{
                text+=" "+platos[i]+",";
            }
        }
        JOptionPane.showMessageDialog(null, text);

    }
    
    public void ingresarDatos(){
        
        datos=new int[6][platos.length];
        
        for(int f=0;f<datos.length;f++){
            for(int c=0;c<platos.length;c++){
                datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog( "Ventas para el día "+semana[f]+"\n"+" Plato: "+platos[c]));
            }
        }
    }
}
