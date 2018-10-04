public class PracticeTaskOne {
    public static void main(String[] args) {


        int[] massiv = {1, 4, 5, 1, 1, 3};
        int index = 0;

        for (int i = 0; i < massiv.length-1; i++) {
            if (massiv[i] != massiv[i + 1]) {
                index++;


            }


        }
        System.out.println(index);

    }
}
