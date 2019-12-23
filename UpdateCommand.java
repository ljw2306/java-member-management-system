package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("업데이트 할 ID를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("변경할 이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("변경할 나이를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		
		
		dao.update(new MemberDTO(id, name, age));
		
		

	}

}
