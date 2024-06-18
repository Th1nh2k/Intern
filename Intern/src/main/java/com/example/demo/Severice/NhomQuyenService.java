package com.example.demo.Severice;

import com.example.demo.Model.NhomQuyen;
import com.example.demo.Repo.NhomQuyenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhomQuyenService {
    @Autowired
    private NhomQuyenRepo nhomQuyenRepo;
    public void createNhomQUyen(NhomQuyen nhomQuyen){
        nhomQuyenRepo.save(nhomQuyen);
    }
    public void deleteNhomQUyen(long id){
        nhomQuyenRepo.deleteById(id);
    }

}
