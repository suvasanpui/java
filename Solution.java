/*
Sample Input

	Heraldo Memelli 8135627
	2
	100 80
Sample Output

	Name: Memelli, Heraldo
	ID: 8135627
	Grade: O 
*/
import java.util.Scanner;

class Person{
    protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		System.out.println("Name: " + lastName + ", " + firstName + 	"\nID: " + idNumber); 
	}
}
class Student extends Person{
    private int[] arr;
	int res=0,count=0;
	Student(String fName,String lName,int sId,int[] arr){
		super(fName,lName,sId);
		this.arr=arr;
	}
	public char gradeCalculation(int marks){
		if(marks>=90 && marks<=100){
			return 'O';
		}else if(marks>=80 && marks<90){
			return 'E';
		}
		else if(marks>=70 && marks<80){
			return 'A';
		}
		else if(marks>=55 && marks<70){
			return 'P';
		}
		else if(marks>=40 && marks<55){
			return 'D';
		}else{
			return 'T';
		}
	}
	public void calculate(){
		for(int i=0;i<arr.length;i++){
			res+=arr[i];
			count++;
		}
		int result=res/count;
		char outPut=gradeCalculation(result);
		System.out.println("Grade:" + outPut);
	}

}
public class Solution {
    public static void main(String []args){
			Scanner obj = new Scanner(System.in);
			String firstName = obj.next();
			String lastName = obj.next();
			int id = obj.nextInt();
			int numScores = obj.nextInt();
			int[] testScores = new int[numScores];
			for(int i = 0; i < numScores; i++){
				testScores[i] = obj.nextInt();
			}
			Student mir = new Student(firstName, lastName, id, testScores);
			mir.printPerson();
			mir.calculate();
		
    }
    
}
