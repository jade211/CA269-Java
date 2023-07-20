/** 
@author Jade Hudson  
*/



/*\* 
BookMethods interface lays out all methods found in the Book Class 
*/
interface BookMethods {
    /*\* 
    setTitle sets the title of the book.
    @return void
    @param takes in string title and sets the title of the book as this value.
    */
    void setTitle(String title);

    /*\* 
    setAuthor sets the author of the book.
    @return void
    @param takes in string author and sets the author of the book as this value.
    */
    void setAuthor(String author);

    /*\* 
    setPublication_Date sets the publication date of the book.
    @return void
    @param takes in int publication_date and sets the publication date of the book as this value.
    */
    void setPublication_Date(int publication_date);

    /*\* 
    setReadDate sets the read date of the book.
    @return void
    @param takes in int read_date and sets the read date of the book as this value.
    */
    void setReadDate(int read_date);

    /*\* 
    setMedium sets the medium of the book.
    @return void
    @param takes in BookMedium value medium and sets the medium of the book as this value.
    */
    void setMedium(BookMedium medium);

    /*\* 
    setGenre sets the genre of the book.
    @return void
    @param takes in BookGenre value genre and sets the genre of the book as this value.
    */
    void setGenre(BookGenre genre);

    /*\* 
    setRating sets the rating of the book.
    @return void
    @param takes in BookRating value rating and sets the book rating of the book as this value.
    */
    void setRating(BookRating rating);

// ------------------------------------------
    /*\* 
    getTitle returns the title of the book.
    @return string - returns the title of the book.
    @param takes in nothing.
    */
    String getTitle();

    /*\* 
    getAuthor returns the author of the book.
    @return string - returns the author of the book.
    @param takes in nothing.
    */
    String getAuthor();

    /*\* 
    getPublicationDate returns the publication date of the book.
    @return int - returns the publication date of the book.
    @param takes in nothing.
    */
    int getPublicationDate();

    /*\* 
    getReadDate returns the read date of the book.
    @return int - returns the read date of the book.
    @param takes in nothing.
    */
    int getReadDate();

    /*\* 
    getMedium returns the medium of the book.
    @return BookMedium - returns the medium of the book.
    @param takes in nothing.
    */
    BookMedium getMedium();

    /*\* 
    getGenre returns the genre of the book.
    @return BookGenre - returns the genre of the book.
    @param takes in nothing.
    */
    BookGenre getGenre();

    /*\* 
    getRating returns the rating of the book.
    @return BookRating - returns the rating of the book.
    @param takes in nothing.
    */
    BookRating getRating();
}


/*\* 
BookMedium displays the types of book mediums available for the books.
*/
enum BookMedium {
    /*\* 
    BookMediums available: Book, PhysicalBook, Kindle, EBook
    */
    Book, PhysicalBook, Kindle, EBook
}

/*\* 
BookGenre displays the types of book genres available for the books.
*/
enum BookGenre {
    /*\* 
    BookGenres available: Fiction, NonFiction, Horror, Romance, Comedy, Thriller, Autobiography, History
    */
    Fiction, NonFiction, Horror, Romance, Comedy, Thriller, Autobiography, History
}

/*\* 
BookRating displays the 5 ratings available for the books (1-5).
*/
enum BookRating {
    /*\* 
    BookRatings available: Rating5, Rating4, Rating3, Rating2, Rating1
    */
    Rating5, Rating4, Rating3, Rating2, Rating1
}


/*\* 
Book is the main class. This class is the book class that uses the above interface, enum methods and also the methods descibed in the class itself to
set the title, author, publication date, read date, medium, genre and ratings of the books.
*/
class Book implements BookMethods {
    /*\* 
    Initialises private String title value to hold title.
    */
    private String title;

    /*\* 
    Initialises private String author value to hold author.
    */
    private String author;

    /*\* 
    Initialises private int publication_date value to hold publication date.
    */
    private int publication_date;
    
    /*\* 
    Initialises private int read_date value to hold read date.
    */
    private int read_date;
    
    /*\* 
    Initialises private BookMedium medium value to hold medium.
    */
    private BookMedium medium;
    
    /*\* 
    Initialises private BookGenre genre value to hold genre.
    */
    private BookGenre genre;
    
    /*\* 
    Initialises private BookRating rating value to hold rating.
    */
    private BookRating rating;


    // CONSTRUCTORS //

    /*\* 
    Initialises the book class if no input is supplied.
    @param Takes in nothing.
    */
    Book(){

    }

