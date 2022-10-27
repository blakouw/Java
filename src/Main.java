import java.util.*;

public class Main {
        public static void main(String[] args) {
                List<Student> list1 = new ArrayList<>();
                List<Student> list2 = new ArrayList<>();
                List<Student> list3 = new ArrayList<>();
                List<Student> list4 = new ArrayList<>();
                List<Student> list5 = new ArrayList<>();
                Map<String, Class> grupy = new TreeMap<>();

                Student student1 = new Student("Kamil", "Starobrat", true,true,true,2001, 27.0);
                Student student2 = new Student("Jakub", "Sowa", false,false,false,2001, 31.0);
                Student student3 = new Student("Jan", "Kowalski", true,false,true,2002, 12.5);
                Student student4 = new Student("Aneta", "Juk", true,false,true,1998, 93.8);
                Student student5 = new Student("Anna", "Robak", true,true,true,2000, 2.5);
                Student student6 = new Student("Laura", "Awiteks", true,true,true,1999, 21.5);
                Student student7 = new Student("Bartosz", "Nowak", false,false,false,2000, 53.0);
                Student student8 = new Student("Edward", "Mazur", true,false,true,2002, 13.0);
                Student student9 = new Student("Joanna", "Mazur", false,false,false,2001, 0.0);
                Student student10 = new Student("Bartlomiej", "Hamak", false,false,false,2001, 84.5);

                Class grupa1 = new Class("Grupa 1", list1, 8);
                Class grupa2 = new Class("Grupa 2", list2, 3);
                Class grupa3 = new Class("Grupa 3", list3, 13);
                Class grupa4 = new Class("Grupa 4", list4, 5);
                Class grupa5 = new Class("Grupa 5", list5, 5);

                ClassContainer szkola = new ClassContainer(grupy);

                grupa1.addStudent(student1);
                grupa1.addStudent(student2);
                grupa1.addStudent(student3);

                grupa2.addStudent(student4);

                grupa3.addStudent(student5);
                grupa3.addStudent(student6);

                grupa4.addStudent(student7);
                grupa4.addStudent(student8);
                grupa4.addStudent(student9);
                grupa4.addStudent(student10);

                szkola.addClass(grupa1.nazwaGrupy,grupa1.grupa, grupa1.maksymalnaIloscStudentow);
                szkola.addClass(grupa2.nazwaGrupy,grupa2.grupa, grupa2.maksymalnaIloscStudentow);
                szkola.addClass(grupa3.nazwaGrupy,grupa3.grupa, grupa3.maksymalnaIloscStudentow);
                szkola.addClass(grupa4.nazwaGrupy,grupa4.grupa, grupa4.maksymalnaIloscStudentow);
                szkola.addClass(grupa5.nazwaGrupy,grupa5.grupa, grupa5.maksymalnaIloscStudentow);

                if(student8.compareTo(student9)==0){
                        System.out.println("Te same nazwiska");

                }
                else{
                        System.out.println("Rozne nazwiska");
                }

                //grupa3.addPoints(student5, 45.5);
                //student1.setStudentCondition(false, false, false);
                //student1.print();
                //student8.setIStudentCondition(true, false, true);
                //student8.print();

                //grupa4.getStudent(student9);
                //grupa4.summary();

                //grupa1.sortByName();
                //grupa2.sortByName();
                //grupa3.sortByName();
                //grupa4.sortByName();

                //grupa1.sortByPoints();
                //grupa2.sortByPoints();
                //grupa3.sortByPoints();
                //grupa4.sortByPoints();

                //grupa1.max();
                //grupa2.max();
                //grupa3.max();
                //grupa4.max();

                //grupa.print();

                //szkola.removeClass("Grupa 1");
                //szkola.print();
                //grupa4.searchPartial("Bart");
                //grupa4.countByCondition(new StudentCondition(false,false,false));
                //grupa1.search("starobrat");
                //grupa3.search("Mazur");
                //grupa.searchPartial("Kowalski");
                //grupa.searchPartial("elo");
                //grupa.countByCondition(new StudentCondition(true, false, false));
                //szkola.print();
                //szkola.summary();
                //szkola.findEmpty();
        }
}
