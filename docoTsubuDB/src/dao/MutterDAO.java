package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Mutter;

public class MutterDAO {
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	//接続共通処理
	private void connect() throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db = ds.getConnection();
	}

	//切断共通処理
	private void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Mutter> findAll(){
		List<Mutter> mutterList = new ArrayList<>();
			try{
				this.connect();
				String sql = "SELECT * FROM MUTTER ORDER BY ID DESC";
				ps=db.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()) {
					int id = rs.getInt("id");
					String userName = rs.getString("name");
					String text = rs.getString("text");
					Mutter mutter = new Mutter(id, userName, text);
					mutterList.add(mutter);
				}
			} catch(NamingException | SQLException e){
				e.printStackTrace();
			} finally {
				this.disconnect();
			}
	return mutterList;
	}
	public boolean create(Mutter mutter) {
		try{
			this.connect();
			String sql = "INSERT INTO MUTTER(NAME, TEXT) VALUES(?, ?)";
			ps=db.prepareStatement(sql);
			ps.setString(1, mutter.getUserName());
			ps.setString(2, mutter.getText());
			int result = ps.executeUpdate();
			if(result != 1) {
				return false;
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
