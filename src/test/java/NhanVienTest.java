import fpoly.demo1.model.NhanVien;
import fpoly.demo1.service.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NhanVienTest {
    NhanVienService service = new NhanVienService();

    @Test
    public void testAdd(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        Assertions.assertEquals(1 , service.getNhanVien().size());
    }
    @Test
    public void testAddNhieuNV(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 2" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        service.add(nv1);
        Assertions.assertEquals(2 , service.getNhanVien().size());
    }
    @Test
    public void testAddNhanVienTrongFirstName(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , " " ,"thang" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 2" , "pham" ,"thang" , "std" , 100000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {service.add(nv);});
        service.add(nv1);
        Assertions.assertEquals(1 , service.getNhanVien().size());
    }
    @Test
    public void testAddNhanVienSaiLuong(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 2" , "pham" ,"thang" , "std" , -1000);
        service.add(nv);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {service.add(nv1);});
        Assertions.assertEquals(1 , service.getNhanVien().size());
    }
    @Test
    public void testAddNhanVienNull(){
        NhanVien nv = new NhanVien();
        Assertions.assertThrows(NullPointerException.class, () -> {service.add(nv);});
        Assertions.assertEquals(0 , service.getNhanVien().size());
    }
    @Test
    public void testUpdate(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        NhanVien nvUpdate = new NhanVien(1 , "Nhan vien " , "pham" ,"thang" , "std" , 100000);
        service.update(1 ,nvUpdate);
        Assertions.assertEquals("Nhan vien " , service.getNhanVien().get(0).getCodeEmployee() );
    }
    @Test
    public void testUpdate1(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 2" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        service.add(nv1);
        NhanVien nvUpdate = new NhanVien(2 , "Nhan vien thuc tap" , "pham" ,"thang" , "std" , 100000);
        service.update(2 ,nvUpdate);
        Assertions.assertEquals("Nhan vien thuc tap" , service.getNhanVien().get(1).getCodeEmployee() );
    }
    @Test
    public void testUpdateNhanVienTrongLastName(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 2" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        service.add(nv1);
        NhanVien nvUpdate = new NhanVien(2 , "Nhan vien thuc tap" , "pham" ,"" , "std" , 100000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {service.update(2 ,nvUpdate);});
//        Assertions.assertEquals("Nhan vien thuc tap" , service.getNhanVien().get(1).getCodeEmployee() );
    }
    @Test
    public void testUpdateNhanVienSaiLuong(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 2" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        service.add(nv1);
        NhanVien nvUpdate = new NhanVien(1 , "Nhan vien thuc tap" , "pham" ,"" , "std" , -100000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {service.update(1 ,nvUpdate);});
//        Assertions.assertEquals("Nhan vien thuc tap" , service.getNhanVien().get(1).getCodeEmployee() );
    }
    @Test
    public void testUpdateNhanVienNull(){
        NhanVien nv = new NhanVien();
        Assertions.assertThrows(NullPointerException.class, () -> {service.update(1 ,nv);});
//        Assertions.assertEquals("Nhan vien thuc tap" , service.getNhanVien().get(1).getCodeEmployee() );
    }
    @Test
    public void testSearch(){
        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"anh" , "std" , 100000);
        NhanVien nv1 = new NhanVien(2 , "Nhan vien 1" , "tran" ,"anh" , "std" , 100000);
        NhanVien nv2 = new NhanVien(3 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
        service.add(nv);
        service.add(nv1);
        service.add(nv2);
        List<NhanVien> nvs = service.search("tran");
        Assertions.assertEquals(1, nvs.size());
    }
    @Test
    public void testSearchNull(){
//        NhanVien nv = new NhanVien(1 , "Nhan vien 1" , "pham" ,"anh" , "std" , 100000);
//        NhanVien nv1 = new NhanVien(2 , "Nhan vien 1" , "tran" ,"anh" , "std" , 100000);
//        NhanVien nv2 = new NhanVien(3 , "Nhan vien 1" , "pham" ,"thang" , "std" , 100000);
//        service.add(nv);
//        service.add(nv1);
//        service.add(nv2);
        List<NhanVien> nvs = service.search(null);
        Assertions.assertEquals(0, nvs.size());
    }
}
