package test;
/* My e number test */
class FZ{
	enum fruits{banana,orange,apple};
	fruits name;
}

public class T2 {
	public static void main(String[] args) {
		FZ fz=new FZ();
		fz.name=FZ.fruits.banana;
		System.out.println("Fruit name "+fz.name);
		
		
	}

}
