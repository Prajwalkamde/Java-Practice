// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Encapsulation {
    public static void main(String[] args) {
        Book b = new Book(100);
        b.display();
        b.setPages(-1);
//        System.out.println(b.getPages());
        b.display();
        b.setPages(200);
//        System.out.println(b.getPages());
        b.display();
    }
}

class Book{
    private int pages;

    public Book(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }
    public void setPages(int pages){
        if(pages > 0){
            this.pages = pages;
        }
        else{
            System.out.println("Pages cannot be negative");
        }
    }
    public void display(){
        System.out.println("Original value is : " + pages);
    }
}