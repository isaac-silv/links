package com.demo.links.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_opening_hour")
public class OpeningHour {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startFirstHorary;
    private String endFirstHorary;
    private String startSecondHorary;
    private String endSecondHorary;

    @ManyToOne
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;

    public OpeningHour() {
    }

    public OpeningHour(Long id, String startFirstHorary, String endFirstHorary, String startSecondHorary,
            String endSecondHorary, Establishment establishment) {
        this.id = id;
        this.startFirstHorary = startFirstHorary;
        this.endFirstHorary = endFirstHorary;
        this.startSecondHorary = startSecondHorary;
        this.endSecondHorary = endSecondHorary;
        this.establishment = establishment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartFirstHorary() {
        return startFirstHorary;
    }

    public void setStartFirstHorary(String startFirstHorary) {
        this.startFirstHorary = startFirstHorary;
    }

    public String getEndFirstHorary() {
        return endFirstHorary;
    }

    public void setEndFirstHorary(String endFirstHorary) {
        this.endFirstHorary = endFirstHorary;
    }

    public String getStartSecondHorary() {
        return startSecondHorary;
    }

    public void setStartSecondHorary(String startSecondHorary) {
        this.startSecondHorary = startSecondHorary;
    }

    public String getEndSecondHorary() {
        return endSecondHorary;
    }

    public void setEndSecondHorary(String endSecondHorary) {
        this.endSecondHorary = endSecondHorary;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OpeningHour other = (OpeningHour) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
