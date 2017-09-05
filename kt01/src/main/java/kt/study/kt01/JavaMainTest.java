package kt.study.kt01;

/**
 * package main test for java
 *
 * @author : panxin
 */
public class JavaMainTest {

    public static void main(String[] args) {
        JavaUser javaUser = new JavaUser(1, "java_user");
        KotlinUser ktUser = new KotlinUser(2, "kt_user");
        DataKotlinUser dku = new DataKotlinUser(3, "data_kt_user");

        System.out.println(javaUser);
        System.out.println(ktUser);
        System.out.println(dku);
    }

}
