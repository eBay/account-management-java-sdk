package com.ebay.accountmanagement.exceptions;

/**
 * Base exception for Account Management SDK errors.
 */
public class AccountManagementException extends RuntimeException {
    public AccountManagementException(String message) {
        super(message);
    }

    public AccountManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}
