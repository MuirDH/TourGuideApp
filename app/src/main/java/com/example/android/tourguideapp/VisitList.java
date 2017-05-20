package com.example.android.tourguideapp;

/**
 * TourGuideApp Created by Muir on 17/05/2017.
 */

public class VisitList {

    private int ImageResourceId;
    private int DescriptiveText;

    /**
     * Create a new VisitList object
     * @param imageResourceId is the image associated with the location
     * @param descriptiveText is the text describing the image
     */

    public VisitList(int imageResourceId, int descriptiveText){

        ImageResourceId = imageResourceId;
        DescriptiveText = descriptiveText;

    }

    // get the image
    public int getImageResourceId(){
        return ImageResourceId;
    }

    // get the descriptive text
    public int getDescriptiveText(){
        return DescriptiveText;
    }

    /**
     * Returns the string representation of the {@link VisitList} object.
     */

    @Override
    public String toString(){
        return "VisitList{" +
                "ImageResourceId='" + ImageResourceId + '\'' +
                ", DescriptiveText='" + DescriptiveText +
                '}';
    }

}
