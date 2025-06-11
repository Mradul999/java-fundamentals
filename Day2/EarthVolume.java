public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow((6378 / 1.609), 3);
        System.out.println(volumeKm3 + "\n" + volumeMiles3);
    }
}
