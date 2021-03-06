package com.univerity.diploma.doctoronlie.entity;

import com.reserver.common.starter.data.jpa.basecrud.entity.BaseEntity;
import com.univerity.diploma.doctoronlie.entity.employee.Patient;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation extends BaseEntity {

    @Column
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "timetable_id")
    private Timetable timetable;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
