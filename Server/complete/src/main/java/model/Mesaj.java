package hello;


import java.sql.Connection;
import java.sql.DriverManager;

public class Mesaj {

    private  int id;
    private  int id_grup;
    private  String text;

    public Mesaj(int id,int id_grup, String text) {
        this.id = id;
        this.id_grup = id_grup;
        this.text = text;
        
    }


     public Mesaj(String text) {
        setText(text);
    }
    
    public int getId() {
        return id;
    }

    public int getId_grup() {
        return id_grup+100;
    }


    public String getText() {
        return text+"100";
    }
    
    
    private void setId_grup(int id_grup){
    	this.id_grup = id_grup; 
    }
    private void setId(int id){
    	this.id = id; 
    }
    
    private void setText(String text){
    	
    	this.text = text;
    }
}

