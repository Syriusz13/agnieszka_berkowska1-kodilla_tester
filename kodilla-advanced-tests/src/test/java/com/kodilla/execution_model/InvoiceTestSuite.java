package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

        @Test
        public void shouldAddItemsToInvoice () {

            //When
            int numberOfItems = invoice.getSize();

            //Then
            assertEquals(3, numberOfItems);
        }

        @Test
        public void shouldGetExistingItem () {

            //When
            Item result = invoice.getItem(2);

            //Then
            assertEquals("Bread", result.getName());
            assertEquals(4.15, result.getPrice(), 0.01);
        }

        @Test
        public void shouldReturnNullWhenPassingNegativeIndex () {

            //When
            Item result = invoice.getItem(-3);

            //Then
            assertNull(result);
        }

        @Test
        public void shouldReturnNullWhenPassingOutOfRangeIndex () {

            //When
            Item result = invoice.getItem(7);

            //Then
            assertNull(result);
        }

        @Test
        public void shouldClearInvoice () {

            //When
            invoice.clear();

            //Then
            assertEquals(0, invoice.getSize());
        }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
