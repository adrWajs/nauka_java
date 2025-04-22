public class App {
    public static void main(String[] args) throws Exception {
        String text = " Jak nauczyc sie programowania ";;

        String text1 = text.strip();
        String text2 = text.toUpperCase();
        String text3 = text.replace(" Jak ", "");

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);


        String razem = text.strip().toUpperCase().substring(4);
        System.out.println(razem);
    }
}
