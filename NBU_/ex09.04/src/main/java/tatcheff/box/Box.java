package tatcheff.box;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getHeigth() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box {width=" + width + ", height=" + height + ", depth=" + depth + '}';
    }

    private double volume() {
        return this.width * this.height * this.depth;
    }
    public  void IncreaseDimensionCond(double increasePercentage,double volumeNum) {
        if (volume() <= volumeNum) {

            try {
                increaseDimensions(increasePercentage);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }


    public void increaseDimensions(double increasePercentage){
        if(increasePercentage < 0||increasePercentage > 100) {
            //todo
            throw new IllegalArgumentException("The value is not in the range");
        }else{
            this.depth += this.depth * increasePercentage / 100;
            this.height += this.height * increasePercentage / 100;
            this.width += this.width * increasePercentage / 100;


        }
    }
}
