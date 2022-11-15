import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccountTest {
    private Account information;
    @BeforeEach
    public void setUp(){
        information = new Account("Harry", "Potter", 2435, 0, LocalDate.of(2022,11,11), "Business");
    }


    @Test
        public void canDeposit(){
            double expected = 5;
            double actual = information.deposit (5);
            assertThat(actual).isEqualTo(expected);
        }
    @Test
    public void canWithdraw(){
        double expected = -5;
        double actual = information.withdrawal (5);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void payInterest(){
        double expected = 14;
        double deposit = information.deposit (10);
        double actual = information.payInterest();
        assertThat(actual).isEqualTo(expected);
    }
    }
