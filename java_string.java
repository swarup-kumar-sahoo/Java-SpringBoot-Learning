public class java_string{

    public static void main(String args[]){

        String a = "Swarup "; // String created in a String Constant Pool

        @SuppressWarnings("RedundantStringConstructorCall") // Ignore

        String b = new String("Kumar"); // String Created in a heap memory

        System.out.println(a + b);

        @SuppressWarnings("StringBufferMayBeStringBuilder") // Ignore

        StringBuffer s = new StringBuffer("Hello "); // String are immutable but string buffer are mutable
        System.out.println(s.append(a)); // String buffer is also a in build class in java

        


    }
}