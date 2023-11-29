package sg;

import java.util.HashMap;
import java.util.List;

import common.MybatisConnection;

public class SgDAO extends MybatisConnection{

	public SgDAO() {
		super(DataResource.HANUL);
	}
	
	
	
	public List<SgVO> select(HashMap<String, String>map) {
		return sql.selectList("sg.select", map);
	}
	

}
