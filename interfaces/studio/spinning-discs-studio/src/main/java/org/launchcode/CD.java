package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String musician, String producer) {
        this.musician = musician;
        this.producer = producer;
    }

    private String musician;

    @Override
    public void spin() {
        System.out.println("This CD is spinning!");
    }

    @Override
    public boolean storesData() {
        System.out.println("Storing data on CD");
        this.producer = "";
        System.out.println("Disc producer is" + producer);
        return true;
    }

    @Override
    public boolean laserWritten() {
        System.out.println("CD is laser written");
        return true;
    }

    @Override
    public boolean laserRead() {
        System.out.println("CD is laser read");
        return true;
    }
    // TODO: Implement your custom interface.



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
