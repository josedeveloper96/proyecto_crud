package formularios;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class menu_principal extends JFrame {
		/**
	 * 
	 */
	
	/**
	 *
	 */
	
	private static final long serialVersionUID = 01L;
	private JPanel panel;
	private JPanel pnl_vista_principal;
	private JToggleButton btn_alta;
	private JLabel lblNewLabel;
	private JPanel pnl_2;
	private JToggleButton btn_modificar;
	private JToggleButton btn_eliminar;
	private JToggleButton btn_buscar;
	private JButton btn_salir;
	/**
	 * @wbp.nonvisual location=730,69
	 */

	/**
	 * Launch the application.
	 */

	
	
	pnl_alta_empleado pnl_alta_empleado = new pnl_alta_empleado();
	pnl_busqueda_empleado pnl_busqueda_empleado = new pnl_busqueda_empleado();
	pnl_eliminacion_empleado pnl_eliminacion_empleado = new pnl_eliminacion_empleado();
	pnl_modificacion_empleado pnl_modificacion_empleado = new pnl_modificacion_empleado();
	
	CardLayout vista;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_principal frame = new menu_principal();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
 	public menu_principal() {
		setTitle("SIstema CRUD de Empleados.");
		setIconImage(Toolkit.getDefaultToolkit().getImage(menu_principal.class.getResource("/imagenes/icono_del_sistema.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 629);
		{
			panel = new JPanel();
			panel.setBackground(Color.CYAN);
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				pnl_vista_principal = new JPanel();
				pnl_vista_principal.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
				pnl_vista_principal.setBackground(Color.WHITE);
				pnl_vista_principal.setBounds(10, 11, 214, 568);
				panel.add(pnl_vista_principal);
				pnl_vista_principal.setLayout(null);
				{
					btn_alta = new JToggleButton("Regisro de nuevo empleado");
					btn_alta.setIcon(new ImageIcon(menu_principal.class.getResource("/imagenes/alta_usuario.png")));
					btn_alta.setForeground(Color.BLACK);
					btn_alta.setBackground(new Color(169, 169, 169));
					btn_alta.setBounds(10, 36, 194, 83);
					pnl_vista_principal.add(btn_alta);
				}
				{
					lblNewLabel = new JLabel("menu del sistema");
					lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
					lblNewLabel.setBounds(31, 11, 132, 14);
					pnl_vista_principal.add(lblNewLabel);
				}
				{
					btn_modificar = new JToggleButton("modificar datos");
					btn_modificar.setIcon(new ImageIcon(menu_principal.class.getResource("/imagenes/modificacion_usuario.png")));
					btn_modificar.setForeground(Color.BLACK);
					btn_modificar.setBackground(new Color(169, 169, 169));
					btn_modificar.setBounds(10, 130, 194, 83);
					pnl_vista_principal.add(btn_modificar);
				}
				{
					btn_eliminar = new JToggleButton("eliminar empleado");
					btn_eliminar.setIcon(new ImageIcon(menu_principal.class.getResource("/imagenes/eliminacion_usuario.png")));
					btn_eliminar.setForeground(Color.BLACK);
					btn_eliminar.setBackground(new Color(169, 169, 169));
					btn_eliminar.setBounds(10, 224, 194, 83);
					pnl_vista_principal.add(btn_eliminar);
				}
				{
					btn_buscar = new JToggleButton("buscar empleado");
					btn_buscar.setIcon(new ImageIcon(menu_principal.class.getResource("/imagenes/buscar.png")));
					btn_buscar.setForeground(Color.BLACK);
					btn_buscar.setBackground(new Color(169, 169, 169));
					btn_buscar.setBounds(10, 318, 194, 83);
					pnl_vista_principal.add(btn_buscar);
				}
				{
					btn_salir = new JButton("Salir");
					btn_salir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.exit(0);
						}
					});
					btn_salir.setIcon(new ImageIcon(menu_principal.class.getResource("/imagenes/cerrar_salir.png")));
					btn_salir.setFont(new Font("Arial", Font.BOLD, 14));
					btn_salir.setBounds(10, 447, 194, 83);
					pnl_vista_principal.add(btn_salir);
				}
			}
			{
				pnl_2 = new JPanel();
				pnl_2.setBackground(Color.CYAN);
				pnl_2.setBounds(234, 0, 423, 590);
				panel.add(pnl_2);
				pnl_2.setLayout(null);
			}
		}
	}
}


