import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import usertbl.UserTblDAO;
import usertbl.UserTblDTO;

class UserTblDAOTest {

	@Test
	public void delete() {
		UserTblDAO dao = new UserTblDAO();
		dao.delete("이승기T"); //이승기T -> request.getParam..
	}

}
