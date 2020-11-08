package com.gamesys.exercises.reimbursement.approval.infrastructure;

import com.gamesys.exercises.reimbursement.approval.core.ReimbursementApproval;
import com.gamesys.exercises.reimbursement.approval.core.ReimbursementApprovalManager;

public class ReimbursementApprovalManagerImpl implements ReimbursementApprovalManager {

    public void saveReimbursementApproval(ReimbursementApproval reimbursementApproval) {
        System.out.println("=== Saved Approval ===");
        System.out.println(reimbursementApproval);
        System.out.println("=== End - Saved Approval ===");
    }

}
