package demo.botkit.app.flight.model;

import java.util.Calendar;
import java.util.Map;

public class Flight {

    private Calendar departs_at;
    private Calendar arrives_at;
    private String flight_number;
    private Map booking_info;
    private Map fare;
    
    public Calendar getDeparts_at() {
        return departs_at;
    }
    public void setDeparts_at(Calendar departs_at) {
        this.departs_at = departs_at;
    }
    public Calendar getArrives_at() {
        return arrives_at;
    }
    public void setArrives_at(Calendar arrives_at) {
        this.arrives_at = arrives_at;
    }
    public String getFlight_number() {
        return flight_number;
    }
    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }
    public Map getBooking_info() {
        return booking_info;
    }
    public void setBooking_info(Map booking_info) {
        this.booking_info = booking_info;
    }
    public Map getFare() {
        return fare;
    }
    public void setFare(Map fare) {
        this.fare = fare;
    }
    
}
