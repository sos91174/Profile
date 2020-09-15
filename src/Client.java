

public class Client {
    public static void main(String arg[]){
        profile pro = new profile();
        phonenumber phone = new phonenumber();
        pro.setName("金城武");
        pro.setAge("30");
        pro.setEmail("abc123@gmail.com");

        phone.setOfficephone("0212345678");
        phone.setHomephone("0228825252");
        phone.setPhone("0912345678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("郭富城");
        pro.setAge("32");
        pro.setEmail("KK555@gmail.com");

        phone.setOfficephone("0812345687678");
        phone.setHomephone("0228826876875252");
        phone.setPhone("09123468765678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("周杰倫");
        pro.setAge("25");
        pro.setEmail("kdas555@gmail.com");

        phone.setOfficephone("0145687678");
        phone.setHomephone("022268875252");
        phone.setPhone("09578765678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("五月天");
        pro.setAge("33");
        pro.setEmail("555555@gmail.com");

        phone.setOfficephone("08555555528");
        phone.setHomephone("054555544552");
        phone.setPhone("095454554678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("劉德華");
        pro.setAge("40");
        pro.setEmail("KK5545455@gmail.com");

        phone.setOfficephone("0812345687678");
        phone.setHomephone("0228826876875252");
        phone.setPhone("09123468765678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("張衛健");
        pro.setAge("40");
        pro.setEmail("KK5568785@gmail.com");

        phone.setOfficephone("0812345687678");
        phone.setHomephone("0228826876875252");
        phone.setPhone("09123468765678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("張學友");
        pro.setAge("39");
        pro.setEmail("9995555@gmail.com");

        phone.setOfficephone("0812345687678");
        phone.setHomephone("0228826876875252");
        phone.setPhone("09123468765678");

        pro.setPhone(phone);
        pro.Total();

        System.out.println("=================================");

        pro.setName("陳學亮");
        pro.setAge("25");
        pro.setEmail("KCC555@gmail.com");

        phone.setOfficephone("0812345687678");
        phone.setHomephone("0228826876875252");
        phone.setPhone("09123468765678");

        pro.setPhone(phone);
        pro.Total();



    }
}
