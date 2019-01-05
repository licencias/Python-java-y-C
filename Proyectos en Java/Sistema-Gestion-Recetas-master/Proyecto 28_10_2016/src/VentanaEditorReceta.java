import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.event.KeyAdapter;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class VentanaEditorReceta extends JFrame  
{
	private JPanel contentPane;
	private JTextField nombreReceta;
	private JTextField tiempoEstimado;
	private int tamMinNombre= 3;
	private int tamMaxNombre = 100;
	private DefaultListModel<String> ingredientes,categorias,utensilios;
	private JTextField txtIngrediente;
	private JTextField txtUtensilio;
	private JTextField txtCategoria;
	
/*||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  												CONSTRUCTOR CREAR RECETA
 */
	/**
	 * @wbp.parser.constructor
	 */
	public VentanaEditorReceta(final Alumno alumno,final VentanaRecetasAlumno ventanaAnterior) 
	{																					
		final Receta receta = new Receta();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 15, 1000, 675);
		setResizable(false);
		setTitle("Receta Nueva");
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a la creacion de tu receta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 38, 394, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("No olvides ser ordenado, escribir correctamente y coherente");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 60, 468, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAsiLosDemas = new JLabel("asi los demas puedan ocupar tu receta sin problemas");
		lblAsiLosDemas.setForeground(new Color(255, 255, 255));
		lblAsiLosDemas.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAsiLosDemas.setBounds(10, 82, 394, 14);
		contentPane.add(lblAsiLosDemas);
		
		JLabel lblSeCreativo = new JLabel("SE CREATIVO!!");
		lblSeCreativo.setForeground(new Color(255, 255, 255));
		lblSeCreativo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSeCreativo.setBounds(10, 107, 152, 14);
		contentPane.add(lblSeCreativo);
		
		final JLabel lblVernombre = new JLabel("");
		lblVernombre.setBounds(682, 13, 46, 14);
		contentPane.add(lblVernombre);
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//NOMBRE RECETA
		
		JLabel lblNombreReceta = new JLabel("NOMBRE RECETA"); 			
		lblNombreReceta.setForeground(new Color(255, 255, 255));
		lblNombreReceta.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNombreReceta.setBounds(256, 13, 113, 14);
		contentPane.add(lblNombreReceta);
		
		nombreReceta = new JTextField();
		nombreReceta.setBounds(356, 8, 320, 25);
		contentPane.add(nombreReceta);
		nombreReceta.setColumns(10);
		
		
		
		
		
		//validacion de que el nombre de la receta no se pase del tama�o maximo
		nombreReceta.addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				soloLetras(e);
				validar(e);
				if (nombreReceta.getText().length() == tamMaxNombre)
					e.consume();
			}
			public void keyPressed(KeyEvent e){
				if(nombreReceta.getText().length() <= tamMaxNombre && nombreReceta.getText().length() > tamMinNombre){
					nombreReceta.setBackground(Color.green);
					lblVernombre.setText("\u2713");
				}
			}
			public void keyReleased(KeyEvent e)
			{
				if(nombreReceta.getText().length() <= tamMinNombre){
					nombreReceta.setBackground(Color.red);
					lblVernombre.setText("\u2717");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//TIEMPO ESTIMADO PREPARACI�N
		
		JLabel lblNewLabel_2 = new JLabel("TIEMPO ESTIMADO");	
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 150, 113, 14);
		contentPane.add(lblNewLabel_2);
		
		final JLabel lblVerifTiempoEst = new JLabel();
		lblVerifTiempoEst.setBounds(177, 150, 46, 14);
		contentPane.add(lblVerifTiempoEst);
		
		tiempoEstimado = new JTextField();
		tiempoEstimado.setBounds(118, 145, 56, 25);
		contentPane.add(tiempoEstimado);
		tiempoEstimado.setColumns(10);
		
		
		
		
		
		//validacion del tiempo estimado 
		tiempoEstimado.addKeyListener(new KeyListener()
		{	//no puede tener mas de 3 digitos
			int tamanoTiempoEst = 3;
			public void keyTyped(KeyEvent e)
			{
				soloNumeros(e);
				if (tiempoEstimado.getText().length() == tamanoTiempoEst)
					e.consume();
			}
			public void keyPressed(KeyEvent e){
				if(tiempoEstimado.getText().length() <= tamanoTiempoEst && !(tiempoEstimado.getText().isEmpty())){
					tiempoEstimado.setBackground(Color.green);
					lblVerifTiempoEst.setText("\u2713");
				}
			}
			public void keyReleased(KeyEvent e)
			{
				if(tiempoEstimado.getText().length() == 0){
					tiempoEstimado.setBackground(Color.red);
					lblVerifTiempoEst.setText("\u2717");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//INSTRUCCIONES
		
		JPanel panel_instrucciones = new JPanel();				
		panel_instrucciones.setBackground(new Color(0, 153, 255));
		panel_instrucciones.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "INSTRUCCIONES", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", Font.PLAIN, 14), new Color(255, 255, 255)));
		panel_instrucciones.setBounds(10, 235, 666, 353);
		contentPane.add(panel_instrucciones);
		panel_instrucciones.setLayout(new GridLayout());
		
		final JTextArea instrucciones = new JTextArea();
		panel_instrucciones.add(instrucciones);
		
		
		
		
		
		
		//validacion de que las instrucciones no tengan mas de 800 caracteres
		instrucciones.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{	validar(x);
				if(instrucciones.getText().length() == 800)
					x.consume();
			}
		});
		instrucciones.setLineWrap(true);   		//Limitar caracteres dentro del JTextArea
		instrucciones.setWrapStyleWord(true);
		
		JScrollPane scroll_instrucciones = new JScrollPane(instrucciones);
		panel_instrucciones.add(scroll_instrucciones);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------	
		//INGREDIENTES
		
		ingredientes = new DefaultListModel<String>();
		JPanel panel_ingredientes = new JPanel();				
		panel_ingredientes.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_ingredientes.setBackground(new Color(0, 153, 255));
		panel_ingredientes.setBounds(730, 45, 113, 161);
		contentPane.add(panel_ingredientes);
		panel_ingredientes.setLayout(new GridLayout());
		
		txtIngrediente = new JTextField();
		txtIngrediente.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtIngrediente.setBounds(853, 48, 131, 25);
		contentPane.add(txtIngrediente);
		txtIngrediente.setColumns(10);
		
		final JList<String> lista_ing = new JList<String>();
		lista_ing.setModel(ingredientes);
		panel_ingredientes.add(lista_ing);
		
		JScrollPane scroll_ingredientes = new JScrollPane(lista_ing);
		panel_ingredientes.add(scroll_ingredientes);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//validacion de que el largo del ingrediente no sea mas de 50 caracteres
		txtIngrediente.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{	validar(x);
				if(txtIngrediente.getText().length() == 50)
					x.consume();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton agregar ingrediente
		JButton btnAgregarIng = new JButton("Agregar");
		btnAgregarIng.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAgregarIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(!txtIngrediente.getText().isEmpty())
				{
				
					ingredientes.addElement(txtIngrediente.getText());
					txtIngrediente.setText("");
				}
			}
		});
		btnAgregarIng.setBounds(853, 79, 131, 23);
		contentPane.add(btnAgregarIng);
		
		
		
		
		
		
		
		
		
		
		
		
		//boton eliminar ingrediente
		final JButton btnEliminarIng = new JButton("Eliminar");
		btnEliminarIng.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEliminarIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(lista_ing.getSelectedIndex() != -1)
				{
					ingredientes.remove(lista_ing.getSelectedIndex());
				}
				if(ingredientes.isEmpty())
					btnEliminarIng.setEnabled(false);
			}
		});
		btnEliminarIng.setBounds(853, 104, 131, 23);
		contentPane.add(btnEliminarIng);
			
		JLabel lblIngredientes = new JLabel("INGREDIENTES");
		lblIngredientes.setForeground(new Color(255, 255, 255));
		lblIngredientes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblIngredientes.setBounds(748, 27, 129, 14);
		contentPane.add(lblIngredientes);
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------		
		//UTENSILIOS
		
		utensilios = new DefaultListModel<String>();
		JPanel panel_utensilios = new JPanel();					
		panel_utensilios.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_utensilios.setBackground(new Color(0, 153, 255));
		panel_utensilios.setBounds(730, 235, 113, 161);
		contentPane.add(panel_utensilios);
		panel_utensilios.setLayout(new GridLayout());
		
		txtUtensilio = new JTextField();
		txtUtensilio.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtUtensilio.setBounds(853, 235, 131, 25);
		contentPane.add(txtUtensilio);
		txtUtensilio.setColumns(10);
		
		final JList<String> lista_uten = new JList<String>();
		lista_uten.setModel(utensilios);
		panel_utensilios.add(lista_uten);
		
		JScrollPane scroll_utensilios = new JScrollPane(lista_uten);
		panel_utensilios.add(scroll_utensilios);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//validacion de que el largo del utensilio no sea mas de 50 caracteres
		txtUtensilio.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{	validar(x);
				if(txtUtensilio.getText().length() == 50)
					x.consume();
			}
		});
		
		
		
		
		
		
		
		
		
		
		//boton agregar utensilio
		JButton btnAgregarUten = new JButton("Agregar");
		btnAgregarUten.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAgregarUten.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(!txtUtensilio.getText().isEmpty())
				{
					utensilios.addElement(txtUtensilio.getText());
					txtUtensilio.setText("");
				}
			}
		});
		btnAgregarUten.setBounds(853, 266, 131, 23);
		contentPane.add(btnAgregarUten);
		
		
		
		
		
		
		
		
		
		
		//boton eliminar utensilio
		final JButton btnEliminarUten = new JButton("Eliminar");
		btnEliminarUten.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEliminarUten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(lista_uten.getSelectedIndex()!=-1)
				{
					utensilios.remove(lista_uten.getSelectedIndex());
				}
				if(utensilios.isEmpty())
				{
					btnEliminarUten.setEnabled(false);
				}
			}
		});
		btnEliminarUten.setBounds(853, 290, 131, 23);
		contentPane.add(btnEliminarUten);	
		
		JLabel lblUtensilios = new JLabel("UTENSILIOS");
		lblUtensilios.setForeground(new Color(255, 255, 255));
		lblUtensilios.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblUtensilios.setBounds(757, 217, 86, 14);
		contentPane.add(lblUtensilios);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------		
		//CATEGORIAS
		
		categorias = new DefaultListModel<String>();
		JPanel panel_categorias = new JPanel();						
		panel_categorias.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_categorias.setBackground(new Color(0, 153, 255));
		panel_categorias.setBounds(730, 424, 113, 161);
		contentPane.add(panel_categorias);
		panel_categorias.setLayout(new GridLayout());
		
		txtCategoria = new JTextField();
		txtCategoria.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtCategoria.setBounds(853, 424, 131, 25);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		final JList<String> lista_categ = new JList<String>();
		lista_categ.setModel(categorias);
		panel_categorias.add(lista_categ);
		
		JScrollPane scroll_categorias = new JScrollPane(lista_categ);
		panel_categorias.setBounds(730, 424, 113, 161);
		panel_categorias.add(scroll_categorias);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//validacion de que la categoria no tenga mas de 50 caracteres
		txtCategoria.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{	validar(x);
				if(txtCategoria.getText().length() == 50)
					x.consume();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		//boton de agregar categoria
		JButton btnAgregarCateg = new JButton("Agregar");
		btnAgregarCateg.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAgregarCateg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(!txtCategoria.getText().isEmpty())
				{
					categorias.addElement(txtCategoria.getText());
					txtCategoria.setText("");
				}
			}
		});
		btnAgregarCateg.setBounds(853, 455, 131, 23);
		contentPane.add(btnAgregarCateg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton de eliminar categoria
		final JButton btnEliminarCateg = new JButton("Eliminar");
		btnEliminarCateg.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEliminarCateg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(lista_categ.getSelectedIndex()!=-1)
				{
					btnEliminarCateg.setEnabled(true);
					categorias.remove(lista_categ.getSelectedIndex());
				}
				if(categorias.isEmpty())
					btnEliminarCateg.setEnabled(false);
			}
		});
		btnEliminarCateg.setBounds(853, 480, 131, 23);
		contentPane.add(btnEliminarCateg);
		
		JLabel lblCategorias = new JLabel("CATEGORIAS");
		lblCategorias.setForeground(new Color(255, 255, 255));
		lblCategorias.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblCategorias.setBounds(748, 407, 99, 14);
		contentPane.add(lblCategorias);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//BOTON CANCELAR
		
		//vuelve a la ventana anterior sin ningun cambio
		JButton btnCancelar = new JButton("Cancelar");	
		btnCancelar.setBounds(20, 602, 120, 33);
		btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnCancelar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)  
			{
				dispose();
				ventanaAnterior.setVisible(true);	
			}
			
		});
		btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		contentPane.add(btnCancelar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//BOTON FINALIZAR
		
		
		
		//al presionar finalizar se agregan todos los datos llenados a la receta
		JButton btnFinalizar = new JButton("Finalizar"); 		
		btnFinalizar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnFinalizar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 	
			{
				//verifica que el nombre de la receta tenga el tama�o necesario y que no exista
				if(nombreReceta.getText().length() < tamMinNombre)
				{
					JOptionPane.showMessageDialog(VentanaEditorReceta.this,
							"el nombre es muy peque�o","Error",0);
				}
				else
				{
					if(alumno.getListaRecetas().existe(nombreReceta.getText()))
						JOptionPane.showMessageDialog(VentanaEditorReceta.this,
							"Ingres� mal el nombre de la receta o ya existe","Error",0);
					else
					{
						receta.setNombreReceta(nombreReceta.getText());
						receta.setIngredientes(casteo(ingredientes));
						receta.setInstrucciones(instrucciones.getText());
						receta.setTiempoEstimadoPreparacion(Integer.parseInt(tiempoEstimado.getText()));
						receta.setUtensilios(casteo(utensilios));
						receta.setCategorias(casteo(categorias));
						receta.setAutor(alumno);
						receta.crearVentana();
						
						int reply = JOptionPane.showConfirmDialog(null, "�Esta seguro?", "Confirmacion", JOptionPane.YES_NO_OPTION);
					    
						
						//si presiona que si se agrega la receta al ArrayList de recetas
						if (reply == JOptionPane.YES_OPTION)	
					    {
							//se muestra la ventanaPrincipal de la receta
							Archivos archivo = new Archivos();
					    	receta.getVentanaPrincipal().setVisible(true);	
					    	setVisible(false);
					    	receta.getVentanaPrincipal().mostrarVentana(ventanaAnterior,alumno);
					    	alumno.getListaRecetas().agregarReceta(receta);					
					    	ventanaAnterior.actualizar(alumno.getListaRecetas());				    	
					    	
					    	//se guarda la receta en el txt
					    	try {						
					    		archivo.actualizarDatosReceta(alumno,receta);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
					    	dispose();
					    }
					}
				}	
			}
		});
		btnFinalizar.setBounds(853, 602, 120, 33);
		contentPane.add(btnFinalizar);
		
	} //FIN DEL CONTRUCTOR

	
	
	
	
	
	

	
	
	
	
