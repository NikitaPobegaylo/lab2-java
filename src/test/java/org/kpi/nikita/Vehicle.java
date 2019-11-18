package org.kpi.nikita;

import org.kpi.nikita.*;
import javax.persistence.*;

// https://thoughts-on-java.org/complete-guide-inheritance-strategies-jpa-hibernate/

@MappedSuperclass
public abstract class Vehicle {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "id", nullable = false, unique = true, updatable = false )
    protected Long id;

    @Column( name = "title", nullable = false, updatable = true )
    protected String title;

    @Column( name = "order", nullable = false, updatable = true )
    protected int order;

    @Column( name = "volume", nullable = false, precision = 2, updatable = true )
    protected double volume;

}
