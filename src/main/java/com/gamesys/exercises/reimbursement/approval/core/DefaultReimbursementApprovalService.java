package com.gamesys.exercises.reimbursement.approval.core;

public class DefaultReimbursementApprovalService implements ReimbursementApprovalService {

    private static final boolean APPROVED = true;
    private static final boolean UNAPPROVED = false;

    private final ReimbursementApprovalManager reimbursementApprovalManager;

    public DefaultReimbursementApprovalService(ReimbursementApprovalManager reimbursementApprovalManager) {
        this.reimbursementApprovalManager = reimbursementApprovalManager;
    }

    public void approve(ReimbursementApprovalRequest request) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), APPROVED, request.getApprover());
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval);
    }

    public void disapprove(ReimbursementApprovalRequest request) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), UNAPPROVED, request.getApprover());
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval);
    }

}
