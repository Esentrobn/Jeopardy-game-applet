
//Jeopardy.java

import javax.swing.*;								
import java.awt.*; 								
import java.awt.event.*; 								
public class Jeopardy extends JFrame implements ActionListener			
{
        private JPanel pnlCategory=new JPanel();
        private JPanel pnlButtons=new JPanel();

	private JLabel CompSci = new JLabel("CompSci", JLabel.CENTER);
	private JLabel HarryPotter = new JLabel("HarryPotter", JLabel.CENTER);
	private JLabel Sports = new JLabel("Sports", JLabel.CENTER);
	private JLabel Geography = new JLabel("Geography", JLabel.CENTER);
	private JLabel Math = new JLabel("Math", JLabel.CENTER);
	private JLabel People = new JLabel("People", JLabel.CENTER);
	private Font labelFont=new Font("Ariel", Font.BOLD, 18); 

	private JButton[] btn100=new JButton[6]; 
	private JButton[] btn200=new JButton[6]; 
	private JButton[] btn300=new JButton[6]; 
	private JButton[] btn400=new JButton[6]; 
	private JButton[] btn500=new JButton[6]; 	

	private Font buttonFont=new Font("Courier", Font.BOLD, 25);  	

	private String compSciAnswer1="Computer Science Answer for $100";
	private String compSciQuestion1="Computer Science Question for $100";
	private String compSciAnswer2="Computer Science Answer for $200";
	private String compSciQuestion2="Computer Science Question for $200";
	private String compSciAnswer3="Computer Science Answer for $300";
	private String compSciQuestion3="Computer Science Question for $300";
	private String compSciAnswer4="Computer Science Answer for $400";
	private String compSciQuestion4="Computer Science Question for $400";
	private String compSciAnswer5="Computer Science Answer for $500";
	private String compSciQuestion5="Computer Science Question for $500";

	private String HarryPotterAnswer1="Harry Potter Answer for $100";
	private String HarryPotterQuestion1="Harry Potter Question for $100";
	private String HarryPotterAnswer2="Harry Potter Answer for $200";
	private String HarryPotterQuestion2="Harry Potter Question for $200";
	private String HarryPotterAnswer3="Harry Potter Answer for $300";
	private String HarryPotterQuestion3="Harry Potter Question for $300";
	private String HarryPotterAnswer4="Harry Potter Answer for $400";
	private String HarryPotterQuestion4="Harry Potter Question for $400";
	private String HarryPotterAnswer5="Harry Potter Answer for $500";
	private String HarryPotterQuestion5="Harry Potter Question for $500";

	private String SportsAnswer1="Sports Answer for $100";
	private String SportsQuestion1="Sports Question for $100";
	private String SportsAnswer2="Sports Answer for $200";
	private String SportsQuestion2="Sports Question for $200";
	private String SportsAnswer3="Sports Answer for $300";
	private String SportsQuestion3="Sports Question for $300";
	private String SportsAnswer4="Sports Answer for $400";
	private String SportsQuestion4="Sports Question for $400";
	private String SportsAnswer5="Sports Answer for $500";
	private String SportsQuestion5="Sports Question for $500";

	private String GeographyAnswer1="Geography Answer for $100";
	private String GeographyQuestion1="Geography Question for $100";
	private String GeographyAnswer2="Geography Answer for $200";
	private String GeographyQuestion2="Geography Question for $200";
	private String GeographyAnswer3="Geography Answer for $300";
	private String GeographyQuestion3="Geography Question for $300";
	private String GeographyAnswer4="Geography Answer for $400";
	private String GeographyQuestion4="Geography Question for $400";
	private String GeographyAnswer5="Geography Answer for $500";
	private String GeographyQuestion5="Geography Question for $500";

	private String MathAnswer1="Math Answer for $100";
	private String MathQuestion1="Math Question for $100";
	private String MathAnswer2="Math Answer for $200";
	private String MathQuestion2="Math Question for $200";
	private String MathAnswer3="Math Answer for $300";
	private String MathQuestion3="Math Question for $300";
	private String MathAnswer4="Math Answer for $400";
	private String MathQuestion4="Math Question for $400";
	private String MathAnswer5="Math Answer for $500";
	private String MathQuestion5="Math Question for $500";

	private String PeopleAnswer1="People Answer for $100";
	private String PeopleQuestion1="People Question for $100";
	private String PeopleAnswer2="People Answer for $200";
	private String PeopleQuestion2="People Question for $200";
	private String PeopleAnswer3="People Answer for $300";
	private String PeopleQuestion3="People Question for $300";
	private String PeopleAnswer4="People Answer for $400";
	private String PeopleQuestion4="People Question for $400";
	private String PeopleAnswer5="People Answer for $500";
	private String PeopleQuestion5="People Question for $500";


