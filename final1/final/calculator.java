package mid;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator extends JFrame{
	JLabel gradeJLabel;
	JLabel gpa2Label;
	JTextField gradeJTextField;
	JTextField gpa2JTextField;
	JButton enterJButton;
	JButton GPAJButton;
	JTextField comentaryJTextField;
	String numcourses;
	String testhours;
	String semesters;
	String enterTHEgpa;
	int numberOfhours;
	int numberofi;
	int numsemesters;
	float scores;
	float gpa;
	float grade;
	float finalgrade;
	int i;
	int j;
	float gradeAccumulator;
	float gpaAccumulator;
	float gpa2;
	
   	public calculator()
   	{
      		SpaGpacalculator();
   	}

   	public void SpaGpacalculator()
   	{
		Container contentPane = getContentPane();
		contentPane.setLayout(null); 
		gradeJLabel = new JLabel();
		gradeJLabel.setBounds(150, 50, 150, 20);
		gradeJLabel.setText("SPA:");
		contentPane.add(gradeJLabel);
		JLabel gpa2JLabel = new JLabel();
		gpa2JLabel.setBounds(150, 97, 200, 30);
		gpa2JLabel.setText("GPA:");
		contentPane.add(gpa2JLabel);
		gpa2JTextField = new JTextField();
		gpa2JTextField.setBounds(210,100,50,20);
		contentPane.add(gpa2JTextField);
		gradeJTextField = new JTextField();
		gradeJTextField.setBounds(210, 50, 50, 20);
		contentPane.add(gradeJTextField);
		comentaryJTextField = new JTextField();
		comentaryJTextField.setBounds(210, 70, 50, 20);
		contentPane.add(comentaryJTextField);
		Component clickstartJLabel = new JLabel();
		clickstartJLabel.setBounds(40, 200, 400, 20);
		((JLabel) clickstartJLabel).setText("Click SPA to calculat your SPA then Click GPA for your GPA!");
		clickstartJLabel.setForeground(Color.RED);
		contentPane.add(clickstartJLabel);
		enterJButton = new JButton();
		enterJButton.setBounds(5, 300,210, 20);
		enterJButton.setText("SPA (Semester Point Average)");
		contentPane.add(enterJButton);
		enterJButton.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					enterJButtonActionPerformed(event);
				}
			}   
		);

		GPAJButton = new JButton();
		GPAJButton.setBounds(220, 300, 210, 20);
		GPAJButton.setText("GPA (Grade Point Average)");
		contentPane.add(GPAJButton);
		GPAJButton.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					GPAJButtonActionPerformed(event);
				}
			}
		);
		setTitle("                                          SPA,GPA (Calculator)");
		setSize(447,400);
	    setVisible(true);
	    setLocationRelativeTo(null);
   	}

   	public static void main(String[] args)
   	{
      		calculator application = new calculator();
      		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   	
   	public void enterJButtonActionPerformed(ActionEvent event)
	{
		getmarkes();
	}
     
	public void getmarkes()
		{
		testhours = JOptionPane.showInputDialog("Enter the amount of houers");
		numcourses = JOptionPane.showInputDialog("Enter Number of courses");
			numberOfhours = Integer.parseInt(testhours);
			numberofi=Integer.parseInt(numcourses);

		for(i = 1; i <=numberofi; i++)
		{
			String testcourse = JOptionPane.showInputDialog("Enter your "+ i+") Scores");
			scores = Integer.parseInt(testcourse);
			scores=scores*3;
			gradeAccumulator=scores+gradeAccumulator;
		}

				grade = gradeAccumulator / numberOfhours;
				gradeJTextField.setText("" + grade);

				 if (85<=grade)
			   	 {
			   		finalgrade=(float) 4.00;
			   	 }
					 else if (80<=grade)
					   	{
						 finalgrade=(float)3.75;
			   	 }
					 else if (77<=grade)
						{
						 finalgrade=(float)3.50;
						}
					 else if (73<=grade)
										{
						 finalgrade=(float)3.25;
			   	 }
					 else if (70<=grade) {

						 finalgrade=(float)3.00;
			   	 }
				     else if (67<=grade)
				 { 
				    	 finalgrade=(float)2.75;
				 }
				     else if (63<=grade)
				 {
				    	 finalgrade=(float)2.50;
			     }
			         else if (60<=grade)
			     {
			        	 finalgrade=(float)2.25;
			     }
					 else if (50<=grade)
				 {
						 finalgrade=(float)1.00;
				 }
				      else if (35<=grade)
				 {
				    	  finalgrade=(float)0.5;
				 }
				 comentaryJTextField.setText(" "+      finalgrade);
		}

	public void GPAJButtonActionPerformed(ActionEvent event)
	{
		getGPA();
	}
     
	public void getGPA()
	{
   		semesters = JOptionPane.showInputDialog("How many semesters did you finished before this one");
			numsemesters = Integer.parseInt(semesters);
   		for( j = 1; j <=numsemesters; j++)
		{
   			enterTHEgpa = JOptionPane.showInputDialog("Enter your "+ j+") GBA Scores");
			gpa = Float.parseFloat(enterTHEgpa);
			gpaAccumulator=gpa+gpaAccumulator;
		}
   		gpa2 = (gpaAccumulator+finalgrade) / (numsemesters+1);
		gpa2JTextField.setText(""+gpa2);
		
	}
	
}