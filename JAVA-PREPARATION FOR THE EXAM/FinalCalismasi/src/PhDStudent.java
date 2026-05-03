public class PhDStudent extends MasterStudent implements ArticleScoreBehavior{
    int numberOfArticles ;

    public PhDStudent(int id , float mid , float fin ,int conf , int numberOfArticles){
        super(id,mid,fin,conf);
        this.numberOfConf=numberOfArticles;
    }

    @Override
    float computeTotalScore(){
        return super.computeBaseScore() + this.articleScore();
    }
    @Override
    public float articleScore(){
        return numberOfArticles*8;
    }


}
