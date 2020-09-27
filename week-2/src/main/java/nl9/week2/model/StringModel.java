package nl9.week2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StringModel {

    @Id
    private String id;
    private String name;
    private int count;

    public StringModel(String Id, String name, int count) {
        super();
        this.name = name;
        this.count = count;
    }

    public StringModel() {

    }

    public String getName() {
        return name;
    }

    public int getCount(){
        return count;
    }
}
