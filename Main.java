package dice;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Main extends JFrame{
  public static void main(String args[]){
	  Main frame = new Main("タイトル");
    frame.setVisible(true);
  }

  Main(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JTextField text1 = new JTextField("ダイスの数", 20);
    JTextField text2 = new JTextField("面の数", 20);
    JTextField text3 = new JTextField("固定値", 20);

    p.add(text1);
    p.add(text2);
    p.add(text3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
    
	System.out.println("期待値は" + n);
  }
}