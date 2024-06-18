package com.example.demo.Repo;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query("Select u FROM User u")
    List<User> findAll();
    @Query("Select u FROM User u WHERE u.username= :username")
    List<User> findByUsername(@Param("username") String username);

    @Query("Select u FROM User u WHERE u.nhomQuyen= :nhomQuyenID")
    List<User> findUserByNhomQuyenID(@Param("nhomQuyenID") Long nhomQuyenID);

    @Query("SELECT COUNT(u) FROM User u Where u.nhomQuyen = :nhomQuyenID")
    Long countUserByNhomQuuyenID(@Param("nhomQuyenID") long nhomQuyenID);

    @Query("From User u Where u.username= :username And u.department= :department")
    List<User> findUserByUsernameAndDepartment(@Param("username") String username, @Param("department") String department);
//tim hieu hql
    //them/xoa /sua cac object
    //lay danh sach quyen cua 1 nhom quyen , truyen vao ma nhom quyen
//lay danh sach cac quyen cua 1 user

}
