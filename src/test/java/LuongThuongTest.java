import fpoly.demo1.service.LuongThuongService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuongThuongTest {

    LuongThuongService service = new LuongThuongService();

    @Test
    public void testCanBien3() {
        String exp = "Thuong 3 trieu" ;
        String act = service.LuongThuong(2);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testCanBien6() {
        String exp = "Thuong 20 trieu" ;
        String act = service.LuongThuong(7);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testCanBien10() {
        String exp = "Thuong 20 trieu" ;
        String act = service.LuongThuong(9);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testCanBien11() {
        String exp = "Thuong 40 trieu" ;
        String act = service.LuongThuong(11);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTaiBien10() {
        String exp = "Thuong 20 trieu" ;
        String act = service.LuongThuong(10);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void test(){
        int[] arr = {1, 2, 3, 6, 19 , 12 , 20};
        int exp = 40 ;
        int act = service.tinhTongMang(arr);
        Assertions.assertEquals(exp, act);

    }
}
