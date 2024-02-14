public class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.setBrand("Gibson");
        electricGuitar.setNumOfPickups(2);
        electricGuitar.setRockStarUsesIt(true);

        System.out.println("Brand: " + electricGuitar.getBrand());
        System.out.println("Number of Pickups: " + electricGuitar.getNumOfPickups());
        System.out.println("Rock Star Uses It: " + electricGuitar.getRockStarUsesIt());
    }
}
