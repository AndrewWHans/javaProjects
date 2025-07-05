package exam2;

public class Website {
    // declaring variables
    String url;
    Website previous;
    Website next;

    public Website(String url) {
        this.url = url;
        this.previous = null;
        this.next = null;
    }
}