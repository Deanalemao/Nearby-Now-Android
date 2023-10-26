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
     * @return {@code true} if email is valid, {@code false} otherwise.
     */
    public boolean isEmail(String email){
        String emailPattern="^[A-Za-z]+[A-Za-z0-9+_.-]{2,64}+@+[a-z]{5,8}+[.]+[a-z]{2,6}$";
        return Pattern.compile(emailPattern).matcher(email).matches();
    }

    /**
     * Method to validate phone number
     * @param phoneNumber The phone number to validate
     * <p><ul><li>[6-9] The first number must be any number from 6-9</li>
     * <li>[0-9]{9} The next part of phone number must have 9 numbers from 0-9</li></ul></p>
     * @return {@code true} if number is valid, {@code false} otherwise.
     */
    public boolean isPhoneNumber(String phoneNumber){
        String phoneNumberPattern="[6-9][0-9]{9}";
        return Pattern.compile(phoneNumberPattern).matcher(phoneNumber).matches();
    }


    /**
     * Method to validate username
     * @param username The username to validate
     * <p><li>Username must begin with a letter</li></p>
     * <p><li>Username can contain letters, number (.), ( _ ), (-) </li></p>
     * @return {@code true} if username is valid, {@code false} otherwise.
     */
    public boolean isUsername(String username){
        String usernamePattern="[A-Za-z]+[A-Za-z0-9_.-]{2,10}";
        return  Pattern.compile(usernamePattern).matcher(username).matches();
    }

    /**
     * Method to validate password
     * @param password The password to validate
     * @return {@code true} if password is valid, {@code false} otherwise.
     * <p><li>Password must be min 8 character and max 20 characters</li></p>
     */
    public boolean isPassword(String password){
        String passwordPattern="[A-Za-z0-9_.-]{8,20}";
        return  Pattern.compile(passwordPattern).matcher(password).matches();
    }

    /**
     * Method to validate if bith passwords match
     * @param password password entered by user
     * @param confirmPassword password entered by user for confirmation
     * @return {@code true} if both password match, {@code false} otherwise.
     */
    public boolean isPasswordSame(String password,String confirmPassword){
        return password.equals(confirmPassword);
    }

    /**
     * Method to check id country is selected
     * @param country country selection
     * @return @code true} if country is selected {@code false} otherwise.
     */
    public boolean isCountrySelected(String country){
        String defaultSelection ="choose";
        return !country.equals(defaultSelection);
    }


}
