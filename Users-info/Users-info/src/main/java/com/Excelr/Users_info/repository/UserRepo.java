package com.Excelr.Users_info.repository;

import com.Excelr.Users_info.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Userinfo, Integer> {

}