    /*\* 
    Initialises the book class when only the title, author and genre are supplied.
    @param title gets set using the title with the setTitle() function using the title supplied.
    @param author gets set using the author with the setAuthor() function using the author name supplied
    @param genre gets set using the genre with the setGenre() function using the genre supplied
    */
    Book(String title, String author, BookGenre genre){
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
    }

    /*\* 
    Initialises the book class when only the title, author, genre and publication date are supplied.
    @param title gets set using the title with the setTitle() function using the title supplied.
    @param author gets set using the author with the setAuthor() function using the author name supplied
    @param genre gets set using the genre with the setGenre() function using the genre supplied
    @param publication_date gets set using the publication date with the setPublication_Date() function using the publication date supplied
    */
    Book(String title, String author, BookGenre genre, int publication_date){
        setTitle(title);
        setAuthor(author);
        setPublication_Date(publication_date);
        setGenre(genre);
    }

    /*\* 
    Initialises the book class when all information is supplied -  the title, author, genre, publication date, read date, medium and rating.
    @param title gets set using the title with the setTitle() function using the title supplied.
    @param author gets set using the author with the setAuthor() function using the author name supplied
    @param publication_date gets set using the publication date with the setPublication_Date() function using the publication date supplied
    @param read_date gets set using the read date with the setReadDate() function using the read date supplied
    @param medium gets set using the medium with the setMedium() function using the medium supplied
    @param genre gets set using the genre with the setGenre() function using the genre supplied
    @param rating gets set using the rating with the setRating() function using the rating supplied.
    */
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
    /*\* 
    setTitle sets the title of the book.
    @return void
    @param takes in string title and sets the title of the book as this value.
    */
    public void setTitle(String title) {
        this.title = title;
    }

    /*\* 
    setAuthor sets the author of the book.
    @return void
    @param takes in string author and sets the author of the book as this value.
    */
    public void setAuthor(String author) {
        this.author = author;
    }

    /*\* 
    setPublication_Date sets the publication date of the book.
    @return void
    @param takes in int publication_date and sets the publication date of the book as this value.
    */
    public void setPublication_Date(int publication_date) {
        this.publication_date = publication_date;
    }

    /*\* 
    setReadDate sets the read date of the book.
    @return void
    @param takes in int read_date and sets the read date of the book as this value.
    */
    public void setReadDate(int read_date) {
        this.read_date = read_date;
    }

    /*\* 
    setMedium sets the medium of the book.
    @return void
    @param takes in BookMedium medium and sets the medium of the book as this value.
    */
    public void setMedium(BookMedium medium) {
        this.medium = medium;
    }

    /*\* 
    setGenre sets the genre of the book.
    @return void
    @param takes in BookGenre genre and sets genre of the book as this value.
    */
    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    /*\* 
    setRating sets the rating of the book.
    @return void
    @param takes in BookRating rating and sets the rating of the book as this value.
    */
    public void setRating(BookRating rating) {
        this.rating = rating;
    }

    /*\* 
    getTitle returns the title of the book.
    @return string - returns the title of the book.
    @param takes in nothing.
    */
    public String getTitle() { return this.title; }

    /*\* 
    getAuthor returns the author of the book.
    @return string - returns the author of the book.
    @param takes in nothing.
    */
    public String getAuthor() { return this.author; }

    /*\* 
    getPublicationDate returns the publication date of the book.
    @return int - returns the publication date of the book.
    @param takes in nothing.
    */
    public int getPublicationDate() { return this.publication_date; }
    
    /*\* 
    getReadDate returns the read date of the book.
    @return int - returns the read date of the book.
    @param takes in nothing.
    */
    public int getReadDate() { return this.read_date; }

    /*\* 
    getMedium returns the medium of the book.
    @return BookMedium - returns the medium of the book.
    @param takes in nothing.
    */
    public BookMedium getMedium() { return this.medium; }

    /*\* 
    getGenre returns the genre of the book.
    @return BookGenre - returns the genre of the book.
    @param takes in nothing.
    */
    public BookGenre getGenre() { return this.genre; }

    /*\* 
    getRating returns the rating of the book.
    @return BookRating - returns the rating of the book.
    @param takes in nothing.
    */
    public BookRating getRating() { return this.rating; }


    /*\* 
    toString returns the information to be printed about the book depending on the input supplied.
    @return String - returns the information to be printed about the book.
    @param takes in nothing
    */
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
        System.out.println(b2.getPublicationDate());
        System.out.println(b3.getReadDate());
        System.out.println(b3.getMedium());
        System.out.println(b3.getRating());
    }
}










