package com.example.lab5.API;

import com.example.lab5.Etity.NhanVien;
import com.example.lab5.Repository.NhanVienDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/demo")
public class NhanVienAPI {

    @Autowired
    private NhanVienDAO nv;

    @GetMapping("/getInformation")
    public ResponseEntity<?> doGetInformation() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World");
        result.put("status", true);
        result.put("data", nv.findAll());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/postInformation")
    public ResponseEntity<?> doPostInformation(@RequestBody NhanVien nhanVien) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World");
        result.put("status", true);
        result.put("data", nv.saveAndFlush(nhanVien));
        return ResponseEntity.ok(result);
    }

}