/*
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  												CONTRUCTOR MODIFICAR RECETA
 */
	public VentanaEditorReceta(final Receta receta,final Alumno alumno,final VentanaRecetasAlumno ventanaAnterior)
	{
		final Receta recetaClon=receta.getClonReceta();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 15, 1000, 675);
		setResizable(false);
		setTitle("Modificando "+ recetaClon.getNombreReceta());
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a la creacion de tu receta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 38, 394, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("No olvides ser ordenado, escribir correctamente y coherente");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 60, 468, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAsiLosDemas = new JLabel("asi los demas puedan ocupar tu receta sin problemas");
		lblAsiLosDemas.setForeground(new Color(255, 255, 255));
		lblAsiLosDemas.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAsiLosDemas.setBounds(10, 82, 394, 14);
		contentPane.add(lblAsiLosDemas);
		
		JLabel lblSeCreativo = new JLabel("SE CREATIVO!!");
		lblSeCreativo.setForeground(new Color(255, 255, 255));
		lblSeCreativo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSeCreativo.setBounds(10, 107, 152, 14);
		contentPane.add(lblSeCreativo);
		
		final JLabel lblVernombre = new JLabel("");
		lblVernombre.setBounds(682, 13, 46, 14);
		contentPane.add(lblVernombre);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//NOMBRE RECETA
		
		JLabel lblNombreReceta = new JLabel("NOMBRE RECETA"); 							
		lblNombreReceta.setForeground(new Color(255, 255, 255));
		lblNombreReceta.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNombreReceta.setBounds(256, 13, 113, 14);
		contentPane.add(lblNombreReceta);
		
		nombreReceta = new JTextField(recetaClon.getNombreReceta());
		nombreReceta.setBounds(356, 8, 320, 25);
		contentPane.add(nombreReceta);
		nombreReceta.setColumns(10);
		
		
		
		
		
		//validacion de que el nombre de la receta no se pase del tama�o maximo
		nombreReceta.addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				soloLetras(e);
				if (nombreReceta.getText().length() == tamMaxNombre)
					e.consume();
			}
			public void keyPressed(KeyEvent e){
				if(nombreReceta.getText().length() <= tamMaxNombre && nombreReceta.getText().length() > tamMinNombre){
					nombreReceta.setBackground(Color.green);
					lblVernombre.setText("\u2713");
				}
			}
			public void keyReleased(KeyEvent e)
			{
				if(nombreReceta.getText().length() <= tamMinNombre){
					nombreReceta.setBackground(Color.red);
					lblVernombre.setText("\u2717");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//TIEMPO ESTIMADO PREPARACI�N
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo estimado");			
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 150, 113, 14);
		contentPane.add(lblNewLabel_2);
		
		final JLabel lblVerifTiempoEst = new JLabel();
		lblVerifTiempoEst.setBounds(177, 150, 46, 14);
		contentPane.add(lblVerifTiempoEst);
		
		tiempoEstimado = new JTextField(String.valueOf(recetaClon.getTiempoEstimadoPreparacion()));
		tiempoEstimado.setBounds(118, 145, 56, 25);
		contentPane.add(tiempoEstimado);
		tiempoEstimado.setColumns(10);
		
		
		
		
		
		
		
		
		//validacion del tiempo estimado
		tiempoEstimado.addKeyListener(new KeyListener()
		{	
			//tama�o maximo 3 digitos
			int tamanoTiempoEst = 3;
			public void keyTyped(KeyEvent e)
			{
				soloNumeros(e);
				if (tiempoEstimado.getText().length() == tamanoTiempoEst)
					e.consume();
			}
			public void keyPressed(KeyEvent e){
				if(tiempoEstimado.getText().length() <= tamanoTiempoEst && !(tiempoEstimado.getText().isEmpty())){
					tiempoEstimado.setBackground(Color.green);
					lblVerifTiempoEst.setText("\u2713");
				}
			}
			public void keyReleased(KeyEvent e)
			{
				if(tiempoEstimado.getText().length() == 0){
					tiempoEstimado.setBackground(Color.red);
					lblVerifTiempoEst.setText("\u2717");
				}
			}
		});
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//INSTRUCCIONES
		
		JPanel panel_instrucciones = new JPanel();								
		panel_instrucciones.setBackground(new Color(0, 153, 255));
		panel_instrucciones.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "INSTRUCCIONES", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", Font.PLAIN, 14), new Color(255, 255, 255)));
		panel_instrucciones.setBounds(10, 235, 666, 353);
		contentPane.add(panel_instrucciones);
		panel_instrucciones.setLayout(new GridLayout());
		
		final JTextArea instrucciones = new JTextArea(recetaClon.getInstrucciones());							
		panel_instrucciones.add(instrucciones);
		
		
		
		
		
		//validacion de que las instrucciones no tengan mas de 800 caracteres
		instrucciones.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{
				validar(x);
				if(instrucciones.getText().length() == 800)
					x.consume();
			}
		});
		instrucciones.setLineWrap(true);   		//Limitar caracteres dentro del JTextArea
		instrucciones.setWrapStyleWord(true);
		
		JScrollPane scroll_instrucciones = new JScrollPane(instrucciones);
		panel_instrucciones.add(scroll_instrucciones);
		

		

		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------	
		//INGREDIENTES
		
		ingredientes = casteoAlReves(recetaClon.getIngredientes());
		JPanel panel_ingredientes = new JPanel();				
		panel_ingredientes.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_ingredientes.setBackground(new Color(0, 153, 255));
		panel_ingredientes.setBounds(730, 45, 113, 161);
		contentPane.add(panel_ingredientes);
		panel_ingredientes.setLayout(new GridLayout());
		
		txtIngrediente = new JTextField();
		txtIngrediente.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtIngrediente.setBounds(853, 48, 131, 25);
		contentPane.add(txtIngrediente);
		txtIngrediente.setColumns(10);
		
		final JList<String> lista_ing = new JList<String>();
		lista_ing.setModel(ingredientes);
		panel_ingredientes.add(lista_ing);
		
		
		
		
		
		//validacion de que el largo del ingrediente no sea mas de 50 caracteres
				txtIngrediente.addKeyListener(new KeyAdapter() 
				{
					@Override
					public void keyTyped(KeyEvent x) 
					{	validar(x);
						if(txtIngrediente.getText().length() == 50)
							x.consume();
					}
				});
					
		
		
				
				
				
				
				
				
				
				
				
		
				
				
		
		//boton agregar ingrediente
		JButton btnAgregarIng = new JButton("Agregar");
		btnAgregarIng.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAgregarIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(!txtIngrediente.getText().isEmpty())
				{
				
					ingredientes.addElement(txtIngrediente.getText());
					txtIngrediente.setText("");
				}
			}
		});
		btnAgregarIng.setBounds(853, 79, 131, 23);
		contentPane.add(btnAgregarIng);
		
		JScrollPane scroll_ingredientes = new JScrollPane(lista_ing);
		panel_ingredientes.add(scroll_ingredientes);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton eliminar ingrediente
		final JButton btnEliminarIng = new JButton("Eliminar");
		btnEliminarIng.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEliminarIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(lista_ing.getSelectedIndex() != -1)
				{
					ingredientes.remove(lista_ing.getSelectedIndex());
				}
			}
		});
		btnEliminarIng.setBounds(853, 114, 131, 23);
		contentPane.add(btnEliminarIng);
			
		JLabel lblIngredientes = new JLabel("Ingredientes");
		lblIngredientes.setForeground(new Color(255, 255, 255));
		lblIngredientes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblIngredientes.setBounds(748, 27, 129, 14);
		contentPane.add(lblIngredientes);
		
