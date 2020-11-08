package com.gamesys.exercises.reimbursement.approval.config;

import com.gamesys.exercises.reimbursement.approval.core.DefaultReimbursementApprovalService;
import com.gamesys.exercises.reimbursement.approval.core.ReimbursementApprovalService;
import com.gamesys.exercises.reimbursement.approval.infrastructure.ReimbursementApprovalManagerImpl;

public class ReimbursementApprovalConfiguration {

    public ReimbursementApprovalService reimbursementApprovalService() {
        return new DefaultReimbursementApprovalService(new ReimbursementApprovalManagerImpl());
    }

}
