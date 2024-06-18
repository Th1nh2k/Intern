package com.example.demo.Severice;

import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {return userRepo.findAll();}
    public List<User> getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }
    public List<User> getUsersByNhomQuyenID(Long nhomQuyenID){
        return  userRepo.findUserByNhomQuyenID(nhomQuyenID);
    }
    public Long totalUser(Long nhomQuyenID){
        return userRepo.countUserByNhomQuuyenID(nhomQuyenID);
    }
    public List<User> getUserByNhomQuyenID(Long nhomQuyenID){
        return userRepo.findUserByNhomQuyenID(nhomQuyenID);
    }
    public boolean checkPassword(String password, long userID){
        if(userRepo.findById(userID).isPresent()){
            return userRepo.findById(userID).get().getPassword().equals(password);
        }
        else
            return false;
    }
    public void createUser(User user){
        userRepo.save(user);
    }
    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

}
