package design_pattern.chapter5.practice;

/**
 * Created by wayne on 2016. 6. 11..
 */
public class Book {
	private String title;
	private int publishedYear;
	private long originalPrice;

	public Book(String titie, int publishedYear, long originalPrice) {
		this.title = titie;
		this.publishedYear = publishedYear;
		this.originalPrice = originalPrice;
	}

	public String getTitle() {
		return title;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public long getOriginalPrice() {
		return originalPrice;
	}
}
