package customer;

import java.util.List;

import common.MybatisConnection;

public class CustomerDAO extends MybatisConnection {

	public void test() {
		int result = sql.selectOne("cu.test");
		System.out.println(result);
	}

	
	public List<CustomerVO> select() {
		return sql.selectList("cu.select");
	}
	
	public void delete(int customer_id) {
		System.out.println(sql.delete("cu.delete", customer_id));  // 1이상의 숫자가 나오면 성공
	}
	
	
	public void insert(CustomerVO vo) {
		System.out.println("인서트 : " + sql.insert("cu.insert" , vo));
	}
	
	
	public void update(CustomerVO vo) {
		System.out.println("update : " + sql.insert("cu.update" , vo));
	}
	
	
}
