package co.edu.unbosque.Model.persistance;

import java.io.Serializable;

public class Person implements Serializable {
    String tip_identification;
    int num_identification;
    String sex;
    int age;
    String names;
    String lastnames;

    public Person( String tip_identification, int num_identification, String sex, int age, String names, String lastnames) {
        this.tip_identification = tip_identification;
        this.num_identification = num_identification;
        this.sex = sex;
        this.age = age;
        this.names = names;
        this.lastnames = lastnames;
    }



    public String getTip_identification() {
        return tip_identification;
    }

    public void setTip_identification(String tip_identification) {
        this.tip_identification = tip_identification;
    }

    public int getNum_identification() {
        return num_identification;
    }

    public void setNum_identification(int num_identification) {
        this.num_identification = num_identification;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "tip_identification='" + tip_identification + '\'' +
                ", num_identification=" + num_identification +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", names='" + names + '\'' +
                ", lastnames='" + lastnames + '\'' +
                '}';
    }

}

