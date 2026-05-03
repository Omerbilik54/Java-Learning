public record UserRecord(String name , String email , String password , int yas) {
    public UserRecord{
        name = name.toUpperCase();
        if(yas < 22) System.out.println("noluyo karşim ");
    }
}
