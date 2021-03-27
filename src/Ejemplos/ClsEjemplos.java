/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import Persona.ClsPersona;
import conex.ConexionDB;
import static conex.ConexionDB.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kathya Ortiz
 */
public class ClsEjemplos {
   
  
    
     public void Sorteo (){
        List<ClsPersona>listan=new ArrayList<>();
        String sql = "SELECT nombres * FROM tb_persona";
        try{
       Connection con;
       con=getConection();
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(sql);

      
       while(rs.next()){
           ClsPersona persona=new ClsPersona();
           persona.setNombre(rs.getString("nombres"));
           listan.add(persona);
           Collections.shuffle(listan);
           
           
           
       }
       rs.close();
       st.close();
       
       //mostrar los 10 ganadorse del sorteo
       for(int j=0;j<10;j++){
//           ClsPersona per=listan.get(j);
//           System.out.println(per.getNombre());
                   System.out.println(listan.get(j));
               }

        }catch(Exception e){
            System.out.println("Error al listar");
            
        }
        
        
       
        
    }
    
    public void ejemplo1(){
        String[]array={"Zacarias","Maria","Abel","Betty","Fabrizio"};
        List<String>milista=Arrays.asList(array);
        imprimirTodo(milista);
      
       // System.out.println("Lista antes orden= "+milista);
        Collections.sort(milista);
        System.out.println("Lista ordenada="+milista);
        int donde=Collections.binarySearch(milista,"Abel");
        System.out.println("Abel se encuentra en el idx= "+donde);
        Collections.shuffle(milista);
        //System.out.println("Revuelto= "+milista);
        imprimirTodo(milista);
        
        
        
    }
    
     public void SorteoPersonas(){
        String[]nombres={"Zacarias","Maria","Abel","Betty","Fabrizio","Lorena","Sander","Antonio","James","Lucas",
                         "Angel","Maria","Dulce","Estefany","Andres","Lucia","Camila","Mariana","Jonathan","Mario",
                         "Clark","Damon","Mauricio","Daniel","Teresa","Ester","Amparo","Violeta","Rafael","Dylan",
                         "Emilio","Albert","Fatima","Alice","Beatriz","Dulce","Katie","Stefan","Mark","Gema",
                         "Nestor","Paulina","Cristina","Samanta","Caroline","Lionel","Chloe","Gerard","Rayan","Edward"};
        List<String>listaPersonas=Arrays.asList(nombres);
        Collections.shuffle(listaPersonas);//mezclar los nombres para el sorteo
         System.out.println("GANADORES DEL SORTEO: ");
        for(int i=0;i<10;i++){         
            System.out.println(listaPersonas.get(i)+" ");
        }
        
        
        
        
        
    }
    public void imprimirTodo(Collection coll){
        Iterator iter=coll.iterator();
        while(iter.hasNext()){
            System.out.println("elemento= "+iter.next());
            
        }
    }
    
    public void pruebaArreglo(){
        ArrayList<String>lista= new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        
        String[]a=new String[20];
        lista.toArray(a);
        String[]b=lista.toArray(new String[10]);
        
    }
    
 
    
    
  
        
     
        
        
       
    
    
}//end class
