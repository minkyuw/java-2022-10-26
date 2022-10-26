import java.util.ArrayList;
import java.util.List;

public class 배열 {

	public static void main(String[] args) {
		exam3();
	}

	static void exam4() {
		List<Article> articles = new ArrayList<Article>();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		for (int i = 0; i < articles.size(); i++) {
			Article article = (Article) articles.get(1);
			System.out.println(article.id);
		}
	}

	static void exam3() {
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		for (int i = 0; i < articles.size(); i++) {
			Article article = (Article) articles.get(1);
			System.out.println(article.id);
		}
	}
	
	static void exam2() {
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		for (int i = 0; i < articles.size(); i++) {
			System.out.println((Article) articles.get(i));
		}
	}
	
	static void exam1() {

		Article[] articles = new Article[10];
		
		int articlesSize = 0;
		articles[0] = new Article();
		articlesSize++;
		articles[1] = new Article();
		articlesSize++;
		articles[2] = new Article();
		articlesSize++;
		articles[3] = new Article();
		articlesSize++;
		
		for ( int i = 0; i < articlesSize; i++) {
			System.out.println(articles[i].id);
		}
	}
}

class Article{
	static int LastId;
	int id;
	String regDate;
	
	static {
		LastId = 0;
	}
	
	Article(int id, String regDate){
		this.id = id;
		this.regDate = regDate;
		
	}
	Article() {
		this(LastId + 1, "2022-10-24"); // Article(LastId + 1, "2022-10-24" + LastId);
		LastId++;
	}
}