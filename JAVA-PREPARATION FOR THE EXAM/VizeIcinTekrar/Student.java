package VizeIcinTekrar;

public class Student {
    public String name ;
    public int mid;
    public int fin;

    int calculareScore(){
        return (int)(mid*0.4+fin*0.6);
    }
    public void printData(){
        System.out.printf("Name: %s Score: %d %n",name,calculareScore());
    }
}
