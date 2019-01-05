import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
 
public class VentanaDocente extends JFrame {
 
    private JPanel contentPane;
    
    
    public VentanaDocente(final Docente docente,final Universidad universidad) 
    {
    	
    	setTitle("Bienvenido "+docente.getNombrePersona());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 361, 350);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setResizable(false);
        setDefaultCloseOperation(0);
        contentPane.setLayout(null);
        
        
        JPanel panelDatosDocente = new JPanel();
        panelDatosDocente.setBackground(new Color(51, 153, 255));
        panelDatosDocente.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Bienvenido/a", TitledBorder.LEADING, TitledBorder.TOP,  new java.awt.Font("Century Gothic", Font.PLAIN, 12), new Color(255, 255, 255)));
        panelDatosDocente.setBounds(10, 11, 327, 145);
        contentPane.add(panelDatosDocente);
        panelDatosDocente.setLayout(null);
        
        
        
        
        
        
        
        
        
 //--------------------------------------------------------------------------------------------------------------------------
    	//BOTONES
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        //boton crear alumno
        JButton btnCrearAlumno = new JButton("Crear Alumno");
        btnCrearAlumno.setFont(new Font("Century Gothic", Font.PLAIN, 11));
        btnCrearAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(false);
                VentanaCrearUsuario ventanaCrearUsuario = new VentanaCrearUsuario (universidad,VentanaDocente.this,false);     
                ventanaCrearUsuario.setVisible(true);
            }
        });
        btnCrearAlumno.setBounds(12, 169, 151, 36);
        contentPane.add(btnCrearAlumno);
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //boton eliminar alumno
        JButton btnEliminarAlumno = new JButton("Eliminar Alumno");
        btnEliminarAlumno.setFont(new Font("Century Gothic", Font.PLAIN, 11));
        btnEliminarAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String rutAlumno = JOptionPane.showInputDialog(null,"Ingrese rut del alumno","Buscar alumno",JOptionPane.QUESTION_MESSAGE);
                if(rutAlumno != null){
                	if(!rutAlumno.equals("")){
                		if(universidad.getListaAlumnos().existe(rutAlumno))
                        {
                			
                            setVisible(false);
                            VentanaEliminarUsuario ventanaEliminarUsuario = new VentanaEliminarUsuario(
                            		universidad,(Alumno)universidad.getListaAlumnos().busqueda(rutAlumno),
															VentanaDocente.this,false);
                            ventanaEliminarUsuario.setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Alumno no encontrado","Eliminar Alumno",JOptionPane.INFORMATION_MESSAGE);
                        }
                	}
                }
            }
        });
        btnEliminarAlumno.setBounds(194, 169, 141, 23);
        contentPane.add(btnEliminarAlumno);
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //boton modificar alumno
        JButton btnModifAlumno = new JButton("Modificar datos alumno");
        btnModifAlumno.setFont(new Font("Century Gothic", Font.PLAIN, 9));
        btnModifAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String rutAlumno = JOptionPane.showInputDialog(null,"Ingrese rut del alumno","Buscar alumno",JOptionPane.QUESTION_MESSAGE);
                if(rutAlumno != null){
                    if(universidad.getListaAlumnos().existe(rutAlumno))
                    {               
                        setVisible(false);
                        VentanaModificarAlumno ventanaModificarAlumno = new VentanaModificarAlumno(
                        		universidad.getListaAlumnos().busqueda(rutAlumno),universidad,VentanaDocente.this);
                        ventanaModificarAlumno.setVisible(true);
                    }else
                        JOptionPane.showMessageDialog(VentanaDocente.this,"No se encontr� alumno","Error de busqueda",0);
                }
            }
        });
        btnModifAlumno.setBounds(12, 207, 151, 36);
        contentPane.add(btnModifAlumno);
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //boton cerrar sesi�n
        JButton btnCerrarSesi�n = new JButton("Cerrar Sesi\u00F3n");
        btnCerrarSesi�n.setFont(new Font("Century Gothic", Font.PLAIN, 11));
        btnCerrarSesi�n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) 
            {
            	Archivos archivo = new Archivos();
            	try {
					archivo.actualizarTxtDocente(docente);
				} catch (IOException e) {
					e.printStackTrace();
				}
                VentanaPrincipal ventanaInicial = new VentanaPrincipal(universidad);
                dispose();
            	ventanaInicial.setVisible(true);
            }
        });
        btnCerrarSesi�n.setBounds(194, 283, 143, 30);
        contentPane.add(btnCerrarSesi�n);
         
        
        
        
        
        JButton btnCrearDocente = new JButton("Crear Docente");
        btnCrearDocente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) 
        	{
        		setVisible(false);
                VentanaCrearUsuario ventanaCrearDocente = new VentanaCrearUsuario (universidad,VentanaDocente.this,true);     
                ventanaCrearDocente.setVisible(true);
        	}
        });
        btnCrearDocente.setBounds(10, 254, 153, 23);
        contentPane.add(btnCrearDocente);
        btnCrearDocente.setVisible(false);
        btnCrearDocente.setEnabled(false);
        
        JButton btnEliminarDocente = new JButton("Eliminar Docente");
        btnEliminarDocente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		String rutDocente = JOptionPane.showInputDialog(null,"Ingrese rut del docente","Buscar docente",JOptionPane.QUESTION_MESSAGE);
                if(rutDocente != null){
                	if(!rutDocente.equals("")){
                		if(universidad.getListaDocentes().existe(rutDocente))
                        {
                            setVisible(false);
                            VentanaEliminarUsuario ventanaEliminarUsuario = new 
                            		VentanaEliminarUsuario(universidad,(Docente)universidad.getListaDocentes().busqueda(rutDocente),
													VentanaDocente.this,true);
                            ventanaEliminarUsuario.setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Docente no encontrado","Eliminar Docente",JOptionPane.INFORMATION_MESSAGE);
                        }
                	}
                }
        		
        		
        	}
        });
        btnEliminarDocente.setBounds(10, 288, 153, 23);
        contentPane.add(btnEliminarDocente);
        btnEliminarDocente.setVisible(false);
        btnEliminarDocente.setEnabled(false);
        
        
        
        //si el docente tiene poder de admin puede ver los botones
        if(docente.getRut().equals("80186894"))
        {
        	btnCrearDocente.setVisible(true);
            btnCrearDocente.setEnabled(true);
            
        	btnEliminarDocente.setVisible(true);
            btnEliminarDocente.setEnabled(true);
        }
        
        
        
        
        
        
        
        
        
        
        //boton mostrar datos alumno
        JButton btnMostrarDatosAlumno = new JButton("Mostrar datos alumno");
        btnMostrarDatosAlumno.setFont(new Font("Century Gothic", Font.PLAIN, 9));
        btnMostrarDatosAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(universidad.getListaAlumnos()!=null)
                {
                    setVisible(false);
                    VentanaReporteAlumnos ventanaMostrarAlumnos = new VentanaReporteAlumnos(universidad.getListaAlumnos(),VentanaDocente.this);
                    ventanaMostrarAlumnos.setVisible(true);
                }else
                    JOptionPane.showMessageDialog(VentanaDocente.this,"No existen alumnos ingresados","Error al mostrar",0);
            }
        });
        btnMostrarDatosAlumno.setBounds(196, 242, 141, 30);
        contentPane.add(btnMostrarDatosAlumno);
        
        
        
        
        
        
        
        
        
        
        
        
        
