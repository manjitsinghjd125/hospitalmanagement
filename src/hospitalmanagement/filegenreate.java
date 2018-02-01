/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author manjitsingh
 */
public class filegenreate {
    public void report(String filename,List name,List Age,List Gender,List Bloodgroup,List Address,List Postal,List country,List status,List contact){
        int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save and generate File?","Warning",dialogButton);
             if(dialogResult == JOptionPane.YES_OPTION){
  try{
           int n = name.size();
            FileWriter writer= new FileWriter(filename,true);
            

                for(int i = 0;i<n;i++){

                writer.write((String)name.get(i));
                writer.write("\t\t");
                writer.write((String)Age.get(i));
                writer.write("\t\t");
                writer.write((String)Gender.get(i));
                writer.write("\t\t");
                writer.write((String)Bloodgroup.get(i));
                writer.write("\t\t");
                writer.write((String)Address.get(i));
                writer.write("\t\t");
                writer.write((String)Postal.get(i));
                writer.write("\t\t");
                writer.write((String)country.get(i));
                writer.write("\t\t");
                writer.write((String)status.get(i));
                writer.write("\t\t");
                writer.write((String)contact.get(i));
                writer.write("\r\n");
            }
   writer.close();
            JOptionPane.showMessageDialog(null, "File is generated", "Info", JOptionPane.INFORMATION_MESSAGE);
     }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    }
    public List data(String filename){
        int linelength;
        List name=new ArrayList();
        try{
        
        String code = "";
          FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                linelength = line.length();
                for(int i = 0 ;i<linelength;i++){
                    char a = line.charAt(i);
                    if(a == ','){
                        // System.out.println(code);
                        name.add(code);
                        code="";
                    }
                    else{
                        
                        
                        code += a;
                        
                        
                    }
                }
                
            }
            
            
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
       
        return name;
    }
    public void file(String namefile,List name){
        String code = null;
        try{ int linelength,linelength1;
              FileReader reader = new FileReader(namefile);
              FileWriter writer=null;
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                linelength = line.length();
                for(int i = 0 ;i<linelength;i++){
                    char a = line.charAt(i);
                     
                        code += a;
                        
                        
                }
                
            }
            
            
            reader.close();
            String newline="";
            
            for(int i = 1 ;i<name.size();i++){
                         
                        newline +=name.get(i)+",";
                        
                        
                }
                System.out.print(code);
            System.out.print(newline);
            String newContent = code.replaceAll(code, newline);
             
             
            writer = new FileWriter(namefile);
             writer.write(",");
            writer.write(newContent);
        
                 writer.close();
                 }
         catch(IOException e){
             e.printStackTrace();
         }
    }
}
