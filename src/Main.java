public class Main {

    public static void main(String[] args) {
        // 1 задание
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        // 2 задание
        dog += 4;
        cat += 4;
        paper += 4;

        // 3 задание
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Вывод значений:");
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);

        // 4 задание
        var friend = 19;
        System.out.println("friend1 = " + friend);
        friend += 2;
        System.out.println("friend2 = " + friend);
        friend /= 7;
        System.out.println("friend3 = " + friend);

        // 5 задание
        var frog = 3.5;
        System.out.println("frog1 = " + frog);
        frog *= 10;
        System.out.println("frog2 = " + frog);
        frog /= 3.5;
        System.out.println("frog3 = " + frog);
        frog += 4;
        System.out.println("frog4 = " + frog);

        // 6 задание
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var MassBoxers = boxer1 + boxer2;
        var DifMassBoxers = boxer2 - boxer1;
        System.out.println("Общая масса боксёров = " + MassBoxers);
        System.out.println("Разница в весе боксёров = "+ DifMassBoxers);

        // 7 задание
        var Diff1 = 0.0;
        var Diff2 = 0.0;
        if(boxer1 > boxer2)
        {
            Diff1 = boxer1 - boxer2;
            Diff2 = boxer1 % boxer2;
        }
        else
        {
            Diff1 = boxer2 - boxer1;
            Diff2 = boxer2 % boxer1;
        }

        System.out.println("Результат вычитания = " + Diff1);
        System.out.println("Остаток деления = "+ Diff2);

        // 8 задание
       var Time = 640;
       var WorkTime = 8;
       var Employees = Time / WorkTime;
       var AddTime = (Employees + 94)*WorkTime;

       System.out.println("Всего работников в компании — " + Employees + " человек");
       System.out.println("Если в компании работает " + (Employees+94) + " человек, то всего " + AddTime + " часов работы может быть поделено между сотрудниками");






    }
}