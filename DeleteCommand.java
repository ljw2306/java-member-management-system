package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ ȸ���� ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		System.out.println(id + "ȸ���� �����Ǿ����ϴ�.");

	}

}
