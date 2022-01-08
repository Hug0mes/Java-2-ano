import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class nivel_bonus extends JFrame {

	int points = 0;
	int time = 60;
	
	Random rand = new Random();
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nivel_bonus frame = new nivel_bonus();
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
		
		
	/**
	 * Create the frame.
	 */
	public nivel_bonus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GRAY);
		
		JLabel Pacman1 = new JLabel(".");
		Pacman1.setBackground(Color.PINK);
		Pacman1.setBounds(198, 326, 25, 24);
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
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2.setBounds(0, 0, 9, 151);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("...");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_2_1.setBounds(0, 200, 9, 161);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("...");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
		lblNewLabel_3.setBounds(0, 351, 301, 10);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("...");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\Borders.jpg"));
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
		
	
		JLabel Tele1 = new JLabel("");
		Tele1.setBounds(575, 168, 9, 21);
		contentPane.add(Tele1);
		
		JLabel Tele2 = new JLabel("");
		Tele2.setBounds(0, 168, 9, 21);
		contentPane.add(Tele2);
		
		JLabel lblNewLabel_4 = new JLabel("Pontos: ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_4.setBounds(438, 9, 69, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nivel Bonus");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel_5.setBounds(21, 8, 186, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Nivel Bonus");
		lblNewLabel_5_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_5_1.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel_5_1.setBounds(19, 9, 269, 33);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tempo: ");
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(438, 41, 69, 24);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lbl_points = new JLabel("000");
		lbl_points.setFont(new Font("Verdana", Font.BOLD, 15));
		lbl_points.setBounds(505, 14, 69, 24);
		contentPane.add(lbl_points);
		
		JLabel lbl_time = new JLabel("000");
		lbl_time.setFont(new Font("Verdana", Font.BOLD, 15));
		lbl_time.setBounds(505, 41, 69, 24);
		contentPane.add(lbl_time);
		
		JLabel Cereja = new JLabel("\u00BA");
		Cereja.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\cereja1.png"));
		Cereja.setBounds(276, 170, 25, 24);
		contentPane.add(Cereja);
		
	
		
		// Array das paredes 
		
				 JLabel[] labelH = new JLabel[]{lblNewLabel_2_1_1_1, lblNewLabel_2_1_1,  lblNewLabel_2,
						 						lblNewLabel_2_1, 	 lblNewLabel_3_1, 	 lblNewLabel_3,	
						 						};

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				if(e.getKeyCode()== KeyEvent.VK_W) {
					Pacman1.setIcon(new ImageIcon("C:\\Users\\35192\\eclipse-workspace\\Pacman_604\\imagens\\PacmanUp.png"));
					
					if (Pacman1.getLocation().y > 10) {
						Pacman1.setLocation(Pacman1.getLocation().x, Pacman1.getLocation().y - 5);
					}	
					//Collision verification
					for (int i = 0; i <= 5; i = i + 1) {
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
					for (int i = 0; i <=5; i = i + 1) {
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
					for (int i = 0; i <= 5; i = i + 1) {
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
					for (int i = 0; i <= 5; i = i + 1) {
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
				
			lbl_time.setText(String.valueOf(time));
			lbl_points.setText(String.valueOf(points));
				
				// Intersections and collisions
						
				//teleport 1 an 2
				if(Choque(Pacman1,Tele2)) {
					Pacman1.setLocation(Pacman1.getLocation().x  + 542, Pacman1.getLocation().y);
				}
				if(Choque(Pacman1,Tele1)) {
					Pacman1.setLocation(Pacman1.getLocation().x  - 542, Pacman1.getLocation().y);
				} 
				
				if(Choque(Pacman1,Cereja)){
					
					 int rand_x = rand.nextInt(550);
				     int rand_y = rand.nextInt(327);
					
					Cereja.setLocation(rand_x,rand_y);
					
					points += 100;
					
				}
					
			
					
					//perder
					if (time == 0) { 
						timer.cancel();
						 int result = JOptionPane.showConfirmDialog(null,
									"Acabou o tempo", " Parabens a sua pontuação foi" + lbl_points + "Pretende Continuar ?",
									JOptionPane.YES_NO_OPTION);
					
								  if (result == JOptionPane.YES_OPTION) {
								 
								time = 60;	
						
								  }  else if (result == JOptionPane.NO_OPTION) {
								 

								  }
					}
					
					
					//ganhar
					if(points == 100) {
						
					 int result = JOptionPane.showConfirmDialog(null,
								"Ganhou o jogo Parabens", "Wooooowww", JOptionPane.YES_NO_OPTION);
				
							  if (result == JOptionPane.YES_OPTION) {
								  
							nivel_bonus bonus = new nivel_bonus(); 
							Design level = new Design();
					
							bonus.setVisible(true); 	
							level.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

								  points = 1;
						
							  }  else if (result == JOptionPane.NO_OPTION) {
							 

							  }
					}	
					
			}}, 1, 1);
					
		
		
	
		
	}
}
