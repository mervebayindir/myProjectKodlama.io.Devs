package kodlama.io.language.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.language.dataAccess.abstracts.LanguageRepository;
import kodlama.io.language.entities.concretes.Language;

@Repository  
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages=new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Angular"));
		languages.add(new Language(4,"Asp.Net Core"));
		languages.add(new Language(5,"Javascript"));
		languages.add(new Language(6,"Css3"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		
		languages.add(language);
		
	}

	@Override
	public void update(Language language, int id) {
		List<Language> languageList=getAll();
		for (Language language2 : languageList) {
			if (language2.getId()==id) {
				language2.setName(language.getName());
			}
		}
	}

	@Override
	public void delete(int id) {
		languages.remove(getById(id));
	}
	
	@Override
	public Language getById(int id) {
		 return languages.stream().filter(language -> language.getId()==id).findFirst().get();
	}

}
