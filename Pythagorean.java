public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        int a = legA * legA;
        int b = legB * legB;
        double c = a + b;
        double legC = Math.sqrt(c);
        return legC;
    }
}