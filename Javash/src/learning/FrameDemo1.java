import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class FrameDemo1 {
	
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("窗体实例FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel emptyLabel = new JLabel("Hello World!");
		emptyLabel.setPreferredSize(new Dimension(375,330));
		Container cp = new JPanel();
		frame.getContentPane().add(cp,BorderLayout.CENTER);
		frame.getContentPane().add(emptyLabel,BorderLayout.NORTH);
		
		//组件
		
		frame.getContentPane().add(new JButton("btn-new"),BorderLayout.SOUTH);
		
		cp.add(new JCheckBox("reading"));
		cp.add(new JRadioButton());
		
		cp.add(new JTextField("请输入姓名："));
		JPasswordField password = new JPasswordField(16);
		password.setEchoChar('@');
		cp.add(password);
		/*String pets[] = {"dog","cat","fish"};
		JComboBox comboBox= new JComboBox(pets);
		combobox.setSelectedIndex(3);
		cp.add(comboBox);*/
		cp.add(new  JSlider());
		cp.add(new JSpinner());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("菜单A");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("Only this menu has submenu.");
		menuBar.add(menu);
		cp.add(menuBar);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
				System.out.println(123);
			}
		});
	}

}
