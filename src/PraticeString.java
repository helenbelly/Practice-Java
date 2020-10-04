public class PraticeString {


    String name = "Helen";

    public static void main(String[] args) {
        String love = "Nebiyu";
        String  fikir = "Helen";
        System.out.println(love.length());
        System.out.println(love.equals("nebiyu"));
        System.out.println(love.equalsIgnoreCase("nebiyu"));
        System.out.println(love.charAt(5));
        System.out.println(love.substring(3));
        System.out.println(love.substring(2, 5));
        System.out.println(love.toUpperCase());
        System.out.println(love.toLowerCase());
        System.out.println(love.trim());
        System.out.println(love.concat(fikir));

    }
}