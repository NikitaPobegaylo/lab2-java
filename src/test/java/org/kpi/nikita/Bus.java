package org.kpi.nikita;

import org.kpi.nikita.*;
import javax.persistence.*;

@Entity( name = "Bus" )
@Table( name = "Bus" )
public class Bus extends Vehicle {

    @Column
    protected String color;

}
