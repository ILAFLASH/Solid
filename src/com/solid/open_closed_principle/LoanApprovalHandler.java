package com.solid.open_closed_principle;

public class LoanApprovalHandler {
    public void approvalLoan(Validator validator) {
        if (validator.isValid()) {
            //process the loan
        }
    }
}
