package com.codersden.nearbynow.validations;

import java.util.regex.Pattern;

public class Validations {


    /**
     * Method to check if a String is a valid email address
     * @param email The email address to validate
     * <p>String {@code emailPattern} is a pattern for a valid email address.
     *             <ul><li>{@code [A-Za-z]} email must start with a letter e.i A-Z or a-z</li>
     *              <li>{@code [A-Za-z0-9+_.-]{2,64}}It can contain letters,number,'+' ,'-','_','.' symbols. min.2 characters and max. 64 characters</li>
     *              <li>It must contain one '@' symbol</li>
     *              <li>{@code [a-z]{5,8}}The Domain Label can be of min. 5 and max of 8  lower case letters only</li>
     *              <li>{@code [.]}The Domain Label should be followed by a (dot.) </li>
     *              <li>[a-z]{2,6} : Top-Level-Domain must have min 2 max 6 lower case letter only</li>
     *              </ul></p>
     * @return {@code true} if email is valid, {@code false} otherwise
     */
    public boolean isEmail(String email){
        String emailPattern="^[A-Za-z]+[A-Za-z0-9+_.-]{2,64}+@+[a-z]{5,8}+[.]+[a-z]{2,6}$";
        return Pattern.compile(emailPattern).matcher(email).matches();
    }


}
