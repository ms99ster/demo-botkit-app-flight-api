package demo.botkit.app.flight.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.botkit.app.flight.model.Airport;

@RestController
@CrossOrigin
public class FlightController {

    Logger log = LoggerFactory.getLogger(FlightController.class);
    
    @RequestMapping(value="/airports")
    public List<Airport> findFlightByTerm(@RequestParam String term) {
        log.debug("term : " + term);
        List<Airport> airports = new ArrayList<Airport>();
        if(term.startsWith("S")) {
            airports.add(new Airport("SHA", "Shanghai Hongqiao International Airport"));
        }else if(term.startsWith("M")) {
            airports.add(new Airport("MEE", "La Roche Ile Mare Airport [MEE]"));
        }
        
        return airports;
    }
}
