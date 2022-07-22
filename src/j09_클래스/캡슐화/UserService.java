package j09_클래스.캡슐화;

import java.util.Scanner;

public class UserService {

	private User user;
	private Scanner scanner;

	public UserService() {
		scanner = new Scanner(System.in);
	}

	public void addUser() {

		String username = null;
		String password = null;
		String name = null;
		String email = null;

		System.out.print("아이디: ");
		username = scanner.nextLine();
		if(isStrBlank(username)) {
			return;
		}
		// if(username == null || username.isBlank()) {
		//			return;
		//		}

		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		if(isStrBlank(password)) {
			return;
		}

		System.out.print("이름: ");
		name = scanner.nextLine();
		if(isStrBlank(name)) {
			return;
		}

		System.out.print("이메일: ");
		email = scanner.nextLine();
		if(isStrBlank(email)) {
			return;
		}
		
	}

	private boolean isStrBlank(String str) { 			//캡슐화
		return str == null || str.isBlank();
	}

}
