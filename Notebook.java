public class Notebook{
    private int pages;
    private double height;
    private double width;
    public Notebook(int pages, double height, double width){
        double area = height * width;
    }
    public String determineCost(double area, int pages){
        double cost = area/(pages/2);
        return "the cost of the notebook is: " + cost;
    }

}