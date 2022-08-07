package com.company;

public enum DayOfTheWeer {
    MONDAY("Duischombu kunu javadan technicheski sabak otulot"),
    TUESDAY("Scheischembi kunu javadan praktika sabak otulot "),
    WEDNESDAY("Scharschembi kunu javadan technicheski sabak otulot"),
    THURSDAY("Beischembi kunu javadan Soft Skills sabagy otulot"),
    FRIDAY("Juma kunnu javadan anglis til sabak otulot"),
    SATURDAY("Iischembi es aluu kun"),
    SUNDAY("Jekschembi dem alysch kun");

    String schedule;

    DayOfTheWeer(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "DayOfTheWeer{" +
                "schedule='" + schedule + '\'' +
                "} " + super.toString();
    }
}

