package ie.atu.productv5;

import java.text.NumberFormat;

public class Animal implements Printable{
    String breed;
    String vaccination;
    int age;
    private double price;
    protected static int count = 0;

    public Animal(String breed, String vaccination, int age) {
        this.breed = breed;
        this.vaccination = vaccination;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", vaccination='" + vaccination + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

}
