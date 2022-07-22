package gwAws.gwAwsProject.reservation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class ProgramReserveVo {
    private String id; //예약 아이디
    private String proId; //프로그램 아이디
    private String userId; //예약자 아이디
    private String userNm; //예약자 이름

}
