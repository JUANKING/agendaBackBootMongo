package com.training.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingMongoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(DomainRepository domainRepository, ContactoRepository comunidadesRepo) {
//		return args -> {
//			// Comunidades comunidad = new Comunidades();
//			// comunidad.setComunidad("sdasd");
//			// comunidadesRepo.save(comunidad);
//			// Domain obj = domainRepository.findOne(7L);
//			// System.out.println(obj);
//
//			Collection<Comunidades> com = comunidadesRepo.findAll();
//			com.forEach((k) -> System.out.println("comunidad : " + k));
//
//		};
//
//	}


}
