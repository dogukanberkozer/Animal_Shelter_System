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

public class WorkerTable extends JFrame {

	JFrame f;
	// Table
	JTable j;

	public WorkerTable(ArrayList<Worker> workers) {

		// Frame initiallization
		f = new JFrame();

		// Frame Title
		f.setTitle("TABLE");

		// Data to be displayed in the JTable

		String[][] work = new String[workers.size()][7];

		for (int i = 0; i < work.length; i++) {
			work[i][0] = workers.get(i).getName();
			work[i][1] = workers.get(i).getBirthday().toString();
			work[i][2] = Integer.toString((workers.get(i).getIdNumber()));
			work[i][3] = workers.get(i).getAddress().toString();
			work[i][4] = workers.get(i).getPhone().toString();
			work[i][5] = workers.get(i).getWorkerID();
			work[i][6] = workers.get(i).getWorkerPassword();
		}

		// Column Names
		String[] columnNames = { "Worker Name", "Birth Date", "IDNUMBER", "Address", "Phone", "Worker ID",
				"Worker Password" };

		// Initializing the JTable
		j = new JTable(work, columnNames);
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
