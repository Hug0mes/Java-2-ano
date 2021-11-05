import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;	

public class maximoform extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	Random rnd = new Random();
	
		int min= 0;
		int maxi= 0;
		int total= 0;
		int num= 0;
	
	ArrayList<Integer> numeros = new ArrayList<Integer>();
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
		textArea.setBounds(94, 69, 95, 203);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Gerar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				for(int i=0; i<100; i++);
				num= rnd.nextInt(100);
				textArea.setText(textArea.getText()+num+"\n");
				numeros.add(num);
			}
		});
		btnNewButton.setBounds(237, 70, 97, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Maximo");
		chckbxNewCheckBox.setBounds(237, 123, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Minimo");
		chckbxNewCheckBox_1.setBounds(237, 149, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Media");
		chckbxNewCheckBox_2.setBounds(237, 175, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("...");
		chckbxNewCheckBox_3.setBounds(237, 201, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(237, 250, 97, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(380, 70, 97, 203);
		contentPane.add(textField_1);
		
		
	}
}
