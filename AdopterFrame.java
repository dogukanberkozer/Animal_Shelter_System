package oopProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdopterFrame extends JFrame {

	private JPanel content;
	private JFrame frame;
	JButton btnShowAllAnimals;
	JButton btnShowDogs;
	JButton btnShowCats;
	JButton btnShowBrds;
	JTextField textField;
	JLabel lblUsername;

	public AdopterFrame(Management mn) {

		frame = new JFrame();
		frame.setTitle("Adopter Page");
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnShowAllAnimals = new JButton("SHOW ALL ANIMALS");
		btnShowAllAnimals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BirdTable tb = new BirdTable(mn.getAnimals());
				tb.setVisible(true);
			}
		});
		btnShowAllAnimals.setBounds(81, 102, 259, 83);
		frame.getContentPane().add(btnShowAllAnimals);

		JButton btnShowDogs = new JButton("LIST DOGS");
		btnShowDogs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BirdTable tb = new BirdTable(mn.getDogs());
				tb.setVisible(true);
			}
		});
		btnShowDogs.setBounds(10, 196, 126, 83);
		frame.getContentPane().add(btnShowDogs);

		JButton btnShowCats = new JButton("LIST CATS");
		btnShowCats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BirdTable tb = new BirdTable(mn.getCats());
				tb.setVisible(true);
			}
		});
		btnShowCats.setBounds(146, 196, 126, 83);
		frame.getContentPane().add(btnShowCats);

		JButton btnShowBrds = new JButton("LIST BIRDS");
		btnShowBrds.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				BirdTable tb = new BirdTable(mn.getBirds());
				tb.setVisible(true);
			}
		});
		btnShowBrds.setBounds(282, 196, 126, 83);
		frame.getContentPane().add(btnShowBrds);

		textField = new JTextField();
		textField.setBounds(146, 361, 126, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblIdOfPet = new JLabel("ID of Pet to Adopt");
		lblIdOfPet.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdOfPet.setBounds(146, 330, 126, 20);
		frame.getContentPane().add(lblIdOfPet);

		JButton btnAdoptAPet = new JButton("ADOPT A PET");
		btnAdoptAPet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String user = lblUsername.getText();
				mn.adoptAnimal(mn.findAdopter(user), mn.findAnimal(textField.getText()));
			}
		});
		btnAdoptAPet.setBounds(146, 392, 126, 76);
		frame.getContentPane().add(btnAdoptAPet);

		JLabel lblLoggedInAs = new JLabel("Logged In as");
		lblLoggedInAs.setBounds(36, 37, 73, 20);
		frame.getContentPane().add(lblLoggedInAs);

		lblUsername = new JLabel("UserName");
		lblUsername.setBounds(119, 40, 104, 14);
		frame.getContentPane().add(lblUsername);

		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				First first = new First();
				first.getFirst().setVisible(true);
				first.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(251, 36, 89, 23);
		frame.getContentPane().add(btnBack);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnShowAllAnimals() {
		return btnShowAllAnimals;
	}

	public void setBtnShowAllAnimals(JButton btnShowAllAnimals) {
		this.btnShowAllAnimals = btnShowAllAnimals;
	}

	public JButton getBtnShowDogs() {
		return btnShowDogs;
	}

	public void setBtnShowDogs(JButton btnShowDogs) {
		this.btnShowDogs = btnShowDogs;
	}

	public JButton getBtnShowCats() {
		return btnShowCats;
	}

	public void setBtnShowCats(JButton btnShowCats) {
		this.btnShowCats = btnShowCats;
	}

	public JButton getBtnShowBrds() {
		return btnShowBrds;
	}

	public void setBtnShowBrds(JButton btnShowBrds) {
		this.btnShowBrds = btnShowBrds;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JPanel getContent() {
		return content;
	}

	public void setContent(JPanel content) {
		this.content = content;
	}

	public JLabel getLblUsername() {
		return lblUsername;
	}

	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}
}
