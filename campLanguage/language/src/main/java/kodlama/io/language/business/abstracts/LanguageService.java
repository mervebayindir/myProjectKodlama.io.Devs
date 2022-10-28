package kodlama.io.language.business.abstracts;

import java.util.List;

import kodlama.io.language.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	public Language add(Language language)throws Exception;
	void update(Language language, int id)throws Exception;
	void delete(int id)throws Exception;
	Language getById(int id)throws Exception;
	
	// add
//	
}
