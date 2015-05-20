package ArticleManagermentProgram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ArticleManagerments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		ArrayList<Article> list;
		int option =0;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Article article=null;
		Action action=new Action();
		for(int i=0;i<=15;i++){
			article=new Article();
			article.setId(i);
			article.setAuthor("Author");
			article.setTitle("Java");
			article.setContent("Java programing");
			article.setDate(dateFormat.format(date));
			action.wrtie(article);
		}
		
//		for(int i=0 ; i<action.data.size();i++){
//    		System.out.println(action.data.get(i).getId());
//			System.out.println(action.data.get(i).getAuthor());
//			System.out.println(action.data.get(i).getContent());
//			System.out.println(action.data.get(i).getTitle());
//			System.out.println(action.data.get(i).getDate());
//		}
		Layout t= new Layout();
		
		//t.drawSignRow(50, "*");
		t.drawHeader();
		t.displayWelcome();
		t.drawTable(action.data);
		t.drawMenu("");
		do{
		
		
		System.out.print("\nEnter your choice: ");
        option = sc.nextInt();
        switch(option){
        case 1:
        	break;
        case 2: 
        	break;
        case 3:
        	break;
        case 4:
        	break;
        case 5:
        	break;
        case 6:
        	break;
        case 7:
        	System.out.print("Please Input Title to search: ");
        	String title=sc.next();
        	list=new ArrayList<Article>();
        	list=action.search(title);
        	if(list!=null){
        		t.drawTable(list);
        	}else{
        		System.out.println("Search Not Found!!!");
        	}
        	break;
        case 8:
        	break;
        case 9:
        	break;
        default:
        	System.out.println("Invalid choice!!! Input again");
        
        }
		}while(option!=0);
		sc.close();

	}

}
