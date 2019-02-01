import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
public class MyJPanel extends JFrame{

	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	@SuppressWarnings("deprecation")
	public MyJPanel(){
		frame = new JFrame("²âÊÔ  JPanel ×é¼þ");
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder("panel1"));
		panel1.add(new JButton("panel1"));
		
		panel2 = new JPanel();
		panel2.add(new JButton("panel2"));
		panel2.setBorder(new TitledBorder("panel2"));
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(panel1);//,BorderLayout.SOUTH
		cp.add(panel2);//,BorderLayout.NORTH
		frame.setSize(350,270);
		frame.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyJPanel();
	}

}
