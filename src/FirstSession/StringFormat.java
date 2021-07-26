package FirstSession;// FirstSession.StringFormat.java
/*
This programme outputs the given book details and formats them in a neat way.
By Jonathan O'Donovan Kelly
*/

public class StringFormat {
    public static void main(String[] args) {
        int pages = 317, year = 1999;
        String author = "J.K. Rowling", title = "Harry Potter and the Prisoner of Azkaban", name = "Author:",
               subject = "Title:", sheets = "Pages:", date = "Year:", cost = "Price:", eur = "EUR";
        float price = 35.50f;

        String formatString = String.format("%-10s%-1s\n%-10s%-1s\n%-10s%-1d\n%-10s%-1d\n%-10s%-3s%-1.2f",
               subject,title,name,author,sheets,pages,date,year,cost,eur,price);

        System.out.println(formatString) ;
    }
}