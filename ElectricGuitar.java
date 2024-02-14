class ElectricGuitar {
    String brand;
    int numofPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numofPickups;
    }

    void setNumOfPickups(int num){
        numofPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
