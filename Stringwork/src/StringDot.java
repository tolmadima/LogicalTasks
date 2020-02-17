public class StringDot {
    public static String defanIPaddr(String address) {
        String defanIPaddr = address.replace(".", "[.]");
        return defanIPaddr;
    }
    public static void main(String Args[]){
        System.out.println(defanIPaddr("192.128.1.0"));
    }
}
