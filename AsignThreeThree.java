

import java.util.Scanner;

class Student{
	private int rollNo;
	private String name;
	private int marks;
	static int Cutoff;
	
	
	public Student(int Rno,String Name,int marks){
		rollNo = Rno;
		name= Name;
		this.marks =marks;
		
	}
		
	public void ShowData(){
		boolean status = (marks >= Cutoff)?true:false;
		if(status)
			System.out.println(" Roll No : "+this.rollNo +" Name :"+this.name+" Marks: "+this.marks+" result: pass");
		else
			System.out.println(" Roll No : "+this.rollNo +" Name :"+this.name+" Marks: "+this.marks+" result: Fail");
		
		
		
	}
}

public class AsignThreeThree {

	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Cutoff marks :");
		
		Student.Cutoff=sc.nextInt();
		
		
		Student student1= new Student(2,"Amit",65);
		Student student2 = new Student(3,"Kg",75);
		Student student3= new Student(4,"Manish",35);
		Student student4 = new Student(5,"Sandy",50);
		
		student1.ShowData();
		student2.ShowData();
		student3.ShowData();
		student4.ShowData();

		
		
	}
}
