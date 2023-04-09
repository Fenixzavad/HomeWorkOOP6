import java.util.Scanner;

import models.Zoo.Zoo;
import presenters.Presenter;
import views.ConsoleAnimals;
import views.View;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Zoo javaZoo = new Zoo();
        View view = new ConsoleAnimals(scan);
        Presenter presenter = new Presenter(view, javaZoo);
        presenter.Run();
        scan.close();
    }
}