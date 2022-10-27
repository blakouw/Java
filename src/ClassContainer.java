import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;

public class ClassContainer {
    Map<String,Class> grupy;

    public ClassContainer(Map<String, Class> grupy) {
        this.grupy = grupy;
    }

    public void addClass(String nazwaGrupy, List<Student> grupa, double pojemnosc) {
        grupy.put(nazwaGrupy,new Class(nazwaGrupy, grupa, pojemnosc ));
    }
    public void removeClass(String nazwaGrupy) {
        grupy.remove(nazwaGrupy);
    }
    public void print() {
        System.out.println(grupy);
    }
    public List<Class> findEmpty() {
        List<Class> pusteGrupy = new ArrayList<>();
        for(Class grupa : grupy.values()) {
            if(grupa.getSize()==0){
                pusteGrupy.add(grupa);
            }
        }
        for(Class grupa : pusteGrupy) {
            System.out.println("Grupa: " + grupa.nazwaGrupy + " jest pusta");
        }

        return pusteGrupy;
    }
    public void summary() {

        for (Class grupa : grupy.values()) {
            System.out.println("Nazwa grupy: " + grupa.nazwaGrupy+" Procentowe zapelnienie: " + (grupa.getSize()/grupa.maksymalnaIloscStudentow) * 100.0 + "%");
        }
    }
}
