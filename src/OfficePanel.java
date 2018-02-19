import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OfficePanel extends JPanel{
	
	public OfficePanel() {
		
		this.setPreferredSize(new Dimension(800,900));
		this.setLayout(new GridLayout(10, 10));
	}
	
	//Ceci ajoute un worker(prog/tester) au paneau
	public void addWorker(Worker worker) {
		
		this.add(new JLabel(worker.getImage()));
		
		this.repaint();
		this.revalidate();
	}

}
