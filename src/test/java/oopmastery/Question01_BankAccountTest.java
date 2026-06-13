package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question01_BankAccountTest {

    @Test
    void shouldDepositMoney() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        100
                );

        account.deposit(50);

        assertEquals(
                150,
                account.getBalance()
        );
    }

    @Test
    void shouldIgnoreNegativeDeposit() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        100
                );

        account.deposit(-50);

        assertEquals(
                100,
                account.getBalance()
        );
    }

    @Test
    void shouldWithdrawMoney() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        100
                );

        account.withdraw(40);

        assertEquals(
                60,
                account.getBalance()
        );
    }

    @Test
    void shouldNotAllowOverdraft() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        100
                );

        account.withdraw(200);

        assertEquals(
                100,
                account.getBalance()
        );
    }

    @Test
    void shouldNotAllowNegativeWithdrawal() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        100
                );

        account.withdraw(-20);

        assertEquals(
                100,
                account.getBalance()
        );
    }

    @Test
    void balanceShouldNeverBeNegative() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        0
                );

        account.withdraw(100);

        assertTrue(
                account.getBalance() >= 0
        );
    }

    @Test
    void shouldReturnOwnerName() {
        Question01_BankAccount account =
                new Question01_BankAccount(
                        "John",
                        100
                );

        assertEquals(
                "John",
                account.getOwner()
        );
    }
}
