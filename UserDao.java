package com.javatpoint.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.javatpoint.bean.User;  
public class UserDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into user(id,name,department,phone_number,adhar) values(?,?,?,?,?)");  
        ps.setInt(1,u.getId());  
        ps.setString(2,u.getName());  
        ps.setString(3,u.getDepartment());  
        ps.setInt(4,u.getNumber());  
        ps.setInt(5,u.getAdhar()); 
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update user set name=?,department=?,=?,phone_number=?,adhar=?");  
        ps.setString(1,u.getName());  
        ps.setString(2,u.getDepartment());  
        ps.setInt(3,u.getNumber());  
        ps.setInt(4,u.getAdhar());  
        ps.setInt(6,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from user where id=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<User> getAllRecords(){  
    List<User> list=new ArrayList<User>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from user");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            User u=new User();  
            u.setId(rs.getInt("id"));  
            u.setName(rs.getString("name"));  
            u.setDepartment(rs.getString("department"));  
            u.setNumber(rs.getInt("phone_number"));  
            u.setAdhar(rs.getInt("adhar"));
            
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static User getRecordById(int id){  
    User u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from register where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new User();  
            u.setId(rs.getInt("id"));  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setEmail(rs.getString("email"));  
            u.setSex(rs.getString("sex"));  
            u.setCountry(rs.getString("country"));  
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  
