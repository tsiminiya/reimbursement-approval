package com.gamesys.exercises.reimbursement.approval.core;

public class ReimbursementApprovalRequest {

    private long employeeId;
    private long reimbursementId;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }
}
