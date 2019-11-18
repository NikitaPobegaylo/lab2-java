package org.kpi.nikita;

import org.kpi.nikita.*;
import javax.persistence.*;
import java.util.*;

@Entity( name = "Train" )
@Inheritance( strategy = InheritanceType.JOINED )
@Table( name = "Train" )
public class Train extends Vehicle {

    @Column
    protected int places;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true )
    protected List<Ticket> tickets = new ArrayList<Ticket>();


    public Train () {

    }

    public void addTicket( Ticket ticket ) {
        tickets.add( ticket );
        // ?
    }

    public void removeTicket( Ticket ticket ) {
        tickets.remove( ticket );
        // ?
    }

}
