package JavaSwing1;
import javax.swing.*;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HRA1 {
	JFrame f;
	JTextField t;
	static JTextField t1;
	static JTextField t2;
	public static double TS,HRA,ST;
	public static double DA;
	public static double PF;
	public static double Tax;
	public static int bs,clk;
	public  static void hra(){
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		
		JPanel p=new JPanel();
		f.add(p);
		p.setLayout(null);
		
		
		JLabel l=new JLabel("Name");
		l.setBounds(10,10,80,25);
		p.add(l);
		
		JTextField t=new JTextField(20);
		t.setBounds(100,10,160,25);
		p.add(t);
		
		JLabel l1=new JLabel("BasicSalary");
		l1.setBounds(10,40,80,25);
		p.add(l1);
	
		
		JTextField t1=new JTextField(20);
		t1.setBounds(100,40,160,25);
		p.add(t1);
		
		
		
		
		JCheckBox c=new JCheckBox("HRA");
		c.setBounds(10,80,80,25);
		p.add(c);
		c.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==c){
				int bs=Integer.parseInt(t1.getText());
				HRA=0.10*bs;
				
			}
			}
			
			
		});
		
		JCheckBox c1=new JCheckBox("DA");
		c1.setBounds(10,120,80,25);
		p.add(c1);
		c1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource()==c1){
				int bs=Integer.parseInt(t1.getText());
				DA=0.15*bs;
				}
				
			}
			
		});
		JTextField t2=new JTextField(30);
		t2.setBounds(180,70,100,25);
		p.add(t2);
		
		JLabel l2=new JLabel("TotalSalary");
		l2.setBounds(100,70,80,25);
		p.add(l2);
		
		
		JCheckBox c2=new JCheckBox("PF");
		c2.setBounds(100,100,80,25);
		p.add(c2);
		c2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent r) {
		
					PF=0.12*TS;
				
				
			}
			
		});
		
		JCheckBox c3=new JCheckBox("Tax");
		c3.setBounds(100,140,80,25);
		p.add(c3);
		c3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
					Tax=0.02*TS;
				
				
			}
			
		});
		
		JLabel l3=new JLabel("Salary in hand");
		l3.setBounds(100,180,80,25);
		p.add(l3);
		
		JTextField t3=new JTextField(20);
		t3.setBounds(190,180,100,25);
		p.add(t3);
		
		JButton b=new JButton("Calculate");
		b.setBounds(70,220,120,25);
		p.add(b);
		b.addActionListener(new ActionListener(){

		
			int clk;
			public void actionPerformed(ActionEvent a) {
			String name=t.getText();
			
			if(a.getSource()==b){
				
				if(clk%2==0){
			int bs=Integer.parseInt(t1.getText());
			TS=bs+HRA+DA;
			t2.setText(""+TS);
				}
				else{
			ST=TS-PF+Tax;
			t3.setText(""+ST);
			
				}
			}
			clk++;
			}
		});
		
		JButton b1=new JButton("Clear");
		b1.setBounds(200,220,120,25);
		p.add(b1);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent a) {
				
				if(a.getSource()==b1){
					clk=0;
					c.setSelected(false);
					c1.setSelected(false);
					c2.setSelected(false);
					c3.setSelected(false);
					t.setText("");
					t1.setText("");
					t2.setText("");
					t3.setText("");
				}
			}
			
		});
		
		JMenuBar m1=new JMenuBar();
		f.setJMenuBar(m1);
		
		JMenu mb=new JMenu("File");
		m1.add(mb);
		
		JMenuItem mi=new JMenuItem("New");
		mb.add(mi);
		
		JMenuItem mi1=new JMenuItem("Open");
		mb.add(mi1);
		
		JMenuItem mi2=new JMenuItem("Save");
		mb.add(mi2);
		
		JMenuItem mi3=new JMenuItem("Refresh");
		mb.add(mi3);
	
		 
		JMenuItem mi4=new JMenuItem("Close");
		mb.add(mi4);
		
	}
public static void main(String[] args) {
	hra();
}
}
