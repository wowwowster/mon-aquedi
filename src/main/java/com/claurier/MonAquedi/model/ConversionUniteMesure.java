package com.claurier.MonAquedi.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "conversion_unite_mesure", schema = "siaap",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"unite_mesure_source_id", "unite_mesure_destination_id"}
                , name="unique_unite_mesure_source_destination")}
)
public class ConversionUniteMesure implements Serializable {

    private Long id;
    private UniteMesure uniteMesureSource;
    private UniteMesure uniteMesureDestination;
    private Double multiplicateur;

    public ConversionUniteMesure() {
        super();
    }

    /** Constructeur est rendu privé car il rend difficile la gestion de la contrainte d'unicité
     * uniteMesureSource + uniteMesureDestination
     *
     * @param uniteMesureSource
     * @param uniteMesureDestination
     * @param multiplicateur
     */
    private ConversionUniteMesure(UniteMesure uniteMesureSource, UniteMesure uniteMesureDestination,
                                  Double multiplicateur) {
        this();
        this.uniteMesureSource = uniteMesureSource;
        this.uniteMesureDestination = uniteMesureDestination;
        this.multiplicateur = multiplicateur;
    }

    @SequenceGenerator(name = "generator_conversion_unite_mesure", sequenceName = "test.conversion_unite_mesure_conversion_unite_mesure_id_seq", allocationSize=1)
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "conversion_unite_mesure_id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.uniteMesureSource);
        hash = 37 * hash + Objects.hashCode(this.uniteMesureDestination);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConversionUniteMesure other = (ConversionUniteMesure) obj;
        if (!Objects.equals(this.uniteMesureSource, other.uniteMesureSource)) {
            return false;
        }
        if (!Objects.equals(this.uniteMesureDestination, other.uniteMesureDestination)) {
            return false;
        }
        return true;
    }

    public void setId(Long conversionUniteMesureId) {
        this.id = conversionUniteMesureId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unite_mesure_source_id", nullable = false)
    public UniteMesure getUniteMesureSource() {
        return uniteMesureSource;
    }

    public void setUniteMesureSource(UniteMesure uniteMesureSource) {
        this.uniteMesureSource = uniteMesureSource;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unite_mesure_destination_id", nullable = false)
    public UniteMesure getUniteMesureDestination() {
        return uniteMesureDestination;
    }

    public void setUniteMesureDestination(UniteMesure uniteMesureDestination) {
        this.uniteMesureDestination = uniteMesureDestination;
    }

    @Column(name = "multiplicateur", nullable = false)
    public Double getMultiplicateur() {
        return multiplicateur;
    }

    public void setMultiplicateur(Double multiplicateur) {
        this.multiplicateur = multiplicateur;
    }

    public Double convert(Double initValue) {
        return initValue * this.multiplicateur;
    }

}

