package Ornek2;

public class Java implements YazilimDilleri {
    @Override
    public void selamla(){
        System.out.println("System.out.println(\"Hello\");");
    }
    @Override
    public void yazdir(){//Ama dikkat et .İmplement ettiğin sınıfta , override ettiğin metottun başında default bile yazsa
        //sen override edeceğin zaman başında public olması lazım .
        System.out.println("Bunu Java sınıfından yazıyorum . ");

    }
}
