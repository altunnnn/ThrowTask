public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        MyUncheckedExceptionService myUncheckedExceptionService = new MyUncheckedExceptionService();

        try{
            myUncheckedExceptionService.getException("test");
        }catch (MyUncheckedException e){
            System.out.println(e.getGetCode());
            System.out.println(e.getGetMessage());
        }

        String str3 = "1Geeksforgeeks";
        System.out.println(MyCheckedException.isValidUsername(str3));
    }
}
