package ie.atu.productv5;

public class Horse extends Animal{
    String dam;
    String sire;
    int height;

    public Horse(String breed, String vaccination, int age, String dam, String sire, int height) {
        super(breed, vaccination, age);
        this.dam = dam;
        this.sire = sire;
        this.height = height;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        sire = sire;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", vaccination='" + vaccination + '\'' +
                ", age=" + age +
                ", dam='" + dam + '\'' +
                ", sire='" + sire + '\'' +
                ", height=" + height +
                '}';
    }
}
