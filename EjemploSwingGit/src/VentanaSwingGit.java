import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaSwingGit extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String[] paises = {
		    "Afghanistan", "Albania", "Algeria", "Andorra", "Angola",
		    "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
		    "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados",
		    "Belarus", "Belgium", "Belize", "Benin", "Bhutan",
		    "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei",
		    "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia",
		    "Cameroon", "Canada", "Central African Republic", "Chad", "Chile",
		    "China", "Colombia", "Comoros", "Costa Rica", "Croatia",
		    "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of the Congo", "Denmark",
		    "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador",
		    "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia",
		    "Eswatini", "Ethiopia", "Fiji", "Finland", "France",
		    "Gabon", "Gambia", "Georgia", "Germany", "Ghana",
		    "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau",
		    "Guyana", "Haiti", "Honduras", "Hungary", "Iceland",
		    "India", "Indonesia", "Iran", "Iraq", "Ireland",
		    "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan",
		    "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo",
		    "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon",
		    "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania",
		    "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives",
		    "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius",
		    "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia",
		    "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia",
		    "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua",
		    "Niger", "Nigeria", "North Korea", "North Macedonia", "Norway",
		    "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea",
		    "Paraguay", "Peru", "Philippines", "Poland", "Portugal",
		    "Qatar", "Republic of the Congo", "Romania", "Russia", "Rwanda",
		    "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino",
		    "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
		    "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands",
		    "Somalia", "South Africa", "South Korea", "South Sudan", "Spain",
		    "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland",
		    "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand",
		    "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey",
		    "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates",
		    "United Kingdom", "United States of America", "Uruguay", "Uzbekistan", "Vanuatu",
		    "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
		};
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo Swing + Git");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		// Pestañas -----------------------------------------------------------
		JTabbedPane panelTabs = new JTabbedPane();
		add(panelTabs, BorderLayout.CENTER);
		
		JPanel datosPersonales = new JPanel();
		datosPersonales.setLayout(new BoxLayout(datosPersonales, BoxLayout.Y_AXIS));
		panelTabs.addTab("Datos Personales", datosPersonales);
		
		JPanel informacion = new JPanel();
		panelTabs.addTab("Información", informacion);
		
		JPanel comentarios = new JPanel(new BorderLayout());
		panelTabs.addTab("Comentarios", comentarios);
		// -------------------------------------------------------------------
		
		// Datos personales ----------------------------------------------------------------		
		JPanel informacionPersonal = new JPanel(new GridLayout(2, 2));
		TitledBorder tituloInformacionPersonal = BorderFactory.createTitledBorder("Información personal");
		informacionPersonal.setBorder(tituloInformacionPersonal);
		
		// Nombre
		JLabel labelNombre = new JLabel("Nombre:");
		informacionPersonal.add(labelNombre);
		JTextField nombre = new JTextField(15);
		informacionPersonal.add(nombre);
		
		
		// Email
		JLabel labelEmail = new JLabel("Email:");
		informacionPersonal.add(labelEmail);
		JTextField email = new JTextField(15);
		informacionPersonal.add(email);
		
		datosPersonales.add(informacionPersonal);
		
		JPanel informacionAdicional = new JPanel();
		informacionAdicional.setLayout(new BoxLayout(informacionAdicional, BoxLayout.Y_AXIS)); // uno debajo del otro
		TitledBorder tituloInformacionAdicional = BorderFactory.createTitledBorder("Información adicional");
		informacionAdicional.setBorder(tituloInformacionAdicional);
		
		// Teléfono
		JPanel filaTelefono = new JPanel(new FlowLayout());
		filaTelefono.add(new JLabel("Teléfono:"));
		JTextField telefono = new JTextField(15);
		filaTelefono.add(telefono);
		informacionAdicional.add(filaTelefono);

		// Dirección
		JPanel filaDireccion = new JPanel(new FlowLayout());
		filaDireccion.add(new JLabel("Dirección:"));
		JTextField direccion = new JTextField(15);
		filaDireccion.add(direccion);
		informacionAdicional.add(filaDireccion);

		// Ciudad
		JPanel filaCiudad = new JPanel(new FlowLayout());
		filaCiudad.add(new JLabel("Ciudad:"));
		JTextField ciudad = new JTextField(15);
		filaCiudad.add(ciudad);
		informacionAdicional.add(filaCiudad);

		// País (JComboBox)
		JPanel filaPais = new JPanel(new FlowLayout());
		filaPais.add(new JLabel("País:"));
		JComboBox<String> pais = new JComboBox<>();
		
		for (int i = 0; i < paises.length; i++) {
			pais.addItem(paises[i]);
		}
		
		filaPais.add(pais);
		informacionAdicional.add(filaPais);
		
		datosPersonales.add(informacionAdicional);
		
		// Genero
		JPanel genero = new JPanel();
		TitledBorder tituloGenero = BorderFactory.createTitledBorder("Genero");
		genero.setBorder(tituloGenero);
		
		JRadioButton botonHombre = new JRadioButton("Hombre");
		JRadioButton botonMujer = new JRadioButton("Mujer");
		
		ButtonGroup botonesGenero = new ButtonGroup();
		botonesGenero.add(botonMujer);
		botonesGenero.add(botonHombre);
		
		genero.add(botonHombre);
		genero.add(botonMujer);
		
		datosPersonales.add(genero);
		
		
		// ------------------------------------------------------------------------
		
		// Preferencias -----------------------------------------------------------
		//--------------------------------------------------------------------------
		
		// Comentarios -------------------------------------------------------------
		
		comentarios.add(new JLabel("Comentarios adicionales:"), BorderLayout.NORTH);
		
		JPanel panelTexto = new JPanel();
		TitledBorder bordeTexto = BorderFactory.createTitledBorder("Área de texto");
		panelTexto.setBorder(bordeTexto);
		
		JTextArea texto = new JTextArea(15 ,40);
		panelTexto.add(texto);
		
		comentarios.add(panelTexto, BorderLayout.CENTER);
		
		// -------------------------------------------------------------------------
		
		// Botones inferiores ---------------------------------------------------
				JPanel botones = new JPanel(new FlowLayout());
				JButton mostrarDatos = new JButton("Mostrar Datos");
				JButton limpiar = new JButton("Limpiar");
				JButton salir = new JButton("Salir");
				
				// Boton Mostrar Datos
				mostrarDatos.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Mostrar en una ventana emergente todos los datos introducidos
						
					}
					
				});
				
				// Boton Limpiar
				limpiar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Deja con un string vacío todos los JTextFields
						nombre.setText("");
						email.setText("");
						telefono.setText("");
						direccion.setText("");
						ciudad.setText("");
						
					}
					
				});
				
				// Boton Salir
				salir.addActionListener(new ActionListener () {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Cierra el programa
						System.exit(0);
					}
					
				});
				
				botones.add(mostrarDatos);
				botones.add(limpiar);
				botones.add(salir);
				
				add(botones, BorderLayout.SOUTH);
				// ----------------------------------------------------------------------
		
		// Menu --------------------------------------------------------------------
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
		// ---------------------------------------------------------------------------
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new VentanaSwingGit();
	}

}
