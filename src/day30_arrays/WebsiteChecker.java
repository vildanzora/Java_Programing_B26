package day30_arrays;

public class WebsiteChecker {
    public static void main(String[] args) {

        String [] websites = { "bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0;
        int edu = 0;
        int org = 0;
        int others = 0;

        for (String box : websites) {

            if (box.contains(".com")){
                com++;
            } else if (box.contains(".edu")){
                edu++;
            } else if (box.contains(".org")){
                org++;
            } else {
                others++;
            }
        }
        System.out.println(" .com numbers: " + com);
        System.out.println(" .edu numbers: " + edu);
        System.out.println(".org numbers: " + org);
        System.out.println(" other domain: " + others);

    }
}
