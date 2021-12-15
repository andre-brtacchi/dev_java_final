package br.com.globalhitss.finalProject.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
public class Veiculo implements Serializable {
    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,length = 10)
    private Long id;

    @Column(length = 30)
    private String modelo;

    @Column(length = 10)
    private String placa;
}
