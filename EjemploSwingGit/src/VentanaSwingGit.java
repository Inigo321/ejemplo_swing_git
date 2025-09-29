import javax.swing.JFrame;

public class VentanaSwingGit extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo Swing + Git");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new VentanaSwingGit();
	}

}
