package gwAws.gwAwsProject.reservation;

import gwAws.gwAwsProject.reservation.model.ProgramDetail;
import gwAws.gwAwsProject.reservation.model.ProgramVo;
import org.springframework.stereotype.Component;

/**
 * 프로그램 관리 인터페이스
 */
@Component
public interface ProgramMannageInterface {

    // 프로그램 등록
    ProgramVo createProgram(ProgramVo programVo);

    // 프로그램 수정
    void updateProgram();

    // 프로그램 삭제
    void removeProgram();

    //프로그램 디테일 정보 등록
    void createProgramDetail(ProgramDetail programDetail);
}
