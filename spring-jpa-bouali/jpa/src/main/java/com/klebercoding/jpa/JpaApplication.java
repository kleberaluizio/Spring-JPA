package com.klebercoding.jpa;


import com.klebercoding.jpa.models.Text;
import com.klebercoding.jpa.models.Video;
import com.klebercoding.jpa.repositories.TextRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (TextRepository repository){
		return args -> {
			var existingText = repository.findById(52);
			if(!existingText.isPresent())
			{
				var text = Text.builder().name("Estudo sobre mamiferos")
					.content("Série de artigos sobre o tópico").build();
				repository.save(text);
			} else {
				existingText.get().setSize(12);
				existingText.get().setContent("Novo conteúdo");
				existingText.get().setUrl("empty");
				repository.save(existingText.get());
			}
		};
	}
//	@Bean
//	public CommandLineRunner commandLineRunner (VideoRepository repository){
//		return args -> {
//			var video = Video.builder()
//				.name("Learning Spring JPA")
//				.length(5)
//				.url("https://www.youtube.com/watch?v=mcl_nibV39s&ab_channel=BoualiAli")
//				.build();
//
//			repository.save(video);
//
//		};
//	}
//	@Bean
//	public CommandLineRunner commandLineRunner (AuthorRepository authorRepository){
//		return args -> {
//			var author = Author.builder()
//				.firstName("Kleber")
//				.lastName("Vaiz")
//				.email("kleber@gmail.com")
//				.age(30)
//				.build();
//
//			authorRepository.save(author);
//
//		};
//	}
}
