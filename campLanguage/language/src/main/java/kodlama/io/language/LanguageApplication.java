package kodlama.io.language;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.language.business.abstracts.LanguageService;
import kodlama.io.language.business.concretes.LanguageManager;
import kodlama.io.language.dataAccess.concretes.InMemoryLanguageRepository;
import kodlama.io.language.entities.concretes.Language;

@SpringBootApplication
public class LanguageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguageApplication.class, args);
				
	}

}
