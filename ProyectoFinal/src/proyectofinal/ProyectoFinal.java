package proyectofinal;

//Importar librerias necesarias:
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 * Autores:
  
 * Anferny Sanabria
 * Byron Zumbado
 * Esteban Picado
 * Jorge Durán
 
 **/

public class ProyectoFinal extends JFrame {
    // Atributos
    private int dimesionDefecto = 100;
    private Empleado[] vectorDeEmpleados = new Empleado[dimesionDefecto];
    
    // Componentes visuales
    private JPanel panelSalasDeCine = new JPanel();
    private JPanel panelReservasConElEntrenador = new JPanel();
    private JPanel panelReservasDeClases = new JPanel();
    private JPanel panelGestionDeEmpleados = new JPanel();
    
    private boolean registraEmpleadoNuevo = false;

    // Constructor
    public ProyectoFinal() {
        // Configuracion basica de la ventana
        super("Centro de Control");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        // Hace que la pantalla no se puede redimensionar
        this.setResizable(false);
        // Centrar la ventana en la pantalla
        this.setLocationRelativeTo(null);
        // Inicializar
        inicializarAtributos();
        inicializarComponentesVisuales();
        this.setVisible(true);
    }
   
    // Inicializa los atributos - creacion de empleados
    public void inicializarAtributos() {
        // Se crean empleados iniciales
        Empleado empleado1 = new Empleado("1", "Anferny Sanabria");
        Empleado empleado2 = new Empleado("2", "Jose Perez");
        Empleado empleado3 = new Empleado("3", "Juan Arias");
        Empleado empleado4 = new Empleado("4", "Carlos Rodriguez");
        Empleado empleado5 = new Empleado("5", "Sergio Campos");
        Empleado empleado6 = new Empleado("6", "Anthuan Cortes");
        Empleado empleado7 = new Empleado("7", "Fabian Torres");
        Empleado empleado8 = new Empleado("8", "Daniel Cespedes");
        Empleado empleado9 = new Empleado("9", "Johan Moya");
        Empleado empleado10 = new Empleado("10", "Jorge Duran");
        Empleado empleado11 = new Empleado("11", "Pablo Mena");
        Empleado empleado12 = new Empleado("12", "Samuel Fernandez");
        Empleado empleado13 = new Empleado("13", "Justin Badilla");
        Empleado empleado14 = new Empleado("14", "Diego Alfaro");
        Empleado empleado15 = new Empleado("15", "Brayan Blanco");
        Empleado empleado16 = new Empleado("16", "Pablo Fuentes");
        Empleado empleado17 = new Empleado("17", "Arlin Badilla");
        Empleado empleado18 = new Empleado("18", "Nataly Hernandez");
        Empleado empleado19 = new Empleado("19", "Federico Gonzales");
        Empleado empleado20 = new Empleado("20", "Maria Lopez");
        Empleado empleado21 = new Empleado("21", "Steven Gamboa");
        Empleado empleado22 = new Empleado("22", "Mariangel Lopez");
        Empleado empleado23 = new Empleado("23", "Darien Gomez");
        Empleado empleado24 = new Empleado("24", "Franciny Torres");
        Empleado empleado25 = new Empleado("25", "Santiago Mena");
        Empleado empleado26 = new Empleado("26", "Gerardo Mena");
        Empleado empleado27 = new Empleado("27", "Patricia Delgado");
        Empleado empleado28 = new Empleado("28", "Joseph Gutierrez");
        
        vectorDeEmpleados[0] = empleado1;
        vectorDeEmpleados[1] = empleado2;
        vectorDeEmpleados[2] = empleado3;
        vectorDeEmpleados[3] = empleado4;
        vectorDeEmpleados[4] = empleado5;
        vectorDeEmpleados[5] = empleado6;
        vectorDeEmpleados[6] = empleado7;
        vectorDeEmpleados[7] = empleado8;
        vectorDeEmpleados[8] = empleado9;
        vectorDeEmpleados[9] = empleado10;
        vectorDeEmpleados[10] = empleado11;
        vectorDeEmpleados[11] = empleado12;
        vectorDeEmpleados[12] = empleado13;
        vectorDeEmpleados[13] = empleado14;
        vectorDeEmpleados[14] = empleado15;
        vectorDeEmpleados[15] = empleado16;
        vectorDeEmpleados[16] = empleado17;
        vectorDeEmpleados[17] = empleado18;
        vectorDeEmpleados[18] = empleado19;
        vectorDeEmpleados[19] = empleado20;
        vectorDeEmpleados[20] = empleado21;
        vectorDeEmpleados[21] = empleado22;
        vectorDeEmpleados[22] = empleado23;
        vectorDeEmpleados[23] = empleado24;
        vectorDeEmpleados[24] = empleado25;
        vectorDeEmpleados[25] = empleado26;
        vectorDeEmpleados[26] = empleado27;
        vectorDeEmpleados[27] = empleado28;
    }
    
