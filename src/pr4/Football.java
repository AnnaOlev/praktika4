package pr4;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Football extends JFrame {
	
	public int milan_score = 0;
	public int madrid_score = 0;
	public String team_last;
	public String team_win;
	JButton b1 = new JButton("AC Milan");
	JButton b2 = new JButton("Real Madrid");
	JLabel l1 = new JLabel(milan_score + " X " + madrid_score);
	JLabel l2 = new JLabel("Last scorer: " + team_last);
	JLabel l3 = new JLabel("Winner: " + team_win);
	
	public Football()
	{
		super ("Game!");
		setSize(500,500);
		setLayout(null);
		super.getContentPane().setBackground(Color.GREEN);
		b1.setBounds(100, 20, 300, 50);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.BLACK);
		add(b1);
		b2.setBounds(100, 100, 300, 50);
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.BLUE);
		add(b2);
		l1.setBounds(100, 190, 300, 50);
		add(l1);
		l2.setBounds(100, 280, 300, 50);
		add(l2);
		l3.setBounds(100, 370, 300, 50);
		add(l3);
		
		b1.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				milan_score++;
				team_last = "AC Milan";
				click();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}

			@Override
			public void mouseExited(MouseEvent arg0) {}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
		});
		
		b2.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				madrid_score++;
				team_last = "Real Madrid";
				click();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}

			@Override
			public void mouseExited(MouseEvent arg0) {}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
		});	

	}
	
	public void click()
	{
		if (milan_score > madrid_score)
			team_win = "AC Milan";
		else if (milan_score < madrid_score)
			team_win = "Real Madrid";
		else
			team_win = "Friendship";
		l1.setText(milan_score + " X " + madrid_score);	
		l2.setText("Last scorer: " + team_last);
		l3.setText("Winner: " + team_win);
	}
	
	public static void main(String[]args)
	{
		new Football().setVisible(true);
	}
}
