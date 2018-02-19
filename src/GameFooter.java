import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFooter extends JPanel{
	
	JLabel lbWeek;
	JLabel lbProgress;
	JLabel lbBudget;
	JLabel lbScore;
	
	
	public GameFooter(int week, double progress, double budget, int score) {
		
		this.lbWeek = new JLabel("Week: " + week);
		this.lbProgress = new JLabel("Progress: " + progress+"%");
		this.lbBudget = new JLabel("Budget balance: " + budget);
		this.lbScore = new JLabel("Score: " + score);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
		this.add(lbWeek);
		this.add(lbProgress);
		this.add(lbBudget);
		JLabel lbTest = new JLabel(" ");
		lbTest.setPreferredSize(new Dimension(300, 20));
		this.add(lbTest);
		this.add(lbScore);
		
		this.setPreferredSize(new Dimension(1000, 20));
	}
	
	public void setWeek(int week) {
		
		lbWeek.setText("Week: "+week);
	}
	
	public void setProgress(double prog) {
			
		lbProgress.setText("Progress: "+prog+"%");
	}
	
	public void setBudget(double budget) {
		
		lbBudget.setText("Budget balance: "+budget);
	}
	
	public void setScore(int score) {
		
		lbScore.setText("Score: "+score);
	}
}