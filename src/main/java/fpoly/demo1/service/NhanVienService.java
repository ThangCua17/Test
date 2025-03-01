package fpoly.demo1.service;

import fpoly.demo1.model.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    //Khoi tao list doi tuong
    List<NhanVien> list = new ArrayList<NhanVien>();

    public List<NhanVien> getNhanVien() {
        return list;
    }
    public void add(NhanVien nhanVien) {
        if (nhanVien == null) {
            throw new NullPointerException("NhanVien is null");
        }
        if (nhanVien.getCodeEmployee().isBlank()){
            throw new IllegalArgumentException("Code Employee k dk trong");
        }
        else if (nhanVien.getFirstName().isBlank()){
            throw new IllegalArgumentException("name k dk trong");
        }
        else if (nhanVien.getLastName().isBlank()){
            throw new IllegalArgumentException("name k dk trong");
        }
        else if (nhanVien.getPosition().isBlank()){
            throw new IllegalArgumentException("vi tri k dk trong");
        }
        else if (nhanVien.getSalary() < 0 || nhanVien.getSalary() > 100000000){
            throw new IllegalArgumentException("luong k dk vut qua muc cho phep");
        }
        for (NhanVien nv : list){
            if (nv.getEmployeeID() == nhanVien.getEmployeeID()){
                throw new IllegalArgumentException("Trung id");
            }
        }
        list.add(nhanVien);
    }
    public void update(int id , NhanVien nhanVien){
        if (nhanVien == null) {
            throw new NullPointerException("NhanVien is null");
        }
        if (nhanVien.getCodeEmployee().isBlank()){
            throw new IllegalArgumentException("Code Employee k dk trong");
        }
        else if (nhanVien.getFirstName().isBlank()){
            throw new IllegalArgumentException("name k dk trong");
        }
        else if (nhanVien.getLastName().isBlank()){
            throw new IllegalArgumentException("name k dk trong");
        }
        else if (nhanVien.getPosition().isBlank()){
            throw new IllegalArgumentException("vi tri k dk trong");
        }
        else if (nhanVien.getSalary() < 0 || nhanVien.getSalary() > 100000000){
            throw new IllegalArgumentException("luong k dk vut qua muc cho phep");
        }
        for (NhanVien nv : list){
            if (nv.getEmployeeID() == id){
                nv.setFirstName(nhanVien.getFirstName());
                nv.setLastName(nhanVien.getLastName());
                nv.setPosition(nhanVien.getPosition());
                nv.setSalary(nhanVien.getSalary());
                nv.setCodeEmployee(nhanVien.getCodeEmployee());
                return;
            }
        }
    }
    public void delete(int id){
        boolean kq = getNhanVien().removeIf(nv -> nv.getEmployeeID() == id);
        if (!kq){
            throw new IllegalArgumentException("K tim thay nhan vien co id " + id);
        }
    }
    public List<NhanVien> search(String ten){
        List<NhanVien> listNhanVien = new ArrayList<>();
        if (ten == null || ten.isEmpty()){
            return listNhanVien;
        }
        for (NhanVien nv : list){
            if (nv.getFirstName().equalsIgnoreCase(ten) || nv.getLastName().equalsIgnoreCase(ten)){
                listNhanVien.add(nv);
            }
        }
        return listNhanVien;
    }
}
