package com.BanqueBlood.Banque_Blood;

import com.BanqueBlood.Banque_Blood.model.Admin;
import com.BanqueBlood.Banque_Blood.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BanqueBloodApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(BanqueBloodApplication.class, args);
	}

@Autowired
	AdminRepository adminRepository;
	@Override
	public void run(String... args) throws Exception {
		Admin admin = new Admin( "diakiss",  "konate", "bko", 7721, "diakisskonate5@gmail.com", "diakiss", "azerty");
		 adminRepository.save(admin);
	}
}
