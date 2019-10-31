package it.unical.demacs.ingsw2019.PracticeTestB;

public class ArtWork {

	private String name;
	private String author;
	private int rate;
	
	public ArtWork(String name, String author, int rate) {
		super();
		this.name = name;
		this.author = author;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
