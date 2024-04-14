package tatcheff;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountServiceTest {


    @Test
    void withdrawWithEnoughAmount() {
        BankAccount account = new BankAccount("BG18RZBB91550123456789", new BigDecimal("1000"));
        BankAccountService service = new BankAccountService(account);
        service.withdraw(new BigDecimal("500"));
        System.out.println("Successfully withdrawed money from the account");
        assertEquals(new BigDecimal("500"), account.getBalance());
    }

    @Test
    void withdrawWithLowFunds() {
        BankAccount account = new BankAccount("BG18RZBB91550123456789", new BigDecimal("500"));
        BankAccountService service = new BankAccountService(account);
        try {
            service.withdraw(new BigDecimal("1000"));
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void withdrawWithNegativeAmount() {
        BankAccount account = new BankAccount("BG18RZBB91550123456789", new BigDecimal("1000"));
        BankAccountService service = new BankAccountService(account);
        try {
            service.withdraw(new BigDecimal("-500"));
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }
    }
    @Test
    void accumulateInterestWithNegativeRate() {
        BankAccount account = new BankAccount("BG18RZBB91550123456789", new BigDecimal("1000"));
        BankAccountService service = new BankAccountService(account);
        BigDecimal initialBalance = account.getBalance();
        BigDecimal interestRate = new BigDecimal("-5");
        if(interestRate.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("The interest rate is negative.");
        }
        service.accumulateInterest(interestRate);
        assertEquals(initialBalance, account.getBalance());
    }

    @Test
    void accumulateInterestWithRateInInterval0to100() {
        BankAccount account = new BankAccount("BG18RZBB91550123456789", new BigDecimal("1000"));
        BankAccountService service = new BankAccountService(account);
        BigDecimal interestRate = new BigDecimal("100");
        if(interestRate.compareTo(BigDecimal.ZERO) > 0 && interestRate.compareTo(BigDecimal.valueOf(100)) <= 0) {
            System.out.println("The interest rate is within the range.");
        }
        service.accumulateInterest(interestRate);
        assertEquals(new BigDecimal("2000"), account.getBalance());
    }

    @Test
    void accumulateInterestWithRateMoreThan100() {
        BankAccount account = new BankAccount("BG18RZBB91550123456789", new BigDecimal("1000"));
        BankAccountService service = new BankAccountService(account);
        BigDecimal initialBalance = account.getBalance();
        BigDecimal interestRate = new BigDecimal("150");
        if(interestRate.compareTo(BigDecimal.valueOf(100)) > 0) {
            System.out.println("The interest rate is more than 100.");
            service.accumulateInterest(interestRate);
            assertEquals(initialBalance, account.getBalance());
        } else {
            System.out.println("The interest rate is less than 100.");
            service.accumulateInterest(interestRate);
            BigDecimal expectedBalance = initialBalance.add(initialBalance.multiply(interestRate.divide(BigDecimal.valueOf(100))));
            assertEquals(expectedBalance, account.getBalance());
        }
    }



}