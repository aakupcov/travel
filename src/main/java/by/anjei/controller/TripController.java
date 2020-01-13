package by.anjei.controller;

import by.anjei.business.model.TripModel;
import by.anjei.business.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TripController {
    private final TripService tripService;

    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/trips")
    public List<TripModel> getAllTrips() {
        return tripService.getAllTrips();
    }
}