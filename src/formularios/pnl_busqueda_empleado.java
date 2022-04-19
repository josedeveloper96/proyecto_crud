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
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class pnl_busqueda_empleado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 01L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblBusquedaDeDatos;
	private JPanel panel_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pnl_busqueda_empleado frame = new pnl_busqueda_empleado();
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
	public pnl_busqueda_empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 498);
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
				lblBusquedaDeDatos = new JLabel("Busqueda de datos del empleado");
				lblBusquedaDeDatos.setHorizontalAlignment(SwingConstants.CENTER);
				lblBusquedaDeDatos.setFont(new Font("Arial Black", Font.BOLD, 24));
				lblBusquedaDeDatos.setBounds(207, 5, 472, 35);
				panel.add(lblBusquedaDeDatos);
			}
			{
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(10, 98, 554, 341);
				panel.add(panel_1);
				{
					table = new JTable();
					table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
					table.setBounds(10, 21, 534, 305);
					panel_1.add(table);
				}
			}
		}
	}
}
