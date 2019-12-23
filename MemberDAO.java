package com.naver;

import java.util.ArrayList;

public class MemberDAO {
	public static ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	
	public void delete(String id) {
		MemberDTO dto = new MemberDTO(id, null, 0);
		list.remove(dto);
	}
	
	public void update(MemberDTO dto) {
		int idx = list.indexOf(dto);
		if (idx != -1) {
			list.set(idx, dto);	
		}else {
			System.out.println("회원이 아닙니다.");
		}
		
	}
	
	public MemberDTO getMemberDTOById(String id) {
		int idx = list.indexOf(new MemberDTO(id, null, 0));
		if (idx != -1) {
			return list.get(idx);
		}else {
			return null;
		}
	}
	
	public ArrayList<MemberDTO> getList() {
		return list;
	}
	
	public void insert(MemberDTO dto) {
		list.add(dto);
	}
	
	

}
