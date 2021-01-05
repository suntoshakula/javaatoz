package javacertification.samples;

import javax.swing.JOptionPane;

public class JoptionPane {
public static void main(String[] args) {
	String s;
	s = JOptionPane.showInputDialog("enter int");
	int x= Integer.parseInt(s);
	System.out.println("you entered "+x);
}
}
