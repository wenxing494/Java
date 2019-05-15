
public class Robot {
	public static String name= null;
	public Robot (String name) {
		Robot.name=name;
	}
	 public   void talk(){
		  System.out.println(Robot.name+"が話す");
	  }
	  public void walk(){
		  System.out.println(Robot.name+"が歩く");

	  }
	  public void run(){
		  System.out.println(Robot.name+"が走る");
	  }
	}

