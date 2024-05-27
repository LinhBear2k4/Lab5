package com.example.lab5.Repository;

import com.example.lab5.Etity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienDAO extends JpaRepository<NhanVien, String> {
    @Repository
    public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

        @Query("SELECT k FROM NhanVien k WHERE k.MaNV = ?1")
        NhanVien findByMaNV(String MaNV);
    }
}
