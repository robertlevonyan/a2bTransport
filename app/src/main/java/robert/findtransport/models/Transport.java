package robert.findtransport.models;

/**
 * Created by robert on 3/20/16.
 */
public class Transport {

    private int transportIcon;
    private String transportNumber;
    private String transportType;
    private String transportRoutes;
    private boolean hasOptionForLimitedPeople;

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

    public boolean isHasOptionForLimitedPeople() {
        return hasOptionForLimitedPeople;
    }

    public void setHasOptionForLimitedPeople(boolean hasOptionForLimitedPeople) {
        this.hasOptionForLimitedPeople = hasOptionForLimitedPeople;
    }
}
