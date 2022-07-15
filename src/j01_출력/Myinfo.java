package j01_출력;

public class Myinfo {
	
	public static void main(String[] args) 
	{
		char name1 = '문';
		char name2 = '창';
		char name3 = '배';
		
		int age = 24;
		
		String address = "경남 양산시 평산동";
		String name = "문창배";
		
		System.out.print("이름: ");
		System.out.println(name1 + name2 + name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("경남 양산시 평산동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("문창배");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("경남 양산시 평산동");
		System.out.println();
	}

}
