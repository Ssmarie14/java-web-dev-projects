package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    private String actor;
    public DVD(String actor, String producer) {
        this.actor = actor;
        this.producer = producer;
    }
    // TODO: Implement your custom interface.

    @Override
    public void spin() {
        System.out.println("This DVD is spinning!");
    }

    @Override
    public boolean storesData() {
        System.out.println("Storing data on DVD");
        return true;
    }

    @Override
    public boolean laserWritten() {
        System.out.println("DVD is laser written");
        return true;
    }

    @Override
    public boolean laserRead() {
        System.out.println("DVD is laser read");
        return true;
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
