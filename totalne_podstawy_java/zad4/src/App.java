public class App {
    public static void main(String[] args) throws Exception {
        String name = "Kamil";
        int lenght = name.length();
        System.out.println(name);
        System.out.println(lenght);

        String text = " Jakis losowy tekst dla testu    ";
        String text2 = text.replace(" ", "-");
        System.out.println(text2);

        String text3 = text.strip();
        String text4 = text3.replace(" ", "-");
        System.out.println(text4);


        boolean startsWithK = name.startsWith("K");
        boolean endWtihK = name.endsWith("K");
        System.out.println(startsWithK);
        System.out.println(endWtihK);

        String name2 = name.toUpperCase();
        String name3 = name.toLowerCase();

        System.out.println(name2);
        System.out.println(name3);
    }
}
