interface BookMethods {
    void setTitle(String title);
    void setAuthor(String author);
    void setPublication_Date(int publication_date);
    void setReadDate(int read_date);
    void setMedium(BookMedium medium);
    void setGenre(BookGenre genre);
    void setRating(BookRating rating);
    String getTitle();
    String getAuthor();
    int getPublishedDate();
    int getReadDate();
    BookMedium getMedium();
    BookGenre getGenre();
    BookRating getRating();
}

enum BookMedium {
    Book, PhysicalBook, Kindle, EBook

}

enum BookGenre {
    Fiction, NonFiction, Horror, Romance, Comedy, Thriller, Autobiography, History

}

enum BookRating {
    Rating5, Rating4, Rating3, Rating2, Rating1

}




class Book implements BookMethods {
    private String title;
    private String author;
    private int publication_date;
    private int read_date;
    private BookMedium medium;
    private BookGenre genre;
    private BookRating rating;

    // TODO: CONSTRUCTORS //
    // Book(String title, String author){
    //     setTitle(title);
    //     setAuthor(author);
    // }
    Book(String title, String author, BookGenre genre){
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
    }
    Book(String title, String author, BookGenre genre, int publication_date){
        setTitle(title);
        setAuthor(author);
        setPublication_Date(publication_date);
        setGenre(genre);
    }
    Book(String title, String author, BookGenre genre, int publication_date, int read_date, BookMedium medium, BookRating rating){
        setTitle(title);
        setAuthor(author);
        setPublication_Date(publication_date);
        setReadDate(read_date);
        setMedium(medium);
        setGenre(genre);
        setRating(rating);
    }
    ////////////////////////////////////////////////////

    // METHODS ////
    // getters and setters //
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublication_Date(int publication_date) {
        this.publication_date = publication_date;
    }
    public void setReadDate(int read_date) {
        this.read_date = read_date;
    }
    public void setMedium(BookMedium medium) {
        this.medium = medium;
    }
    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
    public void setRating(BookRating rating) {
        this.rating = rating;
    }

    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public int getPublishedDate() { return this.publication_date; }
    public int getReadDate() { return this.read_date; }
    public BookMedium getMedium() { return this.medium; }
    public BookGenre getGenre() { return this.genre; }
    public BookRating getRating() { return this.rating; }

    public String toString() {
        String message = this.title + " by " + this.author;
        if (publication_date != 0) {
            message = message + " (" + this.publication_date + ")";
        }
        if (read_date != 0) {
            message = message + " - read in " + this.read_date;
        }
        if (rating != null) {
            message = message + ", rated " + (this.rating.toString()).charAt((this.rating.toString()).length()-1) + "/5";
        }
        return message;
    }














    public static void main(String[] args) {
        Book b1 = new Book("Children of Time", "Adrian Tchaikovsky", BookGenre.Fiction);
        System.out.println(b1);
        Book b2 = new Book("The Fifth Season", "N. K. Jemesin", BookGenre.Fiction, 2015);
        System.out.println(b2);
        Book b3 = new Book("Perdido Street Station", "China Mieville",
        BookGenre.Fiction, 2000, 2020, BookMedium.EBook, BookRating.Rating5);
        System.out.println(b3);
        
        
        
        
        
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getGenre());
        System.out.println(b2.getPublishedDate());
        System.out.println(b3.getReadDate());
        System.out.println(b3.getMedium());
        System.out.println(b3.getRating());
    }
}