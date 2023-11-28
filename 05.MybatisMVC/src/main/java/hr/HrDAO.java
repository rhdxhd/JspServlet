package hr;

import java.util.List;

import common.MybatisConnection;
import common.MybatisConnection.DataResource;

public class HrDAO extends MybatisConnection{
	
	public HrDAO() {
		super(DataResource.HR);
	}

	
	public List<HrVO> select() {
		return sql.selectList("hr.select");
	}
	
	
}