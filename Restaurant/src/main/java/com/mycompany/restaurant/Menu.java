package com.mycompany.restaurant;

import javax.swing.JOptionPane;

public class Menu {
    Plato plato1 = new Plato();
    Plato plato2 = new Plato();
    Plato plato3 = new Plato();
    
    Plato platosArray []={plato1,plato2,plato3};
    String platos [];
    int datos[][];
    String semana[]=new String[]{"lunes","martes","miercoles","jueves","viernes","sábado"};
    int c=0;
    int m=1000;
    
    public void crearMenu(){
        int i=0;
        while(i<3){
            platosArray[i].setName(JOptionPane.showInputDialog("Escriba el nombre del plato "+(i+1)));
            platosArray[i].setIngredients(JOptionPane.showInputDialog("Escriba los ingredientes del plato "+(i+1)));
            platosArray[i].setPrice(Double.parseDouble(JOptionPane.showInputDialog("Escriba los ingredientes del plato "+(i+1))));
//            platos[i]=JOptionPane.showInputDialog("Escriba el nombre del plato "+(i+1));
            i++;
        }
    }
    
    public void consultarMenu(){
        String text="Estos son los platos existentes:"+"\n";
        for(int i=0;i<platosArray.length;i++){
            text+=platosArray[i].getName()+": "+platosArray[i].getIngredients()+". $"+platosArray[i].getPrice()+"\n";
//            if((i+1)==platosArray.length){
//                text+=" "+platosArray[i].getName();
//            }else{
//                text+=" "+platosArray[i].getName()+",";
//            }
        }
        JOptionPane.showMessageDialog(null, text);
    }
    
    public void ingresarDatos(){
        
        datos=new int[6][platosArray.length];
        
        for(int f=0;f<datos.length;f++){
            for(int c=0;c<platosArray.length;c++){
                datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog( "Ventas para el día "+semana[f]+"\n"+" Plato: "+platosArray[c].getName()));
            }
        }
    }
    
    public String analizarDatos(){
        String text1 = "Esta semana se vendieron: ";
        for(int i=0;i<platosArray.length;i++){
            for(int a=0;a<datos.length;a++){
                c+=datos[a][i];
            }
            if((i+1)==platosArray.length){
                text1 += c +" "+ platosArray[i].getName()+ ".";
            }else{
                text1 += c +" "+ platosArray[i].getName()+ ", ";
            }
            c=0;
        }
        String text2="Los días que más se vendieron fueron: ";
        String text3="Los días que menos se vendieron fueron: ";
        for(int i=0;i<platosArray.length;i++){
            int ma=0,me=0;
            for(int a=0;a<datos.length;a++){
                if(datos[a][i]>c){
                    c=datos[a][i];
                    ma=a;
                }
                if(datos[a][i]<m){
                    m=datos[a][i];
                    me=a;
                }
            }
            c=0;
            m=1000;
            if((i+1)==platosArray.length){
                text2 += platosArray[i].getName()+ " el " + semana[ma] + ".";
                text3 += platosArray[i].getName()+ " el " + semana[me] + ".";

            }else{
                text2 += platosArray[i].getName()+ " el " + semana[ma] + ", ";
                text3 += platosArray[i].getName()+ " el " + semana[me] + ", ";
                
            }
        }
        String text4="";
        int sum=0,ma=0,me=0;
        for(int a=0;a<datos.length;a++){
            for(int i=0;i<platosArray.length;i++){
                sum+=datos[a][i];
            }
            if(sum>c){
                c=sum;
                ma=a;
            }else if(sum<m){
                m=sum;
                me=a;
            }
            sum=0;
        }
        text4+="El día que más se vendió fue el "+semana[ma]+" y el día que menos se vendió fue el "+semana[me];
        c=0;
        m=1000;
        String text= text1+"\n"+"\n"+text2+"\n"+text3+"\n"+"\n"+text4;

        return text;
    }
}
