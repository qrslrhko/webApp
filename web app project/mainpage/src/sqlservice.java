import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlservice {

	void showtables(Statement stmt) throws SQLException{
			

			ResultSet rs=stmt.executeQuery("show tables"); 
			System.out.println("show table in database of fruitcompany: ");
			while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  " +rs.getString(4));  
			System.out.println(rs.getString(1) 
							
					);
		}
	public boolean checkPhone(String num){
		
		int size = num.length();
		for(int i =0; i < size; i++){
			if(i >= 10){
				System.out.println("invalid phone number, please type again ");
				return false;
			}
			
			if (Character.isDigit(num.charAt(i))) { 
//			    System.out.printf("-> " +num.charAt(i));
			} else if (Character.isLetter(num.charAt(i))) {
				System.out.println("invalid phone number ");
				return false;
			}
			
		}
		System.out.println("\n");
		return true;
	}
	
	
	public static void main(String []args){
		
		String num = "541-345-2301";
		String num1 = "541-345-288831";
		
		char aa =  num1.charAt(2);
		String str = Character.toString(aa);
		System.out.println("char aa: "+ aa);
		if(str.compareTo("@") == 0){
			System.out.println("@@@");
		}
		sqlservice obj = new sqlservice();
		obj.checkPhone(num1);
		
		/*
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/fruitcompany","root","123");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			sqlservice obj = new sqlservice();
			obj.showtables(stmt);
		
			con.close();  
			
			
			}catch(Exception e){ System.out.println(e);}  
			*/
	}  
		

	
	
}
