package usertbl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// import oracle.jdbc.driver.OracleDriver;

public class UserTblDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public boolean isConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			// OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 전체 목록 조회
	public ArrayList<UserTblDTO> selectList() {

		ArrayList<UserTblDTO> list = new ArrayList<>();

		if (!isConnection())
			return list;
		// return new ArrayList<>();
		try {
			ps = conn.prepareStatement("select * from usertbl");
			rs = ps.executeQuery();
			while (rs.next()) {
				UserTblDTO dto = new UserTblDTO();
				dto.setUsername(rs.getString("USER_NAME"));
				dto.setAddress(rs.getString("ADDRESS"));
				dto.setBirthyear(rs.getInt("BIRTHYEAR"));
				dto.setMobile(rs.getString("MOBILE"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 데이터 1건 조회(회원 한명)
	public UserTblDTO selectOne(String name) {
		UserTblDTO dto = new UserTblDTO();
		if (!isConnection())
			return dto;
		
			try {
				ps = conn.prepareStatement(" SELECT * FROM USERTBL WHERE USER_NAME=? ");
				ps.setString(1, name);
				rs = ps.executeQuery();
				while (rs.next()) {
					dto.setUsername(rs.getString("USER_NAME"));
					dto.setAddress(rs.getString("ADDRESS"));
					dto.setBirthyear(rs.getInt("BIRTHYEAR"));
					dto.setMobile(rs.getString("MOBILE"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return dto;
	}

}
