package model;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String idCardNum;
    public Student(String name, int age,char sex ,String idCardNum){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idCardNum = idCardNum;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getSex(){
        return sex;
    }
    public String getIdCardNum(){
        return idCardNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }
}
