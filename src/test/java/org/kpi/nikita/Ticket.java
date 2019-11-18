package org.kpi.nikita;

import org.kpi.nikita.*;
import javax.persistence.*;

// https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/

@Entity( name = "Ticket" )
@Table( name = "Ticket" )
public class Ticket {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "id", nullable = false, unique = true, updatable = false )
    protected Long id;

    @Column( name = "trainId", nullable = false, updatable = false )
    protected Long trainId;

    @Column( name = "name", nullable = false, updatable = true )
    protected String name;

    @Column( name = "place", nullable = false, updatable = true )
    protected int place;

    @Column( name = "price", nullable = false, precision = 2, updatable = true )
    protected double price;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "trainId" )
    protected Train train;

    public Ticket ( String name, int place, double price ) {
        this.name = name;
        this.place = place;
        this.price = price;
    }

}
