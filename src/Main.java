public class Main {
    public static void main(String[] args) {

       //Task 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);

        //Task 2
        String fullNameToApperCase = fullName.toUpperCase();
        System.out.println(fullNameToApperCase);

        //Task 3
        String fullNameForTask3 = "Иванов Семён Семёнович";
        fullNameForTask3 = fullNameForTask3.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameForTask3);
    }
}