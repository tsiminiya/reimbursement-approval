package com.gamesys.exercises.reimbursement.approval.core;

public interface ReimbursementApprovalService {

    void approve(ReimbursementApprovalRequest request);

    void disapprove(ReimbursementApprovalRequest request);

    default void approveWithDetails(
            ReimbursementApprovalRequest request,
            String username) {

    };

    default void disapproveWithDetails(
            ReimbursementApprovalRequest request,
            String username,
            String reason) {

    };
}
