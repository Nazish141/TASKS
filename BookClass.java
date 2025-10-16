class Book{
    String title;
    String author;
    int publiCationYear;
    public void displayBookInfo(){
        System.out.println("Book titile is:"+title);
        System.out.println("Book author is:"+author);
        System.out.println("Book's publication year is:"+publiCationYear);
    }

}
public class BookClass{
    public static void main(String[]args){
        Book book1 = new Book();
        book1.title = "The great Gatsby";
        book1.author="F.scot";
        book1.publiCationYear=1925;
        
        Book book2 = new Book();
        book2.title="the kite runner";
        book2.author ="khaled hosseini";
        book2.publiCationYear=2003;
        
        Book book3 = new Book();
        book3.title="The power of now";
        book3.author="eckhart tolle";
        book3.publiCationYear=1997;
        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
    }
}
