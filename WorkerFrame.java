package oopProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WorkerFrame extends JFrame {

	private JPanel content;
	private JFrame frame;
	JLabel lblUsername;
	private JButton btnLstAdopters;
	private JTextField adopterName;
	private JButton btnLstAnmals;
	private JTextField BdDay;
	private JTextField BdMonth;
	private JTextField BdYear;
	private JTextField IDNumber;
	private JTextField Address;
	private JTextField addressCountry;
	private JTextField addressCity;
	private JTextField addressPostal;
	private JTextField pNumberCountry;
	private JTextField pNumber;
	private JTextField IDbox;
	private JTextField passwordBox;
	private JTextField animalName;
	private JTextField animalID;
	private JTextField animalAge;
	private JTextField animalWeight;
	private JTextField animalHeight;
	private JComboBox comboBox;
	private JRadioButton rdbtnCanTalk;
	private JTextField animalBreed;

	public WorkerFrame(Management mn) {
		frame = new JFrame();
		frame.setTitle("Admin Page");
		frame.setBounds(100, 100, 650, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLoggedInAs = new JLabel("Logged in As");
		lblLoggedInAs.setBounds(10, 11, 80, 14);
		frame.getContentPane().add(lblLoggedInAs);

		lblUsername = new JLabel("UserName");
		lblUsername.setBounds(104, 11, 67, 14);
		frame.getContentPane().add(lblUsername);

		btnLstAdopters = new JButton("LIST ADOPTERS");
		btnLstAdopters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AdopterTable tb = new AdopterTable(mn.getAdopters());
				tb.setVisible(true);
			}
		});
		btnLstAdopters.setBounds(42, 58, 129, 73);
		frame.getContentPane().add(btnLstAdopters);

		adopterName = new JTextField();
		adopterName.setBounds(85, 207, 86, 20);
		frame.getContentPane().add(adopterName);
		adopterName.setColumns(10);

		JButton btnLstWorkers = new JButton("LIST WORKERS");
		btnLstWorkers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				WorkerTable tb = new WorkerTable(mn.getWorkers());
				tb.setVisible(true);
			}
		});
		btnLstWorkers.setBounds(241, 58, 129, 73);
		frame.getContentPane().add(btnLstWorkers);

		btnLstAnmals = new JButton("LIST ANIMALS");
		btnLstAnmals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BirdTable tb = new BirdTable(mn.getAnimals());
				tb.setVisible(true);
			}
		});
		btnLstAnmals.setBounds(436, 58, 136, 73);
		frame.getContentPane().add(btnLstAnmals);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 210, 46, 14);
		frame.getContentPane().add(lblName);

		JLabel lblBdayDay = new JLabel("Bday Day");
		lblBdayDay.setBounds(10, 235, 65, 14);
		frame.getContentPane().add(lblBdayDay);

		JLabel lblBdayMonth = new JLabel("BD Month");
		lblBdayMonth.setBounds(10, 260, 65, 14);
		frame.getContentPane().add(lblBdayMonth);

		JLabel lblBdYear = new JLabel("BD Year");
		lblBdYear.setBounds(10, 285, 65, 14);
		frame.getContentPane().add(lblBdYear);

		JLabel lblIdNo = new JLabel("ID NO");
		lblIdNo.setBounds(10, 310, 46, 14);
		frame.getContentPane().add(lblIdNo);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 335, 65, 14);
		frame.getContentPane().add(lblAddress);

		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 381, 46, 14);
		frame.getContentPane().add(lblCity);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 360, 65, 14);
		frame.getContentPane().add(lblCountry);

		JLabel lblPostalcode = new JLabel("PostalCode");
		lblPostalcode.setBounds(10, 406, 65, 14);
		frame.getContentPane().add(lblPostalcode);

		JLabel lblPnoCountry = new JLabel("PNo Country");
		lblPnoCountry.setBounds(10, 431, 65, 14);
		frame.getContentPane().add(lblPnoCountry);

		JLabel lblPnumber = new JLabel("Pnumber");
		lblPnumber.setBounds(10, 456, 65, 14);
		frame.getContentPane().add(lblPnumber);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 481, 65, 14);
		frame.getContentPane().add(lblId);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 506, 80, 14);
		frame.getContentPane().add(lblPassword);

		BdDay = new JTextField();
		BdDay.setToolTipText("Integer");
		BdDay.setBounds(85, 232, 86, 20);
		frame.getContentPane().add(BdDay);
		BdDay.setColumns(10);

		BdMonth = new JTextField();
		BdMonth.setToolTipText("Integer");
		BdMonth.setBounds(85, 257, 86, 20);
		frame.getContentPane().add(BdMonth);
		BdMonth.setColumns(10);

		BdYear = new JTextField();
		BdYear.setToolTipText("Integer");
		BdYear.setBounds(85, 282, 86, 20);
		frame.getContentPane().add(BdYear);
		BdYear.setColumns(10);

		IDNumber = new JTextField();
		IDNumber.setToolTipText("INteger");
		IDNumber.setBounds(85, 307, 86, 20);
		frame.getContentPane().add(IDNumber);
		IDNumber.setColumns(10);

		Address = new JTextField();
		Address.setBounds(85, 332, 86, 20);
		frame.getContentPane().add(Address);
		Address.setColumns(10);

		addressCountry = new JTextField();
		addressCountry.setBounds(85, 357, 86, 20);
		frame.getContentPane().add(addressCountry);
		addressCountry.setColumns(10);

		addressCity = new JTextField();
		addressCity.setBounds(85, 378, 86, 20);
		frame.getContentPane().add(addressCity);
		addressCity.setColumns(10);

		addressPostal = new JTextField();
		addressPostal.setToolTipText("Integer");
		addressPostal.setBounds(85, 403, 86, 20);
		frame.getContentPane().add(addressPostal);
		addressPostal.setColumns(10);

		pNumberCountry = new JTextField();
		pNumberCountry.setToolTipText("Integer");
		pNumberCountry.setBounds(85, 428, 86, 20);
		frame.getContentPane().add(pNumberCountry);
		pNumberCountry.setColumns(10);

		pNumber = new JTextField();
		pNumber.setToolTipText("INteger");
		pNumber.setBounds(85, 453, 86, 20);
		frame.getContentPane().add(pNumber);
		pNumber.setColumns(10);

		IDbox = new JTextField();
		IDbox.setBounds(85, 478, 86, 20);
		frame.getContentPane().add(IDbox);
		IDbox.setColumns(10);

		passwordBox = new JTextField();
		passwordBox.setBounds(85, 503, 86, 20);
		frame.getContentPane().add(passwordBox);
		passwordBox.setColumns(10);

		JButton btnAddWorker = new JButton("ADD WORKER");
		btnAddWorker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (adopterName.getText().length() != 0)
					if (BdDay.getText().length() != 0)
						if (BdMonth.getText().length() != 0)
							if (BdYear.getText().length() != 0)
								if (IDNumber.getText().length() != 0)
									if (Address.getText().length() != 0)
										if (addressCountry.getText().length() != 0)
											if (addressCity.getText().length() != 0)
												if (addressPostal.getText().length() != 0)
													if (pNumberCountry.getText().length() != 0)
														if (pNumber.getText().length() != 0)
															if (IDbox.getText().length() != 0)
																if (passwordBox.getText().length() != 0) {
																	Worker wr = new Worker(adopterName.getText(),
																			new Birthdate(
																					Integer.parseInt(BdDay.getText()),
																					Integer.parseInt(BdMonth.getText()),
																					Integer.parseInt(BdYear.getText())),
																			Integer.parseInt(IDNumber.getText()),
																			new Address(Address.getText(),
																					addressCountry.getText(),
																					addressCity.getText(),
																					Integer.parseInt(
																							addressPostal.getText())),
																			new Phone(
																					Integer.parseInt(
																							pNumberCountry.getText()),
																					Integer.parseInt(
																							pNumber.getText())),
																			IDbox.getText(), passwordBox.getText());
																	mn.addWorker(wr);

																}

			}
		});
		btnAddWorker.setBounds(205, 206, 129, 93);
		frame.getContentPane().add(btnAddWorker);

		JButton btnAddAdopter = new JButton("ADD ADOPTER");
		btnAddAdopter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (adopterName.getText().length() != 0)
					if (BdDay.getText().length() != 0)
						if (BdMonth.getText().length() != 0)
							if (BdYear.getText().length() != 0)
								if (IDNumber.getText().length() != 0)
									if (Address.getText().length() != 0)
										if (addressCountry.getText().length() != 0)
											if (addressCity.getText().length() != 0)
												if (addressPostal.getText().length() != 0)
													if (pNumberCountry.getText().length() != 0)
														if (pNumber.getText().length() != 0)
															if (IDbox.getText().length() != 0)
																if (passwordBox.getText().length() != 0) {
																	Adopter wr = new Adopter(adopterName.getText(),
																			new Birthdate(
																					Integer.parseInt(BdDay.getText()),
																					Integer.parseInt(BdMonth.getText()),
																					Integer.parseInt(BdYear.getText())),
																			Integer.parseInt(IDNumber.getText()),
																			new Address(Address.getText(),
																					addressCountry.getText(),
																					addressCity.getText(),
																					Integer.parseInt(
																							addressPostal.getText())),
																			new Phone(
																					Integer.parseInt(
																							pNumberCountry.getText()),
																					Integer.parseInt(
																							pNumber.getText())),
																			IDbox.getText(), passwordBox.getText());
																	mn.addAdopter(wr);
																}

			}
		});
		btnAddAdopter.setBounds(205, 308, 129, 87);
		frame.getContentPane().add(btnAddAdopter);

		JButton btnRemoveWorker = new JButton("REMOVE WORKER");
		btnRemoveWorker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (IDbox.getText().length() != 0) {
					mn.removeWorker(IDbox.getText());
				}

			}
		});
		btnRemoveWorker.setBounds(205, 406, 129, 93);
		frame.getContentPane().add(btnRemoveWorker);

		JButton btnRemoveAdopter = new JButton("REMOVE ADOPTER");
		btnRemoveAdopter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (IDbox.getText().length() != 0) {
					mn.removeAdopter(IDbox.getText());
				}
			}
		});
		btnRemoveAdopter.setBounds(205, 502, 129, 87);
		frame.getContentPane().add(btnRemoveAdopter);

		JLabel lblAddremoveWorkeradopter = new JLabel("ADD/REMOVE WORKER/ADOPTER");
		lblAddremoveWorkeradopter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddremoveWorkeradopter.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddremoveWorkeradopter.setBounds(10, 164, 285, 32);
		frame.getContentPane().add(lblAddremoveWorkeradopter);

		JLabel lblAnimalName = new JLabel("Animal Name");
		lblAnimalName.setBounds(365, 210, 92, 14);
		frame.getContentPane().add(lblAnimalName);

		JLabel lblAnimalId = new JLabel("Animal ID");
		lblAnimalId.setBounds(365, 235, 92, 14);
		frame.getContentPane().add(lblAnimalId);

		JLabel lblAnimalAge = new JLabel("Animal Age");
		lblAnimalAge.setBounds(365, 260, 92, 14);
		frame.getContentPane().add(lblAnimalAge);

		JLabel lblAnimalWeight = new JLabel("Animal Weight");
		lblAnimalWeight.setBounds(365, 285, 116, 14);
		frame.getContentPane().add(lblAnimalWeight);

		JLabel lblAnimalHeight = new JLabel("Animal Height");
		lblAnimalHeight.setBounds(365, 310, 116, 14);
		frame.getContentPane().add(lblAnimalHeight);

		rdbtnCanTalk = new JRadioButton("Can Talk / Trained");
		rdbtnCanTalk.setBounds(417, 335, 155, 23);
		frame.getContentPane().add(rdbtnCanTalk);

		animalName = new JTextField();
		animalName.setBounds(480, 207, 86, 20);
		frame.getContentPane().add(animalName);
		animalName.setColumns(10);

		animalID = new JTextField();
		animalID.setBounds(480, 232, 86, 20);
		frame.getContentPane().add(animalID);
		animalID.setColumns(10);

		animalAge = new JTextField();
		animalAge.setToolTipText("Integer");
		animalAge.setBounds(480, 257, 86, 20);
		frame.getContentPane().add(animalAge);
		animalAge.setColumns(10);

		animalWeight = new JTextField();
		animalWeight.setToolTipText("Integer");
		animalWeight.setBounds(480, 282, 86, 20);
		frame.getContentPane().add(animalWeight);
		animalWeight.setColumns(10);

		animalHeight = new JTextField();
		animalHeight.setToolTipText("Integer");
		animalHeight.setBounds(480, 307, 86, 20);
		frame.getContentPane().add(animalHeight);
		animalHeight.setColumns(10);

		JButton btnAddAnmal = new JButton("ADD ANIMAL");
		btnAddAnmal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (animalName.getText().length() != 0)
					if (animalID.getText().length() != 0)
						if (animalAge.getText().length() != 0)
							if (animalWeight.getText().length() != 0)
								if (animalHeight.getText().length() != 0)
									if (animalBreed.getText().length() != 0) {
										String comboxselection = comboBox.getSelectedItem().toString();
										String aniname = animalName.getText();
										String aniID = animalID.getText();
										int aniAge = Integer.parseInt(animalAge.getText());
										int aniWeight = Integer.parseInt(animalWeight.getText());
										int aniHeight = Integer.parseInt(animalHeight.getText());
										String aniBreed = animalBreed.getText();
										boolean att = rdbtnCanTalk.isSelected();
										if (comboxselection.equals("Dog")) {
											Dog dg = new Dog(aniname, aniID, aniAge, aniWeight, aniHeight, aniBreed,
													"Dog", att);
											mn.addAnimal(dg);
										} else if (comboxselection.equals("Bird")) {
											Bird dg = new Bird(aniname, aniID, aniAge, aniWeight, aniHeight, att,
													aniBreed, "Bird");
											mn.addAnimal(dg);
										} else if (comboxselection.equals("Cat")) {
											Cat dg = new Cat(aniname, aniID, aniAge, aniWeight, aniHeight, aniBreed,
													"Cat", att);
											mn.addAnimal(dg);
										}
									}
			}
		});
		btnAddAnmal.setBounds(411, 459, 155, 58);
		frame.getContentPane().add(btnAddAnmal);

		JButton btnRemoveAnmal = new JButton("REMOVE ANIMAL");
		btnRemoveAnmal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (animalID.getText().length() != 0)
					mn.removeAnimal(animalID.getText());
			}
		});
		btnRemoveAnmal.setBounds(411, 531, 155, 58);
		frame.getContentPane().add(btnRemoveAnmal);

		JLabel lblAddremoveAnmal = new JLabel("ADD/REMOVE ANIMAL");
		lblAddremoveAnmal.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddremoveAnmal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddremoveAnmal.setBounds(365, 173, 201, 14);
		frame.getContentPane().add(lblAddremoveAnmal);

		comboBox = new JComboBox();
		comboBox.addItem("Dog");
		comboBox.addItem("Cat");
		comboBox.addItem("Bird");
		comboBox.setSelectedItem("Dog");
		comboBox.setBounds(430, 375, 136, 26);
		frame.getContentPane().add(comboBox);

		animalBreed = new JTextField();
		animalBreed.setBounds(430, 428, 136, 20);
		frame.getContentPane().add(animalBreed);
		animalBreed.setColumns(10);

		JLabel lblBreed = new JLabel("Breed");
		lblBreed.setBounds(351, 431, 46, 14);
		frame.getContentPane().add(lblBreed);

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
		btnBack.setBounds(245, 7, 89, 23);
		frame.getContentPane().add(btnBack);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getLblUsername() {
		return lblUsername;
	}

	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}
}
