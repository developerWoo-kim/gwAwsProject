package gwAws.gwAwsProject.reservation.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class ProgramVo {
    private Long id; // 프로그램 아이디
    private String name; // 프로그램 이름
    private String type; // 프로그램 종류
    private String detailInfo; // 상세 설명
    private String notice; //유의사항
    private Long personnel; // 정원
    private String state; // 프로그램 상태
    private Date startDate; // 시작일
    private Date endDate; // 종료일
    private Date startReceiptDate; // 접수 시작일
    private Date endReceiptDate; // 접수 종료일
    private String privacyAgreePhrases; //개인 정보 동의 문구
    private String overlapApplicationState; // 중복 신청 가능 여부

    private String regNm; // 등록자
    private Date regDt; // 등록 일자
}
