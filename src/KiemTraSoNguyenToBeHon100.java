public class KiemTraSoNguyenToBeHon100 {
    public static void main(String[] args) {
        for (int number = 100; number > 0; number--) {
            int biến_đếm = 0;
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0) {
                    biến_đếm++;
                } else {
                    biến_đếm = biến_đếm;
                }
            }
            if (biến_đếm == 0) {
                System.out.println(number + " là số nguyên tố!");
            }
        }

    }
}
