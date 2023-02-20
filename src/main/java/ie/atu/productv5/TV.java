package ie.atu.productv5;

public class TV extends Product {
    private String manufacture;
    private int screenSize;

    public TV(){
        super();
        manufacture = "";
        screenSize = 0;
        count++;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + "\nScreen size is " + screenSize + " inches ";
    }
}
