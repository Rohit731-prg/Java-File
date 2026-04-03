public class File3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // StringBuffer is thread-safe, synchronized
        StringBuilder sb2 = new StringBuilder(); // StringBuilder is not thread-safe, but faster than StringBuffer
        sb.append("Hello");
        sb.append(" World");

        sb2.append("lets say this is another one");
        sb2.append(" from builder");
        
        System.out.println(sb.toString());
        System.out.println(sb2.toString());
    }
}
