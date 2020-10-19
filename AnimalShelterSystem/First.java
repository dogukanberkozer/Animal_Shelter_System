package oopProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class First extends JFrame {

	private JFrame first;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	private JButton btnLogIn;
	private JTextField txtAdopterIdTo;
	private JTextField txtWorkerPassword;
	private JTextField txtWorkerId;
	private JTextField txtAdopterPassword;
	private JLabel lblAdopterId;
	private JLabel lblAdopterPas;
	private JLabel lblWorkerId;
	private JLabel lblWorkerPas;

	static Management mn;

	public static void main(String[] args) throws Exception {
		mn = new Management();

		mn.addAdopter(new Adopter("Fatih Topçu", new Birthdate(3, 7, 1997), 4980,
				new Address("Dokuz eylul uni", "Turkiye", "izmir", 35), new Phone(90, 555023), "fatiht", "125"));
		mn.addWorker(new Worker("WFatih Emekli", new Birthdate(3, 7, 1987), 4980,
				new Address("Dokuz ekim sokak", "Turkiye", "izmir", 35), new Phone(90, 5556462), "fatihw", "127"));
		mn.readAnimals();
		mn.adoptAnimal(mn.findAdopter("fatiht"), mn.findAnimal("111111"));

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
					window.first.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First() {

		first = new JFrame();
		first.setTitle("LOGIN PAGE");
		first.setBounds(100, 100, 450, 500);
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnAdopterButton = new JButton("ADOPTER LOGIN");
		btnAdopterButton.setBounds(32, 180, 152, 110);
		btnAdopterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (mn.checkAdopter(txtAdopterIdTo.getText(), txtAdopterPassword.getText())) {
					AdopterFrame wp = new AdopterFrame(mn);
					wp.getLblUsername().setText(txtAdopterIdTo.getText());
					wp.getFrame().setVisible(true);
					first.setVisible(false);
				}
			}
		});
		first.getContentPane().setLayout(null);
		first.getContentPane().add(btnAdopterButton);

		JButton btnWorkerButton = new JButton("WORKER LOGIN");
		btnWorkerButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWorkerButton.setBounds(245, 180, 152, 110);
		btnWorkerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (mn.checkWorker(txtWorkerId.getText(), txtWorkerPassword.getText())) {
					WorkerFrame wp = new WorkerFrame(mn);
					wp.getLblUsername().setText(txtWorkerId.getText());
					wp.getFrame().setVisible(true);
					first.setVisible(false);
				}
			}
		});

		first.getContentPane().add(btnWorkerButton);

		txtAdopterIdTo = new JTextField();
		txtAdopterIdTo.setToolTipText("dasdas");
		txtAdopterIdTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdopterIdTo.setBounds(89, 119, 107, 19);
		first.getContentPane().add(txtAdopterIdTo);
		txtAdopterIdTo.setColumns(10);

		txtWorkerPassword = new JTextField();
		txtWorkerPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtWorkerPassword.setBounds(235, 149, 107, 20);
		first.getContentPane().add(txtWorkerPassword);
		txtWorkerPassword.setColumns(10);

		txtWorkerId = new JTextField();
		txtWorkerId.setHorizontalAlignment(SwingConstants.CENTER);
		txtWorkerId.setBounds(235, 119, 107, 19);
		first.getContentPane().add(txtWorkerId);
		txtWorkerId.setColumns(10);

		txtAdopterPassword = new JTextField();
		txtAdopterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdopterPassword.setBounds(89, 149, 107, 19);
		first.getContentPane().add(txtAdopterPassword);
		txtAdopterPassword.setColumns(10);

		lblAdopterId = new JLabel("Adopter ID");
		lblAdopterId.setBounds(10, 122, 62, 14);
		first.getContentPane().add(lblAdopterId);

		lblAdopterPas = new JLabel("Adopter Pass");
		lblAdopterPas.setBounds(10, 150, 69, 19);
		first.getContentPane().add(lblAdopterPas);

		lblWorkerId = new JLabel("Worker ID");
		lblWorkerId.setBounds(352, 120, 49, 19);
		first.getContentPane().add(lblWorkerId);

		lblWorkerPas = new JLabel("Worker Pass");
		lblWorkerPas.setBounds(352, 150, 72, 19);
		first.getContentPane().add(lblWorkerPas);

	}

	public JFrame getFirst() {
		return first;
	}

	public void setFirst(JFrame first) {
		this.first = first;
	}

}
