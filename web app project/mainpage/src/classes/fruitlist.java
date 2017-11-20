package classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class fruitlist {
	
	private String redtomato;
	private String yellowtomato;
	private String raspberry;
	private String pear;
	private String apple;
	private String checkout;
//	private String shoppingbag;
	private Integer shoppingbag;
//	HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	public fruitlist(){
		
		this.redtomato = "";
		this.yellowtomato= "";
		this.raspberry= "";
		this.pear= "";
		this.apple= "";
		this.checkout  = "";
		this.shoppingbag = 0;
	}
	
	public void setredtomato(String redtomato){
		this.redtomato = redtomato;
	}
	
	public void setyellowtomato(String yellowtomato){
		this.yellowtomato = yellowtomato;
	}
	
	
	public void setraspberry(String raspberry){
		this.raspberry = raspberry;
	}
	
	public void setpear(String pear){
		this.pear = pear;
	}
	
	public void setapple(String apple){
		this.apple = apple;
	}
	
	public void setcheckout(String checkout){
		this.checkout = checkout;
	}
	
//	public void setshoppingbag(String shoppingbag){
//		this.shoppingbag = shoppingbag;
//		this.shoppingbag = redtomato + yellowtomato ;
//	}
	public void setshoppingbag(){
//		this.shoppingbag = shoppingbag;
		this.shoppingbag = Integer.parseInt(redtomato) + Integer.parseInt(yellowtomato) + Integer.parseInt(raspberry) + Integer.parseInt(pear) + Integer.parseInt(apple);
	}
	
	// get functions
	public String getredtomato(){
		//System.out.println("get red : " +redtomato );
		return redtomato;
	}
	
	public String getyellowtomato(){
		//System.out.println("get yellow : " +yellowtomato );
		return yellowtomato;
	}
	
	
	public String getraspberry(){
	//	System.out.println("get raspberry : " +raspberry );
		return raspberry;
	}
	
	public String getpear(){
		//System.out.println("get pear : " +pear );
		return pear;
	}
	
	public String getapple(){
		//System.out.println("get apple : " +apple );
		return apple;
	}
	

	public String getcheckoutt(){
//		System.out.println("get : " +checkout );
		return checkout;
	}
	
	public Integer getshoppingbag(){		
		return shoppingbag;
	}
	
//	public String getshoppingbag(){		
//		return shoppingbag;
//	}
	
	
	
	
	
	public boolean submitbutton(){
		
		boolean res  = false;
		if( !checkout.equals("")){	
			return true;
		}
		
		
		
		return res;
	}
	
	
	public HashMap<String, LinkedList<String> > myshoppingbag(){
		
		
		String temp = getredtomato();
		String tempYellow = getyellowtomato();
		String tempAsp = getraspberry();
		String tempApp = getapple();
		String temppear = getpear();
		 HashMap<String, LinkedList<String> > map = new  HashMap<String, LinkedList<String> >();
		System.out.println("----------------------");
		System.out.println("red tomato " + temp );
		System.out.println("yellow tomato " + tempYellow );
		System.out.println("raspberry " + tempAsp );
		System.out.println("apple" + tempApp );
		System.out.println("pear " + temppear);
		
		
		LinkedList redtomato = new LinkedList();
		
		redtomato.add("tomatos.jpg");
		redtomato.add("12");
		redtomato.add("2");
		redtomato.add("24");
		
		System.out.println("print out: " +redtomato.toString() );
//		map.put("aa", 1);
//		map.put("bb", 2);
		map.size();
	
		return map;
		
	}
	
	

}
