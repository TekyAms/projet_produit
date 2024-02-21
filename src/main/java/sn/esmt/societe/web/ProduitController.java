package sn.esmt.societe.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.societe.entity.ProduitEntity;
import sn.esmt.societe.service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;
  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){
    return produitService.save(produitEntity);

  }
  @GetMapping
  public List<ProduitEntity> all(){
    return produitService.getAll().get();

  }
  @PutMapping
  public ProduitEntity update(String ref, ProduitEntity produitEntity){
    return produitService.update(ref,produitEntity);

  }
  @DeleteMapping
  public void delete(String ref){
     produitService.delete(ref);
  }
  @GetMapping("/ref")
  public Optional<ProduitEntity> get(String ref){
    return produitService.get(ref);
  }

  }







