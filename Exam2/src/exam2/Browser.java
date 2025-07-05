package exam2;

public class Browser {
    private Website current;

    // empty argument constructor
    public Browser() {
        this.current = null;
    }

    public Browser(String homepageUrl) {
        visit(new Website(homepageUrl));
    }

    public void visit(Website w) {
        if (current == null) {
            current = w;
        } 
        else if (!current.url.equals(w.url)) {
            if (current.next != null) {
                // detaches from the rest of the list
                current.next.previous = null;
            }
            w.previous = current;
            current.next = w;
            current = w;
        }
        // if the URL is the same as the current, do nothing
    }

    public void backward() {
        if (current != null && current.previous != null) {
            current = current.previous;
        }
    }

    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void show() {
        if (current != null) {
            System.out.println(current.url);
        }
    }
}