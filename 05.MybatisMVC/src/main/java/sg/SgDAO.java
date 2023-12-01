package sg;

import java.util.HashMap;
import java.util.List;

import common.MybatisConnection;

public class SgDAO extends MybatisConnection{

	public SgDAO() {
		super(DataResource.HANUL);
	}
	
	
	
	public List<SgVO> select() {
		return sql.selectList("sg.select");
	}
	

	public void delete(int employee_id) {
		System.out.println(sql.delete("sg.delete", employee_id));
		
	}
	
	
	
	public void insert(SgVO vo) {
		sql.insert("sg.insert", vo);
	}
	
	
	public void update(SgVO vo) {
		sql.update("sg.update", vo);
	}
	
	
	

	
	
	
	
}
