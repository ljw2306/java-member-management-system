package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command {
	@Override
	public void execute(Scanner sc) {
		System.out.println("ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		System.out.println("Name�� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("Age�� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
	}
}
