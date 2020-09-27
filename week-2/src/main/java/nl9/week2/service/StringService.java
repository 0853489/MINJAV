package nl9.week2.service;

import nl9.week2.model.StringModel;
import nl9.week2.repository.StringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringService {

    @Autowired
    private StringRepository stringRepository;

    @Profile(value={"default"})
    public String reverseString(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public int countWords(String name){
        if (name == null || name.isEmpty()) {
            return 0;
        }

        else {
        String[] words = name.split("\\s+");
        return words.length;
        }

    }
/* Werkt nog niet..
    public void saveString(StringModel stringModel) {
        stringRepository.save(StringModel);
    }

    public List<StringModel> getAllStrings() {
        List<StringModel> stringModels = new ArrayList<>();
        stringRepository.findAll().forEach(StringModel -> stringModels.add(stringModel));
        return stringModels;
    }
*/
    @Profile(value={"local"})
    public String encapsulatedString(String name) {
        return name.toUpperCase();
    }

}
