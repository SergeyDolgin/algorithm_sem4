public class sem4 {
    public static void main(String[] args) {

        Mapa <Integer, String> mapa = new Mapa<>();
        System.out.println(mapa.put(1, "1"));
        System.out.println(mapa.get(1));
        System.out.println(mapa.get(0));
        System.out.println(mapa.put(2, "b"));
        System.out.println(mapa.get(2));
        System.out.println(mapa.put(3, "c"));
        System.out.println(mapa.put(4, "d"));
        System.out.println(mapa.put(17, "F+1"));
        System.out.println(mapa.put(18, "F+2"));
        System.out.println(mapa.put(33, "F+21"));
        System.out.println(mapa.put(1, "e"));
        System.out.println(mapa.put(2, null));
        System.out.println();


        System.out.println(mapa.containsKey(1));
        System.out.println(mapa.containsKey(0));
        System.out.println(mapa.containsKey(2));
        System.out.println();

        System.out.println(mapa.containsValue("3+2"));
        System.out.println(mapa.containsValue("e"));
        System.out.println(mapa.containsValue("c"));

    }
}