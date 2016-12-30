package org.naraberri.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.naraberri.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace =
			"org.naraberri.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMamber(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);		
	}

}
