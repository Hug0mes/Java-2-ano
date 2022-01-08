import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.awt.Window.Type;

public class Design extends JFrame {

	private JPanel contentPane;
	boolean up=true;
	boolean up1=true;
	boolean up2=true;
	boolean up3=true;
	boolean up4=true;
	boolean up5=true;
	boolean up6=true;
	boolean up7=true;
	boolean up8=true;
	boolean up9=true;
	boolean up10=true;
	
	
	
int points = 0;
int lifes = 3;
	 //Launch the application.
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design frame = new Design();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//------------------------------
	//Collision function
	//------------------------------
	

	public boolean Choque(JLabel a,JLabel b) {

		boolean x=false;

		Rectangle r1 = a.getBounds();
		Rectangle r2 = b.getBounds();
		
		if(r2.intersects(r1)) {
			 x=true;
		}else {
			x=false;
		} 
			return x;
		}
	
	
	
	 //Create the frame.
	 
	public Design() {
		//------------------------------
		// Design and creation of elements
		//------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GRAY);
		
		JLabel Vidaextra = new JLabel("");
		Vidaextra.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\pixel2-heart.png"));
		Vidaextra.setBounds(535, 4, 30, 24);
		contentPane.add(Vidaextra);
		
		JLabel lbl_lifes = new JLabel("3");
		lbl_lifes.setForeground(Color.WHITE);
		lbl_lifes.setBounds(517, 8, 25, 16);
		contentPane.add(lbl_lifes);
		
		JLabel lbl_points = new JLabel("000");
		lbl_points.setForeground(Color.WHITE);
		lbl_points.setBounds(517, 27, 48, 16);
		contentPane.add(lbl_points);
		
		JLabel Pacman1 = new JLabel(".");
		Pacman1.setBackground(Color.PINK);
		Pacman1.setBounds(265, 268, 25, 24);
		Pacman1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Pacmanimg.png"));
		contentPane.add(Pacman1);
		
		JLabel lblNewLabel = new JLabel("...");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel.setBounds(0, 0, 301, 10);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("...");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_1.setBounds(293, 0, 301, 10);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("...");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2.setBounds(0, 0, 9, 151);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("...");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1.setBounds(0, 200, 9, 161);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("...");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_3.setBounds(0, 351, 301, 10);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("...");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_3_1.setBounds(293, 351, 301, 10);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("...");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_1.setBounds(575, 200, 9, 161);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("...");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_1_1.setBounds(575, -2, 9, 153);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("...");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_2.setBounds(55, 52, 9, 151);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("...");
		lblNewLabel_2_1_3.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_3.setBounds(98, 52, 9, 62);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("...");
		lblNewLabel_2_1_4.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_4.setBounds(51, 251, 9, 61);
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("...");
		lblNewLabel_2_1_5.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\Borders.jpg"));
		lblNewLabel_2_1_5.setBounds(98, 151, 9, 52);
		contentPane.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("...");
		lblNewLabel_2_1_6.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_6.setBounds(157, 100, 9, 161);
		contentPane.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("...");
		lblNewLabel_2_1_7.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_7.setBounds(59, 52, 48, 10);
		contentPane.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("...");
		lblNewLabel_2_1_8.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_8.setBounds(59, 193, 48, 10);
		contentPane.add(lblNewLabel_2_1_8);
		
		JLabel lblNewLabel_2_1_9 = new JLabel("...");
		lblNewLabel_2_1_9.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9.setBounds(157, 52, 250, 10);
		contentPane.add(lblNewLabel_2_1_9);
		
		JLabel Tele1 = new JLabel("");
		Tele1.setBounds(575, 168, 9, 21);
		contentPane.add(Tele1);
		
		JLabel Tele2 = new JLabel("");
		Tele2.setBounds(0, 168, 9, 21);
		contentPane.add(Tele2);
		
		JLabel lblNewLabel_2_1_9_1 = new JLabel("...");
		lblNewLabel_2_1_9_1.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_1.setBounds(109, 302, 140, 10);
		contentPane.add(lblNewLabel_2_1_9_1);
		
		JLabel lblNewLabel_2_1_6_1 = new JLabel("...");
		lblNewLabel_2_1_6_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_6_1.setBounds(398, 100, 9, 161);
		contentPane.add(lblNewLabel_2_1_6_1);
		
		JLabel lblNewLabel_2_1_6_1_1 = new JLabel("...");
		lblNewLabel_2_1_6_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_6_1_1.setBounds(213, 100, 9, 76);
		contentPane.add(lblNewLabel_2_1_6_1_1);
		
		JLabel lblNewLabel_2_1_6_1_2 = new JLabel("...");
		lblNewLabel_2_1_6_1_2.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_6_1_2.setBounds(330, 100, 9, 76);
		contentPane.add(lblNewLabel_2_1_6_1_2);
		
		JLabel lblNewLabel_2_1_9_2 = new JLabel("...");
		lblNewLabel_2_1_9_2.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_2.setBounds(213, 170, 126, 10);
		contentPane.add(lblNewLabel_2_1_9_2);
		
		JLabel lblNewLabel_2_1_9_2_1 = new JLabel("...");
		lblNewLabel_2_1_9_2_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_2_1.setBounds(213, 100, 36, 10);
		contentPane.add(lblNewLabel_2_1_9_2_1);
		
		JLabel lblNewLabel_2_1_9_2_1_1 = new JLabel("...");
		lblNewLabel_2_1_9_2_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_2_1_1.setBounds(303, 100, 36, 10);
		contentPane.add(lblNewLabel_2_1_9_2_1_1);
		
		JLabel lblNewLabel_2_1_9_1_1 = new JLabel("...");
		lblNewLabel_2_1_9_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_1_1.setBounds(109, 251, 56, 10);
		contentPane.add(lblNewLabel_2_1_9_1_1);
		
		JLabel lblNewLabel_2_1_9_1_2 = new JLabel("...");
		lblNewLabel_2_1_9_1_2.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_1_2.setBounds(303, 302, 151, 10);
		contentPane.add(lblNewLabel_2_1_9_1_2);
		
		JLabel lblNewLabel_2_1_9_1_1_1 = new JLabel("...");
		lblNewLabel_2_1_9_1_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_9_1_1_1.setBounds(398, 251, 56, 10);
		contentPane.add(lblNewLabel_2_1_9_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Pontos:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(468, 26, 48, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Vidas:");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(468, 8, 48, 16);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(462, 0, 77, 48);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_1_6_1_3 = new JLabel("...");
		lblNewLabel_2_1_6_1_3.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_6_1_3.setBounds(458, 0, 126, 49);
		contentPane.add(lblNewLabel_2_1_6_1_3);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("...");
		lblNewLabel_2_1_5_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_5_1.setBounds(459, 150, 9, 60);
		contentPane.add(lblNewLabel_2_1_5_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("...");
		lblNewLabel_2_1_3_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_3_1.setBounds(458, 49, 9, 66);
		contentPane.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("...");
		lblNewLabel_2_1_2_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_2_1.setBounds(507, 42, 9, 169);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_8_1 = new JLabel("...");
		lblNewLabel_2_1_8_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_8_1.setBounds(468, 200, 48, 10);
		contentPane.add(lblNewLabel_2_1_8_1);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("...");
		lblNewLabel_2_1_4_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_4_1.setBounds(507, 251, 9, 61);
		contentPane.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("...");
		lblNewLabel_2_1_4_2.setIcon(new ImageIcon("C:\\Users\\35192\\Desktop\\TGPSI\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1_4_2.setBounds(213, 227, 126, 24);
		contentPane.add(lblNewLabel_2_1_4_2);
		
		JLabel Cereja = new JLabel("New label");
		Cereja.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja.setBounds(540, 316, 25, 24);
		contentPane.add(Cereja);
		
		JLabel Cereja_1 = new JLabel("New label");
		Cereja_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1.setBounds(74, 68, 25, 24);
		contentPane.add(Cereja_1);
		
		JLabel Cereja_1_1 = new JLabel("New label");
		Cereja_1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_1.setBounds(224, 131, 25, 24);
		contentPane.add(Cereja_1_1);
		
		JLabel Cereja_1_2 = new JLabel("New label");
		Cereja_1_2.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_2.setBounds(74, 285, 25, 24);
		contentPane.add(Cereja_1_2);
		
		JLabel Cereja_1_3 = new JLabel("New label");
		Cereja_1_3.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_3.setBounds(424, 21, 25, 24);
		contentPane.add(Cereja_1_3);
		
		JLabel Cereja_1_4 = new JLabel("New label");
		Cereja_1_4.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_4.setBounds(526, 52, 25, 24);
		contentPane.add(Cereja_1_4);
		
		JLabel Cereja_1_5 = new JLabel("New label");
		Cereja_1_5.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_5.setBounds(472, 170, 25, 24);
		contentPane.add(Cereja_1_5);
		
		JLabel Cereja_1_6 = new JLabel("New label");
		Cereja_1_6.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_6.setBounds(408, 273, 25, 24);
		contentPane.add(Cereja_1_6);
		
		JLabel Cereja_1_7 = new JLabel("New label");
		Cereja_1_7.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja_1_7.setBounds(260, 191, 25, 24);
		contentPane.add(Cereja_1_7);
		
		JLabel Ghost1 = new JLabel(".");
		Ghost1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\blueGhost.png"));
		Ghost1.setBounds(128, 27, 27, 32);
		contentPane.add(Ghost1);
		
		JLabel Ghost1_1 = new JLabel(".");
		Ghost1_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Fantasma_V1.png"));
		Ghost1_1.setBounds(61, 111, 27, 32);
		contentPane.add(Ghost1_1);
		
		JLabel Ghost1_2 = new JLabel(".");
		Ghost1_2.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Fantasma_V1.png"));
		Ghost1_2.setBounds(263, 127, 27, 32);
		contentPane.add(Ghost1_2);
		
		JLabel Ghost1_3 = new JLabel(".");
		Ghost1_3.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\FantasmaV.png"));
		Ghost1_3.setBounds(474, 59, 27, 32);
		contentPane.add(Ghost1_3);
		
		JLabel Ghost1_4 = new JLabel(".");
		Ghost1_4.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\blueGhost - C\u00F3pia.png"));
		Ghost1_4.setBounds(540, 50, 27, 32);
		contentPane.add(Ghost1_4);
		
		JLabel Ghost1_5 = new JLabel(".");
		Ghost1_5.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\FantasmaV.png"));
		Ghost1_5.setBounds(72, 308, 27, 32);
		contentPane.add(Ghost1_5);
		
		JLabel Ghost1_6 = new JLabel(".");
		Ghost1_6.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\FantasmaV.png"));
		Ghost1_6.setBounds(19, 58, 27, 32);
		contentPane.add(Ghost1_6);
		
		JLabel Ghost1_7 = new JLabel(".");
		Ghost1_7.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\blueGhost.png"));
		Ghost1_7.setBounds(357, 264, 27, 32);
		contentPane.add(Ghost1_7);
		
		JLabel Ghost1_8 = new JLabel(".");
		Ghost1_8.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\blueGhost - C\u00F3pia.png"));
		Ghost1_8.setBounds(424, 313, 27, 32);
		contentPane.add(Ghost1_8);
		
			
		// Array das paredes 
		
		 JLabel[] labelH = new JLabel[]{lblNewLabel_2_1_7,  lblNewLabel_2_1_2,    lblNewLabel_2_1_3, 	  lblNewLabel_2_1_8,
				 						lblNewLabel_2_1_5,  lblNewLabel_2_1_9,    lblNewLabel_2_1_6,	  lblNewLabel_2_1_9_1_1,
				 						lblNewLabel_2_1_4,  lblNewLabel_2_1_9_1,  lblNewLabel_2_1_9_2_1,  lblNewLabel_2_1_6_1_1,
				 						lblNewLabel_2_1_9_2,lblNewLabel_2_1_6_1_2,lblNewLabel_2_1_9_2_1_1,lblNewLabel_2_1_1_1,
				 						lblNewLabel_2_1_1,  lblNewLabel_2, 		  lblNewLabel_2_1, 		  lblNewLabel_5,
				 						lblNewLabel_2_1_3_1,lblNewLabel_2_1_5_1,  lblNewLabel_2_1_2_1, 	  lblNewLabel_2_1_8_1,
				 						lblNewLabel_2_1_4_1,lblNewLabel_2_1_9_1_2,lblNewLabel_2_1_4_2,	  lblNewLabel_2_1_6_1,
				 						lblNewLabel_2_1_9_1_1_1 };
	
		 JLabel[] labelCereja = new JLabel[]{Cereja_1_7, Cereja_1_1, Cereja_1, 	 Cereja_1_2, Cereja_1_6,
				 							 Cereja_1_3, Cereja_1_4, Cereja_1_5, Cereja };
		 
		 //Ghost 
		 JLabel[] Ghost = new JLabel[]{Ghost1,Ghost1_1,Ghost1_2,Ghost1_3,Ghost1_4,Ghost1_5,Ghost1_6,Ghost1_7,Ghost1_8};
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				if(e.getKeyCode()== KeyEvent.VK_W) {
					Pacman1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\PacmanUp.png"));
					
					if (Pacman1.getLocation().y > 10) {
						Pacman1.setLocation(Pacman1.getLocation().x, Pacman1.getLocation().y - 5);
					}	
					//Collision verification
					for (int i = 0; i <= 28; i = i + 1) {
					if(Choque(Pacman1,labelH[i])) {
						Pacman1.setLocation(Pacman1.getLocation().x, Pacman1.getLocation().y + 5);
					}}
					
				}
				
				//S key
				
				if(e.getKeyCode()== KeyEvent.VK_S) {
					Pacman1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Pacmandown.png"));
					
					if (Pacman1.getLocation().y < 315) {
						Pacman1.setLocation(Pacman1.getLocation().x, Pacman1.getLocation().y + 5);
					}
					//Collision verification
					for (int i = 0; i <= 28; i = i + 1) {
						if(Choque(Pacman1,labelH[i])) {
							Pacman1.setLocation(Pacman1.getLocation().x, Pacman1.getLocation().y - 5);
						}}
					
						
				}
				
				//A key
				
				if(e.getKeyCode()== KeyEvent.VK_A) {
					Pacman1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\PacmanBack.png"));
					
					if (Pacman1.getLocation().x > 7) {
						Pacman1.setLocation(Pacman1.getLocation().x  - 5, Pacman1.getLocation().y);
					}
					//Collision verification
					for (int i = 0; i <= 28; i = i + 1) {
						if(Choque(Pacman1,labelH[i])) {
							Pacman1.setLocation(Pacman1.getLocation().x + 5, Pacman1.getLocation().y);
						}
						}
				}
				
				//D key
				
				if(e.getKeyCode()== KeyEvent.VK_D) {
					Pacman1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Pacmanimg.png"));
					
					if (Pacman1.getLocation().x < 555) {
						Pacman1.setLocation(Pacman1.getLocation().x  + 5, Pacman1.getLocation().y);
					}
					//Collision verification
					for (int i = 0; i <= 28; i = i + 1) {
						if(Choque(Pacman1,labelH[i])) {
							Pacman1.setLocation(Pacman1.getLocation().x - 5, Pacman1.getLocation().y);
						}}
				}
			}
		}); 	
	

		//Timer
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {



				// Intersections and collisions

				//teleport 1 an 2
				if(Choque(Pacman1,Tele2)) {
					Pacman1.setLocation(Pacman1.getLocation().x  + 542, Pacman1.getLocation().y);
				}
				if(Choque(Pacman1,Tele1)) {
					Pacman1.setLocation(Pacman1.getLocation().x  - 542, Pacman1.getLocation().y);
				}

				//Intersection with "Cerejas"
								if(Choque(Pacman1,labelCereja[0])) {
									labelCereja [0].setIcon(new ImageIcon(""));
									labelCereja[0].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[1])) {
									labelCereja [1].setIcon(new ImageIcon(""));
									labelCereja[1].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[2])) {
									labelCereja [2].setIcon(new ImageIcon(""));
									labelCereja[2].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[3])) {
									labelCereja [3].setIcon(new ImageIcon(""));
									labelCereja[3].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[4])) {
									labelCereja [4].setIcon(new ImageIcon(""));
									labelCereja[4].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[5])) {
									labelCereja [5].setIcon(new ImageIcon(""));
									labelCereja[5].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[6])) {
									labelCereja [6].setIcon(new ImageIcon(""));
									labelCereja[6].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[7])) {
									labelCereja [7].setIcon(new ImageIcon(""));
									labelCereja[7].setText("");
									points= points + 100;
								}
								if(Choque(Pacman1,labelCereja[8])) {
									labelCereja [8].setIcon(new ImageIcon(""));
									labelCereja[8].setText("");
									points= points + 100;
								}



					if(Choque(Pacman1,Vidaextra)) {
						Vidaextra.setIcon(new ImageIcon(""));
						Vidaextra.setText("");
						lifes = lifes + 1;
						//Vidaextra.setText(lifes);
					}

			}}, 1, 1);


		timer.schedule(new TimerTask() {
			@Override
			public void run() {

			//Ghost 1_3
					if(up) {
						if(Ghost1_3.getLocation().y>50) {
							Ghost1_3.setLocation(Ghost1_3.getLocation().x, Ghost1_3.getLocation().y-4);
						}

						else {
						up=false;
						}
							}
					//Down
						else{
							if(Ghost1_3.getLocation().y<150) {
								Ghost1_3.setLocation(Ghost1_3.getLocation().x, Ghost1_3.getLocation().y+5);
							}
							else{
								up=true;
								}
						}
					//----------------------------------------------------------------------------------
					//Ghost1_2
					if(up1) {
						if(Ghost1_2.getLocation().x >230) {
							Ghost1_2.setLocation(Ghost1_2.getLocation().x - 4, Ghost1_2.getLocation().y);
						}

						else {
						up1=false;
						}
							}
					//Down
						else{
							if(Ghost1_2.getLocation().x<300) {
								Ghost1_2.setLocation(Ghost1_2.getLocation().x + 4, Ghost1_2.getLocation().y);
							}
							else{
								up1=true;
								}
						}
					//----------------------------------------------------------------------------------
					//Ghost1_1
					if(up2) {
						if(Ghost1_1.getLocation().y >63) {
							Ghost1_1.setLocation(Ghost1_1.getLocation().x, Ghost1_1.getLocation().y - 4);
						}

						else {
						up2=false;
						}
							}
					//Down
						else{
							if(Ghost1_1.getLocation().y<160) {
								Ghost1_1.setLocation(Ghost1_1.getLocation().x, Ghost1_1.getLocation().y + 5);
							}
							else{
								up2=true;
								}
						}
					//----------------------------------------------------------------------------------
					//Ghost1_5
					if(up3) {
						if(Ghost1_5.getLocation().y >210) {
							Ghost1_5.setLocation(Ghost1_5.getLocation().x, Ghost1_5.getLocation().y -4);
						}

						else {
						up3=false;
						}
							}
					//Down
						else{
							if(Ghost1_5.getLocation().y<315) {
								Ghost1_5.setLocation(Ghost1_5.getLocation().x, Ghost1_5.getLocation().y + 4);
							}
							else{
								up3=true;
								}
						}
					//----------------------------------------------------------------------------------
		}}, 10, 400);



		timer.schedule(new TimerTask() {
			@Override
			public void run() {

				//Ghost 1_6
				if(up) {
					if(Ghost1_6.getLocation().y>50) {
						Ghost1_6.setLocation(Ghost1_6.getLocation().x, Ghost1_6.getLocation().y-4);
					}

					else {
					up=false;
					}
						}
				//Down
					else{
						if(Ghost1_6.getLocation().y<350) {
							Ghost1_6.setLocation(Ghost1_6.getLocation().x, Ghost1_6.getLocation().y+5);
						}
						else{
							up=true;
							}
					}
				//----------------------------------------------------------------------------------








			}}, 10, 200);
	
		}
	}