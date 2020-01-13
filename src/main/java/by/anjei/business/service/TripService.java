package by.anjei.business.service;

import by.anjei.business.converter.TripConverter;
import by.anjei.business.model.TripModel;
import by.anjei.data.entity.Trip;
import by.anjei.data.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripService {
    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<TripModel> getAllTrips() {
        TripConverter tripConverter = new TripConverter();
        List<TripModel> allTrips = new ArrayList<>();

        Iterable<Trip> trips = tripRepository.findAll();
        trips.forEach(trip -> {
            allTrips.add(tripConverter.getTripModel(trip));
        });
        return allTrips;
    }
}