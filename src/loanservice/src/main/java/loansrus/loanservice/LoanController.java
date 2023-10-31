package loansrus.loanservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/loanRequest")
    public String processLoanRequest(@RequestParam(value = "applicantId") String applicantId,
                                          @RequestParam(value = "loanAmount") long loanAmount) {
        return String.format("Loan in the amount of %d was processed successfully.", loanAmount);
    }
}
