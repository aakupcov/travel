package by.anjei.business.model;

import java.time.LocalDate;

public class TripModel {
    private long id;
    private LocalDate date;
    private String country;
    private String place;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public static class TripModelBuilder {
        private final TripModel tripModel;

        public TripModelBuilder() {
            this(new TripModel());
        }

        private TripModelBuilder(TripModel tripModel) {
            this.tripModel = tripModel;
        }

        public TripModelBuilder id(long id) {
            tripModel.setId(id);
            return this;
        }

        public TripModelBuilder date(LocalDate date) {
            tripModel.setDate(date);
            return this;
        }

        public TripModelBuilder country(String country) {
            tripModel.setCountry(country);
            return this;
        }

        public TripModelBuilder place(String place) {
            tripModel.setPlace(place);
            return this;
        }

        public TripModel build() {
            return tripModel;
        }
    }

    public static TripModelBuilder builder() {
        return new TripModelBuilder();
    }
}