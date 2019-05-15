
public class Test {
		public static void main(String[]args){
			Person taro = new Person(null, 0);
			taro.name="山田太郎";
			taro.age=20;
			taro.phoneNumber="08074578456";
			taro.address="東京都、品川区";


	System.out.println("名前："+taro.name );
	System.out.println("年齢："+taro.age);
	System.out.println("電話番号:"+taro.phoneNumber);
	System.out.println("住所:"+taro.address);
	taro.talk();
	taro.walk();
	taro.run();

		Person jiro=new Person("木村次郎", 18);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		Person hanako =new Person("鈴木花子", 16);
		System.out.println(hanako.name);
		System.out.println(hanako.age);



		Robot aibo=new Robot(null);
		Robot.name="aibo";
		System.out.println(Robot.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		Robot asimo=new Robot(null);
		Robot.name="asimo";
		System.out.println(Robot.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot(null);
		Robot.name="pepper";
		System.out.println(Robot.name);
		pepper.talk();
		pepper.walk();
		pepper.run();



		}





}
