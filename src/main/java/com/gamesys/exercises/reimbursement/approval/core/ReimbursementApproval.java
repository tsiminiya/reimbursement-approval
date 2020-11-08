package com.gamesys.exercises.reimbursement.approval.core;

public class ReimbursementApproval {

    private long reimbursementId;
    private long employeeId;
    private boolean approved;

    public ReimbursementApproval() {
    }

    public ReimbursementApproval(long reimbursementId, long employeeId, boolean approved) {
        this.reimbursementId = reimbursementId;
        this.employeeId = employeeId;
        this.approved = approved;
    }

    public long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "ReimbursementApproval{" +
                "reimbursementId=" + reimbursementId +
                ", employeeId=" + employeeId +
                ", approved=" + approved +
                '}';
    }
}
