package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.QuarantineCenterDto;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.model.QuarantineCenter;

import java.util.List;

public interface QuarantineCenterService {

    QuarantineCenter getQuarantineCenterForGivenId(Long id) throws QmsException;

    void createOrEditQuarantineCenter(QuarantineCenterDto quarantineCenterDto) throws QmsException;

    List<QuarantineCenterDto> findQuarantineCenters(String search);

    QuarantineCenterDto getQuarantineCenterDetails(Long id) throws QmsException;
}
