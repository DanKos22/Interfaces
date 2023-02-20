package ie.atu.productv5;

import ie.atu.productv4.*;


public class ProductDB {

    public static Printable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Printable p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        } else if(productCode.equalsIgnoreCase("PINK")){
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
            p = myMusic;
        } else if(productCode.equalsIgnoreCase("kdl43")){
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819);
            myTV.setManufacture("Sony");
            myTV.setScreenSize(55);
            p = myTV;
        } else if(productCode.equalsIgnoreCase("meg")) {
            Dog myDog = new Dog("Golden Retriever", "Yes", 3, "No", "No");
            p = myDog;
        } else if(productCode.equalsIgnoreCase("Arabian")) {
            Horse myHorse = new Horse("Arabian", "Yes", 4, "Yes", "No", 2);
            p = myHorse;
        }
        return p;
    }
}
