import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VentanaSwingGit extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo Swing + Git");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menuFile = new JMenu("Fichero");
		barraMenu.add(menuFile);
		
		JMenuItem itemMostrar = new JMenuItem("Mostrar");
		menuFile.add(itemMostrar);
		JMenuItem itemLimpiar = new JMenuItem("Limpiar");
		menuFile.add(itemLimpiar);
		JMenuItem itemSalir = new JMenuItem("Salir");
		menuFile.add(itemSalir);
		
		JTabbedPane panelTabs = new JTabbedPane();
		add(panelTabs, BorderLayout.CENTER);
		
		panelTabs.addTab("Datos Personales", new JPanel());
		panelTabs.addTab("Información", new JPanel());
		panelTabs.addTab("Comentarios", new JPanel());
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new VentanaSwingGit();
	}

}
