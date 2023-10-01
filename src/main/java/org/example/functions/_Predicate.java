package org.example.functions;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

    _Predicate predicate= new _Predicate();
        System.out.println(predicate.phoneNumberValid.test("872773717"));
        System.out.println(predicate.phoneNumberValid.test("828182818"));
    }

     Predicate<String> phoneNumberValid= phoneNumber->
            phoneNumber.startsWith("82") && phoneNumber.length()==9;

}
