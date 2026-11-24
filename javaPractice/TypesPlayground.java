public class TypesPlayground {
    public static void main(String[] args) {
        //primitive datatypes
        byte a=100;
        short b=10;
        int c=22;
        long d= 12345678;
        boolean e= true;
        char f='f';
        float g=22.5f;
        double h=22.5;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
        //integer vs decimal division
        int x=5;
        int y=2;
        int res=5/2;
        System.out.println(res);

        double x1=5;
        double y1=2;
        double res1=x1/y1;
        System.out.println(res1);

        //casting loses data
        double marks = 85.7;
        int marks_roundoff = (int)marks;
        System.out.println(marks_roundoff);

        //string comparison
        String s1="Malayalam";
        String s2="Malayalam";
        String s3="NoMalayalam";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
