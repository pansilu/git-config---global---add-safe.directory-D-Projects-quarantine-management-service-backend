package lk.uom.fit.qms.repository;

import lk.uom.fit.qms.model.GndCoordinateDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GndCoordinateDetailRepository extends JpaRepository<GndCoordinateDetail, Long> {

    @Query("SELECT gcd FROM GndCoordinateDetail gcd WHERE gcd.gnDivision.id in :ids")
    List<GndCoordinateDetail> findGndCoordinateDetailsForGivenGnIds(@Param("ids") List<Long> gndIds);

    @Query("SELECT gcd FROM GndCoordinateDetail gcd WHERE gcd.gnDivision.division.district.id = :id")
    List<GndCoordinateDetail> findGndCoordinateDetailsForDistrictId(@Param("id") Long districtId);

    @Query("SELECT gcd FROM GndCoordinateDetail gcd WHERE gcd.gnDivision.division.id = :id")
    List<GndCoordinateDetail> findGndCoordinateDetailsForDivisionId(@Param("id") Long divisionId);

    GndCoordinateDetail findGndCoordinateDetailByGnDivisionId(Long gndId);

    @Query("SELECT gcd.lon, gcd.lat FROM GndCoordinateDetail gcd WHERE gcd.gnDivision.id = :id")
    List<String[]> getGndCenterCoordinates(@Param("id") Long gndId);
}
