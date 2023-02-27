package examen21;

public class Restaurant extends Place{
    private String location;
    private int stars;

    public Restaurant(String title, double lat, double lon) {
        super(title, lat, lon);
    }

    public String getLocation() {
        return location;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return super.toString() +
                location + stars;
    }
}
