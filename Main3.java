class Book{
    String title;
    Double price;
Book(){
    this.title = "Unknown";
    this.price = 0.0;
    }
Book(String title){
    this.title = title;
    this.price = 0.0;
    }
Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    void display() {
        System.out.println("Title: "+title+", Price: "+price);
    }
}
class Main3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python");
        Book b3 = new Book("Basics of Python", 675.0);
        b1.display();
        b2.display();
        b3.display();
    }
}
