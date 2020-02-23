public class User {

    String name; //zmienne
    int age;

    public User (String name, int age) { //konstruktor łączący zmienne

        this.name = name;
        this.age = age;
    }

   /* public String userName() { //metoda - getter zwracająca imię

        return this.name;
    }

    public int userAge() { //metoda - getter zwracająca wiek

        return this.age;
    }*/


    public static void main(String[] args) {

        User aga = new User("Aga", 40); //obiekty stworzone na podstawie konstroktora
        User beata = new User("Beata", 35);
        User celina = new User("Celina", 30);
        User daria = new User("Daria", 30);

        User[] users = {aga, beata, celina, daria}; //dlaczego w ten sposób tworzy się tabelice, skąd to się wzięło ,
        // gdzie wcięło komendę new

        int sum =0; // wyliczanie sumy wieku
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }

        int averageAge = sum/users.length;

        int i = 0;
        for (i=0; i< users.length; i++) {
            if (users[i].age<averageAge) {
                System.out.println(users[i].name);
            }
        }

    }

}
