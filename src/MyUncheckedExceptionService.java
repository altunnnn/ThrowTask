public class MyUncheckedExceptionService {
    public void getException(String name) {
        Person person = new Person();
        person.setAge(23);

        if (person.getAge() < 25) {
            throw new MyUncheckedException(1, String.format("%s adli istifadeci ucun hesab acila bilmez", name));
        }
    }
}
