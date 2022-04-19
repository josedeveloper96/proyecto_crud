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
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class pnl_eliminacion_empleado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 01L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblEliminacinDeEmpleado;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPanel panel_2;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pnl_eliminacion_empleado frame = new pnl_eliminacion_empleado();
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
	public pnl_eliminacion_empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 492);
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
				lblEliminacinDeEmpleado = new JLabel("Eliminaci\u00F3n de empleado");
				lblEliminacinDeEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
				lblEliminacinDeEmpleado.setFont(new Font("Arial Black", Font.BOLD, 24));
				lblEliminacinDeEmpleado.setBounds(207, 5, 357, 35);
				panel.add(lblEliminacinDeEmpleado);
			}
			{
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(10, 98, 554, 341);
				panel.add(panel_1);
				{
					lblNewLabel_1 = new JLabel("Nombre:");
					lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_1.setBounds(10, 29, 73, 22);
					panel_1.add(lblNewLabel_1);
				}
				{
					lblNewLabel_2 = new JLabel("Apellido Paterno:");
					lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_2.setBounds(10, 75, 140, 22);
					panel_1.add(lblNewLabel_2);
				}
				{
					lblNewLabel_3 = new JLabel("Apellido Materno:");
					lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_3.setBounds(10, 121, 140, 22);
					panel_1.add(lblNewLabel_3);
				}
				{
					lblNewLabel_4 = new JLabel("Domicilio: ");
					lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_4.setBounds(10, 174, 81, 22);
					panel_1.add(lblNewLabel_4);
				}
				{
					lblNewLabel_5 = new JLabel("A\u00F1o de Nacimiento:");
					lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_5.setBounds(0, 217, 155, 22);
					panel_1.add(lblNewLabel_5);
				}
				{
					lblNewLabel_6 = new JLabel("Area:");
					lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_6.setBounds(287, 29, 51, 22);
					panel_1.add(lblNewLabel_6);
				}
				{
					lblNewLabel_7 = new JLabel("Contrase\u00F1a: ");
					lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_7.setBounds(287, 75, 104, 22);
					panel_1.add(lblNewLabel_7);
				}
				{
					lblNewLabel_8 = new JLabel("---");
					lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_8.setBounds(93, 29, 88, 22);
					panel_1.add(lblNewLabel_8);
				}
				{
					lblNewLabel_9 = new JLabel("---");
					lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_9.setBounds(152, 75, 88, 22);
					panel_1.add(lblNewLabel_9);
				}
				{
					lblNewLabel_10 = new JLabel("---");
					lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_10.setBounds(152, 121, 88, 22);
					panel_1.add(lblNewLabel_10);
				}
				{
					lblNewLabel_11 = new JLabel("---");
					lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_11.setBounds(106, 174, 88, 22);
					panel_1.add(lblNewLabel_11);
				}
				{
					lblNewLabel_12 = new JLabel("---");
					lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_12.setBounds(162, 217, 88, 22);
					panel_1.add(lblNewLabel_12);
				}
				{
					lblNewLabel_13 = new JLabel("---");
					lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_13.setBounds(344, 29, 88, 22);
					panel_1.add(lblNewLabel_13);
				}
				{
					lblNewLabel_14 = new JLabel("---");
					lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 16));
					lblNewLabel_14.setBounds(401, 75, 88, 22);
					panel_1.add(lblNewLabel_14);
				}
			}
			{
				panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opciones. ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_2.setBackground(Color.WHITE);
				panel_2.setBounds(574, 98, 165, 341);
				panel.add(panel_2);
				{
					btnGuardar = new JButton("");
					btnGuardar.setIcon(new ImageIcon(pnl_eliminacion_empleado.class.getResource("/imagenes/check.png")));
					btnGuardar.setBounds(40, 52, 89, 75);
					panel_2.add(btnGuardar);
				}
				{
					lblNewLabel = new JLabel("Eliminar");
					lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
					lblNewLabel.setBounds(24, 145, 105, 14);
					panel_2.add(lblNewLabel);
				}
			}
		}
	}
}
