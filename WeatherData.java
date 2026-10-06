package com.weather;

public class WeatherData {
    private String city;
    private String date;
    private String condition;
    private double temperature;
    private double humidity;
    private double windSpeed;
    private double pressure;
    private double rainChance;

    public WeatherData() {}

    public WeatherData(String city, String date, String condition, double temperature,
                       double humidity, double windSpeed, double pressure, double rainChance) {
        this.city = city;
        this.date = date;
        this.condition = condition;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.rainChance = rainChance;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public double getHumidity() { return humidity; }
    public void setHumidity(double humidity) { this.humidity = humidity; }

    public double getWindSpeed() { return windSpeed; }
    public void setWindSpeed(double windSpeed) { this.windSpeed = windSpeed; }

    public double getPressure() { return pressure; }
    public void setPressure(double pressure) { this.pressure = pressure; }

    public double getRainChance() { return rainChance; }
    public void setRainChance(double rainChance) { this.rainChance = rainChance; }
}
