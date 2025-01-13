import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BankHolidayData {

    private DivisionData englandAndWales;
    private DivisionData scotland;
    private DivisionData northernIreland;

    public DivisionData getEnglandAndWales() {
        return englandAndWales;
    }

    @JsonProperty("england-and-wales")
    public void setEnglandAndWales(DivisionData englandAndWales) {
        this.englandAndWales = englandAndWales;
    }

    public DivisionData getScotland() {
        return scotland;
    }

    public void setScotland(DivisionData scotland) {
        this.scotland = scotland;
    }

    public DivisionData getNorthernIreland() {
        return northernIreland;
    }

    @JsonProperty("northern-ireland")
    public void setNorthernIreland(DivisionData northernIreland) {
        this.northernIreland = northernIreland;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankHolidayData that = (BankHolidayData) o;
        return Objects.equals(englandAndWales, that.englandAndWales) && Objects.equals(scotland, that.scotland) && Objects.equals(northernIreland, that.northernIreland);
    }

    @Override
    public String toString() {
        return "BankHolidayData{" +
                "englandAndWales=" + englandAndWales +
                ", scotland=" + scotland +
                ", northernIreland=" + northernIreland +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(englandAndWales, scotland, northernIreland);
    }
}
