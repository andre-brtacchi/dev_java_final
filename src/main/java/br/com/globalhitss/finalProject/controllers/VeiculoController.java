package br.com.globalhitss.finalProject.controllers;

import br.com.globalhitss.finalProject.models.Veiculo;
import br.com.globalhitss.finalProject.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class VeiculoController {
    @Autowired
    private VeiculoRepository repository;

    @GetMapping("/veiculos")
    public List<Veiculo> listaVeiculos(){
        return repository.findAll();
    }

    @GetMapping("/veiculo/{id}")
    public Veiculo consultarVeiculoUnico(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }

    @PostMapping(path = "/api/veiculo/salvar")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    @DeleteMapping("/veiculo")
    public void deletaVeiculo(@RequestBody Veiculo veiculo){
        repository.delete(veiculo);
    }

    @DeleteMapping("/veiculo/{id}")
    public void deleteById(@PathVariable("id") Long id){
        Veiculo veiculo=consultarVeiculoUnico(id);
        repository.delete(veiculo);
    }

    @PutMapping("/veiculo")
    public Veiculo atualizaVeiculo(@RequestBody Veiculo veiculo){
        return repository.save(veiculo);
    }
}
