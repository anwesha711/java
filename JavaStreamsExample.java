import java.util.ArrayList;
import java.util.List;

public class JavaStreamsExample{

public static void main(String[] args){
    List<String> list = new ArrayList<String>();
    for(int i=0; i<10; i++)
    list.add("a"+i);
    System.out.println(list);
}

}