package fangyaxin;

public class BaiJi {
    public static void main(String[] args) {
        jisuan();
    }

    public static void jisuan() {
        int x, y, z;
        for (x = 0; x <= 20; x++) {
            for (y = 0; y <= 33; y++) {
                z = 100 - x - y;
                if ((z % 3 == 0) && (5 * x + 3 * y + z / 3 == 100)) {
                    System.out.println("鸡翁，鸡母，鸡雏：" + x + " " + y + " " + z);
                }
            }
        }
    }
}
