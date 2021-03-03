package ua.TechnicalInterveByJava.Practise.ModificationPractise1;

public class ModificationPractise1 {
  
    public static void main(String[] args) {
        UserModificationPractise1 userModificationPractise1 =new UserModificationPractise1("Alex");
        modifayUser(userModificationPractise1);
        System.out.println(userModificationPractise1.name);
    }

    private static void modifayUser(UserModificationPractise1 userModificationPractise1) {
        userModificationPractise1.name="NotAlex";
    }
}
//NotAlex