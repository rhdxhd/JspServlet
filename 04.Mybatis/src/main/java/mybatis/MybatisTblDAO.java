package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTblDAO {
	//싱글톤 ( static 블럭킹을 이용해서 전역적인 초기화 식 사용 )
	
	private static String sql;
	
	static {
		System.out.println("싱글톤?");
		String resource = "mybatis/config.xml";
		InputStream inputStream;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sql = sqlSessionFactory.openSession(true); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public int insert(MybatisTblVO vo) {
		int result = sql.insert("", vo);
		return result;
	}
	public int update(MybatisTblVO vo) {
		return sql.update("", vo);
	}
	public int delete(MybatisTblVO vo) {
		return sql.delete("", vo);
		
	public List<MybatisVO> select() {
		List<MybatisTblVO> list = sql.selectList("");
		return list;
	}
	}
	
}
