package fangyaxin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class fangayxin {
    public static void main(String[] args) {
        System.out.println("dnaidani");
        System.out.println();
        System.out.println();
        int[] a = {1,2,3};
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        ArrayList<Student> st = new ArrayList<>();
        Student s1 = new Student(2222,"六六六");
        Student s2 = new Student(3333,"花花花");
        st.add(s1);
        st.add(s2);
        st.remove(1);
        System.out.println(st.get(0)+" "+st.size());

        final int b = 60;

        double d = Math.abs(-33.8);
        double e = Math.ceil(33.8);
        double f = Math.floor(33.8);
        double g = Math.round(333.8);
        double d2 = Math.random()*10;
        //System.exit(1);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = df.format(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(System.currentTimeMillis());
        Integer.valueOf(1);
    }
}
