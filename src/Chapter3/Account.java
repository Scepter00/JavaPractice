package Chapter3;

public class Account {
        private String name;
        private double balance;

        public Account(String Surname, double balance) {
            name = Surname;

            if (balance > 0.0) {
                this.balance = balance;
            }
        }
        public void deposit(double depositAmount) {
            if (depositAmount > 0.0) {
                balance = balance + depositAmount;
            }
        }
        public  void withdrawal(double withdrawAmount){
            if (withdrawAmount  > balance) {
                System.out.println("Insufficient fund");
            }
            else
                balance = balance - withdrawAmount;
        }

        public double getBalance() {
            return balance;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
}