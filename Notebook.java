public class Notebook{
    private int pages;
    private double height;
    private double width;
    public Notebook(int pages, double height, double width){
    }
    public double determineCost(){
        double cost = (height * width)/(pages/2);
        return cost;
    }

}