package test;
//Test instance variable 
public class T5 {
	
		String empname;
		int salary;
		public T5(String emp) {
			empname=emp;
		}
		
		public void setsalary(int s) {
			salary=s;
		}
		public void showemp() {
			System.out.println("Name   :"+empname);
			System.out.println("Salary :"+salary);
		}
		
	
	
	public static void main(String[] args) {
		T5 t=new T5("John");
		t.setsalary(100000);
		t.showemp();
		
	}

}