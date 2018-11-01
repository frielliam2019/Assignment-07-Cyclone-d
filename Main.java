public class Main {

    public static double distanceD1, distanceD2, distanceD3, distanceD4, distanceD5, distanceD6, distanceD7;
    public static double distanceD8, distanceD9, distanceD10, distanceD11, distanceD12;
    public static double distanceTotal, longitude1, longitude2, latitude1, latitude2, distancePTtoPT;
    public static double radiusE = 6371;

    public static void main(String[] args) {
    // Distances between labeled from initial point ( For one day ) and the next point (for the end of that day )
    distanceD1 = distanceFinder(25,15,23,20);
    distanceD2 = distanceFinder(23,20,21,24);
    distanceD3 = distanceFinder(21,24,20,27);
    distanceD4 = distanceFinder(20,27,19,35);
    distanceD5 = distanceFinder(19,35,21,46);
    distanceD6 = distanceFinder(21,46,23,56);
    distanceD7 = distanceFinder(23,56,25,65);
    distanceD8 = distanceFinder(25,65,28,70);
    distanceD9 = distanceFinder(28,70,32,73);
    distanceD10 = distanceFinder(32,73,34,74);
    distanceD11 = distanceFinder(34,74,36,74);
    distanceD12 = distanceFinder(36,74,39,74);

    distanceTotal = distanceD1 + distanceD2 + distanceD3 + distanceD4 + distanceD5 + distanceD6 + distanceD7 + distanceD8 + distanceD9 + distanceD10 + distanceD11 + distanceD12;

    System.out.print("The total distance of Hurricane Gloria from the coast of Africa to the coast of the east coast is "+ distanceTotal);

    }
    // The math that takes the first point's latitude and longitude and the second points lat&long
    public static double distanceFinder(double latitude1, double longitude1, double latitude2, double longitude2){
        double latitude1Rads = Math.toRadians(latitude1);
        double longitude1Rads = Math.toRadians(longitude1);
        double latitude2Rads = Math.toRadians(latitude2);
        double longitude2Rads = Math.toRadians(longitude2);
        double monomial1 = Math.sin((latitude1Rads - latitude2Rads)/2);
        double actualMon = monomial1 * monomial1;
        double monomial4= Math.sin((longitude1Rads - longitude2Rads)/2);
        double actualMon4= monomial4*monomial4;
        double innerMons= Math.cos(latitude1Rads)* Math.cos(latitude2Rads);
        double a = actualMon+innerMons*actualMon4;
        double c= (Math.atan2((Math.sqrt(a)),(Math.sqrt(1-a))));
        distancePTtoPT= radiusE*(2*c);

    return distancePTtoPT;
    }

}