    // Inicializa los componentes visuales
    public void inicializarComponentesVisuales() {
        // Crear los menus
        crearMenus();
        
        // Se añaden los paneles
        panelSalasDeCine.setSize(900, 600);
        panelReservasConElEntrenador.setSize(900, 600);
        panelReservasDeClases.setSize(900, 600);
        panelGestionDeEmpleados.setSize(900, 600);
        
        // Se les pone color a los paneles
        panelSalasDeCine.setBackground(Color.yellow);
        panelReservasConElEntrenador.setBackground(Color.blue);
        panelReservasDeClases.setBackground(Color.ORANGE);
        panelGestionDeEmpleados.setBackground(Color.green);
        
        // Se agregan los paneles al jframe
        this.add(panelSalasDeCine);
        this.add(panelReservasConElEntrenador);
        this.add(panelReservasDeClases);
        this.add(panelGestionDeEmpleados);
    }
    
        public void crearMenus() {
        // Crear una barra de menu
        JMenuBar menuBar = new JMenuBar();
        
        // Establecer la barra de menu en la ventana
        setJMenuBar(menuBar);
        
        // Crear las opciones que tendra el menu
        JMenu archivoMenu = new JMenu("Opciones");
        JMenu opcionSalir = new JMenu("Salir");
        
        // Agregar menus a la barra de menu
        menuBar.add(archivoMenu);
        menuBar.add(opcionSalir);

        // Crear los items del menu
        JMenuItem menuSalasDeCine = new JMenuItem("Salas de cine");
        JMenuItem menuReservasConElEntrenador = new JMenuItem("Reservas con el entrenador");
        JMenuItem menuReservasDeClases = new JMenuItem("Reservas de clases");
        JMenuItem menuGestionarEmpleados = new JMenuItem("Gestionar empleados");
        
        // Se agregan los eventos a los menus
        menuSalasDeCine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Accion a realizar cuando se hace clic
                panelSalasDeCine.setVisible(true);
                panelReservasConElEntrenador.setVisible(false);
                panelReservasDeClases.setVisible(false);
                panelGestionDeEmpleados.setVisible(false);
                
                // Invoca al panelSalasDeCine y todos sus componentes
                panelSalasDeCine();
            }
        });
        
        menuReservasConElEntrenador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Accion a realizar cuando se hace clic
                panelSalasDeCine.setVisible(false);
                panelReservasConElEntrenador.setVisible(true);
                panelReservasDeClases.setVisible(false);
                panelGestionDeEmpleados.setVisible(false);
                
                // Invoca al panelReservasConElEntrenador y todos sus componentes
                panelReservasConElEntrenador();
            }
        });
        
        menuReservasDeClases.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Accion a realizar cuando se hace clic
                panelSalasDeCine.setVisible(false);
                panelReservasConElEntrenador.setVisible(false);
                panelReservasDeClases.setVisible(true);
                panelGestionDeEmpleados.setVisible(false);
                
                // Invoca al panelReservasDeClases y todos sus componentes
                panelReservasDeClases();
            }
        });
        
        //rellenar con opcion para salir*
        
        menuGestionarEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Accion a realizar cuando se hace clic
                panelSalasDeCine.setVisible(false);
                panelReservasConElEntrenador.setVisible(false);
                panelReservasDeClases.setVisible(false);
                panelGestionDeEmpleados.setVisible(true);
                
                // Invoca al panelGestionDeEmpleados y todos sus componentes
                panelGestionDeEmpleados();
            }
        });
        
        // Agregar items al menu "Opciones"
        archivoMenu.add(menuSalasDeCine);
        archivoMenu.add(menuReservasConElEntrenador);
        archivoMenu.add(menuReservasDeClases);
        archivoMenu.add(menuGestionarEmpleados);
        archivoMenu.addSeparator();
        
        
    }
    
    // Determina la cantidad de empleados
    public int cantidadDeEmpleados() {
        int cantidadDeEmpleados = 0;
        
        // Recorre el vectorDeEmpleados y cuenta cuando empleados hay
        for (int i = 0; i < dimesionDefecto; i++) {
            if (vectorDeEmpleados[i] != null) {
                cantidadDeEmpleados = cantidadDeEmpleados + 1;
            } else {
                break;
            }
        }
        
        return cantidadDeEmpleados;
    }
    
    public void panelSalasDeCine() {
        
    }
    
    public void panelReservasConElEntrenador() {
        
    }
    
    public void panelReservasDeClases() {
        
    }
    
    // Este es el panelGestionDeEmpleados con la funcionalidad de los componentes
    public void panelGestionDeEmpleados() {
        // Elimina todos los componentes del panel
        panelGestionDeEmpleados.removeAll();
                
        // Labels, campos de texto y botones
        JLabel labelId = new JLabel("Id");
        JLabel labelNombre = new JLabel("Nombre");
        
        JTextField textFieldId = new JTextField("", 15);
        JTextField textFieldNombre = new JTextField("", 15);
        
        JButton botonNuevoEmpleado = new JButton("Nuevo");
        JButton botonGuardarEmpleado = new JButton("Guardar");
        
        // Determina la cantidad de empleados
        int cantidadDeEmpleados = cantidadDeEmpleados();
        
        // Datos de id y nombre de empleados
        Object[][] datos = new String[cantidadDeEmpleados][2];
        
        // Llena la matriz de datos con la informacion del vectorDeEmpleados
        for (int i = 0; i < cantidadDeEmpleados; i++) {
            datos[i][0] = vectorDeEmpleados[i].getId();
            datos[i][1] = vectorDeEmpleados[i].getNombre();
        }

        // Nombres de las columnas
        String[] columnas = {"Id", "Nombre"};

        // Crear un modelo de tabla no editable con los datos y columnas
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacer que todas las celdas no sean editables
                return false;
            }
        };

        // Crear la tabla con el modelo
        JTable table = new JTable(modelo);
        
        // Agregar un MouseListener a la tabla para rastrear clics en celdas
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Si el click es izquierdo, se cargan los textField con el empleado que se enfoco
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int row = table.getSelectedRow();
                    int col = table.getSelectedColumn();

                    if (row != -1 && col != -1) {
                        // Al hacer clic en una celda, muestra la informacion
                        // System.out.println(table.getModel().getValueAt(row, col));

                        // Se cargan los textField con el empleado que se enfoco
                        textFieldId.setText( (String) table.getModel().getValueAt(row, 0));
                        textFieldNombre.setText( (String) table.getModel().getValueAt(row, 1));

                        // System.out.println(textFieldId.getText() + ", " + textFieldNombre.getText());

                        // Se repintan los textField
                        textFieldId.repaint();
                        textFieldNombre.repaint();
                    }
                // Si el clic es derecho, se envia un mensaje para eliminar el empleado que se enfoco
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    int row = table.rowAtPoint(e.getPoint());
                    int col = table.columnAtPoint(e.getPoint());
                    
                    // Seleccionar la fila
                    table.setRowSelectionInterval(row, row);
                    
                    // Se repinta la tabla
                    table.repaint();
                    
                    if (row != -1 && col != -1) {
                        // Se construye la consulta al usuario si desea eliminar el empleado
                        String id = (String) table.getModel().getValueAt(row, 0);
                        String nombre = (String) table.getModel().getValueAt(row, 1);
                        String mensaje = "¿Desea eliminar el empleado : id = " + id + ", nombre = " + nombre + "?";
                        int opcionSeleccionada = JOptionPane.showConfirmDialog(null, mensaje);
                        
                        // Si elimina el empleado
                        if (opcionSeleccionada == JOptionPane.YES_OPTION) {
                            // Obtener la fila seleccionada
                            int selectedRow = table.getSelectedRow();

                            // Verificar si se ha seleccionado una fila
                            if (selectedRow != -1) {
                                // Eliminar la fila seleccionada del modelo
                                ((DefaultTableModel) table.getModel()).removeRow(selectedRow);
                                // Mueve los empleados en el vector para no dejar espacios nulos entre los empleados
                                eliminarEmpleado(selectedRow);
                            } else {
                                JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
                            }
                        }
                    }
                }
            }
        });
        
        // Agregar evento de clic al botonNuevoEmpleado
        botonNuevoEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpia los campos de texto
                textFieldId.setText("");
                textFieldNombre.setText("");
                
                // Activa la bandera para registrar un nuevo empleado
                registraEmpleadoNuevo = true;
            }
        });
        
        // Agregar evento de clic al botonGuardar
        botonGuardarEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {     
                // Se extraen el id y el nombre de los campos de texto
                String id = textFieldId.getText();
                String nombre = textFieldNombre.getText();
                
                // Si el id o nombre estan vacios se envia un mensaje que son obligatorios
                if ("".equals(id.trim()) || "".equals(nombre.trim())) {
                    JOptionPane.showMessageDialog(null, "El id y el nombre son obligatorios");
                } else {
                
                    // Si se esta guardando un empleado ya existente
                    if (registraEmpleadoNuevo == false) {
                        // Obtener la fila seleccionada
                        int row = table.getSelectedRow();
                        // Obtener la columna seleccionada
                        int col = table.getSelectedColumn();
                        
                        // Si no hay un empleado seleccionado
                        if (row == -1 && col == -1) {
                            JOptionPane.showMessageDialog(null, "Para guardar un nuevo empleado debe usar primero el botón Nuevo");
                        // Si ya selecciono un empleado
                        } else {
                            // Se actualiza la informacion del empleado
                            // En el vector
                            vectorDeEmpleados[row].setId(textFieldId.getText());
                            vectorDeEmpleados[row].setNombre(textFieldNombre.getText());

                            // En el modelo
                            table.getModel().setValueAt(textFieldId.getText(), row, 0);
                            table.getModel().setValueAt(textFieldNombre.getText(), row, 1);

                            // Se repinta la tabla
                            table.repaint();

                            // Mensaje con la informacion a guardar
                            JOptionPane.showMessageDialog(null, "Datos guardados:\nId: " + textFieldId.getText() + "\nNombre: " + textFieldNombre.getText());
                        }
                    // Si se esta guardando un empleado nuevo
                    }  else {
                        int cantidadDeEmpleados = cantidadDeEmpleados();

                        // Se crea el nuevoEmpleado 
                        Empleado nuevoEmpleado = new Empleado(id, nombre);

                        // Se añade al vectorDeEmpleados
                        vectorDeEmpleados[cantidadDeEmpleados] = nuevoEmpleado;

                        // Nueva cantidad despues de añadir el nuevoEmpleado
                        cantidadDeEmpleados = cantidadDeEmpleados();

                        // Se añade al modelo de la tabla
                        // Datos de id y nombre de empleados
                        Object[][] datos = new String[cantidadDeEmpleados][2];

                        // Llena la matriz de datos con la informacion del vectorDeEmpleados
                        for (int i = 0; i < cantidadDeEmpleados; i++) {
                            datos[i][0] = vectorDeEmpleados[i].getId();
                            datos[i][1] = vectorDeEmpleados[i].getNombre();
                        }

                        // Nombres de las columnas
                        String[] columnas = {"Id", "Nombre"};

                        // Crear un modelo de tabla no editable con los datos y columnas
                        DefaultTableModel modeloConElNuevoEmpleado = new DefaultTableModel(datos, columnas) {
                            @Override
                            public boolean isCellEditable(int row, int column) {
                                // Hacer que todas las celdas no sean editables
                                return false;
                            }
                        };

                        // Se actualiza al nuevo modelo
                        table.setModel(modeloConElNuevoEmpleado);

                        // Se repinta la tabla
                        panelGestionDeEmpleados.repaint();

                        imprimirEmpleados();        

                        // Mensaje con la informacion a guardar
                        JOptionPane.showMessageDialog(null, "Datos guardados:\nId: " + id + "\nNombre: " + nombre);

                        // Se limpian los campos de texto
                        textFieldId.setText("");
                        textFieldNombre.setText("");

                        // Desactiva la bandera para registrar un nuevo empleado
                        registraEmpleadoNuevo = false;
                    }
                }
            }
        });
        
        // Crear un JScrollPane para la tabla (manejo de desplazamiento si es necesario)
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Se crea un panel para incluir la informacion del empleado seleccionado o nuevo en forma de tabla
        JPanel panelDatosDelEmpleado = new JPanel(new GridLayout(0, 2, 10, 10));
        panelDatosDelEmpleado.add(labelId);
        panelDatosDelEmpleado.add(labelNombre);
        panelDatosDelEmpleado.add(textFieldId);
        panelDatosDelEmpleado.add(textFieldNombre);
        panelDatosDelEmpleado.add(botonNuevoEmpleado);
        panelDatosDelEmpleado.add(botonGuardarEmpleado);
        
        // Se anaden la tabla y el panelDatosDelEmpleado al jframe
        panelGestionDeEmpleados.add(scrollPane);
        panelGestionDeEmpleados.add(panelDatosDelEmpleado);
    }
    
    public void Salir(){
        System.exit(0);
    }
    
    // Mueve los empleados en el vector para no dejar espacios nulos entre los empleados
    public void eliminarEmpleado(int posicionEmpleadoSeleccionado) {
        vectorDeEmpleados[posicionEmpleadoSeleccionado] = null;
        
        for (int i = posicionEmpleadoSeleccionado; i < dimesionDefecto - 1; i++) {
            // Si hay un empleado a la derecha para comparar y el empleado actual es null,
            // pero el que sigue no lo es, entonces muevalo a la izquierda y deje el de la izquieda
            // como nuevo nulo
            if (vectorDeEmpleados[i] == null && vectorDeEmpleados[i + 1] != null) {
                // Mueve el empleado de la posicionSiguiente en la posicionActual
                // y deja la posicionSiguiente como nula
                vectorDeEmpleados[i] = vectorDeEmpleados[i + 1];
                vectorDeEmpleados[i + 1] = null;
            }
        }
        
        imprimirEmpleados();
    }
    
    // Imprime los empleados del vector
    public void imprimirEmpleados() {
        System.out.println("Impresion de los empleados");
        for (int i = 0; i < dimesionDefecto; i++) {
            // Si la posicion del vector tiene null en la posicion es que no tiene un empleado
            if (vectorDeEmpleados[i] != null) {
                System.out.println("Posicion : " + i + " : " + vectorDeEmpleados[i].getId() + ", " + vectorDeEmpleados[i].getNombre());
            }
        }
    }

    public static void main(String[] args) {
        ProyectoFinal proyectoFinal = new ProyectoFinal();
    }
}
