package org.launchcode;

public interface OpticalDisc {

    void spin();
    boolean storesData(); //boolean returns true if successful

    boolean laserWritten(); //boolean returns true if disc written

    boolean laserRead(); //boolean returns true if readable




}
