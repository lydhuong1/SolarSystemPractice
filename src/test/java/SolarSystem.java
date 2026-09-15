import java.awt.*;

public class SolarSystem {

    public static void main(String[] args) {
        BasicStructure BB = new BasicStructure();
        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";
        System.out.println("solar system is ready");

        FeatureSun Xros = new FeatureSun();
        Xros.temp="34324K";
        Xros.Color="green";
        Xros.Radius="3423434342miles";
    }
}
