package assignment13;

public class usemedianClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       medianclass mc= new medianclass();
       mc.Insert(5);
       mc.Insert(4);
       mc.Insert(10);
    //   mc.Insert(20);
      int x= mc.median();
       mc.removeMedian();
      int y= mc.median();
      System.out.println(x);
      System.out.println(y);
	}

}
