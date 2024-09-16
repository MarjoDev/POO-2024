package br.edu.fatecfranca.exe3o1;

public class Person{
    public int id;
    public String name;
    public String user;

    public Person(){
        this.id = 0;
        this.name = "";
        this.user = "";
    }
    public Person(int id, String name, String user){
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
