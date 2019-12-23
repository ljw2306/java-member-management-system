package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������Ʈ �� ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		System.out.println("������ �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("������ ���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		
		
		dao.update(new MemberDTO(id, name, age));
		
		

	}

}
