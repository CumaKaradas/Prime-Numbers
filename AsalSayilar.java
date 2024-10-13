public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1'den 1000'e kadar olan asal sayılar:");

        // 2'den başlayarak 1000'e kadar olan sayıları kontrol etme
        for (int i = 2; i <= 1000; i++) {
            boolean asalMi = true;

            // Asal sayı kontrolü
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }

            // Eğer sayı asalsa ekrana yazdırma
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
