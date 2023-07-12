package algorithmsHomework2;
/*
Algorithms recAuM4qHYwPpCQLL
        Описание задания.
        1 уровень сложности: Ханойская башня
        Задача заключается в следующем:
        Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков, диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший. Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
        Головоломка имеет следующие два правила:
        ●    Вы не можете поместить больший диск на меньший диск.
        ●    За один раз можно перемещать только один диск.
*/


public class Homework2 {

        public static void main(String[] args) {
            System.out.println(Hanoi(6, "A", "C", "B"));


        }

        public static String Hanoi(int n, String A, String C, String B) {
            if (n == 1) return A + C + " ";
            return Hanoi(n - 1, A, B, C) + A + C + " " + Hanoi(n - 1, B, C, A);
        }


    }
   /* Hanoi(n,A,C,B) = Hanoi(n-1,A,B,C)+AC+Hanoi(n-1,B,C,A)
        Hanoi(3,A,C,B) = Hanoi(2,A,B,C)+AC+Hanoi(2,B,C,A)
        Hanoi(2,A,B,C) = Hanoi(1,A,C,B)+AB+Hanoi(1,C,B,A) = AC+AB+CB
        Hanoi(2,B,C,A) = Hanoi(1,B,A,C)+BC+Hanoi(1,A,C,B) = BA+BC+AC
        Hanoi(3,A,C,B) = AC+AB+CB+AC+BA+BC+AC

        */

