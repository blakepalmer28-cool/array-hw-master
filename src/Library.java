import java.sql.SQLOutput;

public class Library {


    public String owner = "Blake Palmer ";
    public Book[] allBooks;
    public static void main(String[] args) {

        Library Lib=new Library();
    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");
        //TODO: Give the array allBooks a size of 10
        allBooks = new Book[10];

        //TODO: Fill the array allBooks with reviews with random ratings from 0 to 10 inclusive
        for (int i =0; i< allBooks.length; i++){
            int randomRating = (int)(Math.random()*11);
            allbooks.l[i]=randomRating;
        }

        //TODO: print all the ratings in the array allBooks
        
        //TODO: Call the method averageRating
        averageRating();

    }

    public void averageRating(){
        //TODO: calculate the average rating from the array allBooks and print it

    }
}
