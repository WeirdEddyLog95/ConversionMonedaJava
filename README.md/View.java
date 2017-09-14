package MVP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class View {
	
	private Presenter presenter;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

    public View() {
        createUI();
    }
    
    private void createUI() {
    	
    	JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    			
		JLabel lblNewLabel = new JLabel("Bienvenido a la aplicacion de conversion de monedas");
		lblNewLabel.setBounds(10, 11, 400, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Se permite convertir estas siguientes monedas, Pesos, Dolares y Euros");
		lblNewLabel_1.setBounds(10, 36, 435, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 143, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Object[] data1 = { "PESOS", "DOLARES", "EUROS" };
		    
        final JList list = new JList(data1);
		list.setBounds(163, 61, 55, 55);
		contentPane.add(list);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 125, 143, 26);
		textField_1.disable();
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Object[] data2 = { "PESOS", "DOLARES", "EUROS" };
		
		final JList list_1 = new JList(data2);
		list_1.setBounds(163, 125, 55, 55);
		contentPane.add(list_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(10, 185, 89, 23);
		contentPane.add(btnConvertir);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(10, 221, 89, 14);
		contentPane.add(lblResultados);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 243, 410, 20);
		textField_2.disable();
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnConvertir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        		double monedaActual = Double.parseDouble(textField.getText());
        		//double monedaConvertida = Double.parseDouble(textField_1.getText());
        		String mon1 = (String) list.getSelectedValue();
        		String mon2 = (String) list_1.getSelectedValue();
        		presenter.Operaciones(monedaActual, mon1, mon2);	
        	}
            
        });
		
		JFrame frame = new JFrame("Conversion de Pesos, Dolares y Euros");
		((JPanel)frame.getContentPane()).setBackground(Color.white);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//frame.add(lblNewLabel);
		//frame.setBounds(500, 400, 600, 400);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(contentPane);
		frame.setBounds(450, 350, 450, 310);
		
		
    }
    
    public void setPresenter(Presenter pres) {
        presenter = pres;
    }
    //called by the presenter to update the status label.
    public void updateStatusLabel(String text, double resultado) {
    	//Esta vez para pasar los resultados
    	String res = String.valueOf(resultado);
    	textField_1.setText(res);
    	textField_2.setText(text);
    }

}
