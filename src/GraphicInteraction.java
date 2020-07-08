import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField; 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
public class GraphicInteraction {
	static boolean on = false;


	public static void main(String[] args) {

		// create frame and set visible
		JFrame imageFrame = new JFrame("Stage");
		imageFrame.setVisible(true);
		imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imageFrame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		//create switch label
		JLabel switchLabel = new JLabel();
		ImageIcon image1 = new ImageIcon("src/OffSwitch.jpg");
		switchLabel.setIcon(image1);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10,10,10,10);
		imageFrame.add(switchLabel,gbc);
		//create image label
		JLabel imageLabel = new JLabel();
		ImageIcon image2 = new ImageIcon("src/tv.png");
		imageLabel.setIcon(image2);
		gbc.gridx = 1;
		
		imageFrame.add(imageLabel,gbc);
		
		// create panel
		//JPanel panel = new JPanel();
		//panel.add(switchLabel);
		//panel.add(imageLabel);
		//imageFrame.getContentPane().add(panel);
		imageFrame.pack();
		
		//action listner
		imageFrame.addMouseListener(new MouseListener() {
		public void mousePressed(MouseEvent me) { }
		public void mouseReleased(MouseEvent me) { }
		public void mouseEntered(MouseEvent me) { }
		public void mouseExited(MouseEvent me) { }
		public void mouseClicked(MouseEvent me) {
			//conditional statements
			if (on) {
				ImageIcon image = new ImageIcon("src/OffSwitch.jpg");
				switchLabel.setIcon(image);
				image = new ImageIcon("src/tv.png");
				imageLabel.setIcon(image);
			
				on = false;
			}
			else {
				ImageIcon image = new ImageIcon("src/OnSwitch.jpg");
				switchLabel.setIcon(image);
				image = new ImageIcon("src/images.jpeg");
				imageLabel.setIcon(image);
				on = true; 
			}
			}
		});	
		
		
	
		
		
		
		

	}

}
