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

        
        //        *********planet2*********
        Planet2 xaros=new Planet2();
        xaros.name="nehaio";
        xaros.color="blue";
        xaros.size="32432432324324km";



        //        Planet1
        Planet1 plato = new Planet1();
        plato.color = "green";
        plato.name = "abracadabra";
        plato.temp = "10000000k";
        plato.radius = "800000km";

    }
}
