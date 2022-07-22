package gwAws.gwAwsProject.reservation.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProgramDetail {

    private Long id; // 프로그램 디테일 아이디
    private Long programId; // 프로그램 아이디
    private String startTime; // 시작 시간
    private String endTime; // 종료 시간
    private Long personnel; // 정원
    private String state; // 마감 상태

    private Long leftPerson; // 잔여 인원
}

