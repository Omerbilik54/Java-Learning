package VizeIcinTekrar;

public class Human {
    int id ;
    int age ;
    private String name ;

    public Human(){
        this.id= id;
        this.age=age;
        this.name="No name";
    }

    public Human(int id){
        this.id=id;
    }

    public Human(int id, String name,int age){
        this.id=id;
        this.age = age;
        this.name=name;
    }
    public Human(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void ShowInfo(){
        System.out.printf("İd: %d age: %d name: %s %n",id,age,name);
    }

}
