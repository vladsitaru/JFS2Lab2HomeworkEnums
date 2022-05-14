package PlanetEnums;

import java.util.Scanner;

public class EnumMain {
        public static void main(String[] args) {
            System.out.println("Enter your weight on Earth");
            double weightOnEarth = new Scanner(System.in).nextDouble();
            for (EnumPlanet e : EnumPlanet.values()){
                System.out.println("Your weight on " + e + " is " + Math.round(e.getTerraWeightEquivalent(weightOnEarth)));
            }
        }
}
