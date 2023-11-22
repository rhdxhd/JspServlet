import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mybatis.MybatisTblDAO;
import mybatis.MybatisTblVO;

class MybatisTblDAOTest {

@Test
public void insert() {
	
	MybatisTblVO vo = new MybatisTblVO();
	vo.setCol1("a");
	vo.setCol1("a");
	vo.setCol1("a");
	
	
	
	MybatisTblDAO dao = new MybatisTblDAO();
	dao.insert(vo)
	
}

}