//-------------------------------------------------------------------------------------------------------------------------------------		
		//UTENSILIOS
		
		utensilios = casteoAlReves(recetaClon.getUtensilios());
		JPanel panel_utensilios = new JPanel();		
		panel_utensilios.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_utensilios.setBackground(new Color(0, 153, 255));
		panel_utensilios.setBounds(730, 235, 113, 161);
		contentPane.add(panel_utensilios);
		panel_utensilios.setLayout(new GridLayout());
		
		txtUtensilio = new JTextField();
		txtUtensilio.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtUtensilio.setBounds(853, 235, 131, 25);
		contentPane.add(txtUtensilio);
		txtUtensilio.setColumns(10);
		
		final JList<String> lista_uten = new JList<String>();
		lista_uten.setModel(utensilios);
		panel_utensilios.add(lista_uten);
		
		JScrollPane scroll_utensilios = new JScrollPane(lista_uten);
		panel_utensilios.add(scroll_utensilios);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//validacion de que el largo del utensilio no sea mas de 50 caracteres
		txtUtensilio.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{	validar(x);
				if(txtUtensilio.getText().length() == 50)
					x.consume();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton agregar utensilio
		JButton btnAgregarUten = new JButton("Agregar");
		btnAgregarUten.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAgregarUten.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(!txtUtensilio.getText().isEmpty())
				{
					utensilios.addElement(txtUtensilio.getText());
					txtUtensilio.setText("");
				}
			}
		});
		btnAgregarUten.setBounds(853, 266, 131, 23);
		contentPane.add(btnAgregarUten);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton eliminar utensilio
		final JButton btnEliminarUten = new JButton("Eliminar");
		btnEliminarUten.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEliminarUten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(lista_uten.getSelectedIndex()!=-1)
				{
					utensilios.remove(lista_uten.getSelectedIndex());
				}
			}
		});
		btnEliminarUten.setBounds(853, 300, 131, 23);
		contentPane.add(btnEliminarUten);	
		
		JLabel lblUtensilios = new JLabel("Utensilios");
		lblUtensilios.setForeground(new Color(255, 255, 255));
		lblUtensilios.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblUtensilios.setBounds(753, 217, 86, 14);
		contentPane.add(lblUtensilios);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------		
		//CATEGORIAS
		
		categorias = casteoAlReves(recetaClon.getCategorias());
		JPanel panel_categorias = new JPanel();			
		panel_categorias.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_categorias.setBackground(new Color(0, 153, 255));
		panel_categorias.setBounds(730, 424, 113, 161);
		contentPane.add(panel_categorias);
		panel_categorias.setLayout(new GridLayout());
		
		txtCategoria = new JTextField();
		txtCategoria.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtCategoria.setBounds(853, 424, 131, 25);
		txtCategoria.setColumns(10);
		
		final JList<String> lista_categ = new JList<String>();
		lista_categ.setModel(categorias);
		panel_categorias.add(lista_categ);
		
		JScrollPane scroll_categorias = new JScrollPane(lista_categ);
		panel_categorias.add(scroll_categorias);
		

		
		
		
		
		
		
		
		
		
		
		
		//validacion de que la categoria no tenga mas de 50 caracteres
		txtCategoria.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent x) 
			{	validar(x);
				if(txtCategoria.getText().length() == 50)
					x.consume();
			}
		});
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton agregar categoria
		JButton btnAgregarCateg = new JButton("Agregar");		
		btnAgregarCateg.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnAgregarCateg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(!txtCategoria.getText().isEmpty())
				{
					categorias.addElement(txtCategoria.getText());
					txtCategoria.setText("");
				}
			}
		});
		btnAgregarCateg.setBounds(853, 455, 131, 23);
		contentPane.add(btnAgregarCateg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boton eliminar categoria
		final JButton btnEliminarCateg = new JButton("Eliminar");
		btnEliminarCateg.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEliminarCateg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(lista_categ.getSelectedIndex()!=-1)
				{
					btnEliminarCateg.setEnabled(true);
					categorias.remove(lista_categ.getSelectedIndex());
				}
			}
		});
		btnEliminarCateg.setBounds(853, 489, 131, 23);
		contentPane.add(btnEliminarCateg);
		
		JLabel lblCategorias = new JLabel("Categorias");
		lblCategorias.setForeground(new Color(255, 255, 255));
		lblCategorias.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblCategorias.setBounds(748, 407, 99, 14);
		contentPane.add(lblCategorias);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//BOTON CANCELAR
		
		//devuelve a la ventana anterior
		JButton btnCancelar = new JButton("Cancelar");	
		btnCancelar.setBounds(20, 602, 120, 33);
		btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnCancelar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				dispose();
				ventanaAnterior.setVisible(true);
			}
			
		});
		btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		contentPane.add(btnCancelar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------------------
		//BOTON FINALIZAR
		
		//al presionar finalizar se agregan todos los datos llenados a la receta
		JButton btnFinalizar = new JButton("Finalizar"); 	
		btnFinalizar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnFinalizar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//verifica que el nombre de la receta tenga el tama�o necesario y que no exista
				if(nombreReceta.getText().length() < tamMinNombre 
						&& alumno.getListaRecetas().existe(nombreReceta.getText()))
					JOptionPane.showMessageDialog(VentanaEditorReceta.this,"Ingres� mal el nombre de la receta o ya existe","Error",0);
				else
				{
					

					int reply = JOptionPane.showConfirmDialog(null, "�Esta seguro?", "Confirmacion", JOptionPane.YES_NO_OPTION);
				    if (reply == JOptionPane.YES_OPTION)	
				    {
				    	//modifica la receta original
				    	if(alumno.getListaRecetas().modificarReceta(recetaClon))
				    	{	
				    		dispose();
				    		receta.getVentanaPrincipal().mostrarVentana(ventanaAnterior,alumno);
				    	}
				    	else
				    		JOptionPane.showMessageDialog(VentanaEditorReceta.this,"No se pudo modificar la receta","Error",0);
				    }
				}
			}

		});
		btnFinalizar.setBounds(853, 602, 120, 33);
		contentPane.add(btnFinalizar);
		
	}//FIN DEL CONTRUCTOR
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void soloLetras(KeyEvent letra){		//solo deja escribir letras
		char c=letra.getKeyChar(); 
	       
		if(Character.isDigit(c)) { 
			getToolkit().beep(); 
	        letra.consume(); 
	    }
	}
	
	
	
	
	
	
	public void validar(KeyEvent letra)			//no deja escribir el caracter |
	{
		char c=letra.getKeyChar();
		if(c=='|')
		{
			getToolkit().beep(); 
	        letra.consume();
		}
	}
	
	
	
	
	public void soloNumeros(KeyEvent letra) 	//solo deja escribir numeros
	{ 
	    char c=letra.getKeyChar();     
	    
	    if(!Character.isDigit(c)) { 
	    	getToolkit().beep(); 
	    	letra.consume();  
	    } 
	 
	}
	
	
	
	
	public String[] casteo(DefaultListModel<String> listaEntrada) //convierte de DefaultListModel a String[]
	{
		String[] listaFinal= new String[listaEntrada.getSize()];
		int i;
		for(i=0;i<listaEntrada.getSize();i++)
		{
			listaFinal[i]=((String)listaEntrada.getElementAt(i));
		}
		return listaFinal;
	}
	
	
	
	
	public DefaultListModel<String> casteoAlReves(String[] listaEntrada) //convierte de String[] a DefaultListModel
	{
		DefaultListModel<String> listaFinal= new DefaultListModel<String>();
		int i;
		for(i=0;i<listaEntrada.length;i++)
		{
			listaFinal.addElement(listaEntrada[i]);
		}
		return listaFinal;
	}
		
}
