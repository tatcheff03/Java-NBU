package org.tatcheff.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccTest {
    @Test
    public void bankAcc_initWithPositiveBalance_setsCorrectBalance() {

        //arrange
        BankAcc bankAcc = new BankAcc(100.00);
        final double expectedBalance = 100.00;

        //act and assert
        assertEquals(expectedBalance, bankAcc.getBalance(), 0.001);
    }

    @Test
    public void deposit_withNegativeAmount_doesNotChange() {
        //arrange
        final double startingSum = 0.0;
        final double depositSum = -5;
        BankAcc bankAcc = new BankAcc(startingSum);

        //act
        bankAcc.deposit(depositSum);
        //assert
        assertEquals(startingSum, bankAcc.getBalance());
    }


/*/    @Test
//    public void bankAcc_initWithNegativeBalance_setsCorrectBalance() {
//
//        //arrange
//        BankAcc bankAcc = new BankAcc(-100.00);
//        final double expectedBalance = 0.0;
//
//        //act and assert
//        assertEquals(expectedBalance, bankAcc.getBalance(), 0.001);
/*/

    @Test
    public void withdraw_withNegativeAmount_amountDoesNotChange() {
        //Arrange
        final double startingSum = 0.0;
        final double withdrawSum = -5.0;
        BankAcc bankAccount = new BankAcc(startingSum);

        //Act
        bankAccount.withdraw(withdrawSum);

        //Assert
        assertEquals(startingSum, bankAccount.getBalance());
    }

    @Test
    public void withdraw_withWithdrawAmountGtBalance_amountDoesNotChange() {
        //Arrange
        final double startingSum = 100.0;
        final double withdrawSum = 101.0;
        BankAcc bankAccount = new BankAcc(startingSum);

        //Act
        bankAccount.withdraw(withdrawSum);

        //Assert
        assertEquals(startingSum, bankAccount.getBalance());
    }

    @Test
    public void withdraw_withWithdrawAmountEqBalance_amountIsWithdrawn() {
        //Arrange
        final double startingSum = 100.0;
        final double withdrawSum = 100.0;
        final double expected = 0.0;
        BankAcc bankAccount = new BankAcc(startingSum);

        //Act
        bankAccount.withdraw(withdrawSum);

        //Assert
        assertEquals(expected, bankAccount.getBalance());
    }
}



