package gwAws.gwAwsProject.reservation;

import gwAws.gwAwsProject.reservation.model.ProgramDetail;
import gwAws.gwAwsProject.reservation.model.ProgramVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramManagerService implements ProgramMannageInterface{

    @Override
    public ProgramVo createProgram(ProgramVo programVo) {
        programVo.setId((long) 1);
        programVo.setName("테스트");
        return programVo;
    }

    @Override
    public void updateProgram() {

    }

    @Override
    public void removeProgram() {

    }

    @Override
    public void createProgramDetail(ProgramDetail programDetail) {

    }
}
