package SolarSys;

public class main {
    public static void main(String[] args) {
        solarSysBscs solarsys = new solarSysBscs();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";
        solarsys.Asteroids="17";
//      ******Feature Sun**********
        Feature1Sun Sun = new Feature1Sun();
        Sun.name="jaguar";
        Sun.color="purple";
        Sun.temp="-122234567kelvir";
//      ******Feature Planet**********
        Feature2Planet Planet = new Feature2Planet();
        Planet.name="zuzu";
        Planet.color="orange";
        Planet.mass="122234567t";

    }
}
