public class Human implements Predictor,Prey{
    @Override
    public void predict(){
        System.out.println("Human is predicting future....");
    }
    @Override
    public void flee(){
        System.out.println("Human is fleeing....");
    }
}