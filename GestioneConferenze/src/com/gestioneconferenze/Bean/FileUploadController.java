package com.gestioneconferenze.Bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
  





import org.apache.commons.io.FilenameUtils;
import org.primefaces.event.FileUploadEvent;  
import org.primefaces.model.UploadedFile;  
  
public class FileUploadController {  
  
    public void handleFileUpload(FileUploadEvent event) {  
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
    

    public void copyFile(String fileName, InputStream in) 
    {
    	String destination="C:\\reporttmp\\";   
    	try {
             
             
                // write the inputStream to a FileOutputStream
        	   
    			//String nome_assoluto = new File(fileName).getAbsolutePath();
    			String nome_assoluto = new File(fileName).getName();
    			
    			String nome_in_uscita="";
    			UUID uuid = UUID.randomUUID();
    		    nome_in_uscita = uuid.toString();
                OutputStream out = new FileOutputStream(new File(destination + nome_in_uscita + ".docx"));
             
                int read = 0;
                byte[] bytes = new byte[1024];
             
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
             
                in.close();
                out.flush();
                out.close();
             
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }
}  