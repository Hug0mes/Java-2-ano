import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JScrollBar;	

public class maximoform extends JFrame {

	private JPanel contentPane;
	Random rnd = new Random();
	
		int min= 0;
		int maxi= 0;
		int total= 0;
		int num= 0;

	ArrayList<Integer> numeros = new ArrayList<Integer>();
	protected AbstractButton textArea_1;
	/**
	 Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maximoform frame = new maximoform();
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
	public maximoform() {
		setTitle("Maximo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-2, -31, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		JTextArea textArea_1 = new JTextArea();
		textArea.setBackground(new Color(204, 204, 204));
		textArea.setBounds(92, 69, 95, 203);
		contentPane.add(textArea);
		
	//Random number
		JButton btnNewButton = new JButton("Gerar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				for(int i=0; i<100; i++) {
				num= rnd.nextInt(100);
				textArea.setText(textArea.getText()+num+"\n");
				numeros.add(num);
			}
			}
		});
		btnNewButton.setBounds(237, 70, 97, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Media");
		chckbxNewCheckBox.setBounds(237, 123, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Maximo");
		chckbxNewCheckBox_1.setBounds(237, 149, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Minimo");
		chckbxNewCheckBox_2.setBounds(237, 175, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Ordem crescente");
		chckbxNewCheckBox_3.setBounds(237, 201, 115, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		
		//change counted of text area
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea_1.setText("");
				 min= 0;
				 maxi= 0;
				 total= 0;
				num=0;
			}
		});
		btnNewButton_1.setBounds(237, 279, 97, 23);
		contentPane.add(btnNewButton_1);
		
		
		textArea_1.setBackground(new Color(204, 204, 204));
		textArea_1.setBounds(377, 69, 95, 203);
		contentPane.add(textArea_1);
		
		JButton btnNewButton_1_1 = new JButton("Estatistica");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<100;i++) {

					if(chckbxNewCheckBox.isSelected()) {

						total+=numeros.get(i);
						textArea_1.setText("Média " + String.valueOf(total/100));

					}

					if(chckbxNewCheckBox_1.isSelected()) {

						num=numeros.get(i);
						
						if ( num > maxi){
							maxi=num;
						}	
					}
					
					 if(chckbxNewCheckBox_2.isSelected()) {
						 
						 num = numeros.get(i);
							
							if ( num < min){
								min=num;
					 }

					 if(chckbxNewCheckBox_3.isSelected()) {
						 
						 
						 
					 }

					 
					 
					}textArea_1.setText(String.valueOf("Média... " + total/100	+ "\n") + "Max... " +  maxi + "\n" +("Min..." + min));

				}}
		});
		btnNewButton_1_1.setBackground(new Color(204, 204, 204));
		btnNewButton_1_1.setBounds(237, 249, 97, 23);
		contentPane.add(btnNewButton_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(557, 11, 17, 339);
		contentPane.add(scrollBar);
		
		
	}
}
