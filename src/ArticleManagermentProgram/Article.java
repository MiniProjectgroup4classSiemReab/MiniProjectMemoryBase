package ArticleManagermentProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {
	private long id;
	private String title;
	private String author;
	private String content;
	private String date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Article getArticle(){
		return this;
		
	}

	public Article(long id,String title,String author,String content){
		this.id=id;
		this.title=title;
		this.author=author;
		this.content=content;
		this.date= new SimpleDateFormat("dd/MM/yyyy").format(new Date()).toString();
	}
	public Article() {
		// TODO Auto-generated constructor stub
	}

	
}
