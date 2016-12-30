package org.naraberri.persistence;

import org.naraberri.domain.MemberVO;

public interface MemberDAO {

	public String getTime();
	
	public void insertMamber(MemberVO vo);
	
}
