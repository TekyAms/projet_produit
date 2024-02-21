package sn.esmt.societe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.societe.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {
  @Query("select e from ProduitEntity e where e.ref=?1 and e.nom=?2 ")
  //
  public Optional<ProduitEntity> findByReferenceAndNom(String ref, String nom);
  ;

  @Query("select e from ProduitEntity e where e.ref= :m and e.nom= :n ")
  public Optional<ProduitEntity> findByReferenceAndNomv2(@Param("m") String ref, @Param("n") String nom);
  public Optional<ProduitEntity> findByRef(String ref);

}




