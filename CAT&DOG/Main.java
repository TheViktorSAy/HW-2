public class Main {
    public static void main(String[] args) {

// задание 1
        var dog = 10.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

// задание 2
        var resultDog = dog + 4;
        System.out.println(resultDog);

        var resultCat = cat + 4;
        System.out.println(resultCat);

        var resultPaper = paper + 4;
        System.out.println(resultPaper);

// задание 3
        resultDog = resultDog - 3.5;
        System.out.println(resultDog);

        resultCat = resultCat - 1.6;
        System.out.println(resultCat);

        resultPaper = resultPaper - 7639;
        System.out.println(resultPaper);

// задание 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = (friend + 2) / 7;
        System.out.println(friend);

// задание 5
        var frog = 3.5;
        System.out.println(frog);

        frog = 3.5 * 10;
        System.out.println(frog);

        frog = 3.5 * 10 / 3.5;
        System.out.println(frog);

        frog = 3.5 * 10 / 3.5 + 4;
        System.out.println(frog);



// Задание 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var result = firstBoxer + secondBoxer;
        System.out.println(result);

        var result2 = firstBoxer - secondBoxer;
        System.out.println(result2);

// Задание 7
        var result3 = secondBoxer % firstBoxer;
        System.out.println(result3);

//Задание 8
        var workDone = 640;
        var timePerEmployee = 8;
        var totalEmployeesInTheCompany = workDone / timePerEmployee;
        System.out.println ("Всего работников в компании "  + totalEmployeesInTheCompany + " человек");


        totalEmployeesInTheCompany = totalEmployeesInTheCompany + 94;
        System.out.println(totalEmployeesInTheCompany);

        timePerEmployee = workDone / totalEmployeesInTheCompany;
        System.out.println(timePerEmployee);
        System.out.println("Если в компании работает " + totalEmployeesInTheCompany + " человека, то всего " + timePerEmployee + " часа работы может быть поделено между сотрудниками");

    }




}