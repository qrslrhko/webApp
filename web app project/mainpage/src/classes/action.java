
package classes;

public class action {
//	private boolean result;
	
	private String fname;
	private String error_fname;
	
	private String lname;
	private String error_lname;
	
	private String mobno;
	private String error_phone;
	
	private String password;
	private String error_password;
	
	private String email;
	private String error_email;
	
	private String address;
	private String error_address;
	
	private String city;
	private String error_city;
	
	public action(){
		this.fname = "";
		this.lname = "";
		this.mobno="";
		this.error_phone = "";
		this.password = "";
		this.error_password = "";
		this.error_email = "";
		this.error_fname = "";
		this.error_lname = "";
		this.error_address = "";
		this.error_city = "";
	}
	
	// first name
	public void setfname(String fname){
		this.fname = fname;
	}
	public String getfname(){
		return fname;
	}
	
	// last name
	public void setlname(String lname){
		this.lname = lname;
	}
	public String getlname(){
		return lname;
	}
	
	//phone
	public void setmobno(String mobno) {
		this.mobno = mobno;
	}
	public String getmobno(){
	     return mobno;
	}
	//password
	public void setpassword(String password){
		this.password =  password;
	}
	public String getpassword(){
		return password;
	}
	//email
	public void setemail(String email){
		this.email = email;
	}
	public String getemail(){
		return email;
	}
	
	//address
	public void setaddress(String address){
		this.address = address;
	}
	public String getaddress(){
		return address;
	}
	
	//city 
	public void setcity(String city){
		this.city = city;
	}
	public String getcity(){
		return city;
	}
	
	// get error functions ------
	
	public String getLastNameError(){
		return error_lname;
	}
	
	public String getFirstNameError(){
		return error_fname;
	}
	
	public String getPhoneError(){
		return error_phone;
	}
	
	public String getPasswordError(){
		return error_password;
	}
	public String getEmailError(){
		return error_email;
	}
	
	public String getAddressError(){
		return error_address;
	}
	
	public String getCityError(){
		return error_city;
	}
	
	
	
	public boolean validate() {
		 boolean result=true;

		
		int size = mobno.length();
		
	
		if( fname == null || fname.equals("") ){
			this.error_fname = "empty first name, please enter your first name.";
			fname = "";
			result= false;
		}else{
			this.error_fname = "";
		}
		
		if( lname == null || lname.equals("") ){
			this.error_lname = "empty last name, please enter your last name.";
			lname = "";
			result= false;
		}else{
			this.error_lname = "";
		}
		
		if( email == null || email.equals("") ){
			this.error_email = "empty email, please enter your email.";
			email = "";
			result= false;
		}else{
			this.error_email = "";
		}
		
		if( mobno == null || mobno.equals("") ){
			this.error_phone = "empty phone number, please enter your phone number.";
			mobno = "";
			result= false;
		}else{
			this.error_phone = "";
		}
		
		
		if( password == null || password.equals("") ){
			this.error_password = "empty password, please enter your password.";
			password = "";
			result= false;
		}else{
			this.error_password = "";
		}
		
		if( address == null || address.equals("") ){
			this.error_address = "empty address , please enter your address.";
			address = "";
			result= false;
		}else{
			this.error_address = "";
		}
		
		if( city == null || city.equals("") ){
			this.error_city = "empty city , please enter your city.";
			city = "";
			result= false;
		}else{
			this.error_city = "";
		}
		
		

	
				//phone
				int i = 0; 
				while (i < size){
					char  p = mobno.charAt(i);
					String strP = Character.toString(p);					
					if(strP.compareTo("-") == 0  || strP.compareTo("(") == 0 || strP.compareTo(")") == 0){
						this.error_phone = "invalid phone number, please type only digits (No space, parentheses and hyphens ) ";
						result = false;
					}
					if(Character.isLetter(p) == true ) {
						this.error_phone = "invalid phone number, please type only digits (No space, parentheses and hyphens) ";
						result = false;
					}
					else{
						this.error_phone = "";
					}
					i ++;
				}				
				if(i > 10 || i < 10){
					result = false;
					if( this.error_phone.equals("")  == true ){
						this.error_phone = "invalid phone number, wrong digits, please enter again";
					}
				}
				else{
					this.error_phone = "";
				}
				
				
				// password
				int size2 = password.length();
				int z =0; 
				if(size2 < 8){
						this.error_password = "invalid password, please type at least 8 characters.";
						result = false;						
				}
				else{
						this.error_password ="";
				}
		
				
				// email
				int size3= email.length();
				int count = 0;
				int j =0;
				while( j< size3){
					 char c1 = email.charAt(j); 
					String str = Character.toString(c1);
					if( str.compareTo("@") == 0){
						count++;
					}
					j++;
				}
				if(count >=2 || count == 0 ){
					result = false;
					
					this.error_email = "invalid email, please type again";
				}else{
					this.error_email = "";
				}
		
		if(this.error_fname.equals("") &&  this.error_lname.equals("") &&  this.error_email.equals("") &&
				this.error_password.equals("") && this.error_phone.equals("") &&
				this.error_address.equals("") && this.error_city.equals("")
				){
			result = true;
		}
		
		
		
		return result;
		
	}


}
