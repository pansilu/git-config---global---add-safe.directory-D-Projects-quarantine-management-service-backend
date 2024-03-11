package lk.uom.fit.qms.service;

import lk.uom.fit.qms.model.QuarantineUser;

import java.time.LocalDate;
import java.util.List;

public interface DeceasedDetailService {

    long getNewDeceasedCasesPerDate(LocalDate date);

    long getNewDeceasedCasesPerDateAndGnd(LocalDate date, Long gndId);

    long getNewDeceasedCasesPerDateAndDivision(LocalDate date, Long divisionId);

    long getNewDeceasedCasesPerDateAndDistrict(LocalDate date, Long districtId);

    long getNewDeceasedCasesPerDateAndProvince(LocalDate date, Long provinceId);

    List<Long[]> getDeceasedCaseCountAgainstAgeGroup();

    List<Long[]> getDeceasedCaseCountAgainstAgeGroupAndGnd(Long gndId);

    List<Long[]> getDeceasedCaseCountAgainstAgeGroupAndDivision(Long divisionId);

    List<Long[]> getDeceasedCaseCountAgainstAgeGroupAndDistrict(Long districtId);

    List<Long[]> getDeceasedCaseCountAgainstAgeGroupAndProvince(Long provinceId);

    List<Object []> getNewDeceasedCasesPerDateForGivenDistricts(List<Long> districtIds, LocalDate date);

    List<QuarantineUser> getAllDeceasedUserDetails(List<Long> districtIds);
}
