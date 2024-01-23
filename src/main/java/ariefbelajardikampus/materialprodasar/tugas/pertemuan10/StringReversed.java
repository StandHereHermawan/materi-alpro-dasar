package ariefbelajardikampus.materialprodasar.tugas.pertemuan10;

public class StringReversed {
    public static void main(String[] args) {
        String[] arraysCharacter = {"J", "A", "V", "A"};
        for (String letter : arraysCharacter) {

        }

        String character = "JAVA";
        StringBuilder builder = new StringBuilder();
        builder.append(character);
        builder.reverse();

        System.out.println(character);
        System.out.println(builder);
    }
}
