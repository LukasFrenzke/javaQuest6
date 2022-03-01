import Quest6.Wilder;


public class Classroom {
    public static void main(String[] args) {
        Wilder lukas = new Wilder("Lukas", true);
        Wilder bernd = new Wilder("Bernd", true);
        Wilder andi = new Wilder("Andi", true);
        Wilder andreas = new Wilder("Andreas", true);
        Wilder daniela = new Wilder("Daniela", true);
        Wilder lisanne = new Wilder("Lisanne", true);
        Wilder mike = new Wilder("Mike", true);
        Wilder miles = new Wilder("Miles", true);
        Wilder stefan = new Wilder("Stefan", true);

        System.out.println(lukas.whoAmI());
        System.out.println(bernd.whoAmI());
        System.out.println(andi.whoAmI());
        System.out.println(andreas.whoAmI());
        System.out.println(daniela.whoAmI());
        System.out.println(lisanne.whoAmI());
        System.out.println(mike.whoAmI());
        System.out.println(miles.whoAmI());
        System.out.println(stefan.whoAmI());
    }
}
