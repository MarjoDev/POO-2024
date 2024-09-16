package br.edu.fatecfranca.exe3o3;

import java.util.Date;

public class Reservation {
    public int id;
    public Date date;

    public Reservation() {
        this.id = 0;
        this.date = new Date();
    }
    public Reservation(Date date, int id) {
        this.date = date;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
