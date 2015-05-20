package ArticleManagermentProgram;

import java.io.Console;
import java.util.ArrayList;

public class Layout {	
	
	//DRAW HEADER ON TOP
	public void drawHeader(){
		String title="KOREA SOFTWARE HRD CENTER";
		//top row
		displayText("+"); drawSign(45, "=");drawSign(4, "<"); drawSign(30, "=");drawSign(4, ">");drawSign(45, "="); displayText("+"); endOfLine();
		
		displayText( "|"); drawSign(128, " "); displayText( "|"); endOfLine();
		displayText( "|"); drawSign(45, "_"); displayText("<"); drawSign(6, "_"); displayText( title); drawSign(5, "_");displayText(">");drawSign(45, "_"); displayText( "|"); endOfLine();
		displayText( "|"); drawSign(128, " "); displayText( "|"); endOfLine();
		//button row
		displayText("+"); drawSign(45, "=");drawSign(4, "<"); drawSign(30, "=");drawSign(4, ">");drawSign(45, "="); displayText("+"); endOfLine();
		endOfLine();
		
		
	}
	//DISPLAY WELCOME AND GROUP NAME
	public void displayWelcome(){
		String welcome = "Welcome To Article Management Application";
		String group_name = "Class SiemReap , Group 4";
		String member1 = "1. Sok Kimchhoin";
		String member2 = "2. Lim Seudy";
		String member3 = "3. Oeurn Ravuth";
		String member4 = "4. Po Dara";
		String member5 = "5. Prom Piseth";
				
		drawSign(42, " ");displayText("# "); displayText( welcome); displayText(" #"); endOfLine(); 
		drawSign(52, " "); displayText( group_name); endOfLine();
		drawSign(55, " "); displayText( member1); endOfLine();
		drawSign(55, " "); displayText( member2); endOfLine();
		drawSign(55, " "); displayText( member3); endOfLine();
		drawSign(55, " "); displayText( member4); endOfLine();
		drawSign(55, " "); displayText( member5); endOfLine();endOfLine();
	}
	//DRAW MENU
	public void drawMenu(String str){ // parameter action only ACTION like Update delete ...
		String menu_item = "[ 1: First | 2: Prev | 3: Next | 4: Last ]";
		String menu_item2 = "[ 5: Read | 6: Write | 7: Search | 8: Update | 9: Delete | 0: Exit ]";
		
		displayText( "+"); drawSign(58, "-"); displayText( "<<<Menu>>>"); drawSign(60, "-"); displayText( "+"); endOfLine();
		if(!str.equalsIgnoreCase("action")){
			displayText( "|"); drawSign(42, " "); displayText( menu_item); drawSign(44, " "); displayText( "|"); endOfLine();
		}		
		displayText( "|"); drawSign(30, " "); displayText( menu_item2); drawSign(30, " "); displayText( "|"); endOfLine();
		displayText( "+"); drawSign(128, "-"); displayText( "+"); endOfLine(); endOfLine();
		//drawSign(1, "--> Choice...  ");
		//drawSign(130, "-");  endOfLine();
		
	}
	
	
	//DRAW TABLE FOR DISPLAY DATA	

	public void drawTable(ArrayList<Article> arr){
		String total_record = ""+arr.size(); 
		String page;
		if((arr.size()%5)!=0) 
			page= "5/"+((arr.size()/5)+1);
		else
			page= "5/"+((arr.size()/5));
		displayText( "+"); drawSign(128, "="); displayText( "+"); endOfLine();
		displayText( "|"); 
		drawSign(7, " "); displayText("NO"); drawSign(7, " "); displayText( "|"); 
		drawSign(17, " "); displayText("TITLE"); drawSign(17, " "); displayText( "|"); 
		drawSign(17, " "); displayText("AUTHOR"); drawSign(17, " "); displayText( "|");
		drawSign(13, " "); displayText("DATE"); drawSign(13, " "); displayText( "|"); endOfLine();		
		displayText( "+"); drawSign(128, "="); displayText( "+"); endOfLine();		
			for(int k=0;k<arr.size();k++){
				displayText( "|"); 
				displayText(" ");  filterSpace(15,  ""+ arr.get(k).getId()); displayText( "|"); 
				displayText( " ");  filterSpace(38, ""+ arr.get(k).getTitle()); displayText( "|");
				displayText( " ");  filterSpace(39, ""+ arr.get(k).getAuthor()); displayText( "|");
				displayText( " ");  filterSpace(29, ""+ arr.get(k).getDate()); displayText( "|");
				endOfLine();
				displayText( "+"); drawSign(16, "-"); displayText( "+"); drawSign(39, "-");  displayText( "+"); 
				drawSign(40, "-"); displayText( "+"); drawSign(30, "-"); displayText( "+"); endOfLine();
			}			
			displayText( "+"); drawSign(128, "="); displayText( "+"); endOfLine();
			displayText( "|"); filterSpace(20, " Page: " + page); drawSign(85, " "); filterSpace(23, " Total Record: " + total_record); displayText( "|"); endOfLine();
			displayText( "+"); drawSign(128, "="); displayText( "+"); endOfLine();
		}
	
	public void displayFullContent(ArrayList arr,String str){
		
		drawHeader();
		displayWelcome();
		drawTable(arr);
		drawMenu(str);
		
	}
	
	//DISPLAY TEXT AND ONE SIGN
	public void displayText(String str){
		System.out.print(str);
	}
	//DRAW SIGN AND DISPLAY TEXT
	public void drawSign(int num,String sign){
		
		for(int i=1;i<=num;i++){
			System.out.print(sign);
		}
	}
	//END OF LINE
	public void endOfLine(){
		System.out.println();
	}
	//SET SPACIFIC SPACE
	public void filterSpace(int space,String str){
		String sp = "";
		for(int i=0;i<space - str.length() ;i++){
			sp += " ";
		}
		System.out.print(str+sp);
	}
		
	
}
