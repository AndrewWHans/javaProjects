package exam2;

public class Exam2 {

    public static void main(String[] args) {
        Website  w1 = new Website("yahoo.com");
        Website  w2 = new Website("chase.com");
        Website  w3 = new Website("iusb.edu");
        Website  w4 = new Website("iusb.edu");
        Website  w5 = new Website("wsbt.com");
        Website  w6 = new Website("wndu.com");
        Website  w7 = new Website("southbendin.gov");
        
        Browser Firefox = new Browser();
        Firefox.visit(w1);
        Firefox.show();     //yahoo.com
        Firefox.visit(w2);
        Firefox.show();     //chase.com
        Firefox.visit(w3);
        Firefox.visit(w4);
        Firefox.show();     //iusb.edu
        Firefox.visit(w5);
        Firefox.show();     //wsbt.com
        Firefox.forward();
        Firefox.show();     //wsbt.com      
        Firefox.backward();
        Firefox.backward();
        Firefox.show();     //www.chase.com
        Firefox.visit(w6);
        Firefox.backward();
        Firefox.backward();
        Firefox.show();     //yahoo.com
        Firefox.backward();
        Firefox.show();     //yahoo.com/
        Firefox.forward();
        Firefox.forward();
        Firefox.forward();
        Firefox.visit(w7);  
        Firefox.show();     //southbendin.gov
        Firefox.backward();
        Firefox.show();     //wndu.com    
        
        String homepage = "Google.com";
        Browser Edge = new Browser(homepage);
        Edge.show();    //Google.com
    }
}

/*
If your Website and Browser classes are implemented correctly,
running this program, the following results will be displayed:

yahoo.com
chase.com
iusb.edu
wsbt.com
wsbt.com
chase.com
yahoo.com
yahoo.com
southbendin.gov
wndu.com
Google.com
*/        