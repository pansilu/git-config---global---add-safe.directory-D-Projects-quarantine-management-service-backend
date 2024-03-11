package lk.uom.fit.qms.repository;

import lk.uom.fit.qms.model.GramaNiladariDivision;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface GramaNiladariDivisionRepository extends JpaRepository<GramaNiladariDivision, Long> {

    GramaNiladariDivision findGramaNiladariDivisionById(Long id);

    @Query("SELECT gn FROM GramaNiladariDivision gn WHERE LOWER(gn.name) LIKE LOWER(:pattern) OR LOWER(gn.code) LIKE LOWER(:pattern) OR LOWER(gn.gndNo) LIKE LOWER(:pattern) ORDER BY gn.name")
    List<GramaNiladariDivision> filterBySearch(@Param("pattern") String pattern);

    GramaNiladariDivision findGramaNiladariDivisionByObjectId(String objectId);

    @Query("SELECT gn FROM GramaNiladariDivision gn WHERE gn.division.id = :id AND (LOWER(gn.name) LIKE LOWER(:pattern) OR LOWER(gn.code) LIKE LOWER(:pattern) OR LOWER(gn.gndNo) LIKE LOWER(:pattern)) ORDER BY gn.name")
    List<GramaNiladariDivision> filterBySearch(@Param("id") Long divisionId, @Param("pattern") String pattern);

    List<GramaNiladariDivision> findGramaNiladariDivisionsByDivisionIdOrderByName(Long id);

    List<GramaNiladariDivision> findGramaNiladariDivisionsByIdIn(Collection<Long> gndIds);

    GramaNiladariDivision findGramaNiladariDivisionByDivisionNameAndDivisionDistrictNameAndDivisionDistrictProvinceNameAndGndNo(String dsName, String districtName, String provinceName, String gndNo);

    @Query("SELECT gn.id FROM GramaNiladariDivision gn WHERE gn.name = :gnd AND gn.division.name = :ds AND gn.division.district.name = :district AND gn.division.district.province.name = :province")
    Long findUserGnDivision(@Param("province") String province, @Param("district") String district, @Param("ds") String ds, @Param("gnd") String gnd);
}
