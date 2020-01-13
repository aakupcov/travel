package by.anjei.business.converter;

import by.anjei.business.model.TripModel;
import by.anjei.data.entity.Trip;

public class TripConverter {

    public TripModel getTripModel(Trip trip) {
        return TripModel.builder()
                .id(trip.getId())
                .date(trip.getDate())
                .country(trip.getCountry())
                .place(trip.getPlace())
                .build();
    }
}