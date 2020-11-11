package com.gamesys.exercises.reimbursement.approval.core;

public class DefaultReimbursementApprovalService implements ReimbursementApprovalService {

    private static final boolean APPROVED = true;
    private static final boolean UNAPPROVED = false;

    private final ReimbursementApprovalManager reimbursementApprovalManager;

    public DefaultReimbursementApprovalService(ReimbursementApprovalManager reimbursementApprovalManager) {
        this.reimbursementApprovalManager = reimbursementApprovalManager;
    }

    @Override
    public void approve(ReimbursementApprovalRequest request) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), APPROVED);
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval);
    }

    @Override
    public void disapprove(ReimbursementApprovalRequest request) {
        ReimbursementApproval reimbursementApproval = new ReimbursementApproval(request.getReimbursementId(),
                request.getEmployeeId(), UNAPPROVED);
        reimbursementApprovalManager.saveReimbursementApproval(reimbursementApproval);
    }

    @Override
    public void approveWithDetails(ReimbursementApprovalRequest request, String username) {

    }

    @Override
    public void disapproveWithDetails(ReimbursementApprovalRequest request, String username, String reason) {

    }

}
