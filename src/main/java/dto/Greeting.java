package dto;

/**
 * Created by CarlosSanchez on 2/17/17.
 */
public class Greeting {

    private int visitorNumber;
    private String message;

    public Greeting(int visitorNumber, String message) {
        this.visitorNumber = visitorNumber;
        this.message = message;
    }

    public int getVisitorNumber() {
        return visitorNumber;
    }

    public void setVisitorNumber(int visitorNumber) {
        this.visitorNumber = visitorNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "visitorNumber=" + visitorNumber +
                ", message='" + message + '\'' +
                '}';
    }
}
