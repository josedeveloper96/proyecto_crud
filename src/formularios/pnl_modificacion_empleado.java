package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class pnl_modificacion_empleado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 01L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblActualizacinDeDatos;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnContraseñaRandom;
	private JLabel lblNewLabel_11;
	private JPanel panel_2;
	private JButton btnGuardar;
	private JButton btnBorrar;
	private JLabel lblNewLabel;
	private JLabel lblBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pnl_modificacion_empleado frame = new pnl_modificacion_empleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pnl_modificacion_empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.WHITE);
			contentPane.add(panel, BorderLayout.CENTER);
			{
				lblActualizacinDeDatos = new JLabel("Actualizaci\u00F3n de datos del empleado");
				lblActualizacinDeDatos.setHorizontalAlignment(SwingConstants.CENTER);
				lblActualizacinDeDatos.setFont(new Font("Arial Black", Font.BOLD, 24));
				lblActualizacinDeDatos.setBounds(207, 5, 536, 35);
				panel.add(lblActualizacinDeDatos);
			}
			{
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(10, 108, 554, 328);
				panel.add(panel_1);
				{
					lblNewLabel_1 = new JLabel("Nombre:");
					lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_1.setBounds(10, 35, 76, 22);
					panel_1.add(lblNewLabel_1);
				}
				{
					lblNewLabel_2 = new JLabel("Apellido Paterno:");
					lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_2.setBounds(10, 79, 141, 22);
					panel_1.add(lblNewLabel_2);
				}
				{
					lblNewLabel_3 = new JLabel("Apellido Materno:");
					lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_3.setBounds(10, 123, 141, 22);
					panel_1.add(lblNewLabel_3);
				}
				{
					lblNewLabel_4 = new JLabel("Domicilio: ");
					lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_4.setBounds(4, 174, 88, 22);
					panel_1.add(lblNewLabel_4);
				}
				{
					lblNewLabel_5 = new JLabel("A\u00F1o de Nacimiento:");
					lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_5.setBounds(10, 222, 157, 22);
					panel_1.add(lblNewLabel_5);
				}
				{
					lblNewLabel_6 = new JLabel("Area:");
					lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_6.setBounds(292, 35, 53, 22);
					panel_1.add(lblNewLabel_6);
				}
				{
					lblNewLabel_7 = new JLabel("Contrase\u00F1a: ");
					lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_7.setBounds(280, 79, 99, 22);
					panel_1.add(lblNewLabel_7);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_1.setColumns(10);
					textField_1.setBounds(92, 38, 125, 20);
					panel_1.add(textField_1);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_2.setColumns(10);
					textField_2.setBounds(145, 82, 125, 20);
					panel_1.add(textField_2);
				}
				{
					textField_3 = new JTextField();
					textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_3.setColumns(10);
					textField_3.setBounds(145, 126, 125, 20);
					panel_1.add(textField_3);
				}
				{
					textField_4 = new JTextField();
					textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_4.setColumns(10);
					textField_4.setBounds(92, 177, 125, 20);
					panel_1.add(textField_4);
				}
				{
					textField_5 = new JTextField();
					textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_5.setColumns(10);
					textField_5.setBounds(389, 82, 125, 20);
					panel_1.add(textField_5);
				}
				{
					comboBox = new JComboBox();
					comboBox.setFont(new Font("Arial", Font.BOLD, 12));
					comboBox.setBounds(164, 224, 98, 22);
					panel_1.add(comboBox);
				}
				{
					comboBox_1 = new JComboBox();
					comboBox_1.setFont(new Font("Arial", Font.BOLD, 12));
					comboBox_1.setBounds(339, 37, 98, 22);
					panel_1.add(comboBox_1);
				}
				{
					btnContraseñaRandom = new JButton("");
					btnContraseñaRandom.setIcon(new ImageIcon(pnl_modificacion_empleado.class.getResource("/imagenes/random.png")));
					btnContraseñaRandom.setBounds(339, 136, 119, 81);
					panel_1.add(btnContraseñaRandom);
				}
				{
					lblNewLabel_11 = new JLabel("generar contrase\u00F1a random(opcional)");
					lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
					lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_11.setBounds(292, 237, 231, 40);
					panel_1.add(lblNewLabel_11);
				}
			}
			{
				panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opciones. ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_2.setBackground(Color.WHITE);
				panel_2.setBounds(578, 54, 165, 385);
				panel.add(panel_2);
				{
					btnGuardar = new JButton("");
					btnGuardar.setIcon(new ImageIcon(pnl_modificacion_empleado.class.getResource("/imagenes/check.png")));
					btnGuardar.setBounds(33, 39, 89, 75);
					panel_2.add(btnGuardar);
				}
				{
					btnBorrar = new JButton("");
					btnBorrar.setIcon(new ImageIcon(pnl_modificacion_empleado.class.getResource("/imagenes/borrar.png")));
					btnBorrar.setBounds(33, 191, 89, 81);
					panel_2.add(btnBorrar);
				}
				{
					lblNewLabel = new JLabel("Actualizar");
					lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setBounds(48, 137, 64, 14);
					panel_2.add(lblNewLabel);
				}
				{
					lblBorrar = new JLabel("Borrar");
					lblBorrar.setHorizontalAlignment(SwingConstants.CENTER);
					lblBorrar.setFont(new Font("Arial", Font.BOLD, 12));
					lblBorrar.setBounds(48, 296, 64, 14);
					panel_2.add(lblBorrar);
				}
			}
		}
	}

}
