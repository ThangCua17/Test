package fpoly.demo1.service;

public class LuongThuongService {

    public String LuongThuong(int namLamViec) {
        if (namLamViec <= 0 ){
            throw new IllegalArgumentException("Nam lam viec phai tu 1 nam tro len ms co thuong");
        }
        if (namLamViec < 3){
            return "Thuong 3 trieu";
        }else if (namLamViec <= 6){
            return "Thuong 10 trieu";
        }else if (namLamViec <= 10){
            return "Thuong 20 trieu";
        }else{
            return "Thuong 40 trieu";
        }

    }
    public int tinhTongMang(int[] array) {
        int sum = 0 ;
        for (int num : array) {
            if (num % 2 == 0 ){
                sum += num;
            }

        }
        return sum;

    }
}
