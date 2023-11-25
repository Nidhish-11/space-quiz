import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Quiz implements ActionListener,ItemListener
{
	JFrame f;
	JPanel p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l30,l31,lPB;
	Color c2,c3;
	int x,p=0,correct=0,wrong=0;
	ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6;
	JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13,rb14,rb15,rb16,rb17,rb18,rb19,rb20,rb21,rb22,rb23,rb24;
	JProgressBar jb;

	Quiz()
	{
		f=new JFrame();		
		f.setLayout(null);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		f.setBounds(0,0,screenSize.width,screenSize.height);
		f.setUndecorated(true);
		//f.setSize(1405,735);
		f.setContentPane(new JLabel(new ImageIcon("images/original1.jpg")));
		c2=new Color(192,192,192);
		//TICK
		p11=new JPanel();
		p11.setBounds(65,65,85,85);
		f.add(p11);
		p11.setLayout(null);
		p11.setVisible(true);
		b1=new JButton(new ImageIcon("images/Tick.jpg"));
		b1.setBounds(5,5,75,75);
		p11.add(b1);
		//CROSS
		p12=new JPanel();
		p12.setBounds(185,65,85,85);
		f.add(p12);
		p12.setVisible(true);
		p12.setLayout(null);
		b2=new JButton(new ImageIcon("images/Cross.jpg"));
		b2.setBounds(5,5,75,75);
		p12.add(b2);
		//TYPE
		l1=new JLabel(new ImageIcon("images/Label1TY.jpg"));
		l1.setBounds(850,70,205,70);
		l1.setBackground(Color.green);
		f.add(l1);
		//TEXT
		l2=new JLabel(new ImageIcon("images/Label1TE.jpg"));
		l2.setBounds(850,170,205,70);
		l2.setBackground(Color.green);
		f.add(l2);
		b3=new JButton(new ImageIcon("images/index1.jpg"));
		b3.setBounds(1200,95,50,50);
		f.add(b3);
		b4=new JButton(new ImageIcon("images/index1.jpg"));
		b4.setBounds(1300,95,50,50);
		f.add(b4);
		b5=new JButton(new ImageIcon("images/index1.jpg"));
		b5.setBounds(1200,195,50,50);
		f.add(b5);
		b6=new JButton(new ImageIcon("images/index1.jpg"));
		b6.setBounds(1300,195,50,50);
		f.add(b6);
		b7=new JButton(new ImageIcon("images/index1.jpg"));
		b7.setBounds(1200,295,50,50);
		f.add(b7);
		b8=new JButton(new ImageIcon("images/index1.jpg"));
		b8.setBounds(1300,295,50,50);
		f.add(b8);
		b3.setBackground(c2);
		b4.setBackground(c2);
		b5.setBackground(c2);
		b6.setBackground(c2);
		b7.setBackground(c2);
		b8.setBackground(c2);
		lPB=new JLabel(new ImageIcon("images/Bar.jpg"));
		lPB.setBounds(30,200,800,50);
		f.add(lPB);
		//Sci-Fi
		l3=new JLabel(new ImageIcon("images/Heading.jpg"));
		l3.setBounds(390,300,250,80);
		l3.setBackground(Color.green);
		f.add(l3);
		p3=new JPanel();
		p3.setBounds(10,420,1000,310);
		p3.setLayout(null);
		f.add(p3);
		p3.setBackground(Color.yellow);
		l4=new JLabel(new ImageIcon("images/Ques1.jpg"));
		l4.setBounds(20,20,900,70);
		l4.setBackground(Color.green);
		p3.add(l4);
		rb1=new JRadioButton(new ImageIcon("images/Label1.jpg"));
		rb1.setBounds(20,110,255,70);
		p3.add(rb1);
		rb3=new JRadioButton(new ImageIcon("images/Label3.jpg"));
		rb3.setBounds(20,200,255,70);
		p3.add(rb3);
		rb2=new JRadioButton(new ImageIcon("images/Label2.jpg"));
		rb2.setBounds(720,110,255,70);
		p3.add(rb2);
		rb4=new JRadioButton(new ImageIcon("images/Label4.jpg"));
		rb4.setBounds(720,200,255,70);
		p3.add(rb4);
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		bg1.add(rb4);
		p4=new JPanel();
		p4.setBounds(10,420,1000,310);
		p4.setLayout(null);
		f.add(p4);
		p4.setBackground(Color.yellow);
		l5=new JLabel(new ImageIcon("images/Ques2.jpg"));
		l5.setBounds(20,20,900,70);
		l5.setBackground(Color.green);
		p4.add(l5);
		rb5=new JRadioButton(new ImageIcon("images/Label5.jpg"));
		rb5.setBounds(20,110,255,70);
		p4.add(rb5);
		rb7=new JRadioButton(new ImageIcon("images/Label7.jpg"));
		rb7.setBounds(20,200,255,70);
		p4.add(rb7);
		rb6=new JRadioButton(new ImageIcon("images/Label6.jpg"));
		rb6.setBounds(720,110,255,70);
		p4.add(rb6);
		rb8=new JRadioButton(new ImageIcon("images/Label8.jpg"));
		rb8.setBounds(720,200,255,70);
		p4.add(rb8);
		bg2=new ButtonGroup();
		bg2.add(rb5);
		bg2.add(rb6);
		bg2.add(rb7);
		bg2.add(rb8);
		p5=new JPanel();
		p5.setBounds(10,420,1000,310);
		p5.setLayout(null);
		f.add(p5);
		p5.setBackground(Color.yellow);
		l6=new JLabel(new ImageIcon("images/Ques3.jpg"));
		l6.setBounds(20,20,900,70);
		l6.setBackground(Color.green);
		p5.add(l6);
		rb9=new JRadioButton(new ImageIcon("images/Label9.jpg"));
		rb9.setBounds(20,110,255,70);
		p5.add(rb9);
		rb11=new JRadioButton(new ImageIcon("images/Label11.jpg"));
		rb11.setBounds(20,200,255,70);
		p5.add(rb11);
		rb10=new JRadioButton(new ImageIcon("images/Label10.jpg"));
		rb10.setBounds(720,110,255,70);
		p5.add(rb10);
		rb12=new JRadioButton(new ImageIcon("images/Label12.jpg"));
		rb12.setBounds(720,200,255,70);
		p5.add(rb12);
		bg3=new ButtonGroup();
		bg3.add(rb9);
		bg3.add(rb10);
		bg3.add(rb11);
		bg3.add(rb12);
		p6=new JPanel();
		p6.setBounds(10,420,1000,310);
		p6.setLayout(null);
		f.add(p6);
		p6.setBackground(Color.yellow);
		l7=new JLabel(new ImageIcon("images/Ques4.jpg"));
		l7.setBounds(20,20,900,70);
		l7.setBackground(Color.green);
		p6.add(l7);
		rb13=new JRadioButton(new ImageIcon("images/Label13.jpg"));
		rb13.setBounds(20,110,255,70);
		p6.add(rb13);
		rb15=new JRadioButton(new ImageIcon("images/Label15.jpg"));
		rb15.setBounds(20,200,255,70);
		p6.add(rb15);
		rb14=new JRadioButton(new ImageIcon("images/Label14.jpg"));
		rb14.setBounds(720,110,255,70);
		p6.add(rb14);
		rb16=new JRadioButton(new ImageIcon("images/Label16.jpg"));
		rb16.setBounds(720,200,255,70);
		p6.add(rb16);
		bg4=new ButtonGroup();
		bg4.add(rb13);
		bg4.add(rb14);
		bg4.add(rb15);
		bg4.add(rb16);
		p7=new JPanel();
		p7.setBounds(10,420,1000,310);
		p7.setLayout(null);
		f.add(p7);
		p7.setBackground(Color.yellow);
		l8=new JLabel(new ImageIcon("images/Ques5.jpg"));
		l8.setBounds(20,20,900,70);
		l8.setBackground(Color.green);
		p7.add(l8);
		rb17=new JRadioButton(new ImageIcon("images/Label17.jpg"));
		rb17.setBounds(20,110,255,70);
		p7.add(rb17);
		rb19=new JRadioButton(new ImageIcon("images/Label19.jpg"));
		rb19.setBounds(20,200,255,70);
		p7.add(rb19);
		rb18=new JRadioButton(new ImageIcon("images/Label18.jpg"));
		rb18.setBounds(720,110,255,70);
		p7.add(rb18);
		rb20=new JRadioButton(new ImageIcon("images/Label20.jpg"));
		rb20.setBounds(720,200,255,70);
		p7.add(rb20);
		bg5=new ButtonGroup();
		bg5.add(rb17);
		bg5.add(rb18);
		bg5.add(rb19);
		bg5.add(rb20);
		p8=new JPanel();
		p8.setBounds(10,420,1000,310);
		p8.setLayout(null);
		f.add(p8);
		p8.setBackground(Color.yellow);
		l9=new JLabel(new ImageIcon("images/Ques6.jpg"));
		l9.setBounds(20,20,900,70);
		l9.setBackground(Color.green);
		p8.add(l9);
		rb21=new JRadioButton(new ImageIcon("images/Label21.jpg"));
		rb21.setBounds(20,110,255,70);
		p8.add(rb21);
		rb23=new JRadioButton(new ImageIcon("images/Label23.jpg"));
		rb23.setBounds(20,200,255,70);
		p8.add(rb23);
		rb22=new JRadioButton(new ImageIcon("images/Label22.jpg"));
		rb22.setBounds(720,110,255,70);
		p8.add(rb22);
		rb24=new JRadioButton(new ImageIcon("images/Label24.jpg"));
		rb24.setBounds(720,200,255,70);
		p8.add(rb24);
		//NEXT
		b9=new JButton(new ImageIcon("images/NextButton.jpg"));
		b9.setBounds(1100,500,150,130);
		f.add(b9);
		bg6=new ButtonGroup();
		bg6.add(rb21);
		bg6.add(rb22);
		bg6.add(rb23);
		bg6.add(rb24);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		b8.setBackground(Color.white);
		p8.setVisible(false);
		p7.setVisible(false);
		p6.setVisible(false);
		p5.setVisible(false);
		p4.setVisible(false);
		p3.setVisible(true);
		p=3;
		b9.addActionListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		rb4.addItemListener(this);
		rb5.addItemListener(this);
		rb6.addItemListener(this);
		rb7.addItemListener(this);
		rb8.addItemListener(this);
		rb9.addItemListener(this);
		rb10.addItemListener(this);
		rb11.addItemListener(this);
		rb12.addItemListener(this);
		rb13.addItemListener(this);
		rb14.addItemListener(this);
		rb15.addItemListener(this);
		rb16.addItemListener(this);
		rb17.addItemListener(this);
		rb18.addItemListener(this);
		rb19.addItemListener(this);
		rb20.addItemListener(this);
		rb21.addItemListener(this);
		rb22.addItemListener(this);
		rb23.addItemListener(this);
		rb24.addItemListener(this);
		p3.setOpaque(false);
		p4.setOpaque(false);
		p5.setOpaque(false);
		p6.setOpaque(false);
		p7.setOpaque(false);
		p8.setOpaque(false);
		p11.setBackground(c2);
		p12.setBackground(c2);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==b9)
		{	
			p11.setBackground(c2);
			p12.setBackground(c2);
			if(p==3)
			{
				p3.setVisible(false);
				p4.setVisible(true);
				p++;
				//b4.setBackground(Color.green);
				lPB.setIcon(new ImageIcon("images/Bar1.jpg"));
				b3.setIcon(new ImageIcon("images/index2.jpg"));
			}
			else if(p==4)
			{
				p4.setVisible(false);
				p5.setVisible(true);
				p++;
				//b5.setBackground(Color.green);
				lPB.setIcon(new ImageIcon("images/Bar2.jpg"));
				b4.setIcon(new ImageIcon("images/index2.jpg"));
			}
			else if(p==5)
			{
				p5.setVisible(false);
				p6.setVisible(true);
				p++;
				//b6.setBackground(Color.green);
				lPB.setIcon(new ImageIcon("images/Bar3.jpg"));
				b5.setIcon(new ImageIcon("images/index2.jpg"));
			}
			else if(p==6)
			{
				p6.setVisible(false);
				p7.setVisible(true);
				p++;
				//b7.setBackground(Color.green);
				lPB.setIcon(new ImageIcon("images/Bar4.jpg"));
				b6.setIcon(new ImageIcon("images/index2.jpg"));
			}
			else if(p==7)
			{
				p7.setVisible(false);
				p8.setVisible(true);
				p++;
				//b8.setBackground(Color.green);
				lPB.setIcon(new ImageIcon("images/Bar5.jpg"));
				b7.setIcon(new ImageIcon("images/index2.jpg"));
			}
			else if(p==8)
			{
				b8.setIcon(new ImageIcon("images/index2.jpg"));
				lPB.setIcon(new ImageIcon("images/Bar6.jpg"));
				p8.setVisible(false);
				p++;
			}
			else
			{
				System.exit(1);
			}
		}
	}
	public void itemStateChanged(ItemEvent e)
	{	
		if(p==3)
		{
		if(rb2.isSelected())
		{
			correct++;
			p11.setBackground(Color.green);
			rb2.setIcon(new ImageIcon("images/Correct1.jpg"));
		}
		else
		{
			wrong++;
			rb2.setIcon(new ImageIcon("images/Correct1.jpg"));
			p12.setBackground(Color.red);
			if(rb1.isSelected())
			{
				//rb1.setBackground(Color.red);
				rb1.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb3.isSelected())
			{
				//rb3.setBackground(Color.red);
				rb3.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb4.isSelected())
			{
				//rb4.setBackground(Color.red);
				rb4.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
		}
		}
		else if(p==4)
		{
		if(rb7.isSelected())
		{
			correct++;
			p11.setBackground(Color.green);
			rb7.setIcon(new ImageIcon("images/Correct2.jpg"));
		}
		else
		{

			wrong++;
			rb7.setIcon(new ImageIcon("images/Correct2.jpg"));
			p12.setBackground(Color.red);
			if(rb4.isSelected())
			{
				//rb1.setBackground(Color.red);
				rb4.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb5.isSelected())
			{
				//rb3.setBackground(Color.red);
				rb5.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb8.isSelected())
			{
				//rb4.setBackground(Color.red);
				rb8.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
		}
		}
		else if(p==5)
		{
		if(rb10.isSelected())
		{
			correct++;
			p11.setBackground(Color.green);
			rb10.setIcon(new ImageIcon("images/Correct3.jpg"));
		}
		else
		{

			wrong++;
			rb10.setIcon(new ImageIcon("images/Correct3.jpg"));
			p12.setBackground(Color.red);
			if(rb9.isSelected())
			{
				//rb1.setBackground(Color.red);
				rb9.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb11.isSelected())
			{
				//rb3.setBackground(Color.red);
				rb11.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb12.isSelected())
			{
				//rb4.setBackground(Color.red);
				rb12.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
		}
		}
		else if(p==6)
		{
		if(rb13.isSelected())
		{
			correct++;
			p11.setBackground(Color.green);
			rb13.setIcon(new ImageIcon("images/Correct4.jpg"));
		}
		else
		{

			wrong++;
			rb13.setIcon(new ImageIcon("images/Correct4.jpg"));
			p12.setBackground(Color.red);
			if(rb14.isSelected())
			{
				//rb1.setBackground(Color.red);
				rb14.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb15.isSelected())
			{
				//rb3.setBackground(Color.red);
				rb15.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb16.isSelected())
			{
				//rb4.setBackground(Color.red);
				rb16.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
		}
		}
		else if(p==7)
		{
		if(rb20.isSelected())
		{
			correct++;
			p11.setBackground(Color.green);
			rb20.setIcon(new ImageIcon("images/Correct5.jpg"));
		}
		else
		{

			wrong++;
			rb20.setIcon(new ImageIcon("images/Correct5.jpg"));
			p12.setBackground(Color.red);
			if(rb17.isSelected())
			{
				//rb1.setBackground(Color.red);
				rb17.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb18.isSelected())
			{
				//rb3.setBackground(Color.red);
				rb18.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb19.isSelected())
			{
				//rb4.setBackground(Color.red);
				rb19.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
		}
		}
		else if(p==8)
		{
		if(rb21.isSelected())
		{
			correct++;
			p11.setBackground(Color.green);
			rb21.setIcon(new ImageIcon("images/Correct6.jpg"));
		}
		else
		{
			wrong++;
			rb21.setIcon(new ImageIcon("images/Correct6.jpg"));
			p12.setBackground(Color.red);
			if(rb22.isSelected())
			{
				//rb1.setBackground(Color.red);
				rb22.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb23.isSelected())
			{
				//rb3.setBackground(Color.red);
				rb23.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
			if(rb24.isSelected())
			{
				//rb4.setBackground(Color.red);
				rb24.setIcon(new ImageIcon("images/LabelD.jpg"));
			}
		}
		}
	}
	public static void main(String z[])
	{
		new Quiz();

	}
}