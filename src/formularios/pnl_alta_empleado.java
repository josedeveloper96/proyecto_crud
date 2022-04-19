package formularios;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class pnl_alta_empleado extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 01;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lbl_informacion_curp;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JPanel panel_2;
	private JButton btnGuardar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_9;
	private JButton btnContraseñaRandom;
	private JSeparator lbl_curp_valido;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_1;
	private JButton btnBorrar;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;

	/**
	 * Create the panel.
	 */
	public pnl_alta_empleado() {
		setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(10, 11, 882, 461);
			add(panel);
			panel.setLayout(null);
			{
				lblNewLabel = new JLabel("Alta de nuevo empleado");
				lblNewLabel.setBounds(207, 5, 357, 35);
				lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
				panel.add(lblNewLabel);
			}
			{
				panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Inserte datos del Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBounds(10, 54, 554, 385);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					lbl_informacion_curp = new JLabel("CURP:");
					lbl_informacion_curp.setFont(new Font("Arial", Font.BOLD, 16));
					lbl_informacion_curp.setBounds(10, 43, 59, 22);
					panel_1.add(lbl_informacion_curp);
				}
				{
					lblNewLabel_2 = new JLabel("Nombre:");
					lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_2.setBounds(10, 96, 88, 22);
					panel_1.add(lblNewLabel_2);
				}
				{
					lblNewLabel_3 = new JLabel("Apellido Paterno:");
					lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_3.setBounds(10, 141, 166, 22);
					panel_1.add(lblNewLabel_3);
				}
				{
					lblNewLabel_4 = new JLabel("Apellido Materno:");
					lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_4.setBounds(10, 174, 166, 22);
					panel_1.add(lblNewLabel_4);
				}
				{
					lblNewLabel_5 = new JLabel("Domicilio: ");
					lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_5.setBounds(10, 207, 94, 22);
					panel_1.add(lblNewLabel_5);
				}
				{
					lblNewLabel_6 = new JLabel("A\u00F1o de Nacimiento:");
					lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_6.setBounds(10, 280, 194, 22);
					panel_1.add(lblNewLabel_6);
				}
				{
					lblNewLabel_7 = new JLabel("Area:");
					lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_7.setBounds(303, 141, 94, 22);
					panel_1.add(lblNewLabel_7);
				}
				{
					lblNewLabel_8 = new JLabel("Contrase\u00F1a: ");
					lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_8.setBounds(303, 174, 129, 22);
					panel_1.add(lblNewLabel_8);
				}
				{
					textField = new JTextField();
					textField.setFont(new Font("Arial", Font.PLAIN, 12));
					textField.setBounds(79, 46, 125, 20);
					panel_1.add(textField);
					textField.setColumns(10);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_1.setColumns(10);
					textField_1.setBounds(90, 99, 125, 20);
					panel_1.add(textField_1);
				}
				{
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_2.setColumns(10);
					textField_2.setBounds(164, 144, 125, 20);
					panel_1.add(textField_2);
				}
				{
					textField_3 = new JTextField();
					textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_3.setColumns(10);
					textField_3.setBounds(173, 174, 125, 20);
					panel_1.add(textField_3);
				}
				{
					textField_4 = new JTextField();
					textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_4.setColumns(10);
					textField_4.setBounds(114, 207, 125, 20);
					panel_1.add(textField_4);
				}
				{
					textField_5 = new JTextField();
					textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
					textField_5.setColumns(10);
					textField_5.setBounds(398, 177, 125, 20);
					panel_1.add(textField_5);
				}
				{
					comboBox = new JComboBox();
					comboBox.setFont(new Font("Arial", Font.BOLD, 12));
					comboBox.setBounds(171, 282, 98, 22);
					panel_1.add(comboBox);
				}
				{
					comboBox_1 = new JComboBox();
					comboBox_1.setFont(new Font("Arial", Font.BOLD, 12));
					comboBox_1.setBounds(354, 141, 98, 22);
					panel_1.add(comboBox_1);
				}
				{
					lblNewLabel_9 = new JLabel("Nombre:");
					lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_9.setBounds(365, 22, 80, 14);
					panel_1.add(lblNewLabel_9);
				}
				{
					btnContraseñaRandom = new JButton("");
					btnContraseñaRandom.setIcon(new ImageIcon(pnl_alta_empleado.class.getResource("/imagenes/random.png")));
					btnContraseñaRandom.setBounds(404, 242, 119, 81);
					panel_1.add(btnContraseñaRandom);
				}
				{
					lbl_curp_valido = new JSeparator();
					lbl_curp_valido.setBounds(354, 100, 169, 2);
					panel_1.add(lbl_curp_valido);
				}
				{
					lblNewLabel_10 = new JLabel("Nombre:");
					lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_10.setBounds(10, 341, 88, 22);
					panel_1.add(lblNewLabel_10);
				}
				{
					lblNewLabel_11 = new JLabel("Nombre:");
					lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_11.setBounds(364, 49, 88, 22);
					panel_1.add(lblNewLabel_11);
				}
				{
					lblNewLabel_1 = new JLabel("generar contrase\u00F1a random(opcional)");
					lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_1.setBounds(292, 334, 231, 40);
					panel_1.add(lblNewLabel_1);
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
					btnGuardar.setIcon(new ImageIcon(pnl_alta_empleado.class.getResource("/imagenes/check.png")));
					btnGuardar.setBounds(33, 39, 89, 75);
					panel_2.add(btnGuardar);
				}
				{
					btnBorrar = new JButton("");
					btnBorrar.setIcon(new ImageIcon(pnl_alta_empleado.class.getResource("/imagenes/borrar.png")));
					btnBorrar.setBounds(33, 165, 89, 81);
					panel_2.add(btnBorrar);
				}
				{
					lblNewLabel_12 = new JLabel("Guardar");
					lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
					lblNewLabel_12.setBounds(43, 130, 61, 14);
					panel_2.add(lblNewLabel_12);
				}
				{
					lblNewLabel_13 = new JLabel("Borrar");
					lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 12));
					lblNewLabel_13.setBounds(43, 277, 61, 14);
					panel_2.add(lblNewLabel_13);
				}
			}
		}

	}
}
