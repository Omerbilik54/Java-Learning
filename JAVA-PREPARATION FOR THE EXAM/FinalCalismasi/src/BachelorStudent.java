public class BachelorStudent extends Student implements ProjectScoreBehavior {

    public BachelorStudent(int id , float mid , float fin){
        super(id,mid,fin);
    }

    @Override
    float computeTotalScore(){
        return super.computeBaseScore() + this.projectScore();
    }
    @Override
    public float projectScore(){
        return 50;
    }
}
