package week2.day1;

/**
 * Created by Ihor Samanchuk on 26.09.2015.
 */
public class Iphone {

    private String version;
    private double pontRate;
    private String color;
    private double size;

    public Iphone(String version, double pontRate, String color, double size) {
        this.version = version;
        this.pontRate = pontRate;
        this.color = color;
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public double getPontRate() {
        return pontRate;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPontRate(double pontRate) {
        this.pontRate = pontRate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
