package ar.com.l_airline.entities.flight;

import ar.com.l_airline.location.City;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class FlightDTO {
    private Long id;
    private AirlineName airLine;
    @Enumerated(EnumType.STRING)
    private City origin;
    @Enumerated(EnumType.STRING)
    private City destiny;
    @Column(name = "flight_schedule")
    private LocalDateTime flightSchedule;
    private int layover;
    private double price;
}
