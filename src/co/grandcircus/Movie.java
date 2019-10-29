package co.grandcircus;

public class Movie {

	private String title;
	private String category;

	public Movie(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public Movie() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie title: " + title + ", category: " + category;
	}

}
