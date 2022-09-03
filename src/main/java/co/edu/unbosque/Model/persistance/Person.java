package co.edu.unbosque.Model.persistance;

public class Person {
    String id;
    String tip_identificacion;
    int num_identificacion;
    String sex;
    int age;
    String names;
    String lastnames;

    public Person(String id, String tip_identificacion, int num_identificacion, String sex, int age, String names, String lastnames) {
        this.id = id;
        this.tip_identificacion = tip_identificacion;
        this.num_identificacion = num_identificacion;
        this.sex = sex;
        this.age = age;
        this.names = names;
        this.lastnames = lastnames;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTip_identificacion() {
        return tip_identificacion;
    }

    public void setTip_identificacion(String tip_identificacion) {
        this.tip_identificacion = tip_identificacion;
    }

    public int getNum_identificacion() {
        return num_identificacion;
    }

    public void setNum_identificacion(int num_identificacion) {
        this.num_identificacion = num_identificacion;
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
                "id='" + id + '\'' +
                ", tip_identificacion='" + tip_identificacion + '\'' +
                ", num_identificacion=" + num_identificacion +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", names='" + names + '\'' +
                ", lastnames='" + lastnames + '\'' +
                '}';
    }

}

