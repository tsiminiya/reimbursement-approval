package com.gamesys.exercises.reimbursement.approval.core;

public interface ReimbursementApprovalService {

    void approve(ReimbursementApprovalRequest request);

    void disapprove(ReimbursementApprovalRequest request);

}
