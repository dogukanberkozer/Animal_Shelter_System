package oopProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class AdopterTable extends JFrame {
	 JFrame f; 
	    // Table 
	    JTable j;
	    
public AdopterTable (ArrayList<Adopter> adopters) {

	 // Frame initiallization 
 f = new JFrame(); 

 // Frame Title 
 f.setTitle("TABLE"); 

 // Data to be displayed in the JTable 
 
 String [][] adop = new String[adopters.size()][8];
 
 for(int i = 0; i<adop.length;i++) {
 	adop[i][0] = adopters.get(i).getName();
 	adop[i][1] = adopters.get(i).getBirthday().toString();
 	adop[i][2] = Integer.toString(( adopters.get(i).getIdNumber()));
 	adop[i][3] = adopters.get(i).getAddress().toString();
 	adop[i][4] = adopters.get(i).getPhone().toString();
 	adop[i][5] = adopters.get(i).getAdopterID();
 	adop[i][6] = adopters.get(i).getAdopterPassword();   
 	adop[i][7] = adopters.get(i).getAdoptedName();
 }
  
 // Column Names 
 String[] columnNames = { "Adopterr Name","Birth Date","IDNUMBER","Address","Phone","Adopter ID","Adopter Password", "Adopted Pets"}; 

 // Initializing the JTable 
 j = new JTable(adop, columnNames); 
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
