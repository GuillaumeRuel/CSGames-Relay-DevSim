import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	OptionPanel panOpt;
	OfficePanel panOffice;
	Container panel;
	GameFooter footer;
	GameSim sim;
	
	public GameFrame() {
		
		this.setTitle("Software Devs Simulator");
		this.setSize(1000, 920);
		panOpt = new OptionPanel(this);
		panOffice = new OfficePanel();
		panel = this.getContentPane();
		panel.add(panOpt, BorderLayout.WEST);
		panel.add(panOffice, BorderLayout.CENTER);
		
		sim = new GameSim();
		footer = new GameFooter(sim.week, sim.progress, sim.budget, sim.score);
		this.add(footer, BorderLayout.PAGE_END);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void redrawFrame() {
		
		this.revalidate();
		this.repaint();
		panOffice.revalidate();
		panOffice.repaint();
	}

}
