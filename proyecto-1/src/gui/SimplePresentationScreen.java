package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JTextField;

public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;

		@SuppressWarnings("serial")
		public SimplePresentationScreen(Student studentData) {
			this.studentData = studentData;
			
			
			contentPane = new JPanel();
			contentPane.setToolTipText("");
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			
			setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
			setIconImage(Toolkit.getDefaultToolkit().getImage("../images/tdp.png"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(new Dimension(615, 266));
			setResizable(false);
			setContentPane(contentPane);
		
			init();
		}
		
		private void init() {
			// Tabbed Pane to student personal data
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBackground(Color.LIGHT_GRAY);
			tabInformation = new JPanel();
			tabInformation.setBackground(UIManager.getColor("Button.background"));
			tabInformation.setPreferredSize(new Dimension(425, 200));
			tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
			tabInformation.setLayout(null);
			
			JLabel lblLu = new JLabel("LU");
			lblLu.setBounds(10, 11, 79, 14);
			tabInformation.add(lblLu);
			
			JLabel lblApellido = new JLabel("Apellido");
			lblApellido.setBounds(10, 48, 79, 14);
			tabInformation.add(lblApellido);
			
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(10, 88, 79, 14);
			tabInformation.add(lblNombre);
			
			JLabel lblEmail = new JLabel("e-mail");
			lblEmail.setBounds(10, 116, 79, 14);
			tabInformation.add(lblEmail);
			
			JLabel lblGithubUrl = new JLabel("GitHub URL");
			lblGithubUrl.setBounds(10, 153, 79, 14);
			tabInformation.add(lblGithubUrl);
			
			JTextField lblNewLabel_1 = new JTextField(""+studentData.getId());
			lblNewLabel_1.setBounds(99, 11, 305, 14);
			lblNewLabel_1.setBackground(Color.WHITE);
			tabInformation.add(lblNewLabel_1);
			
			JTextField lblNewLabel_2 = new JTextField(studentData.getLastName());
			lblNewLabel_2.setBounds(99, 48, 305, 14);
			lblNewLabel_2.setBackground(Color.WHITE);
			tabInformation.add(lblNewLabel_2);
			
			JTextField lblNewLabel_3 = new JTextField(studentData.getFirstName());
			lblNewLabel_3.setBounds(99, 88, 305, 14);
			lblNewLabel_3.setBackground(Color.WHITE);
			tabInformation.add(lblNewLabel_3);
			
			JTextField lblNewLabel_4 = new JTextField(studentData.getMail());
			lblNewLabel_4.setBounds(99, 116, 305, 14);
			lblNewLabel_4.setBackground(Color.WHITE);
			tabInformation.add(lblNewLabel_4);
			
			JTextField lblNewLabel_5 = new JTextField(studentData.getGithubURL());
			lblNewLabel_5.setBounds(99, 153, 305, 14);
			lblNewLabel_5.setBackground(Color.WHITE);
			tabInformation.add(lblNewLabel_5);
			contentPane.add(tabbedPane, BorderLayout.WEST);
			
			String horario=new SimpleDateFormat("hh:mm:ss").format(new Date());
			String fecha=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
			JLabel label = new JLabel("Esta ventana fue generada el "+fecha+"a las "+horario);
			contentPane.add(label, BorderLayout.SOUTH);
			
			JLabel lblNewLabel = new JLabel();
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(lblNewLabel, BorderLayout.CENTER);
			ImageIcon image=new ImageIcon(studentData.getPathPhoto());
			lblNewLabel.setIcon(image);
			
			
		}
	}
