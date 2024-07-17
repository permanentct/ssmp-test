package com.itheima;

import com.itheima.dao.studentDAO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.dao")
public class SpringbootMpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMpDemoApplication.class, args);
    }




}
