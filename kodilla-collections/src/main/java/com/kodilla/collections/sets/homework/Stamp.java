package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private String stampSize;
    private boolean stampOnStamp;

    public Stamp(String stampName, String stampSize, boolean stampOnStamp) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampOnStamp = stampOnStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public boolean isStampOnStamp() {
        return stampOnStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampOnStamp == stamp.stampOnStamp &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampSize, stamp.stampSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampOnStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", stampOnStamp=" + stampOnStamp +
                '}';
    }
}
