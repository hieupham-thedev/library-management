package fa.training.model;

import java.util.Date;
import java.util.Set;

public class Book extends Publication {
    private String isbn;
    private Set<String> authors;
    private String publicationPlace;

    public Book(String isbn, Set<String> authors, String publicationPlace, int publicationYear, String publisher, Date publicationDate) {
        this.isbn = isbn;
        this.authors = authors;
        this.publicationPlace = publicationPlace;
        super.setPublicationYear(publicationYear);
        super.setPublisher(publisher);
        super.setPublicationDate(publicationDate);
    }

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<String> authors) {
        this.authors = authors;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", authors=" + authors +
                ", publicationPlace='" + publicationPlace + '\'' +
                ", " + super.toString() +
                '}';
    }
}
