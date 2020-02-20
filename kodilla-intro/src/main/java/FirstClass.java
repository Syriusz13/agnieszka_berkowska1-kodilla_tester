public class FirstClass {

    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2018);
        Notebook heavyNotebook = new Notebook(2000, 900, 2019);
        Notebook oldNotebook = new Notebook(1200, 500, 2015);

        checkAllParameters(notebook);

        checkAllParameters(heavyNotebook);

        checkAllParameters(oldNotebook);

        //int notebookWeight = notebook.getWeight();
        //System.out.println(notebookWeight);
    }

    private static void checkAllParameters(Notebook notebook) {

        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearVsPrice();
    }


}