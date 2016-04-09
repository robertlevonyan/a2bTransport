package robert.findtransport.models;

/**
 * Created by robert on 3/20/16.
 */
public class Transport {

    private int transportIcon;
    private String transportNumber;
    private String transportType;
    private String transportRoutes;
    private String transportRoutesFull;
    private int backgroundColor;
    private int textColor;
    public String route;

    public Transport() {
    }

    public int getTransportIcon() {
        return transportIcon;
    }

    public void setTransportIcon(int transportIcon) {
        this.transportIcon = transportIcon;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportRoutes() {
        return transportRoutes;
    }

    public void setTransportRoutes(String transportRoutes) {
        this.transportRoutes = transportRoutes;
    }

    public String getTransportRoutesFull() {
        return transportRoutesFull;
    }

    public void setTransportRoutesFull(String transportRoutesFull) {
        this.transportRoutesFull = transportRoutesFull;
    }

    //    public boolean isHasOptionForLimitedPeople() {
//        return hasOptionForLimitedPeople;
//    }
//
//    public void setHasOptionForLimitedPeople(boolean hasOptionForLimitedPeople) {
//        this.hasOptionForLimitedPeople = hasOptionForLimitedPeople;
//    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
