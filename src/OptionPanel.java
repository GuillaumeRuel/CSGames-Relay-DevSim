import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel{
	
	JLabel lbHire = new JLabel("Hire");
	JButton btnHireProg = new JButton("Programmer");
	JButton btnHireTester= new JButton("Tester");
	
	JLabel lbAction = new JLabel("Action(s)");
	JButton btnActOutSource = new JButton("Outsource");
	JButton btnActEarlyAcc = new JButton("Early access release");
	
	JButton btnNextWeek = new JButton("Next week");
	JButton btnScoreboard = new JButton("Scoreboard");
	JButton btnBudget = new JButton("Detailed Budget");
	
	JButton btnQuit = new JButton("Quit");
	
	GameFrame gameFrame;
	
	public OptionPanel(GameFrame gameFrame) {
		
		this.gameFrame = gameFrame;
		this.setLayout(new GridLayout(10, 1, 0,20));
		this.setPreferredSize(new Dimension(200, 900));
		this.add(lbHire);
		this.add(btnHireProg);
		this.add(btnHireTester);
		
		this.add(lbAction);
		this.add(btnActOutSource);
		this.add(btnActEarlyAcc);
		
		this.add(btnNextWeek);
		
		this.add(btnScoreboard);
		this.add(btnBudget);
		
		this.add(btnQuit);
		OptionController();
	}
	
	public void OptionController() {
		
		btnHireProg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Genre quand on click sur le bouton ca ajoute un programmeur a l'ecran
				gameFrame.panOffice.addWorker(new Programmer());
				gameFrame.redrawFrame();
			}
		});
		
		btnHireTester.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				gameFrame.panOffice.addWorker(new Tester());
				gameFrame.redrawFrame();
			}
		});
	}

}