	public Jeopardy()							
	{
                 for(int i=0; i<6; i++){
			btn100[i]=new JButton("100");}
                 for(int i=0; i<6; i++){
			btn200[i]=new JButton("200");}
                 for(int i=0; i<6; i++){
			btn300[i]=new JButton("300");}
                 for(int i=0; i<6; i++){
			btn400[i]=new JButton("400");}
                 for(int i=0; i<6; i++){
			btn500[i]=new JButton("500");}
		 addControls();
		 registerListeners();
		 setTitle("Jeopardy");	
		 setSize(750,600); 						
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );		
		 setVisible(true);							
	}									
	public void addControls()
	{
		add(pnlCategory, BorderLayout.NORTH);
		add(pnlButtons, BorderLayout.CENTER);
                pnlCategoryAddControls();
                pnlButtonsAddControls();
		setLabelFontColor();
		setButtonFontColor();
	}
        private void pnlCategoryAddControls()
        {
		pnlCategory.setLayout( new GridLayout(1,6,5,10));
                pnlCategory.add(CompSci);
                pnlCategory.add(HarryPotter);
                pnlCategory.add(Sports);
                pnlCategory.add(Geography);
                pnlCategory.add(Math);
                pnlCategory.add(People);
        }
	private void pnlButtonsAddControls()
	{
        	pnlButtons.setLayout(new GridLayout(5,6,5,5));
                for(int i=0; i<6; i++){
			pnlButtons.add(btn100[i]);}
                for(int i=0; i<6; i++){
			pnlButtons.add(btn200[i]);}
                for(int i=0; i<6; i++){
			pnlButtons.add(btn300[i]);}
                for(int i=0; i<6; i++){
			pnlButtons.add(btn400[i]);}
                for(int i=0; i<6; i++){
			pnlButtons.add(btn500[i]);}
	}
	public void setLabelFontColor()
	{
		CompSci.setForeground(Color.pink);
		HarryPotter.setForeground(Color.pink);
		Sports.setForeground(Color.pink);
		Geography.setForeground(Color.pink);
		Math.setForeground(Color.pink);
		People.setForeground(Color.pink);

		CompSci.setOpaque(true);
		HarryPotter.setOpaque(true);
		Sports.setOpaque(true);
		Geography.setOpaque(true);
		Math.setOpaque(true);
		People.setOpaque(true);

		CompSci.setBackground(Color.blue);
		HarryPotter.setBackground(Color.blue);
		Sports.setBackground(Color.blue);
		Geography.setBackground(Color.blue);
		Math.setBackground(Color.blue);
		People.setBackground(Color.blue);

		CompSci.setFont(labelFont);
		HarryPotter.setFont(labelFont);
		Sports.setFont(labelFont);
		Geography.setFont(labelFont);
		Math.setFont(labelFont);
		People.setFont(labelFont);
		
	}
	public void setButtonFontColor()
	{
                for(int i=0; i<6; i++){
			btn100[i].setFont(buttonFont);
			btn100[i].setBackground(Color.yellow);}
                for(int i=0; i<6; i++){
			btn200[i].setFont(buttonFont);
			btn200[i].setBackground(Color.yellow);}
                for(int i=0; i<6; i++){
			btn300[i].setFont(buttonFont);
			btn300[i].setBackground(Color.yellow);}
                for(int i=0; i<6; i++){
			btn400[i].setFont(buttonFont);
			btn400[i].setBackground(Color.yellow);}
                for(int i=0; i<6; i++){
			btn500[i].setFont(buttonFont);
			btn500[i].setBackground(Color.yellow);}
	}
	public void registerListeners()
	{
		for(int i=0;i<6;i++)
		{
			btn100[i].addActionListener(this);
		}
		for(int i=0;i<6;i++)
		{
			btn200[i].addActionListener(this);
		}
		for(int i=0;i<6;i++)
		{
			btn300[i].addActionListener(this);
		}
		for(int i=0;i<6;i++)
		{
			btn400[i].addActionListener(this);
		}
		for(int i=0;i<6;i++)
		{
			btn500[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<6;i++)
		{
			if (e.getSource() == btn100[i]) 
			{
				btn100[i].setEnabled(false);
	 			btn100[i].setBackground(Color.gray);
				if(i==0){
					MyJFrame f= new MyJFrame(compSciAnswer1, compSciQuestion1);}
				else if(i==1){
					MyJFrame f= new MyJFrame(HarryPotterAnswer1, HarryPotterQuestion1);}
				else if(i==2){
					MyJFrame f= new MyJFrame(SportsAnswer1, SportsQuestion1);}
				else if(i==3){
					MyJFrame f= new MyJFrame(GeographyAnswer1, GeographyQuestion1);}
				else if(i==4){
					MyJFrame f= new MyJFrame(MathAnswer1, MathQuestion1);}
				else{
					MyJFrame f= new MyJFrame(PeopleAnswer1, PeopleQuestion1);}
			}
			if (e.getSource() == btn200[i]) 
			{
				btn200[i].setEnabled(false);
	 			btn200[i].setBackground(Color.gray);
				if(i==0){
					MyJFrame f= new MyJFrame(compSciAnswer2, compSciQuestion2);}
				else if(i==1){
					MyJFrame f= new MyJFrame(HarryPotterAnswer2, HarryPotterQuestion2);}
				else if(i==2){
					MyJFrame f= new MyJFrame(SportsAnswer2, SportsQuestion2);}
				else if(i==3){
					MyJFrame f= new MyJFrame(GeographyAnswer2, GeographyQuestion2);}
				else if(i==4){
					MyJFrame f= new MyJFrame(MathAnswer2, MathQuestion2);}
				else{
					MyJFrame f= new MyJFrame(PeopleAnswer2, PeopleQuestion2);}
			}
			if (e.getSource() == btn300[i]) 
			{
				btn300[i].setEnabled(false);
	 			btn300[i].setBackground(Color.gray);
				if(i==0){
					MyJFrame f= new MyJFrame(compSciAnswer3, compSciQuestion3);}
				else if(i==1){
					MyJFrame f= new MyJFrame(HarryPotterAnswer3, HarryPotterQuestion3);}
				else if(i==2){
					MyJFrame f= new MyJFrame(SportsAnswer3, SportsQuestion3);}
				else if(i==3){
					MyJFrame f= new MyJFrame(GeographyAnswer3, GeographyQuestion3);}
				else if(i==4){
					MyJFrame f= new MyJFrame(MathAnswer3, MathQuestion3);}
				else{
					MyJFrame f= new MyJFrame(PeopleAnswer3, PeopleQuestion3);}
			}
			if (e.getSource() == btn400[i]) 
			{
				btn400[i].setEnabled(false);
	 			btn400[i].setBackground(Color.gray);
				if(i==0){
					MyJFrame f= new MyJFrame(compSciAnswer4, compSciQuestion4);}
				else if(i==1){
					MyJFrame f= new MyJFrame(HarryPotterAnswer4, HarryPotterQuestion4);}
				else if(i==2){
					MyJFrame f= new MyJFrame(SportsAnswer4, SportsQuestion4);}
				else if(i==3){
					MyJFrame f= new MyJFrame(GeographyAnswer4, GeographyQuestion4);}
				else if(i==4){
					MyJFrame f= new MyJFrame(MathAnswer4, MathQuestion4);}
				else{
					MyJFrame f= new MyJFrame(PeopleAnswer4, PeopleQuestion4);}
			}
			if (e.getSource() == btn500[i]) 
			{
				btn500[i].setEnabled(false);
	 			btn500[i].setBackground(Color.gray);
				if(i==0){
					MyJFrame f= new MyJFrame(compSciAnswer5, compSciQuestion5);}
				else if(i==1){
					MyJFrame f= new MyJFrame(HarryPotterAnswer5, HarryPotterQuestion5);}
				else if(i==2){
					MyJFrame f= new MyJFrame(SportsAnswer5, SportsQuestion5);}
				else if(i==3){
					MyJFrame f= new MyJFrame(GeographyAnswer5, GeographyQuestion5);}
				else if(i==4){
					MyJFrame f= new MyJFrame(MathAnswer5, MathQuestion5);}
				else{
					MyJFrame f= new MyJFrame(PeopleAnswer5, PeopleQuestion5);}
			}
		}

	}
	public static void main(String[] args)
   	{
		Jeopardy j=new Jeopardy();					
	}
}
class MyJFrame extends JFrame 
{
	private JTextArea txa= new JTextArea();
	private String question;
	private String answer;
	private Boolean first=true;
	public MyJFrame(String ans, String ques)
   	{
		addWindowListener(new WindowAdapter()				
		{
			public void windowClosing(WindowEvent e)
			{
				if (first==true) 
				{
					txa.setText(question);  
					first=false;	
				}
				else setDefaultCloseOperation(
				JFrame.DISPOSE_ON_CLOSE );	
			}
		});
		question =ques;
		answer =ans;
		addControls();								
		setSize(800, 600);
		setLocationRelativeTo(null);				
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);	
		setVisible(true);							
	}
	public void addControls()							
	{
		add(txa);
		txa.setText(answer);
		txa.setEditable(false);
		Font f=new Font("Helvetica", Font.BOLD, 50);  	
		txa.setFont(f);				
		txa.setForeground(Color.yellow);
		txa.setBackground(Color.blue);
		txa.setLineWrap(true);
		txa.setWrapStyleWord(true);
	}
}
