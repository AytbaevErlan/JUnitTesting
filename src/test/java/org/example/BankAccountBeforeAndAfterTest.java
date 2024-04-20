package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // - when we are adding TestInstance we do not need to add static
                                                // and it will still work
public class BankAccountBeforeAndAfterTest {

    static BankAccount bankAccount;

    @BeforeAll
    //@BeforeEach
    public void prepTest(){
        System.out.println("hi!");
        bankAccount = new BankAccount(500, 0);
    }

    @Test
    public void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }
    @Test
    public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(1000, bankAccount.getBalance());
    }

    @AfterAll
    //@AfterEach

    public void endTest(){
        System.out.println("bye!");
    }
}
