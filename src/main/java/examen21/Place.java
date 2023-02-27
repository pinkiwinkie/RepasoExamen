package examen21;

public abstract class Place {
    private String title;
    private double lat;
    private double lon;

    public Place(String title, double lat, double lon) {
        this.title = title;
        this.lat = lat;
        this.lon = lon;
    }

    protected double getLat() {
        return lat;
    }

    protected double getLon() {
        return lon;
    }

    protected String getTitle() {
        return title;
    }
}

