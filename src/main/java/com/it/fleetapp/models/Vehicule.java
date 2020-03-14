package com.it.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "vehiculetypeid", insertable = false, updatable = false)
    private VehiculeType vehiculeType;
    private Integer vehiculetypeid;

    private String vehiculeNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date aquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "vehiculemakeid", insertable = false, updatable = false)
    private VehiculeMake vehiculeMake;
    private Integer vehiculemakeid;

    private String power;
    private String fuelCapacity;

    @ManyToOne
    @JoinColumn(name = "vehiculestatusid", insertable = false, updatable = false)
    private VehiculeStatus vehiculeStatus;
    private Integer vehiculestatusid;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name = "employeedid", insertable = false, updatable = false)
    private Employee inCharge;
    private Integer employeeid;

    @ManyToOne
    @JoinColumn(name = "vehiculemodelid", insertable = false, updatable = false)
    private VehiculeModel vehiculeModel;
    private Integer vehiculemodelid;

    @ManyToOne
    @JoinColumn(name = "locationid", insertable = false, updatable = false)
    private Location currentLocation;
    private Integer locationid;

    private  String remarks;

}
