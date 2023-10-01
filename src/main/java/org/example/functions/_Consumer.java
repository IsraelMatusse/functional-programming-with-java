package org.example.functions;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
public class _Consumer {

    public static void main(String[] args) {

      Costumer carlos= new Costumer("Carlos", "9999999");
      greetCostumer.accept(carlos);
        grretCostumerBi.accept(carlos, false);
    }

   static Consumer<Costumer> greetCostumer= costumer->
           System.out.println("Your name is "+ costumer.name + "\n and your phone number is "+ costumer.phoneNumber);
    static BiConsumer<Costumer, Boolean> grretCostumerBi =(costumer, showPhoneNumber) ->
            System.out.println("Your name is "+ costumer.name + "\n and your phone number is "+( showPhoneNumber ?  costumer.phoneNumber: "****"));
    static class Costumer{
        private final String name;
        private final String phoneNumber;

         Costumer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
