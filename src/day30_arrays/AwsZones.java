package day30_arrays;

public class AwsZones {
    public static void main(String[] args) {

        String app = "Etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        String [] eachZones = zones.split(",");

        for (String i : eachZones) {
            System.out.println("Deploying " + app + " to " + i + "..." + "\nDeployment completed for " + i);
            System.out.println();
        }

    }
}
