package ariefbelajardikampus.materialprodasar.materi.pertemuan4.array.declaration;

public class AlternativeArrayDeclaration {
    public static void main(String[] args) {
        /*
        Second Form declare an array */
        int[] arrayNamings;
        /*
        Declaration are equivalent */
        char[][] arrayNaming = new char[3][4];
        char[][] arrayNaming1 = new char[3][4];
        /*
        This alternative declaration form offers convenience when declaring
        several arrays at the same time */
        int[] nums1, nums2, nums3; // create 3 arrays;
        /*
        similar to */
        int nums4[], nums5[], nums6[];
    }
}