//-------------------------------------------------------------------------------------------------------------------------------
   
        //JLabel
        
        final JLabel lblNombre = new JLabel("Nombre : "+docente.getNombrePersona());
        lblNombre.setBounds(21, 20, 264, 14);
        panelDatosDocente.add(lblNombre);
        lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        lblNombre.setForeground(new Color(255, 255, 255));
        
        final JLabel lblRut = new JLabel("RUT : "+docente.getRut());
        lblRut.setBounds(21, 40, 223, 14);
        panelDatosDocente.add(lblRut);
        lblRut.setForeground(new Color(255, 255, 255));
        lblRut.setFont(new Font("Century Gothic", Font.PLAIN, 12));
    
        final JLabel lblDireccion = new JLabel("Direccion : "+docente.getDireccion());
        lblDireccion.setBounds(21, 60, 242, 14);
        panelDatosDocente.add(lblDireccion);
        lblDireccion.setForeground(new Color(255, 255, 255));
        lblDireccion.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        final JLabel lblEdad = new JLabel("Edad : "+docente.getEdad());
        lblEdad.setBounds(21, 80, 87, 14);
        panelDatosDocente.add(lblEdad);
        lblEdad.setForeground(new Color(255, 255, 255));
        lblEdad.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        final JLabel lblTelefono = new JLabel("Telefono : "+docente.getTelefono());
        lblTelefono.setBounds(21, 100, 242, 14);
        panelDatosDocente.add(lblTelefono);
        lblTelefono.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        lblTelefono.setForeground(new Color(255, 255, 255));
        
        final JLabel lblCorreo = new JLabel("Correo : "+docente.getCorreo());
        lblCorreo.setBounds(21, 120, 242, 14);
        panelDatosDocente.add(lblCorreo);
        lblCorreo.setBackground(Color.WHITE);
        lblCorreo.setForeground(new Color(255, 255, 255));
        lblCorreo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        

       final JLabel lblmodificarDireccion = new JLabel("[Modificar]");
       lblmodificarDireccion.setBounds(266, 60, 49, 14);
       panelDatosDocente.add(lblmodificarDireccion);
       lblmodificarDireccion.setForeground(Color.BLACK);
       lblmodificarDireccion.setFont(new Font("Tahoma", Font.PLAIN, 10));

       final JLabel lblmodificarTelefono = new JLabel("[Modificar]");
       lblmodificarTelefono.setBounds(266, 100, 49, 14);
       panelDatosDocente.add(lblmodificarTelefono);
       lblmodificarTelefono.setFont(new Font("Tahoma", Font.PLAIN, 10));
       lblmodificarTelefono.setForeground(Color.BLACK);
          
       
       //modificar correo
       final JLabel lblmodificarCorreo = new JLabel("[Modificar]");                    
       lblmodificarCorreo.setBounds(266, 120, 49, 14);
       panelDatosDocente.add(lblmodificarCorreo);
       lblmodificarCorreo.setForeground(Color.BLACK);
       lblmodificarCorreo.setFont(new Font("Tahoma", Font.PLAIN, 10));
       
       
       
       
       
       //boton cambiar contrase�a
       JButton btnCambiarContrasea = new JButton("Cambiar Contrase\u00F1a");
       btnCambiarContrasea.setBounds(194, 203, 141, 30);
       contentPane.add(btnCambiarContrasea);
       btnCambiarContrasea.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) 
       	{
       		String editarContrasena = JOptionPane.showInputDialog(null, "Ingrese su contrase�a actual: ", "Edite contrase�a : ", JOptionPane.QUESTION_MESSAGE);
 			
 			if(editarContrasena != null)
 			{
 				if(docente.getContrasena().equals(editarContrasena))
 				{
 					String contrasenaEditada = JOptionPane.showInputDialog(null, "Ingrese su nueva contrase�a: ", "Edite contrase�a : ", JOptionPane.QUESTION_MESSAGE);
 					docente.setContrasena(contrasenaEditada);
 					System.out.println("Su nueva contrase�a es : "+docente.getContrasena());
 				}else{
 					JOptionPane.showMessageDialog(VentanaDocente.this, "Contrase�a ingresada es incorrecta o falt� rellenar campo");
 				}
 			}
       	}
       });
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

    
 //---------------------------------------------------------------------------------------------------------------------------
     
    //MODIFICAR DATOS DOCENTE
    
    
  
    
    
    
      //modificar el telefono
      lblmodificarTelefono.addMouseListener(new MouseListener() 
      {
          public void mouseClicked(MouseEvent arg0) 
          {
              String editarTelefono = JOptionPane.showInputDialog(null, "Ingrese su nuevo tel�fono: ", "Modificar telefono ", JOptionPane.QUESTION_MESSAGE);
              if(editarTelefono != null)
              {
            	  if(universidad.getListaDocentes().modificarTelefono(docente, editarTelefono))
            	  {
                          lblTelefono.setText("Telefono: "+docente.getTelefono());
                          JOptionPane.showMessageDialog(VentanaDocente.this, "Se modifico su telefono con exito");
                  }else
                  {
                	  JOptionPane.showMessageDialog(VentanaDocente.this, "El tel�fono ingresado es incorrecto");
                  }   
              }
          }
               
          public void mouseEntered(MouseEvent arg0) 
          {
              lblmodificarTelefono.setForeground(Color.red);
          }
          public void mouseExited(MouseEvent arg0) 
          {
              lblmodificarTelefono.setForeground(Color.BLACK);
          }
          public void mousePressed(MouseEvent arg0) {}
          public void mouseReleased(MouseEvent arg0) {}
      });

    
      
      

      
      
      lblmodificarCorreo.addMouseListener(new MouseListener() 
      {
         public void mouseClicked(MouseEvent arg0) 
         {               
             String editarCorreo = JOptionPane.showInputDialog(null, "Ingrese su nuevo correo: ", "Modificar correo ", JOptionPane.QUESTION_MESSAGE);
             if(editarCorreo != null)
             {
                 if(universidad.getListaDocentes().modificarCorreo(docente, editarCorreo))
                 {
                     lblCorreo.setText("Correo: "+docente.getCorreo());
                     System.out.print("hola "+docente.getCorreo());
                     JOptionPane.showMessageDialog(VentanaDocente.this, "Se modifico su correo con exito");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(VentanaDocente.this, "El correo ingresado es incorrecto");
                 }
             }
         }
      
         public void mouseEntered(MouseEvent arg0) 
         {
             lblmodificarCorreo.setForeground(Color.red);
         }
         public void mouseExited(MouseEvent arg0) 
         {
             lblmodificarCorreo.setForeground(Color.BLACK);
         }
         public void mousePressed(MouseEvent arg0) {}
         public void mouseReleased(MouseEvent arg0) {}
      });
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    //modificar direcci�n
    lblmodificarDireccion.addMouseListener(new MouseListener() 
    {
          public void mouseClicked(MouseEvent arg0)   {
	          String editarDireccion = JOptionPane.showInputDialog(null, "Ingrese su nueva direcci�n: ", "Modificar direcci�n ", JOptionPane.QUESTION_MESSAGE);
	          if(editarDireccion != null)
	          {
	        	  if(universidad.getListaDocentes().modificarDireccion(docente, editarDireccion))
			  	  {
					  JOptionPane.showMessageDialog(VentanaDocente.this, "Se modifico su direccion con exito");
	                  lblDireccion.setText("Direccion: "+docente.getDireccion());
	              }else
	              {
	                  JOptionPane.showMessageDialog(VentanaDocente.this, "su direccion no es valida");
	              }
	                   
	          }
          }
          public void mouseEntered(MouseEvent arg0) 
          {
              lblmodificarDireccion.setForeground(Color.red);
          }
          public void mouseExited(MouseEvent arg0) 
          {
              lblmodificarDireccion.setForeground(Color.BLACK);
          }
          public void mousePressed(MouseEvent arg0) {}
          public void mouseReleased(MouseEvent arg0) {}
    });
    }
}