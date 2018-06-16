import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Số tiền cho vay là : ");
            double money = sc.nextDouble();
            System.out.print("Tỷ lễ lãi suất theo năm là(%): ");
            double interset_rate = sc.nextDouble();

            for (int month = 1; month <= 12; month++) {
                double Số_tiền_lãi = money * interset_rate/12 * month;
                System.out.println("Số tiền lãi bạn phải trả trong " + month + " là: " + Số_tiền_lãi);
                double Tổng_tiền = money + Số_tiền_lãi;
                System.out.println("Tổng số tiền bạn phải trả trong " + month + " tháng là: " + Tổng_tiền);
                System.out.println();
            }
            System.out.println("--------------------------------------------------");
        }
    }
}

