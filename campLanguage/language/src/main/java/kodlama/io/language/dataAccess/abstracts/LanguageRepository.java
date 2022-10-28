package kodlama.io.language.dataAccess.abstracts;

import java.util.List;

import kodlama.io.language.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void add(Language language);
	void update(Language language, int id);
	void delete(int id);
	Language getById(int id); 
}
