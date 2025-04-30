class Book {
    String title;

    Book(){
        this.title = "Untitled";
        System.out.println(title);
    }
    Book(String title){
        this.title = title;
        System.out.println(title);
    }

    public static void main(String[]args){

        Book b1 = new Book();
        Book b2 = new Book("New Book");
    }
}