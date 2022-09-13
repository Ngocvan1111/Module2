package ss6_inheritance.excercise.Point2DandPoint3D;

import ss6_inheritance.excercise.ClassPointandMoveablePoint.Point;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x, float y,float z){
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y,float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.z};
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)",super.getX(),super.getY(),getZ());
    }
}
