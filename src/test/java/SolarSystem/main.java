package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys = new solarSystemBasics();

        solarsys.Sun = "1";
        solarsys.Moon = "2";
        solarsys.Planets = "2";
        solarsys.Stars = "10";


        //****feature Sun
        FeatureSun Sun = new FeatureSun();
        Sun.name = "panther";
        Sun.color = "black";
        Sun.temp = "1222312elvin";
    }
}
