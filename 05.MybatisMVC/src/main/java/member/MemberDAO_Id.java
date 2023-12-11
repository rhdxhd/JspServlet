package member;

import common.MybatisConnection;

public class MemberDAO_Id extends MybatisConnection implements MemberService{

	public MemberDAO_Id() {
		super(DataResource.HANUL);
	}

	@Override
	public int member_join(MemberVO vo) {
		return 0;
	}

	@Override
	public int member_idCheck(String user_id) {
		String result = sql.selectOne("me.idcheck", user_id);
		
		if(result == "") {
			return 0;
		}else {
			return 1;
		}
		
	}

	@Override
	public MemberVO member_login(MemberVO vo) {
		return null;
	}
	
	@Override
	public int member_update(MemberVO vo) {
		return 0;
	}

	@Override
	public int member_delete(MemberVO vo) {
		return 0;
	}

	//진행예정(x)
	@Override
	public void findPassWord(MemberVO vo) {}

}