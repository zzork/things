/* You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in 
 * decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those 
 * two students also have the same first name, then order them according to their ID. No two students have the same ID.
 *
 * For more detail see: https://www.hackerrank.com/challenges/java-sort/problem
 */


import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
  
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Student> {
    public StudentComparator () {}

    @Override
    public int compare(Student a, Student b) {
        if (a.getCgpa() > b.getCgpa()) 
            return -1;
        else if (a.getCgpa() < b.getCgpa()) 
            return 1;
        else if (a.getFname().equals(b.getFname())) 
            return b.getId() - a.getId();
        else return (a.getFname().compareTo(b.getFname()));
    }
}

class Solution
{
	  public static void main(String[] args){
		    Scanner in = new Scanner(System.in);
		    int testCases = Integer.parseInt(in.nextLine());
		
		    List<Student> studentList = new ArrayList<Student>();
		    while(testCases>0){
			      int id = in.nextInt();
			      String fname = in.next();
			      double cgpa = in.nextDouble();
			
			      Student st = new Student(id, fname, cgpa);
			      studentList.add(st);
			
			      testCases--;
		    }
        Collections.sort(studentList, new StudentComparator());
      
        for(Student st: studentList){
		        System.out.println(st.getFname());
		    }
	  }
}



