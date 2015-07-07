package chapter9;

/*
 * Andrew Scalise
 * Chapter 9
 * Programming Challenge 5, Course Grades
 * This program will display course grades
 * based on different course activities.
 */


public class CourseGrades
{
    // array that will hold the scores and grades
    
private GradedActivity[] grades = new GradedActivity[4];
	
	public CourseGrades()
	{
		
	}
	
	// First element in array holds the lab score and grade letter
	public void setLab(GradedActivity lab)
	{
		grades[0] = lab;
	}
	
	// Second element in the array holds the pass/fail exam score and grade
	public void setPassFailExam(PassFailExam pfexam)
	{
		grades[1] = pfexam;
  	}
	
	// Third element in the array holds the essay score and the letter grade
	public void setEssay(GradedActivity essay)
	{
		grades[2] = essay;
	}
	
	// Fourth element in the array holds the final exam score and letter grade
	public void setFinalExam(FinalExam finalExam)
	{
		grades[3] = finalExam;
	}
       
    // To string method to display all the scores and grades
	public String toString()
	{
		String result;
 
		result = "Lab Score: " + grades[0].getScore() + "\t\t\tGrade: " + grades[0].getGrade() + "\nPass/Fail Exam Score: "
		+ grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
		+ "\nEssay Score: " + grades[2].getScore() + "\t\tGrade: " + grades[2].getGrade()
		+ "\nFinal Exam Score: " + grades[3].getScore() + "\t\tGrade: " + grades[3].getGrade();
 
		return result;
	}

}