import java.util.List;

public class YazdirGenericWildcard {
    public static void yazdir1(List<?> liste){
        for(Object o: liste){
            System.out.println(o);
        }
    }
}
