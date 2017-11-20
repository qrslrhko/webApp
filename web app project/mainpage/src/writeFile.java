import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;


	class filemaker{

		void fruitexisting(File filePath ) throws FileNotFoundException, IOException{
			try(BufferedReader it = new BufferedReader(new FileReader(filePath)) ){
				
				String line = it.readLine();

				while(line != null){
					System.out.println("--> " + line);
					int size = line.length();
		
					String unit1 = Character.toString(line.charAt(0));
					String unit2 = Character.toString(line.charAt(1));

					System.out.println(" ");
					line = it.readLine();
				
				}
			}

		}
		
		
		void createFile() throws IOException{
			String filePath = "/Users/Chiaoysbaby/desktop/pro1/mainpage/user1.txt";
			
			File currentFile = new File(filePath);
			
			if(!currentFile.exists()){
				System.out.println("*** create new file ***");
				currentFile.createNewFile();
			}
			
			FileWriter w = new FileWriter(currentFile,true);
			BufferedWriter b = new BufferedWriter(w);
			StringBuilder a = new StringBuilder(); 
			a.append("redtomato");
			a.append(" ");
			a.append("11");
			String str = a.toString();
			b.write(str); 
			b.newLine();

			 
			 b.flush();
			 b.close();
			
		}
		
		void readFile() throws FileNotFoundException, IOException{
		
			String res;
			String filePath = "/Users/Chiaoysbaby/desktop/pro1/mainpage/user1.txt";
			String respberryNum= "";
			String redtomatoNum= "";
			String yellowtomatoNum= "";
			String appleNum= "";
			String pearNum= "";
			
			
			try(BufferedReader it = new BufferedReader(new FileReader(filePath)) ){
			
				String line = it.readLine();

				while(line != null){
					System.out.println("--> " + line);
					int size = line.length();
		
					String unit1 = Character.toString(line.charAt(0));
					String unit2 = Character.toString(line.charAt(1));

					if(unit1.equals("r") && unit2.equals("a")  ){
						respberryNum = line.substring(10,size);	
					}
					if(unit1.equals("r") && unit2.equals("e")){
						redtomatoNum = line.substring(10,size);
					}
					if(unit1.equals("y")){
						yellowtomatoNum = line.substring(13, size);
					}
					if(unit1.equals("a")){
						appleNum = line.substring(5, size);
					}
					if(unit1.equals("p")){
						pearNum  = line.substring(5, size);						
					}
					

					
					System.out.println(" ");
					line = it.readLine();
				
				}

				System.out.println("respberryNum   " +respberryNum );
				System.out.println("redtomatoNum   " +redtomatoNum );
				System.out.println("yellowtomatoNum   " +yellowtomatoNum );
				System.out.println("appleNum   " +appleNum );
				System.out.println("pearNum   " +pearNum );
				
			}
			

		}
		
		void removelineInFile() throws FileNotFoundException, IOException{
			
			String filePath = "/Users/Chiaoysbaby/desktop/pro1/mainpage/testremove.txt";
			String  tempfilePath = "/Users/Chiaoysbaby/desktop/pro1/mainpage/temp.txt";
			
			File currentFile = new File(filePath);
			File tempFile = new File(tempfilePath);
			tempFile.createNewFile();
			
			if(!currentFile.exists()){
				System.out.println("*** create new file ***");
				currentFile.createNewFile();
			}
			
			// write words into file
//			FileWriter w = new FileWriter(currentFile,true);
//			BufferedWriter b = new BufferedWriter(w);
//			StringBuilder a = new StringBuilder(); 
//			
//			a.append("aaaaa aaa");
//			String str = a.toString();
//			b.write(str); 
//			b.newLine();
//			
//			StringBuffer a1 = new StringBuffer();
//			a1.append("bbbbb bbb");
//			String str1 = a1.toString();
//			b.write(str1);
//			b.newLine();
//			
//
//			StringBuffer a2 = new StringBuffer();
//			a2.append("ccccc ccc");
//			String str2 = a2.toString();
//			b.write(str2);
//			b.newLine();
//			
//			StringBuffer a3 = new StringBuffer();
//			a3.append("ddddd ddd");
//			String str3 = a3.toString();
//			b.write(str3);
//			b.newLine();
//			
//			 b.flush();
//			 b.close();
//			 
			 
			 
			 // read file 
			 try(BufferedReader it = new BufferedReader(new FileReader(filePath)) ){
				 
					FileWriter w = new FileWriter(tempFile,true);
					BufferedWriter tempwritebuffer = new BufferedWriter(w);
					
				 
				 
					String line = it.readLine();
					System.out.println("if remove line 2..... ");
//					String targetLine = "yellowtomato";
					String targetLine = "raspberry";
					String targetApple = "apple";
				
					// for yellow tomato
					while(line != null){
						StringBuilder tempstr = new StringBuilder(); 
						int size = line.length();
						if(size > 9){
							
							if(!line.substring(0, 9).equals(targetLine) ){
								tempstr.append(line);
								String str = tempstr.toString();
								tempwritebuffer.write(str);
								System.out.println(" -> " +line);
								tempwritebuffer.newLine();
							
							}
						}else{
							tempstr.append(line);
							String str = tempstr.toString();
							tempwritebuffer.write(str);
							System.out.println(" -> " +line);
							tempwritebuffer.newLine();
						}
						
						System.out.println(" ");
						line = it.readLine();
					
					}
					//for apple (0,5)  // for pear (0,4)  // for raspberry (0,9)
//					while(line != null){
//						StringBuilder tempstr = new StringBuilder(); 				
//							if(!line.substring(0, 5).equals(targetApple) ){
//								tempstr.append(line);
//								String str = tempstr.toString();
//								tempwritebuffer.write(str);
//								System.out.println(" -> " +line);
//								tempwritebuffer.newLine();
//							
//							}
//
//						System.out.println(" ");
//						line = it.readLine();
//					
//					}
					
					tempwritebuffer.flush();
					tempwritebuffer.close();
				
					// rename the file 
					tempFile.renameTo(currentFile);
			 }
			
		}
		
		
		
	
}
	
	
	class fruitOrder{
		
		public HashMap<String, LinkedList<String> > myshoppingbag(){
			
			
//			String temp = getredtomato();
//			String tempYellow = getyellowtomato();
//			String tempAsp = getraspberry();
//			String tempApp = getapple();
//			String temppear = getpear();
			 HashMap<String, LinkedList<String> > map = new  HashMap<String, LinkedList<String> >();
//			System.out.println("----------------------");
//			System.out.println("red tomato " + temp );
//			System.out.println("yellow tomato " + tempYellow );
//			System.out.println("raspberry " + tempAsp );
//			System.out.println("apple" + tempApp );
//			System.out.println("pear " + temppear);
//			
			
			LinkedList redtomato = new LinkedList();
			LinkedList pear = new LinkedList();
			
			redtomato.add("tomatos.jpg");
			redtomato.add("12");
			redtomato.add("2");
			redtomato.add("24");
			
			pear.add("pearsnew.jpg");
			pear.add("2");
			pear.add("2");
			pear.add("4");
			
//			System.out.println("print out: " +redtomato.toString() );
			map.put("redTomato",redtomato );
			map.put("pear", pear);
			map.size();
			System.out.println("size: " + map.size());
		//	System.out.println("first: " + map.);
			System.out.println("get tomato: " + map.get("redTomato").get(0));
			System.out.println("size of linkedlist: " + map.get("redTomato").get(0) );
			
			
			Set set = map.keySet();
			Iterator it = set.iterator();
			
			while(it.hasNext()){
				String key = it.next().toString();
				System.out.println("key:" + key);
				
				for(int i =0; i<4; i++){
					System.out.println("->: " + map.get(key).get(i) );
				}
//				System.out.println("print out: " + map.get(key).toString() );
			}

			
			return map;
			
		}
		
	}


public class writeFile {

	public static void main(String []args) throws FileNotFoundException, IOException{
	

		
		filemaker file = new filemaker();
		file.removelineInFile(); 

		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp );
		
	
		
		
		//		fruitOrder f = new fruitOrder();
//		f.myshoppingbag();
		
		
//		file.createFile();
	//	file.readFile();
		
//		StringBuilder str = new StringBuilder();
//		
//		str.append("apple");
//		str.append(" ");
//		str.append("3");
//		
//		System.out.println("str: " + str);
//		
//		 String strPath = "/Users/Chiaoysbaby/desktop/pro1/mainpage/aaa.txt";
//		 File strFile = new File(strPath);
//		 boolean fileCreated = strFile.createNewFile();
//		 //File appending
//		 Writer objWriter = new BufferedWriter(new FileWriter(strFile));
//		 objWriter.write("This is a test");
//		 ((BufferedWriter) objWriter).newLine();
//		 objWriter.flush();
//		 objWriter.close();
//	
	}
	
	// index 
	// red tomato: 11
	// yellow tomato: 14
	// pear : 5
	// apple: 6
	// raspberry: 10
	

}
