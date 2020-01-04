package com.phn.myplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.phn.myplus.mapper")
public class MyplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyplusApplication.class, args);
	}

}
