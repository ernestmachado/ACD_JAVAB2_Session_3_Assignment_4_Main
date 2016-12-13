//Create a student result processing system. Display the details and result of at-least three students.
package ASSIGNMENTS;

import java.text.DecimalFormat;

public class Assignment3_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--->>> Create object rajesh of Student class to evaluate his result.
		student rajesh = new student();
		rajesh.evaluate("Rajesh",50,75,80);
		//--->>> Create object Geeta of Student class to evaluate her result.
		student Geeta = new student();
		Geeta.evaluate("Geeta",89,65,73);
		//--->>> Create object Jonh of Student class to evaluate his result.
		student John = new student();
		John.evaluate("John",41,35,40);
	}
}

//-->> The Student class will accept the student's details and evaluate the marks
class student {
	String result="passed";	// Initialized the variable result as passed so that we can evaluate for failed criteria.
	
	// The evaluate method will accept the student name and the marks of 3 subjects
	void evaluate(String sname,int sub1,int sub2,int sub3) {
		DecimalFormat f = new DecimalFormat("##.00"); //--->>> Convert the percent to 2 decimal
		double per=(double)(sub1+sub2+sub3)/3; ///--->>> Calculation of percent
		if (per<40)				///--->>> This condition will determine if the Student has passed or failed 
			result="failed";
		
		System.out.println("Name:"+sname+" "+"\nSubject1:"+sub1+"\nSubject2:"+sub2+"\nSubject3:"+sub3);//--->>> Display Details
		
		System.out.println("The student "+sname+" "+result+" with "+f.format(per)+"%\n");//--->>> Display Result
	}
}