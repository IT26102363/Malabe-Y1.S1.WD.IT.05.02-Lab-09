import java.util.Scanner;
public class IT26102363Lab9Q4 {
	
	public static double calcFinalMark(double examMark, double assingmentMark){
		double finalMark=(examMark*0.7)+(assingmentMark*0.3);
		return finalMark;
	}
	
	public static char findGrades(double finalMark){
		char grade;
		if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        
        return grade;
	}
	
	public static void printDetails(String name, double finalMark, char grade){
		System.out.printf("%-10s %-12.2f %-2c\n", name, finalMark, grade);
	}

    public static void main(String[] args) {
		String name[]= new String[5];
		double finalMark[]= new double[5];
		char grade[]= new char[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++){
			System.out.print("Enter Name of Student " + (i+1) + ":");
			name[i]=input.next();
			
			System.out.print("Enter Assignment Marks (out of 100) for " + name[i] + ":");
			double assingmentMark=input.nextDouble();
			
			System.out.print("Enter Exam Paper Marks (out of 100) for " + name[i] + ":");
			double examMark=input.nextDouble();
			
			finalMark[i]=calcFinalMark(examMark, assingmentMark);
			grade[i]=findGrades(finalMark[i]);
			
			System.out.println();
		}
		System.out.println("Name\tFinal Marks\tGrade");
		for(int i=0; i<name.length; i++){
			printDetails(name[i], finalMark[i], grade[i]);
		}
		
	}		
}