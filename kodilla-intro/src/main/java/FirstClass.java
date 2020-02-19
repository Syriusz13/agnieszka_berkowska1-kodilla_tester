public class FirstClass {

    public static void main(String[] args) {

        Notebook notebook = new Notebook(600,1000, 2018);
        System.out.println(notebook.weight +  " " + notebook.price +  " " + notebook.year);
        notebook.checkPrice();
        notebook.checkYearVsPrice();

        Notebook heavyNotebook = new Notebook(2000, 900, 2019);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearVsPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2015);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearVsPrice();
    }
}