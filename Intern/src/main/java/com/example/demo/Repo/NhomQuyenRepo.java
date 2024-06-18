package com.example.demo.Repo;

import com.example.demo.Model.NhomQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhomQuyenRepo extends JpaRepository<NhomQuyen, Long> {
}
