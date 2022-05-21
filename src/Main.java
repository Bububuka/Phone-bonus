package src;

public class Main {
    public static void main(String[] args) {
        int account = 350;
        int income = 1270;
        int border = 1000;

        if (income > border) {
            account += income + income / 100;
        } else {
            account += income;
        }

        System.out.println(account);

    }
}
