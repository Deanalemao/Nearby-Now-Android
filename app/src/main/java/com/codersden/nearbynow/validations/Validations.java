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
     * Methos to validate district
     * @param district the district to validate
     * @return {@code true} if district is valid, {@code false} otherwise.
     */
    public boolean isDistrict(String district){
        String districtPattern="[A-Za-z]{3,50}";
        return  Pattern.compile(districtPattern).matcher(district).matches();
    }

    /**
     * Methos to validate pinCode
     * @param pinCode the pinCode to validate
     * @return {@code true} if pinCode is valid, {@code false} otherwise.
     */
    public boolean isPinCode(String pinCode){
        String pinCodePattern="[0-9]{6}";
        return  Pattern.compile(pinCodePattern).matcher(pinCode).matches();
    }


    /**
     * Method to check if item is selected
     * @param selection country selection
     * @return @code true} if item is selected {@code false} otherwise.
     */
    public boolean isSelected(String selection){
        String defaultSelection ="choose";
        return !selection.equals(defaultSelection);
    }


    /**
     * Methos to validate landmark
     * @param landmark the landmark to validate
     * @return {@code true} if landmark is valid, {@code false} otherwise.
     */
    public boolean isLandmark(String landmark){
        String landmarkPattern="[A-Za-z0-9]{3,150}";
        return  Pattern.compile(landmarkPattern).matcher(landmark).matches();
    }

    /**
     * Methos to validate address
     * @param address the address to validate
     * @return {@code true} if address is valid, {@code false} otherwise.
     */
    public boolean isAddress(String address){
        String addressPattern="[A-Za-z0-9]{3,150}";
        return  Pattern.compile(addressPattern).matcher(address).matches();
    }

    public boolean isBusinessName(String name){
        String businessNamePattern="[A-Za-z0-9]{3,50}";
        return Pattern.compile(businessNamePattern).matcher(name).matches();
    }

    public boolean isBusinessType(String type){
        String businessTypePattern="[A-Za-z]{3,50}";
        return Pattern.compile(businessTypePattern).matcher(type).matches();
    }

    public boolean isDate(String date){
        String datePattern="[0-9]{4}";
        return Pattern.compile(datePattern).matcher(date).matches();
    }

}
