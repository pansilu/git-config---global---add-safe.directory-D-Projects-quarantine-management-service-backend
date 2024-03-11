package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.GraphRequestDto;
import lk.uom.fit.qms.dto.MapRequestDto;
import lk.uom.fit.qms.dto.UserRoleDto;
import lk.uom.fit.qms.exception.QmsException;

import java.util.List;

public interface GraphService {

    Object getGraphDetails(GraphRequestDto graphRequestDto, Long userIdt, List<UserRoleDto> userRoles) throws QmsException;

    Object getMapDetails(MapRequestDto mapRequestDto) throws QmsException;
}
