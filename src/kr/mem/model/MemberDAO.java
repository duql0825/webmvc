package kr.mem.model;
import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConnect() {
    	String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
    	String user="hr";
    	String password="hr";
    	try {
			conn=DriverManager.getConnection(URL, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return conn;
    }
    
    public int memInsert(MemberVO vo) {
    	String SQL="insert into memTbl values(num_seq.nextval, ?,?,?,?,?)";
    	conn=getConnect();
    	int cnt=-1;
    	try {
			ps=conn.prepareStatement(SQL);
			ps.setInt(1, vo.getBun());
	    	ps.setString(2, vo.getName());
	    	ps.setString(3, vo.getPhone());
	    	ps.setString(4, vo.getEmail());
	    	ps.setString(5, vo.getAddr());
	    	cnt = ps.executeUpdate();
	    	
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return cnt;
    }
    
    public int memDelete(int num) {
        conn=getConnect();
        String SQL="delete from memTbl where num=?";
        int cnt=-1;
        try {
         ps=conn.prepareStatement(SQL);
         ps.setInt(1, num);
         cnt=ps.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      }
        return cnt;
    }
    
    public MemberVO memContent(int num) {
    	conn = getConnect();
    	String SQL ="SELECT * FROM memTbl WHERE num=?";
    	MemberVO vo = null;
    	try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt("num");
				int bun = rs.getInt("bun");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String addr = rs.getString("addr");
				vo = new MemberVO(num, bun, name, phone, email, addr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return vo;
    }
    
    public int memUpdate(MemberVO vo) {
    	conn = getConnect();
    	String SQL = "UPDATE memTbl SET phone=?, email=?, addr=? WHERE num = ?";
    	int cnt = -1;
    	try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getPhone());
			ps.setString(2, vo.getEmail());
			ps.setString(3, vo.getAddr());
			ps.setInt(4, vo.getNum());
			cnt = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return cnt;
    }
    
    public ArrayList<MemberVO> memList() {
    	conn=getConnect();
    	String SQL="select * from memTbl order by num desc";
    	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
    	try {
			ps=conn.prepareStatement(SQL);
			rs=ps.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				int bun=rs.getInt("bun");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String email=rs.getString("email");
				String addr=rs.getString("addr");
				MemberVO vo = new MemberVO(num, bun, name, phone, email, addr);
				list.add(vo);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return list;
    }
}