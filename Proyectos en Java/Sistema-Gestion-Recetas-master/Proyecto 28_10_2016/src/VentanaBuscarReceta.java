import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class VentanaBuscarReceta extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtNombreReceta;
	private DefaultListModel<Receta> recetas;
	
	
	
	
	
	
	
	

	//ventana para la busqueda de recetas de todos los alumnos
	public VentanaBuscarReceta(final ArrayList<Receta> arrayReceta, final VentanaAlumno ventanaUsuario,final Alumno usuario) 
	{											
		recetas = new DefaultListModel<Receta>();
		setResizable(false);
		setTitle("Busqueda de Receta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		
//----------------------------------------------------------------------------------------------------------------------------
		//LISTA DE RECETAS ENCONTRADAS
		
		JPanel panelMostrarRecetas = new JPanel();		
		panelMostrarRecetas.setBackground(new Color(0, 153, 255));
		panelMostrarRecetas.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelMostrarRecetas.setBounds(15, 60, 500, 290);
		contentPane.add(panelMostrarRecetas);
		panelMostrarRecetas.setLayout(new GridLayout());
		
		final JList<Receta> listaRecetas = new JList<Receta>();
		listaRecetas.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		listaRecetas.setModel(recetas);
		panelMostrarRecetas.add(listaRecetas);
		
		JScrollPane scrollRecetas = new JScrollPane(listaRecetas);
		panelMostrarRecetas.add(scrollRecetas);
		
		
		
		
		
		
		
//-------------------------------------------------------------------------------------------------------------------------
		//FILTRO
		
		final JCheckBox checkFiltro = new JCheckBox("");	
		checkFiltro.setBackground(new Color(0, 153, 255));
		checkFiltro.setBounds(535, 18, 26, 23);
		contentPane.add(checkFiltro);
		checkFiltro.setSelected(false);
		
		final Receta recetaBuscada = new Receta();
		
		
		
		
		
		
		
		
		
		
		
//--------------------------------------------------------------------------------------------------------------------------
		//BOTON BUSCAR RECETAS
		
		JButton btnBuscar = new JButton("Buscar");			
		btnBuscar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(!txtNombreReceta.getText().isEmpty() && !txtNombreReceta.getText().equals(""))
				{
					String nombreRecetaBuscada = txtNombreReceta.getText();
					int cont;
					recetas.removeAllElements(); //se parte con la lista de recetas vacias
					if(checkFiltro.isSelected())
					{					//si se selecciono el ticket filtro se compara cada elemento de la busqueda con la receta del filtro
						for(int i=0;i<arrayReceta.size();i++)
						{
							cont=0;
							if(!String.valueOf(recetaBuscada.getTiempoEstimadoPreparacion()).isEmpty() && !String.valueOf(recetaBuscada.getTiempoEstimadoPreparacion()).equals(""))
							{
								if(arrayReceta.get(i).getTiempoEstimadoPreparacion() > recetaBuscada.getTiempoEstimadoPreparacion())
									cont++;
							}
							if(recetaBuscada.getAutor()!=null)
							{
								if((arrayReceta.get(i).getAutor().getNombrePersona().indexOf(recetaBuscada.getAutor().getNombrePersona())==-1))
									cont++;
							}
							if(recetaBuscada.getIngredientes()!=null)
							{
								if(!existenString(arrayReceta.get(i).getIngredientes(),recetaBuscada.getIngredientes()))
									cont++;
							}
							if(recetaBuscada.getUtensilios()!=null)
							{
								if(!existenString(arrayReceta.get(i).getUtensilios(),recetaBuscada.getIngredientes()))
									cont++;
							}
							if(recetaBuscada.getCategorias()!=null)
							{
								if(!existenString(arrayReceta.get(i).getCategorias(),recetaBuscada.getIngredientes()))
									cont++;
							}
							if(cont==0)
								recetas.addElement(arrayReceta.get(i)); //si paso el filtro se agrega a la lista
						}												
					}
					else
					{
						for(int i=0;i<arrayReceta.size();i++)
						{
							if(arrayReceta.get(i).getNombreReceta().indexOf(nombreRecetaBuscada)!=-1)
							{
								recetas.addElement(arrayReceta.get(i));
							}
						}
					}
				}
			}
		});
		btnBuscar.setBounds(525, 59, 84, 33);
		contentPane.add(btnBuscar);
		
		
		
		
		
		
		
		
//----------------------------------------------------------------------------------------------------------------------------
		//BOTON MOSTRAR
		
		JButton btnMostrar = new JButton("Mostrar");			
		btnMostrar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(listaRecetas.getSelectedIndex()!=-1)
				{					//muestra la ventanaPrincipal de la receta seleccionada
					((Receta)recetas.get(listaRecetas.getSelectedIndex())).getVentanaPrincipal().mostrarVentana(VentanaBuscarReceta.this,usuario);
					setVisible(false);
				}
			}
		});
		btnMostrar.setBounds(525, 94, 84, 33);
		contentPane.add(btnMostrar);
		
		
		
		
		
		
		
		
		
		
		
//----------------------------------------------------------------------------------------------------------------------------
		//BOTON ATRAS
		
		JButton btnAtras = new JButton("Atras");					
		btnAtras.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventanaUsuario.setVisible(true);				//se devuelve a la ventana anterior
				dispose();
			}
		});
		btnAtras.setBounds(525, 317, 84, 33);
		contentPane.add(btnAtras);
		
		JPanel panelBusqueda = new JPanel();
		panelBusqueda.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelBusqueda.setBackground(new Color(0, 153, 255));
		panelBusqueda.setBounds(46, 11, 527, 41);
		contentPane.add(panelBusqueda);
		panelBusqueda.setLayout(null);
		
		JLabel lblReceta = new JLabel("RECETA :");
		lblReceta.setBounds(20, 11, 63, 14);
		panelBusqueda.add(lblReceta);
		lblReceta.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblReceta.setForeground(new Color(255, 255, 255));
		
		txtNombreReceta = new JTextField();
		txtNombreReceta.setBounds(70, 6, 326, 28);
		panelBusqueda.add(txtNombreReceta);
		txtNombreReceta.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtNombreReceta.setColumns(10);
		JButton btnFiltro = new JButton("Filtro");											
		btnFiltro.setBounds(405, 7, 83, 23);
		panelBusqueda.add(btnFiltro);
		btnFiltro.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) //boton de filtro
			{
				VentanaFiltroRecetas ventanaFiltroRecetas = new VentanaFiltroRecetas(VentanaBuscarReceta.this,recetaBuscada);
				ventanaFiltroRecetas.setVisible(true);					//se envia una receta vacia
				setVisible(false);										//para que se llene con valores que el usuario desea
			}															//y posteriormente utilizar esos valores para filtrar
																		//la busqueda
		});
		
	
		
		
	}//FIN CONTRUCTOR
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//recibe una lista y verifica que si se repite un valor de una lista en la otra lista
	public boolean existenString(String[] listaAgregar,String[] listaIngredientes)
	{													
		int cont=0,contTotal=0;							
		for(int i=0;i<listaIngredientes.length;i++)
		{
			cont=0;
			for(int j=0;j<listaAgregar.length;j++)
			{
				if(listaAgregar[i].indexOf(listaIngredientes[j])!=-1)
				{
					cont++;
				}
				if(cont!=0)
					contTotal++;
			}
		}
		if(contTotal==listaIngredientes.length)
			return true;
		return false;
	}
}

