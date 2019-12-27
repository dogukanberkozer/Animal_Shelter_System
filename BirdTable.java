package oopProject;
import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import javax.swing.table.*;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BirdTable extends JFrame {

	 JFrame f; 
	    // Table 
	    JTable j;
	    

	public BirdTable(ArrayList<Animal> animals) {
		 // Frame initiallization 
        f = new JFrame(); 
  
        // Frame Title 
        f.setTitle("TABLE"); 
  
        // Data to be displayed in the JTable 
        
        String [][] ani = new String[animals.size()][8];
        
        for(int i = 0; i<ani.length;i++) {
        	if(animals.get(i).getClass().getSimpleName().equals("Bird")) {
        		ani[i][0] = animals.get(i).getName();
            	ani[i][1] = animals.get(i).getAnimalID();
            	ani[i][2] = Integer.toString(((Bird) animals.get(i)).getAge());
            	ani[i][3] = Integer.toString(((Bird) animals.get(i)).getWeight());
            	ani[i][4] = Integer.toString(((Bird) animals.get(i)).getHeight());
            	ani[i][5] = Boolean.toString(((Bird) animals.get(i)).canTalk());
            	ani[i][6] = ((Bird) animals.get(i)).getBreed();
            	ani[i][7] = ((Bird) animals.get(i)).getClass().getSimpleName();       
        	}
        	
        	else if(animals.get(i).getClass().getSimpleName().equals("Dog")) {
        		ani[i][0] = animals.get(i).getName();
            	ani[i][1] = animals.get(i).getAnimalID();
            	ani[i][2] = Integer.toString(((Dog) animals.get(i)).getAge());
            	ani[i][3] = Integer.toString(((Dog) animals.get(i)).getWeight());
            	ani[i][4] = Integer.toString(((Dog) animals.get(i)).getHeight());
            	ani[i][5] = Boolean.toString(((Dog) animals.get(i)).isHasTraining());
            	ani[i][6] = ((Dog) animals.get(i)).getBreed();
            	ani[i][7] = ((Dog) animals.get(i)).getClass().getSimpleName();       
        	}
        	
        	else if(animals.get(i).getClass().getSimpleName().equals("Cat")) {
        		ani[i][0] = animals.get(i).getName();
            	ani[i][1] = animals.get(i).getAnimalID();
            	ani[i][2] = Integer.toString(((Cat) animals.get(i)).getAge());
            	ani[i][3] = Integer.toString(((Cat) animals.get(i)).getWeight());
            	ani[i][4] = Integer.toString(((Cat) animals.get(i)).getHeight());
            	ani[i][5] = Boolean.toString(((Cat) animals.get(i)).isHasTraining());
            	ani[i][6] = ((Cat) animals.get(i)).getBreed();
            	ani[i][7] = ((Cat) animals.get(i)).getClass().getSimpleName();       
        	}
        		
        }
         
        // Column Names 
        String[] columnNames = { "Animal Name","Animal ID","Age","Weight","Height","Can Talk/Trained","Breed","Race"}; 
  
        // Initializing the JTable 
        j = new JTable(ani, columnNames); 
        j.setBounds(30, 40, 200, 300); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true 
        f.setVisible(true); 
	}
	
	

}
