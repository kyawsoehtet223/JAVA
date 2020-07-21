package test;
// my variable test

public class T4 {
	public void showage() {
		int age=0;
		age= age+7;
		System.out.println("Age is:"+age);
	}

	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=2;
		c=3;
		byte B=22;
		double pai=3.14;
		System.out.println(a+"\s"+b+"\s"+c);
		System.out.println(B);
		System.out.println(pai);
		
		//for local variable test
		T4  sage=new T4();
		sage.showage();
	    //doesn't work for others

	}

}