/*\* 
PublishedBook is a class that extends the Book class. This class prints out the information on published books and
sets the title, author, genre, medium and publication date of the book.
*/
class PublishedBook extends Book {
    /*\* 
    Initialises String PublishedTitle value to hold published books title.
    */
    String PublishedTitle;
    /*\* 
    Initialises BookGenre PublishedBookGenre value to hold published books genre.
    */
    BookGenre PublishedBookGenre;
    /*\* 
    Initialises BookMedium PublishedBookMedium value to hold published books medium.
    */
    BookMedium PublishedBookMedium;
    /*\* 
    Initialises String PublishedAuthor value to hold published books author.
    */
    String PublishedAuthor;
    /*\* 
    Initialises int PublishedPublicationDate value to hold published books publication date.
    */
    int PublishedPublicationDate;



    /* CONSTRUCTORS */

    /*\* 
    Initialises the PublishedBook class when the published title, author, medium, genre and published date are supplied.
    @param PublishedTitle set using super() - Taken from above parent class Book
    @param PublishedAuthor set using super() - Taken from above parent class Book
    @param PublishedBookGenre set using super() - Taken from above parent class Book
    @param PublishedBookMedium gets set using the medium with the setPublishedMedium() function using the published medium supplied
    @param PublishedPublicationDate gets set using the publication date with the setPublication_Date() function using the published publication date supplied
    */
    public PublishedBook(String PublishedTitle, String PublishedAuthor, BookGenre PublishedBookGenre, int PublishedPublicationDate, BookMedium PublishedBookMedium) {
        super(PublishedTitle, PublishedAuthor, PublishedBookGenre);
        setPublishedMedium(PublishedBookMedium);
        setPublishedPublication_Date(PublishedPublicationDate);
    }

    /*\* 
    setPublishedTitle sets the title of the book.
    @return void
    @param takes in string title and sets the title of the book as this value.
    */
    public void setPublishedTitle(String title) {
        this.PublishedTitle = title;
    }

    /*\* 
    setPublishedAuthor sets the author of the book.
    @return void
    @param takes in string author and sets the author of the book as this value.
    */
    public void setPublishedAuthor(String author) {
        this.PublishedAuthor = author;
    }

    /*\* 
    setPublishedPublication_Date sets the publication date of the book.
    @return void
    @param takes in int publication_date and sets the publication date of the book as this value.
    */
    public void setPublishedPublication_Date(int publication_date) {
        this.PublishedPublicationDate = publication_date;
    }

    /*\* 
    setPublishedMedium sets the medium of the book.
    @return void
    @param takes in BookMedium medium and sets the medium of the book as this value.
    */
    public void setPublishedMedium(BookMedium medium) {
        this.PublishedBookMedium = medium;
    }

    /*\* 
    setPublishedGenre sets the genre of the book.
    @return void
    @param takes in BookGenre genre and sets genre of the book as this value.
    */
    public void setPublishedGenre(BookGenre genre) {
        this.PublishedBookGenre = genre;
    }

    /*\* 
    getPublishedTitle returns the title of the book.
    @return string - returns the title of the book.
    @param takes in nothing.
    */
    public String getPublishedTitle() { return this.PublishedTitle; }
    
    /*\* 
    getPublishedAuthor returns the author of the book.
    @return string - returns the author of the book.
    @param takes in nothing.
    */
    public String getPublishedAuthor() { return this.PublishedAuthor; }
    
    /*\* 
    getPublishedPublicationDate returns the publication date of the book.
    @return int - returns the publication date of the book.
    @param takes in nothing.
    */
    public int getPublishedPublicationDate() { return this.PublishedPublicationDate; }
    
    /*\* 
    getPublishedMedium returns the medium of the book.
    @return BookMedium - returns the medium of the book.
    @param takes in nothing.
    */
    public BookMedium getPublishedMedium() { return this.PublishedBookMedium; }
    
    /*\* 
    getPublishedGenre returns the genre of the book.
    @return BookGenre - returns the genre of the book.
    @param takes in nothing.
    */
    public BookGenre getPublishedGenre() { return this.PublishedBookGenre; }


