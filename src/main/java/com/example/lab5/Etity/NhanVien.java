package com.example.lab5.Etity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @Column(name = "MaNV", nullable = false, length = 10)
    private String MaNV;

    @Column(name = "TenNV")
    private String TenNV;

    @Column(name = "GioiTinh")
    private Boolean GioiTinh;

    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "DienThoai")
    private String DienThoai;

    @Column(name = "NgaySinh")
    private LocalDate NgaySinh;

    @Column(name = "Matkhau")
    private String Matkhau;

    @Column(name = "VaiTro")
    private Boolean VaiTro;

}
