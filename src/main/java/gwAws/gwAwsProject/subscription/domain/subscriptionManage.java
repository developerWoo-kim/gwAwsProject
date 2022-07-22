package gwAws.gwAwsProject.subscription.domain;

import java.util.Date;

public class subscriptionManage {

    private Long id; // 아이디
    private String name; // 이름
    private String type; // 타입
    private String state; // 프로그램 상태
    private Long personnel; // 정원
    private Date startDate; // 시작일
    private Date endDate; // 종료일
    private Date startReceiptDate; // 접수 시작일
    private Date endReceiptDate; // 접수 종료일


    // 편의 메소드

    public subscriptionManage(Long id, String name, String type, String state, Long personnel, Date startDate, Date endDate, Date startReceiptDate, Date endReceiptDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.state = state;
        this.personnel = personnel;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startReceiptDate = startReceiptDate;
        this.endReceiptDate = endReceiptDate;
    }
}
