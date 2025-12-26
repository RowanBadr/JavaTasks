public class Book {
    public String title;
    public int bookCode;
    boolean isBorrowed;

    public Book(int bookCode,String title){
        this.bookCode=bookCode;
        this.isBorrowed=false;
        this.title=title;
    }

     public int getBookCode(){
        return bookCode;
     }
     public String getTitle(){
        return title;
     }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrowBook(){
        isBorrowed=true;
    }
    public void returnBook(){
        isBorrowed=false;
    }
    public String bookStatus(){
        if (isBorrowed){
            return "Borrowed";
        }else{
            return "Available";
        }
    }
}
