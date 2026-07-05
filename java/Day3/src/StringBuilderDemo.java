public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("Java!");

        System.out.println(sb.toString());

        sb.insert(7, "Beautiful ");
        System.out.println(sb.toString());

        sb.delete(7,17);
        System.out.println(sb.toString());
    }
}