    /*\* 
    toString returns the information to be printed about the published book depending on the input supplied.
    @return String - returns the information to be printed about the book.
    @param takes in nothing
    */
    public String toString() {
        String message = this.PublishedTitle + " by " + this.PublishedAuthor;
        if (this.PublishedPublicationDate != 0) {
            message = message + " (" + this.PublishedPublicationDate + ")";
        }
        return message;
    }

}





/*\* 
class ReadBook extends the parent class Book. This class prints out the information on books that have been read.
*/
class ReadBook extends Book {
    /*\* 
    Initialises String ReadTitle value to hold read books title.
    */
    String ReadTitle;
    /*\* 
    Initialises BookGenre ReadBookGenre value to hold read books genre.
    */
    BookGenre ReadBookGenre;
    /*\* 
    Initialises String ReadAuthor value to hold read books author.
    */
    String ReadAuthor;
    /*\* 
    Initialises int Read_Date value to hold read date of book.
    */
    int Read_Date;
    /*\* 
    Initialises BookRating ReadBookRating value to hold read books rating.
    */
    BookRating ReadBookRating;




    /* CONSTRUCTORS */

    /*\* 
    Initialises the ReadBook class when the published title, author, genre, read date and rating are supplied.
    @param ReadTitle set using super() - Taken from above parent class Book
    @param ReadAuthor set using super() - Taken from above parent class Book
    @param ReadBookGenre set using super() - Taken from above parent class Book
    @param Read_Date gets set using the read date with the setRead_Date() function.
    @param ReadBookRating gets sets using the read rating with the setReadRating() function.
    */
    public ReadBook(BookGenre ReadBookGenre, String ReadTitle, String ReadAuthor, int Read_Date, BookRating ReadBookRating) {
        super(ReadTitle, ReadAuthor, ReadBookGenre);
        setRead_Date(Read_Date);
        setReadRating(ReadBookRating);
    }

    /*\* 
    setReadTitle sets the title of the book.
    @return void
    @param takes in string title and sets the title of the read book as this value.
    */
    public void setReadTitle(String title) {
        this.ReadTitle = title;
    }

    /*\* 
    setReadAuthor sets the author of the book.
    @return void
    @param takes in string author and sets the author of the read book as this value.
    */
    public void setReadAuthor(String author) {
        this.ReadAuthor = author;
    }

    /*\* 
    setReadGenre sets the genre of the book.
    @return void
    @param takes in BookGenre genre and sets genre of the read book as this value.
    */
    public void setReadGenre(BookGenre genre) {
        this.ReadBookGenre = genre;
    }

    /*\* 
    setRead_Date sets the read date of the book.
    @return void
    @param takes in int read_date and sets the read date of the read book as this value.
    */
    public void setRead_Date(int read_date) {
        this.Read_Date = read_date;
    }

    /*\* 
    setReadRating sets the rating of the book.
    @return void
    @param takes in BookRating rating and sets rating of the read book as this value.
    */
    public void setReadRating(BookRating rating) {
        this.ReadBookRating = rating;
    }

    /*\* 
    getReadTitle returns the title of the book.
    @return string - returns the title of the book.
    @param takes in nothing.
    */
    public String getReadTitle() { return this.ReadTitle; }
    
    /*\* 
    getReadAuthor returns the author of the book.
    @return string - returns the author of the book.
    @param takes in nothing.
    */
    public String getReadAuthor() { return this.ReadAuthor; }
    
    /*\* 
    getRead_Date returns the read date of the book.
    @return int - returns the read date of the book.
    @param takes in nothing.
    */
    public int getRead_Date() { return this.Read_Date; }
    
    /*\* 
    getReadRating returns the rating of the book.
    @return BookRating - returns the rating of the book.
    @param takes in nothing.
    */
    public BookRating getReadRating() { return this.ReadBookRating; }
    
    /*\* 
    getReadGenre returns the genre of the book.
    @return BookGenre - returns the genre of the book.
    @param takes in nothing.
    */
    public BookGenre getReadGenre() { return this.ReadBookGenre; }


    /*\* 
    toString returns the information to be printed about the read book depending on the input supplied.
    @return String - returns the information to be printed about the book.
    @param takes in nothing
    */
    public String toString() {
        String message = this.ReadTitle + " by " + this.ReadAuthor;
        if (this.getReadGenre() != null && this.getRead_Date() != 0 && this.getReadRating() != null) {
            message = message + "( " + Integer.toString(this.Read_Date) + " " + (this.ReadBookRating.toString()).charAt((this.ReadBookRating.toString()).length()-1) + "/5" + this.ReadBookGenre + ")";
        }
        return message;
    }
}