package fa.training.model;

import java.util.Date;

public class Magazine extends Publication {
    private String author;
    private int volume;
    private int edition;

    public Magazine(String author, int volume, int edition, int publicationYear, String publisher, Date publicationDate) {
        this.author = author;
        this.volume = volume;
        this.edition = edition;
        super.setPublicationYear(publicationYear);
        super.setPublisher(publisher);
        super.setPublicationDate(publicationDate);
    }

    public Magazine() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "author='" + author + '\'' +
                ", volume=" + volume +
                ", edition=" + edition +
                ", " + super.toString() +
                '}';
    }
}
