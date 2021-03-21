package evaluación.primer.trimestre;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class EvaluacionPrimerTrimestre {

	private JFrame frame;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtAyxguy;

	/**
	 * Launch the application.
	 */
	
	ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("ninos.png"));
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvaluacionPrimerTrimestre window = new EvaluacionPrimerTrimestre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EvaluacionPrimerTrimestre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1261, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(img.getImage());
		
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(Color.CYAN);
		panel_0.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_0.setBounds(10, 10, 1236, 86);
		frame.getContentPane().add(panel_0);
		panel_0.setLayout(null);
		
		JLabel lblTitle = new JLabel("\u00C1rea de psicolog\u00EDa");
		lblTitle.setBackground(Color.CYAN);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(194, 10, 869, 66);
		panel_0.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBounds(10, 106, 734, 455);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_0 = new JComboBox();
		comboBox_0.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox_0.setModel(new DefaultComboBoxModel(new String[] {"                                              Entradas principales ", "1. Presentarme con mis compa\u00F1eros  y conocerme.", "2. Identificar habilidades socioemocionales.", "3. Conocerse y amarse a uno mismo.", "4. Identificar tus gustos y aficiones.", "5. Conocer e identificar las diferencias entre personas.", "6. Expresar lo que siento y reconocer diferentes emociones.", "7. Saber lo que siente en cada momento.", "8. Tomar conciencia de las emociones del d\u00EDa a d\u00EDa.", "9. Saber que puedes cambiar tus emociones para sentirte bien.", "10. Agradecer lo que t\u00FA eres y lo que te rodea.", "11. Ver los retos de la vida de forma diferente."}));
		comboBox_0.setBounds(10, 11, 598, 52);
		panel_1.add(comboBox_0);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"                                                Preguntas secundarias", "1. Saluda cuando llega a un lugar.", "1. Se adecua a las rutinas del hogar.", "1. Cuida su aspecto.  ", "1. Realiza con frecuencias juegos de inter\u00E9s.", "1. Prefiere convivir m\u00E1s tiempo con un miembro de la familia. ", "1. Reconoce el motivo de su enojo.  ", "1. Menciona como se siente cuando juega.  ", "1. Expresa cuando est\u00E1 cansado.", "1. Cambia de actividad cuando se aburre.", "1. Agradece cuando lo ayudan.", "1. Usa el tiempo en diversas actividades de su agrado.  "}));
		comboBox_1.setBounds(36, 95, 565, 43);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"                                                Preguntas secundarias", "2. Se despide dice adi\u00F3s cuando se retira. ", "2. Participa en juegos. ", "2. Le gusta peinarse.", "2. Pasa mucho tiempo en alguna actividad. ", "2. Reconoce sus pertenencias y las pertenencias de los otros. ", "2. Expresa felicidad con las cosas que le agradan. ", "2. Sabe cu\u00E1ndo pap\u00E1 o mam\u00E1 est\u00E1n molestos por algo que hizo.", "2. Busca realizar cosas que lo hacen sentir bien.", "2. Estalla en c\u00F3lera cuando algo no le agrada. ", "2. Gratifica a los dem\u00E1s cuando comparten cosas con \u00E9l. ", "2. Se esfuerza en sus tareas."}));
		comboBox_2.setBounds(36, 149, 565, 43);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"                                                Preguntas secundarias", "3. Dice su nombre cuando le preguntan. ", "3. Concluye actividades.  ", "3. Disfruta del ba\u00F1o diario. ", "3. Disfruta de alguna actividad en particular. ", "3. Sabe distinguir diferencias de los integrantes de su familia. ", "3. Sabe porque ha Llorado. ", "3. Pide perd\u00F3n cuando se hiere a alguien. ", "3. Muestra empat\u00EDa con los dem\u00E1s. ", "3. Se regula y se tranquiliza despu\u00E9s de una situaci\u00F3n negativa.", "3. Le gusta compartir con los dem\u00E1s.", "3. Busca juegos o actividades diferentes. "}));
		comboBox_3.setBounds(36, 202, 565, 43);
		panel_1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"                                                Preguntas secundarias", "4. Le gusta usar perfume.", "4. Reconoce detalles f\u00EDsicos de su persona."}));
		comboBox_4.setBounds(36, 255, 565, 43);
		panel_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"                                                Preguntas secundarias", "5. Elige su ropa de vestir. ", "5. Reconoce caracter\u00EDsticas de otros."}));
		comboBox_5.setBounds(36, 308, 565, 43);
		panel_1.add(comboBox_5);
		
		JButton iniciar = new JButton("Iniciar");
		iniciar.setBackground(Color.ORANGE);
		iniciar.setForeground(Color.BLACK);
		iniciar.setBounds(618, 12, 100, 52);
		panel_1.add(iniciar);
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox_0.getSelectedItem().equals("1. Presentarme con mis compañeros  y conocerme.")) {
					comboBox_1.setSelectedIndex(1);
					comboBox_2.setSelectedIndex(1);
					comboBox_3.setSelectedIndex(1);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("2. Identificar habilidades socioemocionales.")) {
					comboBox_1.setSelectedIndex(2);
					comboBox_2.setSelectedIndex(2);
					comboBox_3.setSelectedIndex(2);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("3. Conocerse y amarse a uno mismo.")) {
					comboBox_1.setSelectedIndex(3);
					comboBox_2.setSelectedIndex(3);
					comboBox_3.setSelectedIndex(3);
					comboBox_4.setSelectedIndex(1);
					comboBox_5.setSelectedIndex(1);
				}
				else if(comboBox_0.getSelectedItem().equals("4. Identificar tus gustos y aficiones.")) {
					comboBox_1.setSelectedIndex(4);
					comboBox_2.setSelectedIndex(4);
					comboBox_3.setSelectedIndex(4);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("5. Conocer e identificar las diferencias entre personas.")) {
					comboBox_1.setSelectedIndex(5);
					comboBox_2.setSelectedIndex(5);
					comboBox_3.setSelectedIndex(5);
					comboBox_4.setSelectedIndex(2);
					comboBox_5.setSelectedIndex(2);
				}
				else if(comboBox_0.getSelectedItem().equals("6. Expresar lo que siento y reconocer diferentes emociones.")) {
					comboBox_1.setSelectedIndex(6);
					comboBox_2.setSelectedIndex(6);
					comboBox_3.setSelectedIndex(6);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("7. Saber lo que siente en cada momento.")) {
					comboBox_1.setSelectedIndex(7);
					comboBox_2.setSelectedIndex(7);
					comboBox_3.setSelectedIndex(7);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("8. Tomar conciencia de las emociones del día a día.")) {
					comboBox_1.setSelectedIndex(8);
					comboBox_2.setSelectedIndex(8);
					comboBox_3.setSelectedIndex(8);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("9. Saber que puedes cambiar tus emociones para sentirte bien.")) {
					comboBox_1.setSelectedIndex(9);
					comboBox_2.setSelectedIndex(9);
					comboBox_3.setSelectedIndex(9);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("10. Agradecer lo que tú eres y lo que te rodea.")) {
					comboBox_1.setSelectedIndex(10);
					comboBox_2.setSelectedIndex(10);
					comboBox_3.setSelectedIndex(10);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
				else if(comboBox_0.getSelectedItem().equals("11. Ver los retos de la vida de forma diferente.")) {
					comboBox_1.setSelectedIndex(11);
					comboBox_2.setSelectedIndex(11);
					comboBox_3.setSelectedIndex(11);
					comboBox_4.setSelectedIndex(0);
					comboBox_5.setSelectedIndex(0);
				}
			}
		});
		
		iniciar.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox comboBox_a = new JComboBox();
		comboBox_a.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_a.setModel(new DefaultComboBoxModel(new String[] {"   Escoger", "N", "A", "S"}));
		comboBox_a.setBounds(611, 95, 113, 43);
		panel_1.add(comboBox_a);
		
		JComboBox comboBox_b = new JComboBox();
		comboBox_b.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_b.setModel(new DefaultComboBoxModel(new String[] {"   Escoger", "N", "A", "S"}));
		comboBox_b.setBounds(611, 149, 113, 43);
		panel_1.add(comboBox_b);
		
		JComboBox comboBox_c = new JComboBox();
		comboBox_c.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_c.setModel(new DefaultComboBoxModel(new String[] {"   Escoger", "N", "A", "S"}));
		comboBox_c.setBounds(611, 202, 113, 43);
		panel_1.add(comboBox_c);
		
		JComboBox comboBox_d = new JComboBox();
		comboBox_d.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_d.setModel(new DefaultComboBoxModel(new String[] {"   Escoger", "N", "A", "S"}));
		comboBox_d.setBounds(611, 255, 113, 43);
		panel_1.add(comboBox_d);
		
		JComboBox comboBox_e = new JComboBox();
		comboBox_e.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_e.setModel(new DefaultComboBoxModel(new String[] {"   Escoger", "N", "A", "S"}));
		comboBox_e.setBounds(609, 308, 115, 43);
		panel_1.add(comboBox_e);
		
        JButton registrar = new JButton("Registrar");
        registrar.setBackground(Color.ORANGE);
        registrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(comboBox_0.getSelectedItem().equals("1. Presentarme con mis compañeros  y conocerme.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("1.");
        			    textField_2.setText("Presentarme con mis compañeros  y conocerme.");
					    textField_3.setText("A");
        		    }
        	    }
        		else if(comboBox_0.getSelectedItem().equals("2. Identificar habilidades socioemocionales.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("2.");
        			    textField_2.setText("Identificar habilidades socioemocionales.");
					    textField_3.setText("A");
        		    }
        		}
        		if(comboBox_0.getSelectedItem().equals("3. Conocerse y amarse a uno mismo.")) {
        			//abcde
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
				    }
        			//abcd
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//abce
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//abde
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//acde
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//bcde
        			else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//abc
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
					}   
        			//abd
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//abe
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//acd
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//ace
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//ade
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//bcd
        	        else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//bce
        	        else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//bde
        	        else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        			//cde
        	        else if((comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("S");
        			}
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
				    }
        			//abcd
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//abce
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//abde
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//acde
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//bcde
        			else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//abc
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
					}   
        			//abd
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//abe
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//acd
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//ace
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//ade
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//bcd
        	        else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//bce
        	        else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//bde
        	        else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        			//cde
        	        else if((comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        			}
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
				    }
        			//abcd
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//abce
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//abde
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//acde
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//bcde
        			else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//abc
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
					}   
        			//abd
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//abe
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//acd
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//ace
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//ade
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//bcd
        	        else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//bce
        	        else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//bde
        	        else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        			//cde
        	        else if((comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("N");
        			}
        	        else {
        	        	textField_1.setText("3.");
        			    textField_2.setText("Conocerse y amarse a uno mismo.");
					    textField_3.setText("A");
        	        }
        		}
        		else if(comboBox_0.getSelectedItem().equals("4. Identificar tus gustos y aficiones.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("4.");
        			    textField_2.setText("Identificar tus gustos y aficiones.");
					    textField_3.setText("A");
        		    }
        		}
        		else if(comboBox_0.getSelectedItem().equals("5. Conocer e identificar las diferencias entre personas.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
				    }
        			//abcd
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//abce
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//abde
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//acde
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//bcde
        			else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//abc
        			else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
					}   
        			//abd
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//abe
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//acd
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//ace
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//ade
        	        else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//bcd
        	        else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//bce
        	        else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//bde
        	        else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        			//cde
        	        else if((comboBox_c.getSelectedItem().equals("S"))&&(comboBox_d.getSelectedItem().equals("S"))&&(comboBox_e.getSelectedItem().equals("S"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("S");
        			}
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
				    }
        			//abcd
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//abce
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//abde
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//acde
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//bcde
        			else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//abc
        			else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
					}   
        			//abd
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//abe
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//acd
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//ace
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//ade
        	        else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//bcd
        	        else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//bce
        	        else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//bde
        	        else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        			//cde
        	        else if((comboBox_c.getSelectedItem().equals("A"))&&(comboBox_d.getSelectedItem().equals("A"))&&(comboBox_e.getSelectedItem().equals("A"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        			}
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
				    }
        			//abcd
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//abce
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//abde
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//acde
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//bcde
        			else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//abc
        			else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
					}   
        			//abd
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//abe
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//acd
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//ace
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//ade
        	        else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//bcd
        	        else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//bce
        	        else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//bde
        	        else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        			//cde
        	        else if((comboBox_c.getSelectedItem().equals("N"))&&(comboBox_d.getSelectedItem().equals("N"))&&(comboBox_e.getSelectedItem().equals("N"))) {
        				textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("N");
        			}
        	        else {
        	        	textField_1.setText("5.");
        			    textField_2.setText("Conocer e identificar las diferencias entre personas.");
					    textField_3.setText("A");
        	        }
        		}
        		else if(comboBox_0.getSelectedItem().equals("6. Expresar lo que siento y reconocer diferentes emociones.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("6.");
        			    textField_2.setText("Expresar lo que siento y reconocer diferentes emociones.");
					    textField_3.setText("A");
        		    }
        		}
        		else if(comboBox_0.getSelectedItem().equals("7. Saber lo que siente en cada momento.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("7.");
        			    textField_2.setText("Saber lo que siente en cada momento.");
					    textField_3.setText("A");
        		    }	
        		}
        		else if(comboBox_0.getSelectedItem().equals("8. Tomar conciencia de las emociones del día a día.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("8.");
        			    textField_2.setText("Tomar conciencia de las emociones del día a día.");
					    textField_3.setText("A");
        		    }	
        		}
        		else if(comboBox_0.getSelectedItem().equals("9. Saber que puedes cambiar tus emociones para sentirte bien.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("9.");
        			    textField_2.setText("Saber que puedes cambiar tus emociones para sentirte bien.");
					    textField_3.setText("A");
        		    }	
        		}
        		else if(comboBox_0.getSelectedItem().equals("10. Agradecer lo que tú eres y lo que te rodea.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("10.");
        			    textField_2.setText("Agradecer lo que tú eres y lo que te rodea.");
					    textField_3.setText("A");
        		    }	
        		}
        		else if(comboBox_0.getSelectedItem().equals("11. Ver los retos de la vida de forma diferente.")) {
        			if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        				textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_b.getSelectedItem().equals("S"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("S"))&&(comboBox_c.getSelectedItem().equals("S"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("S");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_b.getSelectedItem().equals("A"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("A"))&&(comboBox_c.getSelectedItem().equals("A"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("A");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_b.getSelectedItem().equals("N"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_a.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("N");
				    }
        		    else if((comboBox_b.getSelectedItem().equals("N"))&&(comboBox_c.getSelectedItem().equals("N"))) {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("N");
				    }
        		    else {
        			    textField_1.setText("11.");
        			    textField_2.setText("Ver los retos de la vida de forma diferente.");
					    textField_3.setText("A");
        		    }	
        		}
        	}
        });
		// abcde, abcd, abce, abde, acde, bcde, abc, abd, abe, acd, ace, ade, bcd, bce, bde, cde
		registrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		registrar.setBounds(36, 372, 131, 43);
		panel_1.add(registrar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 367, 131, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 396, 400, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(197, 425, 131, 21);
		panel_1.add(textField_3);
		
		JLabel gabi = new JLabel("Psic. Gabriela S\u00E1nchez Morales");
		gabi.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 20));
		gabi.setBounds(523, 425, 215, 27);
		panel_1.add(gabi);
		
		JButton finalizar = new JButton("Finalizar");
		finalizar.setBounds(605, 385, 113, 36);
		panel_1.add(finalizar);
		finalizar.setBackground(Color.ORANGE);
		finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object [] {
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
				});	
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Actualización de membresía confirmada", "Sistema de registro", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		finalizar.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(754, 106, 492, 376);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 163, 474, 204);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"No.", "Indicadores", "Resultados"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(0).setMaxWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(400);
		table.getColumnModel().getColumn(1).setMaxWidth(400);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setMaxWidth(85);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_0 = new JLabel("          CAM \"\u00C1ngeles del cielo\"");
		lblNewLabel_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_0.setBounds(76, 10, 352, 54);
		panel_2.add(lblNewLabel_0);
		
		JLabel lblNewLabel_1 = new JLabel("     Ciclo escolar 2020-2021");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(137, 74, 241, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Nombre del alumno: ");
		lblNewLabel_2.setBounds(10, 119, 142, 20);
		panel_2.add(lblNewLabel_2);
		
		txtAyxguy = new JTextField();
		txtAyxguy.setBorder(null);
		txtAyxguy.setForeground(Color.BLACK);
		txtAyxguy.setBackground(new Color(255, 255, 255));
		txtAyxguy.setBounds(147, 120, 231, 19);
		panel_2.add(txtAyxguy);
		txtAyxguy.setColumns(10);
			
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(778, 492, 459, 57);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
			
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Nada para eliminar", "Sistema de registro", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Seleccione una fila para borrar", "Sistema de registro", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
				
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEliminar.setBounds(242, 10, 102, 34);
		panel_3.add(btnEliminar);
		
		JButton btnSalida = new JButton("Salida");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirmar para salir", "Sistema de registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnSalida.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalida.setBounds(354, 10, 95, 34);
		panel_3.add(btnSalida);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setBounds(10, 9, 110, 36);
		panel_3.add(reiniciar);
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_0.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				comboBox_5.setSelectedIndex(0);
				comboBox_a.setSelectedIndex(0);
				comboBox_b.setSelectedIndex(0);
				comboBox_c.setSelectedIndex(0);
				comboBox_d.setSelectedIndex(0);
				comboBox_e.setSelectedIndex(0);
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		reiniciar.setBackground(Color.GREEN);
		reiniciar.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(130, 10, 102, 34);
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//table.print();
				PrinterJob printerJob = PrinterJob.getPrinterJob();
				printerJob.setJobName("Print Record");
				printerJob.setPrintable(new Printable() {
					public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException{
						if(pageIndex>0) {
							return Printable.NO_SUCH_PAGE;
						}
						Graphics2D graphics2D = (Graphics2D)graphics;
						graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
						graphics2D.scale(1.2, 1.2);
						panel_2.print(graphics2D);
						
						return Printable.PAGE_EXISTS;
					}
				});
				boolean returningResult = printerJob.printDialog();
				if(returningResult) {
					try {
						printerJob.print();
					}catch(PrinterException prex) {
						JOptionPane.showMessageDialog(panel_2, "Print Error: " + prex.getMessage(), null, 0);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
	}	
}