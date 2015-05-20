package ArticleManagermentProgram;
import java.util.ArrayList;
public class Action {
	ArrayList<Article>data=new ArrayList<Article>();;
	Article article=new Article();
	//Method for writing data to arraylist
	public boolean wrtie(Article article){
		data.add(article);
		return true;
	}
	//Method for update data in arraylist
	public boolean update(){
		//if data update success
		return true;
		//return false is datacan't update
	}
	public boolean delete(){
		//if data have been delete
		return true;
		//return false if can't deleted data
	}
	public ArrayList<Article> search(String title){
		ArrayList<Article> result=new ArrayList<Article>(); 
	
		for (int i=0 ; i<data.size();i++){
			if (title.equals(data.get(i).getTitle())){
				result.add(data.get(i).getArticle());
			}
			else result=null;
		}
		//return result that datatype in array if search found
		return result;
	}
	public Article read(){
		
		return null;
	}
	//for pagination function
	public void first(){}
	public void last(){}
	public void next(){}
	public void previous(){}
	
	
}
